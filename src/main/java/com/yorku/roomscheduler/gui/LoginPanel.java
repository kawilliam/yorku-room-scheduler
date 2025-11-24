package com.yorku.roomscheduler.gui;

import com.yorku.roomscheduler.dao.UserDAO;
import com.yorku.roomscheduler.model.users.User;
import javax.swing.*;
import java.awt.*;

/**
 * Login panel for user authentication
 */
public class LoginPanel extends JPanel {
    
    private MainFrame mainFrame;
    private UserDAO userDAO;
    
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    private JLabel messageLabel;
    
    public LoginPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.userDAO = new UserDAO();
        
        setLayout(new GridBagLayout());
        setBackground(new Color(240, 240, 245));
        
        initComponents();
    }
    
    private void initComponents() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        // Title
        JLabel titleLabel = new JLabel("YorkU Room Scheduler");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setForeground(new Color(139, 0, 0));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);
        
        // Subtitle
        JLabel subtitleLabel = new JLabel("Conference Room Booking System");
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridy = 1;
        add(subtitleLabel, gbc);
        
        // Spacing
        gbc.gridy = 2;
        add(Box.createVerticalStrut(20), gbc);
        
        // Email label
        gbc.gridwidth = 1;
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(emailLabel, gbc);
        
        // Email field
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        emailField = new JTextField(20);
        emailField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(emailField, gbc);
        
        // Password label
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(passwordLabel, gbc);
        
        // Password field
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(passwordField, gbc);
        
        // Message label
        gbc.gridy = 5;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        messageLabel = new JLabel(" ");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        messageLabel.setForeground(Color.RED);
        add(messageLabel, gbc);
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(new Color(240, 240, 245));
        
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(new Color(139, 0, 0));
        loginButton.setForeground(Color.BLACK);
        loginButton.setFocusPainted(false);
        loginButton.setPreferredSize(new Dimension(100, 35));
        loginButton.addActionListener(e -> handleLogin());
        
        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.PLAIN, 14));
        registerButton.setPreferredSize(new Dimension(100, 35));
        registerButton.addActionListener(e -> mainFrame.showRegistrationPanel());
        
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        
        gbc.gridy = 6;
        add(buttonPanel, gbc);
        
        // Enter key support
        passwordField.addActionListener(e -> handleLogin());
    }
    
    private void handleLogin() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        
        if (email.isEmpty() || password.isEmpty()) {
            showMessage("Please enter email and password", Color.RED);
            return;
        }
        
        // Validate login
        if (userDAO.validateLogin(email, password)) {
        	if (userDAO.isAdminAccount(email)) {
                showMessage("Login successful!", new Color(0, 128, 0));
                mainFrame.showAdminPanel("ADMIN001");  // Use fixed admin ID
                
                // Clear fields
                emailField.setText("");
                passwordField.setText("");
            } else {
                User user = userDAO.findByEmail(email);
                System.out.println("DEBUG LOGIN: User found: " + (user != null ? user.getUserId() : "NULL"));
                
                if (user != null) {
                    showMessage("Login successful!", new Color(0, 128, 0));
                    mainFrame.showBookingPanel(user.getUserId());
                    
                    // Clear fields
                    emailField.setText("");
                    passwordField.setText("");
                } else {
                    showMessage("User not found", Color.RED);
                }
            }
        } else {
            showMessage("Invalid email or password", Color.RED);
        }
    }
    
    private void showMessage(String message, Color color) {
        messageLabel.setText(message);
        messageLabel.setForeground(color);
    }
}