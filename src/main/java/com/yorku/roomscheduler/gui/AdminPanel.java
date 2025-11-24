package com.yorku.roomscheduler.gui;

import com.yorku.roomscheduler.dao.*;
import com.yorku.roomscheduler.model.Room;
import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.model.enums.RoomStatus;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 * Admin panel for room and system management
 */
public class AdminPanel extends JPanel {
    
    private MainFrame mainFrame;
    private String adminId;
    private RoomDAO roomDAO;
    private BookingDAO bookingDAO;
    
    private JTable roomTable;
    private JTable bookingTable;
    private DefaultTableModel roomTableModel;
    private DefaultTableModel bookingTableModel;
    private JButton addRoomButton;
    private JButton enableRoomButton;
    private JButton disableRoomButton;
    private JButton maintenanceButton;
    private JButton logoutButton;
    private JLabel adminInfoLabel;
    
    public AdminPanel(MainFrame mainFrame, String adminId) {
        this.mainFrame = mainFrame;
        this.adminId = adminId;
        this.roomDAO = new RoomDAO();
        this.bookingDAO = new BookingDAO();
        
        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(240, 240, 245));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        initComponents();
        loadData();
    }
    
    private void initComponents() {
        // Top panel - Admin info
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(139, 0, 0));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        adminInfoLabel = new JLabel("Administrator Panel - ID: " + adminId);
        adminInfoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        adminInfoLabel.setForeground(Color.WHITE);
        
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> mainFrame.logout());
        
        topPanel.add(adminInfoLabel, BorderLayout.WEST);
        topPanel.add(logoutButton, BorderLayout.EAST);
        
        add(topPanel, BorderLayout.NORTH);
        
        // Center panel - Split view
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        
        // Rooms Management Panel
        JPanel roomsPanel = new JPanel(new BorderLayout());
        roomsPanel.setBorder(BorderFactory.createTitledBorder("Room Management"));
        
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
        
        addRoomButton = new JButton("Add Room");
        addRoomButton.addActionListener(e -> handleAddRoom());
        
        enableRoomButton = new JButton("Enable Room");
        enableRoomButton.addActionListener(e -> handleEnableRoom());
        
        disableRoomButton = new JButton("Disable Room");
        disableRoomButton.addActionListener(e -> handleDisableRoom());
        
        maintenanceButton = new JButton("Set Maintenance");
        maintenanceButton.addActionListener(e -> handleMaintenanceMode());
        
        roomButtonPanel.add(addRoomButton);
        roomButtonPanel.add(enableRoomButton);
        roomButtonPanel.add(disableRoomButton);
        roomButtonPanel.add(maintenanceButton);
        
        roomsPanel.add(roomButtonPanel, BorderLayout.SOUTH);
        
        // All Bookings Panel
        JPanel bookingsPanel = new JPanel(new BorderLayout());
        bookingsPanel.setBorder(BorderFactory.createTitledBorder("All System Bookings"));
        
        String[] bookingColumns = {"Booking ID", "User ID", "Room", "Start Time", "End Time", "Status"};
        bookingTableModel = new DefaultTableModel(bookingColumns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        bookingTable = new JTable(bookingTableModel);
        
        JScrollPane bookingScrollPane = new JScrollPane(bookingTable);
        bookingsPanel.add(bookingScrollPane, BorderLayout.CENTER);
        
        JPanel bookingButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> loadData());
        bookingButtonPanel.add(refreshButton);
        
        bookingsPanel.add(bookingButtonPanel, BorderLayout.SOUTH);
        
        splitPane.setTopComponent(roomsPanel);
        splitPane.setBottomComponent(bookingsPanel);
        splitPane.setDividerLocation(300);
        
        add(splitPane, BorderLayout.CENTER);
    }
    
    private void loadData() {
        loadRooms();
        loadBookings();
    }
    
    private void loadRooms() {
        roomTableModel.setRowCount(0);
        List<Room> rooms = roomDAO.getAllRooms();
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
        bookingTableModel.setRowCount(0);
        List<Booking> bookings = bookingDAO.getAllBookings();
        
        for (Booking booking : bookings) {
            bookingTableModel.addRow(new Object[]{
                booking.getBookingId(),
                booking.getUserId(),
                booking.getRoomId(),
                booking.getStartTime().toString(),
                booking.getEndTime().toString(),
                booking.getCurrentStateName()
            });
        }
    }
    
    private void handleAddRoom() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        
        JTextField buildingField = new JTextField();
        JTextField roomNumberField = new JTextField();
        JSpinner capacitySpinner = new JSpinner(new SpinnerNumberModel(20, 1, 200, 1));
        
        panel.add(new JLabel("Building:"));
        panel.add(buildingField);
        panel.add(new JLabel("Room Number:"));
        panel.add(roomNumberField);
        panel.add(new JLabel("Capacity:"));
        panel.add(capacitySpinner);
        
        int result = JOptionPane.showConfirmDialog(this, panel, "Add New Room", JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            String building = buildingField.getText().trim();
            String roomNumber = roomNumberField.getText().trim();
            int capacity = (int) capacitySpinner.getValue();
            
            if (building.isEmpty() || roomNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Generate room ID
            String roomId = "R" + String.format("%03d", roomDAO.getAllRooms().size() + 1);
            
            Room room = new Room(roomId, building, roomNumber, capacity);
            
            if (roomDAO.saveRoom(room)) {
                JOptionPane.showMessageDialog(this, "Room added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadRooms();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add room", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void handleEnableRoom() {
        int selectedRow = roomTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a room", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String roomId = (String) roomTableModel.getValueAt(selectedRow, 0);
        
        if (roomDAO.updateRoomStatus(roomId, RoomStatus.AVAILABLE)) {
            JOptionPane.showMessageDialog(this, "Room enabled!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadRooms();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to enable room", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void handleDisableRoom() {
        int selectedRow = roomTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a room", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String roomId = (String) roomTableModel.getValueAt(selectedRow, 0);
        
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to disable this room?", 
            "Confirm", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            if (roomDAO.updateRoomStatus(roomId, RoomStatus.DISABLED)) {
                JOptionPane.showMessageDialog(this, "Room disabled!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadRooms();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to disable room", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void handleMaintenanceMode() {
        int selectedRow = roomTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a room", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String roomId = (String) roomTableModel.getValueAt(selectedRow, 0);
        
        if (roomDAO.updateRoomStatus(roomId, RoomStatus.MAINTENANCE)) {
            JOptionPane.showMessageDialog(this, "Room set to maintenance mode!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadRooms();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to set maintenance mode", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}