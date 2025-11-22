package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.observer.*;
import com.yorku.roomscheduler.service.RoomSensor;
import com.yorku.roomscheduler.model.Booking;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class ObserverTest {
    
    @Test
    public void testSensorNotifiesObservers() {
        // Create sensor
        RoomSensor sensor = new RoomSensor("SENSOR-001", "R001");
        
        // Add observers
        sensor.addObserver(new EmailNotificationObserver("Email Service"));
        sensor.addObserver(new SystemLogObserver());
        
        // Simulate badge scan - should notify all observers
        sensor.scanBadge("BADGE-12345", "B001");
    }
    
    @Test
    public void testBookingNotifiesObservers() {
        // Create booking
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        Booking booking = new Booking("B001", "U001", "R001", start, end, 40.0);
        
        // Add observers
        booking.addObserver(new EmailNotificationObserver("Email Service"));
        booking.addObserver(new SystemLogObserver());
        
        // Perform actions - should notify observers
        booking.confirmBooking();
        booking.checkIn();
    }
    
    @Test
    public void testMultipleObservers() {
        RoomSensor sensor = new RoomSensor("SENSOR-002", "R002");
        
        // Add 3 different observers
        sensor.addObserver(new EmailNotificationObserver("Email Service"));
        sensor.addObserver(new SystemLogObserver());
        sensor.addObserver(new BookingObserver() {
            @Override
            public void update(BookingEvent event) {
                System.out.println("🔔 [CUSTOM OBSERVER] Received: " + event.getMessage());
            }
        });
        
        // All 3 should be notified
        sensor.detectOccupancyChange(true);
    }
}
