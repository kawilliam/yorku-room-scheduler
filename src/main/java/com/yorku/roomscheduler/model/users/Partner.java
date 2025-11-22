package com.yorku.roomscheduler.model.users;

import com.yorku.roomscheduler.model.enums.AccountType;

public class Partner extends User {
    private String organizationId;
    private String companyName;
    
    public Partner(String userId, String email, String password, String organizationId, String companyName) {
        super(userId, email, password, AccountType.PARTNER);
        this.organizationId = organizationId;
        this.companyName = companyName;
    }
    
    @Override
    public double getHourlyRate() {
        return 50.0; // Partners pay $50/hour.
    }
    
    public String getOrganizationId() { return organizationId; }
    public String getCompanyName() { return companyName; }
}