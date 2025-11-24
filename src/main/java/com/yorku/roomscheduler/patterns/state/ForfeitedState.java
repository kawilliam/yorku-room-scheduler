package com.yorku.roomscheduler.patterns.state;

import com.yorku.roomscheduler.model.Booking;

public class ForfeitedState implements BookingState {
    
    @Override
    public void checkIn(Booking booking) {
        System.out.println("Cannot check in - deposit forfeited due to late arrival");
    }
    
    @Override
    public void cancel(Booking booking) {
        System.out.println("Booking already forfeited");
    }
    
    @Override
    public void extend(Booking booking, int hours) {
        System.out.println("Cannot extend - booking was forfeited");
    }
    
    @Override
    public void complete(Booking booking) {
        System.out.println("Cannot complete - booking was forfeited");
    }
    
    @Override
    public String getStateName() {
        return "FORFEITED";
    }
}
