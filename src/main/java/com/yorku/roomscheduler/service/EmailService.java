package com.yorku.roomscheduler.service;

import com.yorku.roomscheduler.model.Booking;

public class EmailService {
    
    public void sendBookingConfirmation(String userEmail, Booking booking) {
        System.out.println(" Sending booking confirmation to " + userEmail);
        System.out.println("   Booking ID: " + booking.getBookingId());
        System.out.println("   Room: " + booking.getRoomId());
        System.out.println("   Time: " + booking.getStartTime() + " to " + booking.getEndTime());
        System.out.println("   Total Cost: $" + booking.getTotalCost());
        System.out.println(" Email sent!");
    }
    
    public void sendCancellationNotice(String userEmail, String bookingId) {
        System.out.println(" Sending cancellation notice to " + userEmail);
        System.out.println("   Booking " + bookingId + " has been cancelled");
        System.out.println(" Email sent!");
    }
    
    public void sendCheckInReminder(String userEmail, Booking booking) {
        System.out.println(" Sending check-in reminder to " + userEmail);
        System.out.println("   Don't forget to check in within 30 minutes!");
        System.out.println(" Email sent!");
    }
}
