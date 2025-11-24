package com.yorku.roomscheduler.gui;

import com.yorku.roomscheduler.patterns.singleton.ChiefEventCoordinator;
import com.yorku.roomscheduler.model.users.Administrator;
import javax.swing.*;
import java.awt.*;

/**
 * Special panel for Chief Event Coordinator to create admin accounts
 * Demonstrates the Singleton pattern in action
 */
public class ChiefCoordinatorPanel extends JPanel {
    
    private MainFrame mainFrame;
    private ChiefEventCoordinator coordinator;
    private JTextArea logArea;
    private JButton createAdminButton;
    private JButton logoutButton;
    
    public ChiefCoordinatorPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        
        // Get the singleton instance - ONLY way to create admins!
        this.coordinator = ChiefEventCoordinator.getInstance();
        
        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(240, 240, 245));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        initComponents();
    }
    
    private void initComponents() {
        // Top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(139, 0, 0));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel titleLabel = new JLabel("Chief Event Coordinator Panel - " + coordinator.getName());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setForeground(Color.WHITE);
        
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> mainFrame.logout());
        
        topPanel.add(titleLabel, BorderLayout.WEST);
        topPanel.add(logoutButton, BorderLayout.EAST);
        
        add(topPanel, BorderLayout.NORTH);
        
        // Center panel - Controls
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(BorderFactory.createTitledBorder("Administrator Management"));
        
        // Info label
        JLabel infoLabel = new JLabel("<html><b>Singleton Pattern Demonstration:</b><br>" +
            "Only the Chief Event Coordinator (YOU) can create admin accounts.<br>" +
            "This ensures security and proper access control.</html>");
        infoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(infoLabel);
        
        centerPanel.add(Box.createVerticalStrut(20));
        
        // Create Admin Button
        createAdminButton = new JButton("Create New Administrator Account");
        createAdminButton.setFont(new Font("Arial", Font.BOLD, 14));
        createAdminButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        createAdminButton.addActionListener(e -> handleCreateAdmin());
        centerPanel.add(createAdminButton);
        
        add(centerPanel, BorderLayout.CENTER);
        
        // Bottom panel - Log area
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createTitledBorder("Activity Log"));
        
        logArea = new JTextArea(15, 50);
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(logArea);
        
        bottomPanel.add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        
        // Initial log message
        log("Chief Event Coordinator Panel Initialized");
        log("Singleton instance retrieved: " + coordinator.getCoordinatorId());
        log("Ready to create administrator accounts\n");
    }
    
    private void handleCreateAdmin() {
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        
        panel.add(new JLabel("Admin Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Admin Email:"));
        panel.add(emailField);
        
        int result = JOptionPane.showConfirmDialog(
            this, 
            panel, 
            "Create Administrator Account", 
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            
            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Please fill in all fields", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Create admin using Singleton!
            log("\n" + "=".repeat(60));
            log("Creating admin account via Singleton...");
            log("   Coordinator: " + coordinator.getName());
            log("   Coordinator ID: " + coordinator.getCoordinatorId());
            
            Administrator admin = coordinator.createAdminAccount(name, email);
            
            if (admin != null) {
                log("SUCCESS! Admin account created:");
                log("   Admin ID: " + admin.getAdminId());
                log("   Name: " + admin.getName());
                log("   Email: " + admin.getEmail());
                log("   Password: " + admin.getPassword() + " (auto-generated)");
                log("   Access Level: " + admin.getAccessLevel());
                log("=".repeat(60) + "\n");
                
                // Show success dialog with credentials
                JTextArea credentialsArea = new JTextArea(
                    "Administrator Account Created!\n\n" +
                    "Admin ID: " + admin.getAdminId() + "\n" +
                    "Name: " + admin.getName() + "\n" +
                    "Email: " + admin.getEmail() + "\n" +
                    "Password: " + admin.getPassword() + "\n\n" +
                    "IMPORTANT: Save these credentials!\n" +
                    "The password is auto-generated and cannot be recovered."
                );
                credentialsArea.setEditable(false);
                credentialsArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
                
                JOptionPane.showMessageDialog(this,
                    new JScrollPane(credentialsArea),
                    "Admin Created Successfully",
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                log("ERROR: FAILED to create admin account");
                log("=".repeat(60) + "\n");
                
                JOptionPane.showMessageDialog(this,
                    "Failed to create admin account!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void log(String message) {
        logArea.append(message + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }
}