package com.yorku.roomscheduler.service;

import com.yorku.roomscheduler.model.Room;
import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.model.enums.RoomStatus;
import com.yorku.roomscheduler.dao.BookingDAO;
import com.yorku.roomscheduler.dao.RoomDAO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RoomManager {
    private List<Room> rooms;
    private BookingDAO bookingDAO;
    private RoomDAO roomDAO;
    
    public RoomManager() {
        this.rooms = new ArrayList<>();
        this.bookingDAO = new BookingDAO();
        this.roomDAO = new RoomDAO();
        
        // Add some sample rooms
        rooms.add(new Room("R001", "Bergeron", "101", 20));
        rooms.add(new Room("R002", "Lassonde", "201", 50));
    }
    
    public boolean isRoomAvailable(String roomId, LocalDateTime startTime, LocalDateTime endTime) {
        System.out.println("Checking availability for room " + roomId + "...");
        System.out.println("   Requested time: " + startTime + " to " + endTime);
        
        List<Booking> allBookings = bookingDAO.getAllBookings();
        
        for (Booking booking : allBookings) {
            String state = booking.getCurrentStateName();
            if (state.equals("CANCELLED") || state.equals("FORFEITED") || state.equals("COMPLETED")) {
                continue;
            }
            
            if (!booking.getRoomId().equals(roomId)) {
                continue;
            }
            
            LocalDateTime bookingStart = booking.getStartTime();
            LocalDateTime bookingEnd = booking.getEndTime();
            
            boolean overlap = (startTime.isBefore(bookingEnd) && endTime.isAfter(bookingStart));
            
            if (overlap) {
                System.out.println("   Conflict found with booking " + booking.getBookingId());
                System.out.println("      Existing: " + bookingStart + " to " + bookingEnd + " [" + state + "]");
                return false;
            }
        }
        
        System.out.println("   Room is available!");
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
        System.out.println("Room " + roomId + " locked for booking");
        roomDAO.updateRoomStatus(roomId, RoomStatus.OCCUPIED);
    }
    
    public void unlockRoom(String roomId) {
        System.out.println("Room " + roomId + " unlocked");
        roomDAO.updateRoomStatus(roomId, RoomStatus.AVAILABLE);
    }
}
