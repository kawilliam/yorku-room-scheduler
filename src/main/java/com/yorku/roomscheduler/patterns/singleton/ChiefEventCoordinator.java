package com.yorku.roomscheduler.patterns.singleton;

import com.yorku.roomscheduler.model.users.Administrator;

public class ChiefEventCoordinator {
	
	private static ChiefEventCoordinator instance = null;
	private static final Object lock = new Object();
	
	private String coordinatorId;
	private String name;
	
	private ChiefEventCoordinator() {
		this.coordinatorId = "COORD-001";
		this.name = "Chief Event Coordinator";
		System.out.println("ChiefEventCoordinator instance created (Singleton Pattern)");
	}
	
	public static ChiefEventCoordinator getInstance() {
		if (instance == null) {
			synchronized(lock) {
				if (instance == null) {
					instance =  new ChiefEventCoordinator();
				}
			}
		}
		return instance;
	}
	
	public Administrator createAdminAccount(String name, String email) {
		String generatedPassword = autoGenerateCredentials();
		System.out.println("Creating admin account:");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Generated Password: " + generatedPassword);
		
		return null;
	}
	
	private String autoGenerateCredentials() {
		return "Admin" + System.currentTimeMillis();
	}
	
	public String getCoordinatorId() {
		return coordinatorId;
	}
	
	public String getName() {
		return name;
	}
}
