package com.yorku.roomscheduler.model.users;

import com.yorku.roomscheduler.model.enums.AccountType;

public abstract class User {
    protected String userId;
    protected String email;
    protected String password;
    protected AccountType accountType;
    protected boolean verified;
    
    public User(String userId, String email, String password, AccountType accountType) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
        this.verified = false;
    }
    
    // Abstract method - each subclass must implement
    public abstract double getHourlyRate();
    
    // Common methods
    public void verify() { this.verified = true; }
    
    // Getters
    public String getUserId() { return userId; }
    public String getEmail() { return email; }
    public AccountType getAccountType() { return accountType; }
    public boolean isVerified() { return verified; }
}