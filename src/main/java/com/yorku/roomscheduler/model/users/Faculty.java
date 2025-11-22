package com.yorku.roomscheduler.model.users;

import com.yorku.roomscheduler.model.enums.AccountType;

public class Faculty extends User {
    private String employeeId;
    private String department;
    
    public Faculty(String userId, String email, String password, String employeeId, String department) {
        super(userId, email, password, AccountType.FACULTY);
        this.employeeId = employeeId;
        this.department = department;
    }
    
    @Override
    public double getHourlyRate() {
        return 30.0; // Faculty pay $30/hour
    }
    
    public String getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }
}