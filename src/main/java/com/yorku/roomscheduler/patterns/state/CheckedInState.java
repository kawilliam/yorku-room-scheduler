package com.yorku.roomscheduler.patterns.state;

import com.yorku.roomscheduler.model.Booking;
import java.time.LocalDateTime;

public class CheckedInState implements BookingState {
    
    @Override
    public void checkIn(Booking booking) {
        System.out.println("Already checked in");
    }
    
    @Override
    public void cancel(Booking booking) {
        System.out.println("Cannot cancel - already checked in! (Req10)");
        System.out.println("You must complete the booking.");
    }
    
    @Override
    public void extend(Booking booking, int hours) {
        LocalDateTime currentEnd = booking.getEndTime();
        LocalDateTime newEnd = currentEnd.plusHours(hours);
        
        System.out.println("Extending booking by " + hours + " hour(s)");
        System.out.println("New end time: " + newEnd);
        System.out.println("Additional cost: $" + (hours * booking.getHourlyRate()));
        
        booking.setEndTime(newEnd);
        // Stay in CheckedInState
    }
    
    @Override
    public void complete(Booking booking) {
        System.out.println("Completing booking...");
        System.out.println("Processing final payment...");
        booking.setState(new CompletedState());
    }
    
    @Override
    public String getStateName() {
        return "CHECKED_IN";
    }
}
