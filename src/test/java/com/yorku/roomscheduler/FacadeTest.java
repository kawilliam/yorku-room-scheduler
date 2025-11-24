package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.facade.BookingFacade;
import com.yorku.roomscheduler.patterns.strategy.CreditCardPayment;
import com.yorku.roomscheduler.patterns.factory.UserFactory;
import com.yorku.roomscheduler.model.users.User;
import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.model.enums.AccountType;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Facade Pattern - Simplified Booking Interface
 */
public class FacadeTest {
    
    @Test
    public void testCreateBookingWithFacade() {
        System.out.println("\n=== TEST: Facade Pattern - Create Booking ===");
        
        // Setup
        BookingFacade facade = new BookingFacade();
        User student = UserFactory.getFactory(AccountType.STUDENT)
                                  .createUser("U001", "student@yorku.ca", "pass123", "217342957");
        
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        
        // Create booking - ONE SIMPLE METHOD CALL
        Booking booking = facade.createBooking(
            student, 
            "R001", 
            start, 
            end,
            new CreditCardPayment(),
            "1234567812345678"
        );
        
        // Verify
        assertNotNull(booking);
        assertEquals("CONFIRMED", booking.getCurrentStateName());
        System.out.println("TEST PASSED: Booking created successfully with Facade");
    }
    
    @Test
    public void testCancelBookingWithFacade() {
        System.out.println("\n=== TEST: Facade Pattern - Cancel Booking ===");
        
        // Setup - create a booking first
        BookingFacade facade = new BookingFacade();
        User faculty = UserFactory.getFactory(AccountType.FACULTY)
                                  .createUser("U002", "faculty@yorku.ca", "pass123", "F001", "CS");
        
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(3);
        
        Booking booking = facade.createBooking(
            faculty, "R002", start, end,
            new CreditCardPayment(), "8765432187654321"
        );
        
        // Cancel booking - ONE SIMPLE METHOD CALL
        boolean success = facade.cancelBooking(booking, faculty);
        
        // Verify
        assertTrue(success);
        assertEquals("CANCELLED", booking.getCurrentStateName());
        System.out.println("TEST PASSED: Booking cancelled successfully with Facade");
    }
    
    @Test
    public void testCompleteBookingFlow() {
        System.out.println("\n=== TEST: Facade Pattern - Complete Flow ===");
        
        BookingFacade facade = new BookingFacade();
        User staff = UserFactory.getFactory(AccountType.STAFF)
                                .createUser("U003", "staff@yorku.ca", "pass123", "S001", "Admin");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(15);
        LocalDateTime end = start.plusHours(2);
        
        // 1. Create booking
        System.out.println("\n--- Step 1: Creating booking ---");
        Booking booking = facade.createBooking(
            staff, "R003", start, end,
            new CreditCardPayment(), "1111222233334444"
        );
        
        assertNotNull(booking);
        
        // 2. Check in
        System.out.println("\n--- Step 2: Checking in ---");
        booking.checkIn();
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        
        // 3. Extend booking
        System.out.println("\n--- Step 3: Extending booking ---");
        boolean extended = facade.extendBooking(
            booking, 1, staff,
            new CreditCardPayment(), "1111222233334444"
        );
        assertTrue(extended);
        
        // 4. Complete
        System.out.println("\n--- Step 4: Completing booking ---");
        booking.complete();
        assertEquals("COMPLETED", booking.getCurrentStateName());
        
        System.out.println("TEST PASSED: Complete booking flow successful");
    }
    
    @Test
    public void testFacadeSimplification() {
        System.out.println("\n=== TEST: Facade Pattern - Simplification ===");
        System.out.println("Without Facade: Would need to manually:");
        System.out.println("  1. Check room availability");
        System.out.println("  2. Calculate costs");
        System.out.println("  3. Process payment");
        System.out.println("  4. Create booking");
        System.out.println("  5. Lock room");
        System.out.println("  6. Send email");
        System.out.println("  7. Configure sensor");
        System.out.println("\nWith Facade: Just call facade.createBooking()");
        
        BookingFacade facade = new BookingFacade();
        User partner = UserFactory.getFactory(AccountType.PARTNER)
                                  .createUser("U004", "partner@company.com", "pass123", "ORG-001", "Tech Corp");
        
        LocalDateTime start = LocalDateTime.now().plusHours(3);
        LocalDateTime end = start.plusHours(4);
        
        Booking booking = facade.createBooking(
            partner, "R004", start, end,
            new CreditCardPayment(), "9999888877776666"
        );
        
        assertNotNull(booking);
        System.out.println("TEST PASSED: Facade successfully simplified complex process");
    }
    
    @Test
    public void testCannotExtendBeforeCheckIn() {
        System.out.println("\n=== TEST: Facade Pattern - Cannot Extend Before Check-in ===");
        
        BookingFacade facade = new BookingFacade();
        User student = UserFactory.getFactory(AccountType.STUDENT)
                                  .createUser("U005", "student2@yorku.ca", "pass123", "217342958");
        
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        
        Booking booking = facade.createBooking(
            student, "R005", start, end,
            new CreditCardPayment(), "5555444433332222"
        );
        
        // Try to extend without checking in - should fail
        boolean extended = facade.extendBooking(
            booking, 1, student,
            new CreditCardPayment(), "5555444433332222"
        );
        
        assertFalse(extended);
        System.out.println("TEST PASSED: Correctly prevented extension before check-in");
    }
}