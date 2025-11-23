package com.yorku.roomscheduler.patterns.observer;

public class SystemLogObserver implements BookingObserver {
    
    @Override
    public void update(BookingEvent event) {
        System.out.println(" [SYSTEM LOG] " + event.toString());
        // In real system, this would write to a log file
    }
}
