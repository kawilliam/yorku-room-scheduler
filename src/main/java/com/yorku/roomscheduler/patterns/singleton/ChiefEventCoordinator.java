package com.yorku.roomscheduler.patterns.singleton;

import com.yorku.roomscheduler.model.users.Administrator;
import com.yorku.roomscheduler.dao.UserDAO;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

/**
 * SINGLETON PATTERN
 * Ensures only ONE Chief Event Coordinator exists who can create admin accounts
 */
public class ChiefEventCoordinator {
	
	private static ChiefEventCoordinator instance = null;
	private static final Object lock = new Object();
	
	private String coordinatorId;
	private String name;
	private UserDAO userDAO;
	private int adminCounter = 1;
	
	// Private constructor - can't be instantiated from outside
	private ChiefEventCoordinator() {
		this.coordinatorId = "COORD-001";
		this.name = "Chief Event Coordinator";
		this.userDAO = new UserDAO();
		System.out.println("ChiefEventCoordinator instance created (Singleton Pattern)");
		System.out.println("   This is the ONLY instance that can create admin accounts!");
	}
	
	// Thread-safe getInstance() with double-checked locking
	public static ChiefEventCoordinator getInstance() {
		if (instance == null) {
			synchronized(lock) {
				if (instance == null) {
					instance = new ChiefEventCoordinator();
				}
			}
		}
		return instance;
	}
	
	/**
	 * Create a new admin account
	 * This is the ONLY way to create admins (demonstrates Singleton pattern)
	 */
	public Administrator createAdminAccount(String name, String email) {
		System.out.println("\n" + "=".repeat(60));
		System.out.println("CREATING ADMIN ACCOUNT (via Singleton)");
		System.out.println("=".repeat(60));
		
		// Generate unique admin ID
		String adminId = "ADMIN" + String.format("%03d", adminCounter++);
		
		// Auto-generate secure password
		String generatedPassword = autoGenerateCredentials();
		
		System.out.println("Admin account created:");
		System.out.println("   Admin ID: " + adminId);
		System.out.println("   Name: " + name);
		System.out.println("   Email: " + email);
		System.out.println("   Generated Password: " + generatedPassword);
		
		// Create Administrator object
		Administrator admin = new Administrator(adminId, name, email, generatedPassword);
		
		// Save to CSV using direct CSV writing (since Administrator doesn't extend User)
		boolean saved = saveAdminToCSV(admin, generatedPassword);
		
		if (saved) {
			System.out.println("Admin account saved to database");
			System.out.println("=".repeat(60) + "\n");
			return admin;
		} else {
			System.out.println("ERROR: Failed to save admin account");
			System.out.println("=".repeat(60) + "\n");
			return null;
		}
	}
	
	/**
	 * Auto-generate a secure password
	 */
	private String autoGenerateCredentials() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
		SecureRandom random = new SecureRandom();
		StringBuilder password = new StringBuilder();
		
		// Generate 12-character password
		for (int i = 0; i < 12; i++) {
			password.append(chars.charAt(random.nextInt(chars.length())));
		}
		
		return password.toString();
	}
	
	/**
	 * Save admin to CSV file
	 * Format: userId, email, password, accountType, verified, extraData
	 */
	private boolean saveAdminToCSV(Administrator admin, String password) {
		try (CSVWriter writer = new CSVWriter(new FileWriter("src/main/resources/data/users.csv", true))) {
			String[] record = {
				admin.getAdminId(),        // userId
				admin.getEmail(),          // email
				password,                  // password (in real system, hash this!)
				"ADMINISTRATOR",           // accountType
				"true",                    // verified
				admin.getAccessLevel()     // extraData
			};
			writer.writeNext(record);
			return true;
		} catch (IOException e) {
			System.err.println("Error saving admin: " + e.getMessage());
			return false;
		}
	}
	
	/**
	 * Get list of all admin accounts (for reporting)
	 */
	public void listAllAdmins() {
		System.out.println("\nListing all administrator accounts:");
		System.out.println("(This would query the database for all ADMINISTRATOR accounts)");
		// Implementation would query UserDAO for all admin accounts
	}
	
	// Getters
	public String getCoordinatorId() {
		return coordinatorId;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Prevent cloning (enforces Singleton)
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cannot clone singleton ChiefEventCoordinator!");
	}
}
