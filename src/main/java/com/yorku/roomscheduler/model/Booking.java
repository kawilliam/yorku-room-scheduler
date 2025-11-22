package com.yorku.roomscheduler.model;

import com.yorku.roomscheduler.model.enums.BookingStatus;
import com.yorku.roomscheduler.patterns.observer.BookingObserver;
import com.yorku.roomscheduler.patterns.observer.BookingEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private String bookingId;
    private String userId;
    private String roomId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private BookingStatus status;
    private double totalCost;
    private double depositPaid;
    private boolean checkedIn;
    
    // Observer pattern support
    private List<BookingObserver> observers;
    
    public Booking(String bookingId, String userId, String roomId, 
                   LocalDateTime startTime, LocalDateTime endTime, double totalCost) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.roomId = roomId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalCost = totalCost;
        this.status = BookingStatus.PENDING;
        this.checkedIn = false;
        this.observers = new ArrayList<>();
    }
    
    // Observer methods
    public void addObserver(BookingObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(BookingObserver observer) {
        observers.remove(observer);
    }
    
    private void notifyObservers(String eventType, String message) {
        BookingEvent event = new BookingEvent(eventType, bookingId, message);
        for (BookingObserver observer : observers) {
            observer.update(event);
        }
    }
    
    // Business methods that trigger notifications
    public void confirmBooking() {
        this.status = BookingStatus.CONFIRMED;
        notifyObservers("BOOKING_CREATED", 
            "Booking " + bookingId + " confirmed for room " + roomId);
    }
    
    public void checkIn() {
        this.checkedIn = true;
        this.status = BookingStatus.CHECKED_IN;
        notifyObservers("CHECK_IN", 
            "User checked in to booking " + bookingId);
    }
    
    public void cancel() {
        this.status = BookingStatus.CANCELLED;
        notifyObservers("BOOKING_CANCELLED", 
            "Booking " + bookingId + " has been cancelled");
    }
    
    public void forfeitDeposit() {
        this.status = BookingStatus.FORFEITED;
        notifyObservers("DEPOSIT_FORFEITED", 
            "Deposit forfeited for booking " + bookingId + " - late check-in");
    }
    
    // Getters
    public String getBookingId() { return bookingId; }
    public String getUserId() { return userId; }
    public String getRoomId() { return roomId; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public BookingStatus getStatus() { return status; }
    public double getTotalCost() { return totalCost; }
    public boolean isCheckedIn() { return checkedIn; }
}
