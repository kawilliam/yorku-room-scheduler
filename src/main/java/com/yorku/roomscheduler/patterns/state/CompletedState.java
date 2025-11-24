package com.yorku.roomscheduler.patterns.state;

import com.yorku.roomscheduler.model.Booking;

public class CompletedState implements BookingState {
    
    @Override
    public void checkIn(Booking booking) {
        System.out.println("Booking already completed");
    }
    
    @Override
    public void cancel(Booking booking) {
        System.out.println("Cannot cancel - booking already completed");
    }
    
    @Override
    public void extend(Booking booking, int hours) {
        System.out.println("Cannot extend - booking already completed");
    }
    
    @Override
    public void complete(Booking booking) {
        System.out.println("Booking already completed");
    }
    
    @Override
    public String getStateName() {
        return "COMPLETED";
    }
}
