package com.yorku.roomscheduler.patterns.observer;


	import java.time.LocalDateTime;

	public class BookingEvent {
	    private String eventType;
	    private String bookingId;
	    private String userId;
	    private String roomId;
	    private LocalDateTime timestamp;
	    private String message;
	    
	    public BookingEvent(String eventType, String bookingId, String message) {
	        this.eventType = eventType;
	        this.bookingId = bookingId;
	        this.message = message;
	        this.timestamp = LocalDateTime.now();
	    }
	    
	    // Getters
	    public String getEventType() { return eventType; }
	    public String getBookingId() { return bookingId; }
	    public String getMessage() { return message; }
	    public LocalDateTime getTimestamp() { return timestamp; }
	    
	    @Override
	    public String toString() {
	        return "[" + timestamp + "] " + eventType + ": " + message;
	    }
	}

