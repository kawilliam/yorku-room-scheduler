package com.yorku.roomscheduler.patterns.observer;

public interface BookingObserver {
    void update(BookingEvent event);
}
