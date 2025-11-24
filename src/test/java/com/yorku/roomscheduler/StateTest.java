package com.yorku.roomscheduler;

import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.patterns.state.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for State Pattern - Booking Lifecycle
 */
public class StateTest {
    
    @Test
    public void testBookingLifecycle() {
        System.out.println("\n=== TEST: State Pattern - Normal Booking Lifecycle ===");
        
        // Create booking (starts in PENDING state)
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B001", "U001", "R001", start, end, 40.0);
        booking.setHourlyRate(20.0);
        
        // 1. Starts as PENDING
        assertEquals("PENDING", booking.getCurrentStateName());
        System.out.println("Initial state: PENDING");
        
        // 2. Confirm payment
        ((PendingState)booking.getState()).confirmPayment(booking);
        assertEquals("CONFIRMED", booking.getCurrentStateName());
        System.out.println("After payment: CONFIRMED");
        
        // 3. Check in
        booking.checkIn();
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        System.out.println("After check-in: CHECKED_IN");
        
        // 4. Extend booking
        booking.extend(1);
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        System.out.println("After extension: Still CHECKED_IN");
        
        // 5. Complete booking
        booking.complete();
        assertEquals("COMPLETED", booking.getCurrentStateName());
        System.out.println("Final state: COMPLETED");
    }
    
    @Test
    public void testCannotCancelAfterCheckIn() {
        System.out.println("\n=== TEST: State Pattern - Cannot Cancel After Check-in (Req10) ===");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B002", "U002", "R002", start, end, 40.0);
        
        // Move to CHECKED_IN state
        booking.setState(new CheckedInState());
        
        // Try to cancel - should fail
        booking.cancel();
        
        // Should still be checked in
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        System.out.println("Correctly prevented cancellation after check-in!");
    }
    
    @Test
    public void testCanCancelBeforeCheckIn() {
        System.out.println("\n=== TEST: State Pattern - Can Cancel Before Check-in ===");
        
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B003", "U003", "R003", start, end, 40.0);
        
        // Move to CONFIRMED state
        booking.setState(new ConfirmedState());
        
        // Cancel - should work
        booking.cancel();
        
        assertEquals("CANCELLED", booking.getCurrentStateName());
        System.out.println("Successfully cancelled before check-in!");
    }
    
    @Test
    public void testCanExtendOnlyWhenCheckedIn() {
        System.out.println("\n=== TEST: State Pattern - Can Extend Only When Checked In (Req8) ===");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B004", "U004", "R004", start, end, 40.0);
        booking.setHourlyRate(20.0);
        
        // Try to extend in PENDING state - should fail
        System.out.println("\n--- Trying to extend in PENDING state ---");
        booking.extend(1);
        assertEquals("PENDING", booking.getCurrentStateName());
        
        // Move to CHECKED_IN
        booking.setState(new CheckedInState());
        
        // Now extend should work
        System.out.println("\n--- Trying to extend in CHECKED_IN state ---");
        booking.extend(1);
        
        assertEquals("CHECKED_IN", booking.getCurrentStateName());
        System.out.println("Extension only allowed when checked in!");
    }
    
    @Test
    public void testCannotCheckInWhenPending() {
        System.out.println("\n=== TEST: State Pattern - Cannot Check In When Pending ===");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B005", "U005", "R005", start, end, 40.0);
        
        // Try to check in while PENDING
        booking.checkIn();
        
        // Should still be PENDING
        assertEquals("PENDING", booking.getCurrentStateName());
        System.out.println("Correctly prevented check-in while payment pending!");
    }
    
    @Test
    public void testCompletedStateIsTerminal() {
        System.out.println("\n=== TEST: State Pattern - Completed is Terminal State ===");
        
        LocalDateTime start = LocalDateTime.now().plusMinutes(10);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B006", "U006", "R006", start, end, 40.0);
        
        // Move to COMPLETED state
        booking.setState(new CompletedState());
        
        // Try various operations - all should fail
        System.out.println("\n--- Trying operations on completed booking ---");
        booking.cancel();
        booking.extend(1);
        booking.checkIn();
        
        // Should still be COMPLETED
        assertEquals("COMPLETED", booking.getCurrentStateName());
        System.out.println("Completed state is terminal - no operations allowed!");
    }
}
