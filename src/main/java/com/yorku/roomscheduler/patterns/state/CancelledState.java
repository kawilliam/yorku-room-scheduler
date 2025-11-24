package com.yorku.roomscheduler.patterns.state;

import com.yorku.roomscheduler.model.Booking;

public class CancelledState implements BookingState {
    
    @Override
    public void checkIn(Booking booking) {
        System.out.println("Cannot check in - booking was cancelled");
    }
    
    @Override
    public void cancel(Booking booking) {
        System.out.println("Booking already cancelled");
    }
    
    @Override
    public void extend(Booking booking, int hours) {
        System.out.println("Cannot extend - booking was cancelled");
    }
    
    @Override
    public void complete(Booking booking) {
        System.out.println("Cannot complete - booking was cancelled");
    }
    
    @Override
    public String getStateName() {
        return "CANCELLED";
    }
}
