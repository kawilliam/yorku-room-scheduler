package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.factory.UserFactory;
import com.yorku.roomscheduler.model.users.*;
import com.yorku.roomscheduler.model.enums.AccountType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Factory Method Pattern - User Creation
 */
public class FactoryTest {
    
    @Test
    public void testCreateStudent() {
        System.out.println("\n=== TEST: Factory Pattern - Create Student ===");
        
        UserFactory factory = UserFactory.getFactory(AccountType.STUDENT);
        User student = factory.createUser("U001", "student@yorku.ca", "pass123", "217342957");
        
        assertNotNull(student);
        assertTrue(student instanceof Student);
        assertEquals(20.0, student.getHourlyRate());
        assertEquals(AccountType.STUDENT, student.getAccountType());
        
        System.out.println("Student created: " + student.getEmail());
        System.out.println("Hourly rate: $" + student.getHourlyRate());
    }
    
    @Test
    public void testCreateFaculty() {
        System.out.println("\n=== TEST: Factory Pattern - Create Faculty ===");
        
        UserFactory factory = UserFactory.getFactory(AccountType.FACULTY);
        User faculty = factory.createUser("U002", "faculty@yorku.ca", "pass123", "F001", "Computer Science");
        
        assertNotNull(faculty);
        assertTrue(faculty instanceof Faculty);
        assertEquals(30.0, faculty.getHourlyRate());
        
        System.out.println("Faculty created: " + faculty.getEmail());
        System.out.println("Hourly rate: $" + faculty.getHourlyRate());
    }
    
    @Test
    public void testCreateStaff() {
        System.out.println("\n=== TEST: Factory Pattern - Create Staff ===");
        
        UserFactory factory = UserFactory.getFactory(AccountType.STAFF);
        User staff = factory.createUser("U003", "staff@yorku.ca", "pass123", "S001", "Administration");
        
        assertNotNull(staff);
        assertTrue(staff instanceof Staff);
        assertEquals(40.0, staff.getHourlyRate());
        
        System.out.println("Staff created: " + staff.getEmail());
        System.out.println("Hourly rate: $" + staff.getHourlyRate());
    }
    
    @Test
    public void testCreatePartner() {
        System.out.println("\n=== TEST: Factory Pattern - Create Partner ===");
        
        UserFactory factory = UserFactory.getFactory(AccountType.PARTNER);
        User partner = factory.createUser("U004", "partner@company.com", "pass123", "ORG-001", "Tech Corp");
        
        assertNotNull(partner);
        assertTrue(partner instanceof Partner);
        assertEquals(50.0, partner.getHourlyRate());
        
        System.out.println("Partner created: " + partner.getEmail());
        System.out.println("Hourly rate: $" + partner.getHourlyRate());
    }
    
    @Test
    public void testAllUserTypesHaveCorrectRates() {
        System.out.println("\n=== TEST: Verify All Hourly Rates ===");
        
        User student = UserFactory.getFactory(AccountType.STUDENT).createUser("U1", "s@yorku.ca", "p", "123");
        User faculty = UserFactory.getFactory(AccountType.FACULTY).createUser("U2", "f@yorku.ca", "p", "F1", "CS");
        User staff = UserFactory.getFactory(AccountType.STAFF).createUser("U3", "st@yorku.ca", "p", "S1", "Admin");
        User partner = UserFactory.getFactory(AccountType.PARTNER).createUser("U4", "p@co.com", "p", "O1", "Corp");
        
        assertEquals(20.0, student.getHourlyRate());
        assertEquals(30.0, faculty.getHourlyRate());
        assertEquals(40.0, staff.getHourlyRate());
        assertEquals(50.0, partner.getHourlyRate());
        
        System.out.println("All hourly rates correct!");
    }
}