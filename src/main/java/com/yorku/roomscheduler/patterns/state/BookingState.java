package com.yorku.roomscheduler.patterns.state;

import com.yorku.roomscheduler.model.Booking;

public interface BookingState {
	void checkIn(Booking booking);
    void cancel(Booking booking);
    void extend(Booking booking, int hours);
    void complete(Booking booking);
    String getStateName();
}
