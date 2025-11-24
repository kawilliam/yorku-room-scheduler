package com.yorku.roomscheduler.service;

import com.yorku.roomscheduler.dao.BookingDAO;
import com.yorku.roomscheduler.dao.RoomDAO;
import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.model.Room;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RoomManager {
    private List<Room> rooms;
    private BookingDAO bookingDAO; 
    private RoomDAO roomDAO;
    
    public RoomManager() {
        this.rooms = new ArrayList<>();
        this.bookingDAO = new BookingDAO();  // ADD THIS
        this.roomDAO = new RoomDAO();
        
    }
    
    public boolean isRoomAvailable(String roomId, LocalDateTime startTime, LocalDateTime endTime) {
        System.out.println(" Checking availability for room " + roomId + "...");
        System.out.println("   Requested time: " + startTime + " to " + endTime);
        System.out.println(" Room is available!");
        
        List<Booking> allBookings = bookingDAO.getAllBookings();
        
        for (Booking booking : allBookings) {
            // Only check active bookings (not cancelled or forfeited or completed)
            String state = booking.getCurrentStateName();
            if (state.equals("CANCELLED") || state.equals("FORFEITED") || state.equals("COMPLETED")) {
                continue;  // Skip inactive bookings
            }
            
            // Check if this booking is for the same room
            if (!booking.getRoomId().equals(roomId)) {
                continue;  // Different room, no conflict
            }
            
            // Check for time overlap
            LocalDateTime bookingStart = booking.getStartTime();
            LocalDateTime bookingEnd = booking.getEndTime();
            
            // Times overlap if:
            // - New booking starts during existing booking
            // - New booking ends during existing booking  
            // - New booking completely contains existing booking
            boolean overlap = (startTime.isBefore(bookingEnd) && endTime.isAfter(bookingStart));
            
            if (overlap) {
                System.out.println("Conflict found with booking " + booking.getBookingId());
                System.out.println("Existing: " + bookingStart + " to " + bookingEnd + " [" + state + "]");
                return false;
            }
        }
        
        System.out.println("Room is available!");
        return true;
    }
    
    public Room getRoom(String roomId) {
        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                return room;
            }
        }
        return roomDAO.findById(roomId);
    }
    
    public void lockRoom(String roomId) {
        System.out.println(" Room " + roomId + " locked for booking");
        roomDAO.updateRoomStatus(roomId, com.yorku.roomscheduler.model.enums.RoomStatus.OCCUPIED);
    }
    
    public void unlockRoom(String roomId) {
        System.out.println(" Room " + roomId + " unlocked");
        roomDAO.updateRoomStatus(roomId, com.yorku.roomscheduler.model.enums.RoomStatus.AVAILABLE);
    }
}
