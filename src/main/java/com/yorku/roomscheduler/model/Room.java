package com.yorku.roomscheduler.model;

import com.yorku.roomscheduler.model.enums.RoomStatus;

public class Room {
    private String roomId;
    private String building;
    private String roomNumber;
    private int capacity;
    private RoomStatus status;
    private String equipment;
    
    public Room(String roomId, String building, String roomNumber, int capacity) {
        this.roomId = roomId;
        this.building = building;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.status = RoomStatus.AVAILABLE;
        this.equipment = "Projector, Whiteboard";
    }
    
    // Getters
    public String getRoomId() { return roomId; }
    public String getBuilding() { return building; }
    public String getRoomNumber() { return roomNumber; }
    public int getCapacity() { return capacity; }
    public RoomStatus getStatus() { return status; }
    
    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
