package com.yorku.roomscheduler.gui;

import com.yorku.roomscheduler.dao.*;
import com.yorku.roomscheduler.model.*;
import com.yorku.roomscheduler.model.enums.RoomStatus;
import com.yorku.roomscheduler.model.users.User;
import com.yorku.roomscheduler.patterns.facade.BookingFacade;
import com.yorku.roomscheduler.patterns.state.PendingState;
import com.yorku.roomscheduler.patterns.strategy.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Booking panel for room reservations
 */
public class BookingPanel extends JPanel {
    
    private MainFrame mainFrame;
    private String userId;
    private UserDAO userDAO;
    private RoomDAO roomDAO;
    private BookingDAO bookingDAO;
    private BookingFacade bookingFacade;
    
    private JTable roomTable;
    private JTable bookingTable;
    private DefaultTableModel roomTableModel;
    private DefaultTableModel bookingTableModel;
    private JButton bookRoomButton;
    private JButton cancelBookingButton;
    private JButton checkInButton;
    private JButton extendBookingButton;
    private JButton logoutButton;
    private JLabel userInfoLabel;
    private User currentUser;
    
    public BookingPanel(MainFrame mainFrame, String userId) {
        this.mainFrame = mainFrame;
        this.userId = userId;
        this.userDAO = new UserDAO();
        this.roomDAO = new RoomDAO();
        this.bookingDAO = new BookingDAO();
        this.bookingFacade = new BookingFacade();
        this.currentUser = userDAO.findByUserId(userId);
        if (this.currentUser == null) {
            System.err.println("ERROR: Could not find user with userId: " + userId);
        }
        
        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(240, 240, 245));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        initComponents();
        loadData();
    }
    
    
    
    private void initComponents() {
        // Top panel - User info
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(139, 0, 0));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        String userName = this.currentUser != null ? this.currentUser.getEmail() : userId;
        double hourlyRate = this.currentUser != null ? this.currentUser.getHourlyRate() : 0.0;
        
        userInfoLabel = new JLabel("User: " + userName + " | Rate: $" + hourlyRate + "/hour");
        userInfoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        userInfoLabel.setForeground(Color.WHITE);
        
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> mainFrame.logout());
        
        topPanel.add(userInfoLabel, BorderLayout.WEST);
        topPanel.add(logoutButton, BorderLayout.EAST);
        
        add(topPanel, BorderLayout.NORTH);
        
        // Center panel - Split view
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        
        // Available Rooms Panel
        JPanel roomsPanel = new JPanel(new BorderLayout());
        roomsPanel.setBorder(BorderFactory.createTitledBorder("Available Rooms"));
        
        String[] roomColumns = {"Room ID", "Building", "Room Number", "Capacity", "Status"};
        roomTableModel = new DefaultTableModel(roomColumns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        roomTable = new JTable(roomTableModel);
        roomTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane roomScrollPane = new JScrollPane(roomTable);
        roomsPanel.add(roomScrollPane, BorderLayout.CENTER);
        
        JPanel roomButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bookRoomButton = new JButton("Book Selected Room");
        bookRoomButton.addActionListener(e -> handleBookRoom());
        roomButtonPanel.add(bookRoomButton);
        
        roomsPanel.add(roomButtonPanel, BorderLayout.SOUTH);
        
        // My Bookings Panel
        JPanel bookingsPanel = new JPanel(new BorderLayout());
        bookingsPanel.setBorder(BorderFactory.createTitledBorder("My Bookings"));
        
        String[] bookingColumns = {"Booking ID", "Room", "Start Time", "End Time", "Cost", "Status"};
        bookingTableModel = new DefaultTableModel(bookingColumns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        bookingTable = new JTable(bookingTableModel);
        bookingTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane bookingScrollPane = new JScrollPane(bookingTable);
        bookingsPanel.add(bookingScrollPane, BorderLayout.CENTER);
        
        JPanel bookingButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        checkInButton = new JButton("Check In");
        checkInButton.addActionListener(e -> handleCheckIn());
        
        extendBookingButton = new JButton("Extend Booking");
        extendBookingButton.addActionListener(e -> handleExtendBooking());
        
        cancelBookingButton = new JButton("Cancel Booking");
        cancelBookingButton.addActionListener(e -> handleCancelBooking());
        
        bookingButtonPanel.add(checkInButton);
        bookingButtonPanel.add(extendBookingButton);
        bookingButtonPanel.add(cancelBookingButton);
        
        JButton refreshButton = new JButton("Refresh"); 
        refreshButton.addActionListener(e -> loadData()); 
        bookingButtonPanel.add(refreshButton); 
        
        JButton completeButton = new JButton("Complete Booking");
        completeButton.addActionListener(e -> handleCompleteBooking());
        bookingButtonPanel.add(completeButton);
        
     // In bookingButtonPanel section, add:
        JButton testLateButton = new JButton("TEST: Create Late Booking");
        testLateButton.addActionListener(e -> handleCreateTestLateBooking());
        bookingButtonPanel.add(testLateButton);
        
        bookingsPanel.add(bookingButtonPanel, BorderLayout.SOUTH);
        
        splitPane.setTopComponent(roomsPanel);
        splitPane.setBottomComponent(bookingsPanel);
        splitPane.setDividerLocation(250);
        
        add(splitPane, BorderLayout.CENTER);
    }
    
    private void loadData() {
        loadRooms();
        loadBookings();
    }
    
    private void loadRooms() {
        roomTableModel.setRowCount(0);
        List<Room> rooms = roomDAO.getAvailableRooms();
        for (Room room : rooms) {
            roomTableModel.addRow(new Object[]{
                room.getRoomId(),
                room.getBuilding(),
                room.getRoomNumber(),
                room.getCapacity(),
                room.getStatus().name()
            });
        }
    }
    
    private void loadBookings() {
        System.out.println("DEBUG: Loading bookings for userId: " + userId);
        bookingTableModel.setRowCount(0);
        List<Booking> bookings = bookingDAO.getBookingsByUser(userId);
        System.out.println("DEBUG: Found " + bookings.size() + " bookings");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        for (Booking booking : bookings) {
            String status = booking.getCurrentStateName();
            String displayStatus = status;
            
            if (status.equals("FORFEITED")) {
                displayStatus = "FORFEITED";
            }
            
            bookingTableModel.addRow(new Object[]{
                booking.getBookingId(),
                booking.getRoomId(),
                booking.getStartTime().format(formatter),
                booking.getEndTime().format(formatter),
                "$" + booking.getTotalCost(),
                displayStatus
            });
        }
    }
    
    private void handleBookRoom() {
        int selectedRow = roomTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a room", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String roomId = (String) roomTableModel.getValueAt(selectedRow, 0);
        
        // Show booking dialog
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        
        JSpinner hourSpinner = new JSpinner(new SpinnerNumberModel(2, 1, 8, 1));
        JComboBox<String> paymentCombo = new JComboBox<>(new String[]{"Credit Card", "Debit Card", "Institutional Billing"});
        JTextField cardNumberField = new JTextField();
        
        panel.add(new JLabel("Duration (hours):"));
        panel.add(hourSpinner);
        panel.add(new JLabel("Payment Method:"));
        panel.add(paymentCombo);
        panel.add(new JLabel("Card Number / Dept Code:"));
        panel.add(cardNumberField);
        
        int result = JOptionPane.showConfirmDialog(this, panel, "Book Room", JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            try {
                int hours = (int) hourSpinner.getValue();
                String paymentMethod = (String) paymentCombo.getSelectedItem();
                String paymentDetails = cardNumberField.getText().trim();
                
                if (paymentDetails.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter payment details", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Create booking using Facade
                User user = this.currentUser;
                LocalDateTime start = LocalDateTime.now().plusMinutes(30);
                LocalDateTime end = start.plusHours(hours);
                
                PaymentStrategy strategy;
                switch (paymentMethod) {
                    case "Credit Card":
                        strategy = new CreditCardPayment();
                        break;
                    case "Debit Card":
                        strategy = new DebitCardPayment();
                        break;
                    default:
                        strategy = new InstitutionalBilling();
                }
                
                Booking booking = bookingFacade.createBooking(user, roomId, start, end, strategy, paymentDetails);
                
                if (booking != null) {
                    bookingDAO.saveBooking(booking);
                    JOptionPane.showMessageDialog(this, "Booking created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to create booking", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void handleCheckIn() {
        int selectedRow = bookingTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a booking", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String bookingId = (String) bookingTableModel.getValueAt(selectedRow, 0);
        Booking booking = bookingDAO.findById(bookingId);
        
        if (booking != null) {
        	String previousState = booking.getCurrentStateName();
            booking.checkIn();
            String newState = booking.getCurrentStateName();
            bookingDAO.updateBooking(booking);
            if (newState.equals("CHECKED_IN")) {
                // Successful check-in
                roomDAO.updateRoomStatus(booking.getRoomId(), RoomStatus.OCCUPIED);
                JOptionPane.showMessageDialog(this, 
                    "Checked in successfully! Enjoy your room.", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
                    
            } else if (newState.equals("FORFEITED")) {
                // Booking was forfeited due to late arrival
                roomDAO.updateRoomStatus(booking.getRoomId(), RoomStatus.AVAILABLE);
                JOptionPane.showMessageDialog(this, 
                    "Check-in window expired!\n" +
                    "You were more than 30 minutes late.\n" +
                    "Your deposit has been forfeited and the booking is cancelled.", 
                    "Booking Forfeited", 
                    JOptionPane.ERROR_MESSAGE);
                    
            } else if (newState.equals("CONFIRMED")) {
                // Too early to check in
                LocalDateTime startTime = booking.getStartTime();
                LocalDateTime now = LocalDateTime.now();
                long minutesUntilStart = java.time.temporal.ChronoUnit.MINUTES.between(now, startTime);
                
                JOptionPane.showMessageDialog(this, 
                    "Too early to check in!\n" +
                    "You can check in 30 minutes before your booking.\n" +
                    "Time until check-in window opens: " + minutesUntilStart + " minutes", 
                    "Check-in Not Available", 
                    JOptionPane.WARNING_MESSAGE);
            }
            
            loadData();  // Refresh the view
        }
        
    }
    
    private void handleExtendBooking() {
        int selectedRow = bookingTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a booking", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String bookingId = (String) bookingTableModel.getValueAt(selectedRow, 0);
        Booking booking = bookingDAO.findById(bookingId);
        
        if (booking != null && booking.getCurrentStateName().equals("CHECKED_IN")) {
            String input = JOptionPane.showInputDialog(this, "Extend by how many hours?", "1");
            if (input != null) {
                try {
                    int hours = Integer.parseInt(input);
                    booking.extend(hours);
                    bookingDAO.updateBooking(booking);
                    JOptionPane.showMessageDialog(this, "Booking extended!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadBookings();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Can only extend checked-in bookings", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void handleCancelBooking() {
        int selectedRow = bookingTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a booking", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String bookingId = (String) bookingTableModel.getValueAt(selectedRow, 0);
        Booking booking = bookingDAO.findById(bookingId);
        
        if (booking != null) {
            booking.cancel();
            bookingDAO.updateBooking(booking);
            
            roomDAO.updateRoomStatus(booking.getRoomId(), RoomStatus.AVAILABLE);
            
            if (booking.getCurrentStateName().equals("CANCELLED")) {
                JOptionPane.showMessageDialog(this, "Booking cancelled!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Cannot cancel in current state", "Error", JOptionPane.ERROR_MESSAGE);
            }
            loadBookings();
        }
    }
    
    private void handleCompleteBooking() {
        int selectedRow = bookingTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a booking", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String bookingId = (String) bookingTableModel.getValueAt(selectedRow, 0);
        Booking booking = bookingDAO.findById(bookingId);
        
        if (booking != null && booking.getCurrentStateName().equals("CHECKED_IN")) {
            booking.complete();
            bookingDAO.updateBooking(booking);
            
            // FREE UP THE ROOM
            roomDAO.updateRoomStatus(booking.getRoomId(), RoomStatus.AVAILABLE);
            
            JOptionPane.showMessageDialog(this, "Booking completed!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadData();
        } else {
            JOptionPane.showMessageDialog(this, "Can only complete checked-in bookings", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void handleCreateTestLateBooking() {
        int selectedRow = roomTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a room", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String roomId = (String) roomTableModel.getValueAt(selectedRow, 0);
        
        // Create a booking that started 45 minutes ago (past the 30-minute grace period)
        LocalDateTime startTime = LocalDateTime.now().minusMinutes(45);
        LocalDateTime endTime = startTime.plusHours(2);
        
        User user = this.currentUser;
        double totalCost = 2 * user.getHourlyRate();
        
        String bookingId = "B" + String.format("%03d", (int)(Math.random() * 1000));
        Booking booking = new Booking(bookingId, user.getUserId(), roomId, startTime, endTime, totalCost);
        booking.setHourlyRate(user.getHourlyRate());
        
        // Move to CONFIRMED state (as if payment was made)
        ((PendingState)booking.getState()).confirmPayment(booking);
        
        if (bookingDAO.saveBooking(booking)) {
            JOptionPane.showMessageDialog(this, 
                "Test late booking created!\n" +
                "Start time: " + startTime.format(DateTimeFormatter.ofPattern("HH:mm")) + "\n" +
                "Current time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + "\n" +
                "You are 45 minutes late - try to check in!", 
                "Test Booking Created", 
                JOptionPane.INFORMATION_MESSAGE);
            loadData();
        }
    }
}