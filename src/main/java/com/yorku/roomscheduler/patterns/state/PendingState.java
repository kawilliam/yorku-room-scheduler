package com.yorku.roomscheduler.patterns.state;

import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.model.enums.BookingStatus;

public class PendingState implements BookingState {
    
    @Override
    public void checkIn(Booking booking) {
        System.out.println("Cannot check in - payment not confirmed yet");
    }
    
    @Override
    public void cancel(Booking booking) {
        System.out.println("Cancelling pending booking...");
        booking.setState(new CancelledState());
        System.out.println("Booking cancelled successfully");
    }
    
    @Override
    public void extend(Booking booking, int hours) {
        System.out.println("Cannot extend - booking not confirmed yet");
    }
    
    @Override
    public void complete(Booking booking) {
        System.out.println("Cannot complete - booking not confirmed yet");
    }
    
    @Override
    public String getStateName() {
        return "PENDING";
    }
    
    // Method to confirm payment and move to confirmed state
    public void confirmPayment(Booking booking) {
        System.out.println("Payment confirmed! Moving to CONFIRMED state");
        booking.setState(new ConfirmedState());
    }
}
