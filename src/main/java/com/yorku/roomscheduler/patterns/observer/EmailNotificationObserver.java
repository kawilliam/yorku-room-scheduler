package com.yorku.roomscheduler.patterns.observer;

public class EmailNotificationObserver implements BookingObserver {
    private String observerName;
    
    public EmailNotificationObserver(String observerName) {
        this.observerName = observerName;
    }
    
    @Override
    public void update(BookingEvent event) {
        System.out.println("[EMAIL SERVICE] Sending email notification...");
        System.out.println("Event: " + event.getEventType());
        System.out.println("Message: " + event.getMessage());
        
        // Simulate sending email based on event type
        switch(event.getEventType()) {
            case "BOOKING_CREATED":
                sendBookingConfirmation(event);
                break;
            case "CHECK_IN":
                sendCheckInConfirmation(event);
                break;
            case "BOOKING_CANCELLED":
                sendCancellationNotice(event);
                break;
            case "DEPOSIT_FORFEITED":
                sendForfeitureNotice(event);
                break;
            default:
                System.out.println("Email sent for: " + event.getEventType());
        }
    }
    
    private void sendBookingConfirmation(BookingEvent event) {
        System.out.println("Booking confirmation email sent!");
    }
    
    private void sendCheckInConfirmation(BookingEvent event) {
        System.out.println("Check-in confirmation email sent!");
    }
    
    private void sendCancellationNotice(BookingEvent event) {
        System.out.println("Cancellation notice email sent!");
    }
    
    private void sendForfeitureNotice(BookingEvent event) {
        System.out.println("Deposit forfeiture notice email sent!");
    }
}
