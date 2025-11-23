package com.yorku.roomscheduler.service;

import com.yorku.roomscheduler.patterns.observer.BookingObserver;
import com.yorku.roomscheduler.patterns.observer.BookingEvent;
import java.util.ArrayList;
import java.util.List;

public class RoomSensor {
    private String sensorId;
    private String roomId;
    private boolean isActive;
    private List<BookingObserver> observers;
    
    public RoomSensor(String sensorId, String roomId) {
        this.sensorId = sensorId;
        this.roomId = roomId;
        this.isActive = true;
        this.observers = new ArrayList<>();
    }
    
    // Subscribe to events
    public void addObserver(BookingObserver observer) {
        observers.add(observer);
        System.out.println("Observer added to sensor " + sensorId);
    }
    
    // Unsubscribe from events
    public void removeObserver(BookingObserver observer) {
        observers.remove(observer);
        System.out.println("Observer removed from sensor " + sensorId);
    }
    
    // Notify all observers
    private void notifyObservers(BookingEvent event) {
        System.out.println("\n📡 [SENSOR " + sensorId + "] Broadcasting event to " + observers.size() + " observers...");
        for (BookingObserver observer : observers) {
            observer.update(event);
        }
        System.out.println("All observers notified!\n");
    }
    
    // Simulate badge scan
    public boolean scanBadge(String badgeId, String bookingId) {
        System.out.println("\n[SENSOR " + sensorId + "] Badge scanned: " + badgeId);
        
        // Simulate validation
        boolean isValid = validateBadge(badgeId);
        
        if (isValid) {
            System.out.println("Badge valid! Unlocking room " + roomId);
            
            // Notify observers about check-in
            BookingEvent event = new BookingEvent(
                "CHECK_IN",
                bookingId,
                "User checked in to room " + roomId + " with badge " + badgeId
            );
            notifyObservers(event);
            
            return true;
        } else {
            System.out.println("Invalid badge!");
            return false;
        }
    }
    
    // Simulate occupancy detection
    public void detectOccupancyChange(boolean isOccupied) {
        System.out.println("\n[SENSOR " + sensorId + "] Occupancy changed: " + (isOccupied ? "OCCUPIED" : "VACANT"));
        
        BookingEvent event = new BookingEvent(
            "OCCUPANCY_CHANGE",
            "N/A",
            "Room " + roomId + " is now " + (isOccupied ? "occupied" : "vacant")
        );
        notifyObservers(event);
    }
    
    private boolean validateBadge(String badgeId) {
        // Simulate validation - just check if it's not empty
        return badgeId != null && !badgeId.isEmpty();
    }
    
    // Getters
    public String getSensorId() { return sensorId; }
    public String getRoomId() { return roomId; }
    public boolean isActive() { return isActive; }
}
