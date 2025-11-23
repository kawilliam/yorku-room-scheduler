package com.yorku.roomscheduler;

import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.patterns.state.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class StateTest {
    
    @Test
    public void testBookingLifecycle() {
        // Create booking (starts in PENDING state)
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B001", "U001", "R001", start, end, 40.0);
        booking.setHourlyRate(20.0);
        
        System.out.println("\n=== TEST: Normal Booking Lifecycle ===");
        
        // 1. Starts as PENDING
        assertEquals("PENDING", booking.getCurrentStateName());
        
        // 2. Confirm payment
        ((PendingState)booking.getState()).confirmPayment(booking);
        assertEquals("CONFIRMED", booking.getCurrentStateName());
        
        // 3. Check in
        booking.checkIn();
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        
        // 4. Extend booking
        booking.extend(1);
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        
        // 5. Complete booking
        booking.complete();
        assertEquals("COMPLETED", booking.getCurrentStateName());
    }
    
    @Test
    public void testCannotCancelAfterCheckIn() {
        System.out.println("\n=== TEST: Cannot Cancel After Check-in (Req10) ===");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B002", "U002", "R002", start, end, 40.0);
        
        // Move to CHECKED_IN state
        booking.setState(new CheckedInState());
        
        // Try to cancel - should fail
        booking.cancel();
        
        // Should still be checked in
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
    }
    
    @Test
    public void testCanCancelBeforeCheckIn() {
        System.out.println("\n=== TEST: Can Cancel Before Check-in ===");
        
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B003", "U003", "R003", start, end, 40.0);
        
        // Move to CONFIRMED state
        booking.setState(new ConfirmedState());
        
        // Cancel - should work
        booking.cancel();
        
        assertEquals("CANCELLED", booking.getCurrentStateName());
    }
    
    @Test
    public void testCanExtendOnlyWhenCheckedIn() {
        System.out.println("\n=== TEST: Can Extend Only When Checked In (Req8) ===");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B004", "U004", "R004", start, end, 40.0);
        booking.setHourlyRate(20.0);
        
        // Try to extend in PENDING state - should fail
        booking.extend(1);
        
        // Move to CHECKED_IN
        booking.setState(new CheckedInState());
        
        // Now extend should work
        booking.extend(1);
        
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
    }
}
