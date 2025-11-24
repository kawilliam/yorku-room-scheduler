package com.yorku.roomscheduler.dao;

import com.yorku.roomscheduler.model.Room;
import com.yorku.roomscheduler.model.enums.RoomStatus;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for Room operations
 * Handles reading/writing rooms to CSV file
 */
public class RoomDAO {
    
    private static final String CSV_FILE = "src/main/resources/data/rooms.csv";
    private static final String[] HEADERS = {"roomId", "building", "roomNumber", "capacity", "status", "equipment"};
    
    public RoomDAO() {
        initializeCSVFile();
    }
    
    private void initializeCSVFile() {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                try (CSVWriter writer = new CSVWriter(new FileWriter(file))) {
                    writer.writeNext(HEADERS);
                    // Add sample rooms
                    writer.writeNext(new String[]{"R001", "Bergeron", "101", "20", "AVAILABLE", "Projector,Whiteboard"});
                    writer.writeNext(new String[]{"R002", "Lassonde", "201", "50", "AVAILABLE", "Projector,Audio System"});
                    writer.writeNext(new String[]{"R003", "Bergeron", "205", "30", "AVAILABLE", "Projector,Whiteboard,Video Conference"});
                }
                System.out.println("Created rooms.csv with sample data");
            } catch (IOException e) {
                System.err.println("Error creating rooms.csv: " + e.getMessage());
            }
        }
    }
    
    public boolean saveRoom(Room room) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE, true))) {
            String[] record = {
                room.getRoomId(),
                room.getBuilding(),
                room.getRoomNumber(),
                String.valueOf(room.getCapacity()),
                room.getStatus().name(),
                "Projector,Whiteboard"
            };
            writer.writeNext(record);
            return true;
        } catch (IOException e) {
            System.err.println("Error saving room: " + e.getMessage());
            return false;
        }
    }
    
    public Room findById(String roomId) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[0].equals(roomId)) {
                    return reconstructRoom(line);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error finding room: " + e.getMessage());
        }
        return null;
    }
    
    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                Room room = reconstructRoom(line);
                if (room != null) {
                    rooms.add(room);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading rooms: " + e.getMessage());
        }
        return rooms;
    }
    
    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : getAllRooms()) {
            if (room.getStatus() == RoomStatus.AVAILABLE) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
    
    public boolean updateRoomStatus(String roomId, RoomStatus newStatus) {
        List<Room> rooms = getAllRooms();
        boolean found = false;
        
        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                room.setStatus(newStatus);
                found = true;
                break;
            }
        }
        
        if (found) {
            return rewriteCSV(rooms);
        }
        return false;
    }
    
    private boolean rewriteCSV(List<Room> rooms) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE))) {
            writer.writeNext(HEADERS);
            for (Room room : rooms) {
                String[] record = {
                    room.getRoomId(),
                    room.getBuilding(),
                    room.getRoomNumber(),
                    String.valueOf(room.getCapacity()),
                    room.getStatus().name(),
                    "Projector,Whiteboard"
                };
                writer.writeNext(record);
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error rewriting rooms.csv: " + e.getMessage());
            return false;
        }
    }
    
    private Room reconstructRoom(String[] line) {
        try {
            Room room = new Room(line[0], line[1], line[2], Integer.parseInt(line[3]));
            room.setStatus(RoomStatus.valueOf(line[4]));
            return room;
        } catch (Exception e) {
            System.err.println("Error reconstructing room: " + e.getMessage());
            return null;
        }
    }
}