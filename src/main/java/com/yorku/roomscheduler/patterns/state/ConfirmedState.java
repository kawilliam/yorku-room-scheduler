package com.yorku.roomscheduler.patterns.state;

import com.yorku.roomscheduler.model.Booking;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ConfirmedState implements BookingState {
    
    @Override
    public void checkIn(Booking booking) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startTime = booking.getStartTime();
        
        // Check if within 30-minute window
        long minutesUntilStart = ChronoUnit.MINUTES.between(now, startTime);
        
        if (minutesUntilStart > 30) {
            System.out.println("Too early to check in. You can check in 30 minutes before your booking.");
            System.out.println("Time until check-in window: " + minutesUntilStart + " minutes");
        } else if (minutesUntilStart < -30) {
            // More than 30 minutes late
            System.out.println("Check-in window expired! Forfeiting deposit...");
            booking.setState(new ForfeitedState());
            booking.forfeitDeposit();
        } else {
            // Within window!
            System.out.println("Checking in... Welcome!");
            booking.setState(new CheckedInState());
        }
    }
    
    @Override
    public void cancel(Booking booking) {
        System.out.println("Cancelling confirmed booking...");
        System.out.println("Refunding deposit...");
        booking.setState(new CancelledState());
    }
    
    @Override
    public void extend(Booking booking, int hours) {
        System.out.println("Cannot extend - must check in first");
    }
    
    @Override
    public void complete(Booking booking) {
        System.out.println("Cannot complete - must check in first");
    }
    
    @Override
    public String getStateName() {
        return "CONFIRMED";
    }
}
