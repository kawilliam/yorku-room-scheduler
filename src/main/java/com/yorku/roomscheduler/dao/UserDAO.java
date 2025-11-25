package com.yorku.roomscheduler.dao;

import com.yorku.roomscheduler.model.users.*;
import com.yorku.roomscheduler.model.enums.AccountType;
import com.yorku.roomscheduler.patterns.factory.UserFactory;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.exceptions.CsvValidationException;

/**
 * Data Access Object for User operations
 * Handles reading/writing users to CSV file
 */
public class UserDAO {
    
    private static final String CSV_FILE = "src/main/resources/data/users.csv";
    private static final String[] HEADERS = {"userId", "email", "password", "accountType", "verified", "extraData"};
    
    public UserDAO() {
        initializeCSVFile();
    }
    
    /**
     * Initialize CSV file with headers if it doesn't exist
     */
    private void initializeCSVFile() {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                try (CSVWriter writer = new CSVWriter(new FileWriter(file))) {
                    writer.writeNext(HEADERS);
                }
                System.out.println("Created users.csv with headers");
            } catch (IOException e) {
                System.err.println("Error creating users.csv: " + e.getMessage());
            }
        }
    }
    
    /**
     * Save a new user to CSV
     */
    public boolean saveUser(User user, String extraData, String password) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE, true))) {
            String[] record = {
                user.getUserId(),
                user.getEmail(),
                password, // In real system, hash the password
                user.getAccountType().name(),
                String.valueOf(user.isVerified()),
                extraData // studentNumber, employeeId/department, or organizationId/company
            };
            writer.writeNext(record);
            return true;
        } catch (IOException e) {
            System.err.println("Error saving user: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Find user by email
     */
    public User findByEmail(String email) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[1].equals(email)) {
                    return reconstructUser(line);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading users: " + e.getMessage());
        }
        return null;
    }
    
    public User findByUserId(String userId) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[0].equals(userId)) {
                    return reconstructUser(line);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading users: " + e.getMessage());
        }
        return null;
    }
    
    /**
     * Validate user login
     */
    public boolean validateLogin(String email, String password) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[1].equals(email)) {
                   if (line[2].equals(password)) {
                	   return true;
                   }
                     // Simplified for demo
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error validating login: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Get all users
     */
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                User user = reconstructUser(line);
                if (user != null) {
                    users.add(user);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading users: " + e.getMessage());
        }
        return users;
    }
    
    /**
     * Check if email already exists
     */
    public boolean emailExists(String email) {
        return findByEmail(email) != null;
    }
    
    /**
     * Reconstruct User object from CSV line
     */
    private User reconstructUser(String[] line) {
        try {
            String userId = line[0];
            String email = line[1];
            String password = "***"; // Don't expose password
            AccountType accountType = AccountType.valueOf(line[3]);
            String extraData = line.length > 5 ? line[5] : "";
            
            // ADMINISTRATOR is special - doesn't extend User
            if (accountType == AccountType.ADMINISTRATOR) {
                System.out.println("DEBUG: Skipping administrator account in User reconstruction");
                return null;
            }
            
            // Use factory to create appropriate user type
            UserFactory factory = UserFactory.getFactory(accountType);
            
            // Parse extraData based on account type
            String[] extras = extraData.split("\\|");
            User user = factory.createUser(userId, email, password, extras);
            
            if (line[4].equals("true")) {
                user.verify();
            }
            
            return user;
        } catch (Exception e) {
            System.err.println("Error reconstructing user: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * Validate admin login (separate from regular users)
     */
    public boolean isAdminAccount(String email) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[1].equals(email) && line[3].equals("ADMINISTRATOR")) {
                    return true;
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error checking admin: " + e.getMessage());
        }
        return false;
    }
}