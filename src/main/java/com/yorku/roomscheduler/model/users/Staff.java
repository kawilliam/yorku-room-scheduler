package com.yorku.roomscheduler.model.users;

import com.yorku.roomscheduler.model.enums.AccountType;

public class Staff extends User {
    private String employeeId;
    private String department;
    
    public Staff(String userId, String email, String password, String employeeId, String department) {
        super(userId, email, password, AccountType.STAFF);
        this.employeeId = employeeId;
        this.department = department;
    }
    
    @Override
    public double getHourlyRate() {
        return 40.0; // Staff pay $40/hour
    }
    
    public String getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }
}