package com.yorku.roomscheduler.model.users;

/**
 * Created by ChiefEventCoordinator (Singleton Pattern).
 */
public class Administrator {
	
	private final String adminId, name, email, password, accessLevel;
	
	public Administrator(String adminId, String name, String email, String password) {
		this.adminId = adminId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.accessLevel = "FULL";
	}
	
	public void addRoom(String roomId) {
		System.out.println("Admin " + name + " adding room: " + roomId);
	}
	
	public void enableRoom(String roomId) {
		System.out.println("Admin " + name + " enabling room: " + roomId);
	}
	
	public void disableRoom(String roomId) {
		System.out.println("Admin " + name + " disabling room: " + roomId);
	}
	
	public void generateReport() {
		System.out.println("Admin " + name + " generating system report");
	}
	
	public String getAdminId() {
		return adminId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAccessLevel() {
		return accessLevel;
	}

    public String getPassword() {
        return password;
    }
}
