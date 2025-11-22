package com.yorku.roomscheduler.model.users;

import com.yorku.roomscheduler.model.enums.AccountType;

public class Student extends User {
    private final String studentNumber;
    
    public Student(String userId, String email, String password, String studentNumber) {
        super(userId, email, password, AccountType.STUDENT);
        this.studentNumber = studentNumber;
    }
    
    @Override
    public double getHourlyRate() {
        return 20.0; // Students pay $20/hour
    }
    
    public String getStudentNumber() { return studentNumber; }
}