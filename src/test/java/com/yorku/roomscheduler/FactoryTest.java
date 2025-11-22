package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.factory.UserFactory;
import com.yorku.roomscheduler.model.users.*;
import com.yorku.roomscheduler.model.enums.AccountType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    
    @Test
    public void testCreateStudent() {
        UserFactory factory = UserFactory.getFactory(AccountType.STUDENT);
        User student = factory.createUser("U001", "student@yorku.ca", "pass123", "217342957");
        
        assertTrue(student instanceof Student);
        assertEquals(20.0, student.getHourlyRate());
    }
    
    @Test
    public void testCreateFaculty() {
        UserFactory factory = UserFactory.getFactory(AccountType.FACULTY);
        User faculty = factory.createUser("U002", "faculty@yorku.ca", "pass123", "F001", "Computer Science");
        
        assertTrue(faculty instanceof Faculty);
        assertEquals(30.0, faculty.getHourlyRate());
    }
}