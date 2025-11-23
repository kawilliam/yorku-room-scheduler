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

public class FacadeTest {
    
    @Test
    public void testCreateBookingWithFacade() {
        System.out.println("\n=== TEST: Create Booking Using Facade ===");
        
        // Setup
        BookingFacade facade = new BookingFacade();
        User student = UserFactory.getFactory(AccountType.STUDENT)
                                  .createUser("U001", "student@yorku.ca", "pass123", "217342957");
        
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        
        // Create booking - ONE SIMPLE METHOD CALL!
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
        System.out.println("\n✅ Booking created successfully with Facade!\n");
    }
    
    @Test
    public void testCancelBookingWithFacade() {
        System.out.println("\n=== TEST: Cancel Booking Using Facade ===");
        
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
        
        // Cancel booking - ONE SIMPLE METHOD CALL!
        boolean success = facade.cancelBooking(booking, faculty);
        
        // Verify
        assertTrue(success);
        assertEquals("CANCELLED", booking.getCurrentStateName());
        System.out.println("\n✅ Booking cancelled successfully with Facade!\n");
    }
    
    @Test
    public void testCompleteBookingFlow() {
        System.out.println("\n=== TEST: Complete Booking Flow ===");
        
        BookingFacade facade = new BookingFacade();
        User staff = UserFactory.getFactory(AccountType.STAFF)
                                .createUser("U003", "staff@yorku.ca", "pass123", "S001", "Admin");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(15);
        LocalDateTime end = start.plusHours(2);
        
        // 1. Create booking
        Booking booking = facade.createBooking(
            staff, "R003", start, end,
            new CreditCardPayment(), "1111222233334444"
        );
        
        assertNotNull(booking);
        
        // 2. Check in
        booking.checkIn();
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        
        // 3. Extend booking
        boolean extended = facade.extendBooking(
            booking, 1, staff,
            new CreditCardPayment(), "1111222233334444"
        );
        assertTrue(extended);
        
        // 4. Complete
        booking.complete();
        assertEquals("COMPLETED", booking.getCurrentStateName());
        
        System.out.println("\n✅ Complete booking flow successful!\n");
    }
}
