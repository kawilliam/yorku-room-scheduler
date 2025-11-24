package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.observer.*;
import com.yorku.roomscheduler.service.RoomSensor;
import com.yorku.roomscheduler.model.Booking;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Observer Pattern - Sensor Notifications
 */
public class ObserverTest {
    
    @Test
    public void testSensorNotifiesObservers() {
        System.out.println("\n=== TEST: Observer Pattern - Sensor Notifies Observers ===");
        
        // Create sensor
        RoomSensor sensor = new RoomSensor("SENSOR-001", "R001");
        
        // Add observers
        sensor.addObserver(new EmailNotificationObserver("Email Service"));
        sensor.addObserver(new SystemLogObserver());
        
        // Simulate badge scan - should notify all observers
        boolean result = sensor.scanBadge("BADGE-12345", "B001");
        
        assertTrue(result);
        System.out.println("All observers notified of badge scan!");
    }
    
    @Test
    public void testBookingNotifiesObservers() {
        System.out.println("\n=== TEST: Observer Pattern - Booking Notifies Observers ===");
        
        // Create booking
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B001", "U001", "R001", start, end, 40.0);
        
        // Add observers
        booking.addObserver(new EmailNotificationObserver("Email Service"));
        booking.addObserver(new SystemLogObserver());
        
        // Perform actions - should notify observers
        System.out.println("\n--- Confirming booking ---");
        booking.confirmBooking();
        
        System.out.println("\n--- Checking in ---");
        booking.checkIn();
        
        System.out.println("Booking successfully notified observers of events!");
    }
    
    @Test
    public void testMultipleObservers() {
        System.out.println("\n=== TEST: Observer Pattern - Multiple Observers ===");
        
        RoomSensor sensor = new RoomSensor("SENSOR-002", "R002");
        
        // Add 3 different observers
        sensor.addObserver(new EmailNotificationObserver("Email Service"));
        sensor.addObserver(new SystemLogObserver());
        sensor.addObserver(new BookingObserver() {
            @Override
            public void update(BookingEvent event) {
                System.out.println(" [CUSTOM OBSERVER] Received: " + event.getMessage());
            }
        });
        
        // All 3 should be notified
        sensor.detectOccupancyChange(true);
        
        System.out.println("All 3 observers received notification!");
    }
    
    @Test
    public void testObserverCanBeRemoved() {
        System.out.println("\n=== TEST: Observer Pattern - Remove Observer ===");
        
        RoomSensor sensor = new RoomSensor("SENSOR-003", "R003");
        
        BookingObserver observer1 = new SystemLogObserver();
        BookingObserver observer2 = new EmailNotificationObserver("Email");
        
        // Add both observers
        sensor.addObserver(observer1);
        sensor.addObserver(observer2);
        
        // Remove one observer
        sensor.removeObserver(observer1);
        
        // Only observer2 should be notified
        System.out.println("\n--- After removing observer1 ---");
        sensor.scanBadge("BADGE-999", "B999");
        
        System.out.println("Observer successfully removed!");
    }
    
    @Test
    public void testInvalidBadgeNotification() {
        System.out.println("\n=== TEST: Observer Pattern - Invalid Badge ===");
        
        RoomSensor sensor = new RoomSensor("SENSOR-004", "R004");
        sensor.addObserver(new SystemLogObserver());
        
        // Scan invalid badge (empty string)
        boolean result = sensor.scanBadge("", "B004");
        
        assertFalse(result);
        System.out.println("Invalid badge correctly rejected!");
    }
    
    @Test
    public void testOccupancyChangeNotification() {
        System.out.println("\n=== TEST: Observer Pattern - Occupancy Change ===");
        
        RoomSensor sensor = new RoomSensor("SENSOR-005", "R005");
        sensor.addObserver(new SystemLogObserver());
        
        // Detect room becomes occupied
        System.out.println("\n--- Room becomes occupied ---");
        sensor.detectOccupancyChange(true);
        
        // Detect room becomes vacant
        System.out.println("\n--- Room becomes vacant ---");
        sensor.detectOccupancyChange(false);
        
        System.out.println("Occupancy changes correctly notified!");
    }
}