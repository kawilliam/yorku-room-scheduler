package com.yorku.roomscheduler.gui;

import com.yorku.roomscheduler.dao.UserDAO;
import com.yorku.roomscheduler.model.users.User;
import com.yorku.roomscheduler.model.enums.AccountType;
import com.yorku.roomscheduler.patterns.factory.UserFactory;
import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Registration panel for new user sign-up
 */
public class RegistrationPanel extends JPanel {
    
    private MainFrame mainFrame;
    private UserDAO userDAO;
    
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JComboBox<String> accountTypeCombo;
    private JTextField extraField1;
    private JTextField extraField2;
    private JLabel extraLabel1;
    private JLabel extraLabel2;
    private JButton registerButton;
    private JButton backButton;
    private JLabel messageLabel;
    
    
    private int userIdCounter;
    
    public RegistrationPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.userDAO = new UserDAO();
        this.userIdCounter = getNextUserId();
        
        setLayout(new GridBagLayout());
        setBackground(new Color(240, 240, 245));
        
        initComponents();
    }
    
    private void initComponents() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        
        // Title
        JLabel titleLabel = new JLabel("Create New Account");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(139, 0, 0));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);
        
        // Email
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Email:"), gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        emailField = new JTextField(20);
        add(emailField, gbc);
        
        // Password
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Password:"), gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        passwordField = new JPasswordField(20);
        add(passwordField, gbc);
        
        // Confirm Password
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Confirm Password:"), gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        confirmPasswordField = new JPasswordField(20);
        add(confirmPasswordField, gbc);
        
        // Account Type
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Account Type:"), gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        String[] accountTypes = {"Student", "Faculty", "Staff", "Partner"};
        accountTypeCombo = new JComboBox<>(accountTypes);
        accountTypeCombo.addActionListener(e -> updateExtraFields());
        add(accountTypeCombo, gbc);
        
        // Extra Field 1
        gbc.gridy = 5;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        extraLabel1 = new JLabel("Student Number:");
        add(extraLabel1, gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        extraField1 = new JTextField(20);
        add(extraField1, gbc);
        
        // Extra Field 2
        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        extraLabel2 = new JLabel("");
        add(extraLabel2, gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        extraField2 = new JTextField(20);
        extraField2.setVisible(false);
        add(extraField2, gbc);
        
        // Message
        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        messageLabel = new JLabel(" ");
        messageLabel.setForeground(Color.RED);
        add(messageLabel, gbc);
        
        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(new Color(240, 240, 245));
        
        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        registerButton.setBackground(new Color(139, 0, 0));
        registerButton.setForeground(Color.BLACK);
        registerButton.setFocusPainted(false);
        registerButton.addActionListener(e -> handleRegistration());
        
        backButton = new JButton("Back to Login");
        backButton.setFont(new Font("Arial", Font.PLAIN, 14));
        backButton.addActionListener(e -> mainFrame.showLoginPanel());
        
        buttonPanel.add(registerButton);
        buttonPanel.add(backButton);
        
        gbc.gridy = 8;
        add(buttonPanel, gbc);
    }
    
    private void updateExtraFields() {
        String selected = (String) accountTypeCombo.getSelectedItem();
        
        switch (selected) {
            case "Student":
                extraLabel1.setText("Student Number:");
                extraField1.setVisible(true);
                extraLabel2.setText("");
                extraField2.setVisible(false);
                break;
            case "Faculty":
                extraLabel1.setText("Employee ID:");
                extraField1.setVisible(true);
                extraLabel2.setText("Department:");
                extraField2.setVisible(true);
                break;
            case "Staff":
                extraLabel1.setText("Employee ID:");
                extraField1.setVisible(true);
                extraLabel2.setText("Department:");
                extraField2.setVisible(true);
                break;
            case "Partner":
                extraLabel1.setText("Organization ID:");
                extraField1.setVisible(true);
                extraLabel2.setText("Company Name:");
                extraField2.setVisible(true);
                break;
        }
        revalidate();
        repaint();
    }
    
    private void handleRegistration() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        String accountType = (String) accountTypeCombo.getSelectedItem();
        String extra1 = extraField1.getText().trim();
        String extra2 = extraField2.getText().trim();
        
        // Validation
        if (email.isEmpty() || password.isEmpty()) {
            showMessage("Please fill in all fields", Color.RED);
            return;
        }
        
        if (!password.equals(confirmPassword)) {
            showMessage("Passwords do not match", Color.RED);
            return;
        }
        
        if (password.length() < 6) {
            showMessage("Password must be at least 6 characters", Color.RED);
            return;
        }
        
        if (userDAO.emailExists(email)) {
            showMessage("Email already exists", Color.RED);
            return;
        }
        
        // Create user
        try {
            AccountType type = AccountType.valueOf(accountType.toUpperCase());
            UserFactory factory = UserFactory.getFactory(type);
            
            String userId = "U" + (userIdCounter++);
            User user;
            String extraData;
            
            switch (accountType) {
                case "Student":
                    user = factory.createUser(userId, email, password, extra1);
                    extraData = extra1;
                    break;
                case "Faculty":
                case "Staff":
                    user = factory.createUser(userId, email, password, extra1, extra2);
                    extraData = extra1 + "|" + extra2;
                    break;
                case "Partner":
                    user = factory.createUser(userId, email, password, extra1, extra2);
                    extraData = extra1 + "|" + extra2;
                    break;
                default:
                    showMessage("Invalid account type", Color.RED);
                    return;
            }
            
            // Save to CSV
            if (userDAO.saveUser(user, extraData, password)) {
                showMessage("Registration successful!", new Color(0, 128, 0));
                JOptionPane.showMessageDialog(this, 
                    "Account created successfully!\nYou can now login.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // Clear fields
                clearFields();
                
                // Go back to login
                mainFrame.showLoginPanel();
            } else {
                showMessage("Error saving user", Color.RED);
            }
            
        } catch (Exception e) {
            showMessage("Error: " + e.getMessage(), Color.RED);
        }
    }
    
    private void clearFields() {
        emailField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        extraField1.setText("");
        extraField2.setText("");
        accountTypeCombo.setSelectedIndex(0);
        messageLabel.setText(" ");
    }
    
    private void showMessage(String message, Color color) {
        messageLabel.setText(message);
        messageLabel.setForeground(color);
    }
    
    private int getNextUserId() {
        int maxId = 999;  // Start below 1000
        
        List<User> existingUsers = userDAO.getAllUsers();
        for (User user : existingUsers) {
            String userId = user.getUserId();
            if (userId.startsWith("U")) {
                try {
                    int id = Integer.parseInt(userId.substring(1));
                    if (id > maxId) {
                        maxId = id;
                    }
                } catch (NumberFormatException e) {
                    // Skip invalid userIds
                }
            }
        }
        
        return maxId + 1;
    }
}

