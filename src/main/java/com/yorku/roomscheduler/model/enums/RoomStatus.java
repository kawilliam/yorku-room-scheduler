package com.yorku.roomscheduler.model.enums;

public enum RoomStatus {
	AVAILABLE("Available", "Room is available for booking"),
	OCCUPIED("Occupied", "Room is currently in use"),
	DISABLED("Disabled", "Room is disabled and cannot be booked"),
	MAINTENANCE("Maintenance", "Room is closed for maintenance");
	
	private final String displayName;
	private final String description;
	
	RoomStatus(String displayName, String description) {
		this.displayName = displayName;
		this.description = description;
	}
	
	public String getDiplayName() {
		return displayName;
	}
	
	public String getDescription() {
		return description;
	}
}
