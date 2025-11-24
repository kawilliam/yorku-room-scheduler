package com.yorku.roomscheduler.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Main application window for YorkU Room Scheduler
 */
public class MainFrame extends JFrame {
    
    private static MainFrame instance;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    
    // Panels
    private LoginPanel loginPanel;
    private RegistrationPanel registrationPanel;
    private BookingPanel bookingPanel;
    private AdminPanel adminPanel;
    
    private MainFrame() {
        setTitle("YorkU Conference Room Scheduler");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        loginPanel = new LoginPanel(this);
        registrationPanel = new RegistrationPanel(this);
        
        mainPanel.add(loginPanel, "LOGIN");
        mainPanel.add(registrationPanel, "REGISTRATION");
        
        add(mainPanel);
        
        showLoginPanel();
    }
    
    public static MainFrame getInstance() {
        if (instance == null) {
            instance = new MainFrame();
        }
        return instance;
    }
    
    public void showLoginPanel() {
        cardLayout.show(mainPanel, "LOGIN");
    }
    
    public void showRegistrationPanel() {
        cardLayout.show(mainPanel, "REGISTRATION");
    }
    
    public void showBookingPanel(String userId) {
        System.out.println("DEBUG MAINFRAME: showBookingPanel called with userId: " + userId);  // ADD DEBUG
        
        // Remove ALL components from mainPanel and rebuild
        mainPanel.removeAll();
        
        // Re-add login and registration panels
        mainPanel.add(loginPanel, "LOGIN");
        mainPanel.add(registrationPanel, "REGISTRATION");
        
        // Create new booking panel with correct userId
        bookingPanel = new BookingPanel(this, userId);
        mainPanel.add(bookingPanel, "BOOKING");
        
        // Show the booking panel
        cardLayout.show(mainPanel, "BOOKING");
        
        // Force refresh
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    public void showAdminPanel(String adminId) {
        System.out.println("DEBUG MAINFRAME: showAdminPanel called with adminId: " + adminId);  // ADD DEBUG
        
        // Remove ALL components from mainPanel and rebuild
        mainPanel.removeAll();
        
        // Re-add login and registration panels
        mainPanel.add(loginPanel, "LOGIN");
        mainPanel.add(registrationPanel, "REGISTRATION");
        
        // Create new admin panel with correct adminId
        adminPanel = new AdminPanel(this, adminId);
        mainPanel.add(adminPanel, "ADMIN");
        
        // Show the admin panel
        cardLayout.show(mainPanel, "ADMIN");
        
        // Force refresh
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    public void logout() {
        bookingPanel = null;
        adminPanel = null;
        showLoginPanel();
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = MainFrame.getInstance();
            frame.setVisible(true);
        });
    }
}