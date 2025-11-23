package com.yorku.roomscheduler.service;

import com.yorku.roomscheduler.model.Room;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RoomManager {
    private List<Room> rooms;
    
    public RoomManager() {
        this.rooms = new ArrayList<>();
        // Add some sample rooms
        rooms.add(new Room("R001", "Bergeron", "101", 20));
        rooms.add(new Room("R002", "Lassonde", "201", 50));
    }
    
    public boolean isRoomAvailable(String roomId, LocalDateTime startTime, LocalDateTime endTime) {
        System.out.println("🔍 Checking availability for room " + roomId + "...");
        // Simplified - in real system, check against bookings database
        System.out.println("✅ Room is available!");
        return true;
    }
    
    public Room getRoom(String roomId) {
        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                return room;
            }
        }
        return null;
    }
    
    public void lockRoom(String roomId) {
        System.out.println("🔒 Room " + roomId + " locked for booking");
    }
    
    public void unlockRoom(String roomId) {
        System.out.println("🔓 Room " + roomId + " unlocked");
    }
}