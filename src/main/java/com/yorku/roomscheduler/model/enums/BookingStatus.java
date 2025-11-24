package com.yorku.roomscheduler.model.enums;

public enum BookingStatus {
	PENDING("Pending", "Awaiting payment confirmation"),
	CONFIRMED("Confirmed", "Payment received, awaiting check-in"),
	CHECKED_IN("Checked In", "User has checked in"),
	COMPLETED("Completed", "Booking finished successfully"),
	CANCELLED("Cancelled", "Booking was cancelled"),
	FORFEITED("Forfeited", "Deposit forfeited due to late check-in");
	
	private final String displayName;
	private final String description;
	
	BookingStatus(String displayName, String description) {
		this.displayName = displayName;
		this.description = description;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public String getDescription() {
		return description;
	}
}
