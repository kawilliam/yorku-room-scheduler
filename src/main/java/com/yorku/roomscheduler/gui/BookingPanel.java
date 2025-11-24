package com.yorku.roomscheduler.gui;

import com.yorku.roomscheduler.dao.*;
import com.yorku.roomscheduler.model.*;
import com.yorku.roomscheduler.model.users.User;
import com.yorku.roomscheduler.patterns.facade.BookingFacade;
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
    	System.out.println("DEBUG: Loading bookings for userId: " + userId);  // ADD THIS
        bookingTableModel.setRowCount(0);
        List<Booking> bookings = bookingDAO.getBookingsByUser(userId);
        System.out.println("DEBUG: Found " + bookings.size() + " bookings");
        bookingTableModel.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        for (Booking booking : bookings) {
            bookingTableModel.addRow(new Object[]{
                booking.getBookingId(),
                booking.getRoomId(),
                booking.getStartTime().format(formatter),
                booking.getEndTime().format(formatter),
                "$" + booking.getTotalCost(),
                booking.getCurrentStateName()
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
            booking.checkIn();
            bookingDAO.updateBooking(booking);
            JOptionPane.showMessageDialog(this, "Checked in successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadBookings();
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
            
            if (booking.getCurrentStateName().equals("CANCELLED")) {
                JOptionPane.showMessageDialog(this, "Booking cancelled!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Cannot cancel in current state", "Error", JOptionPane.ERROR_MESSAGE);
            }
            loadBookings();
        }
    }
}