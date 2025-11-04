package com.yorku.roomscheduler.model.enums;

public enum AccountType {
	STUDENT("Student", 20.0),
	FACULTY("Faculty", 30.0),
	STAFF("Staff", 40.0),
	PARTNER("Partner", 50.0),
	ADMINISTRATOR("Administrator", 0.0);
	
	private final String displayName;
	private final double hourlyRate;
	
	AccountType(String displayName, double hourlyRate) {
		this.displayName = displayName;
		this.hourlyRate = hourlyRate;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
}
