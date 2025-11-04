package com.yorku.roomscheduler.model.enums;

public enum PaymentMethod {
	CREDIT_CARD("Credit Card", "Payment via credit card"),
	DEBIT_CARD("Debit Card", "Payment via debit card"),
	INSTITUTIONAL_BILLING("Institutional Billing", "Billed to university department");
	
	private final String displayName;
	private final String description;
	
	PaymentMethod(String displayName, String description) {
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
