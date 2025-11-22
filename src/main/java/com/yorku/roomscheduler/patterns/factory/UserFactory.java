package com.yorku.roomscheduler.patterns.factory;

import com.yorku.roomscheduler.model.users.*;
import com.yorku.roomscheduler.model.enums.AccountType;

public abstract class UserFactory {
    
    // Factory method - subclasses implement this
    public abstract User createUser(String userId, String email, String password, String... extraParams);
    
    // Static method to get the right factory
    public static UserFactory getFactory(AccountType type) {
        switch(type) {
            case STUDENT: return new StudentFactory();
            case FACULTY: return new FacultyFactory();
            case STAFF: return new StaffFactory();
            case PARTNER: return new PartnerFactory();
            default: throw new IllegalArgumentException("Unknown account type");
        }
    }
}