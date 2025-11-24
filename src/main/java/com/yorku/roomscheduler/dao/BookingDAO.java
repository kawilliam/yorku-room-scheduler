package com.yorku.roomscheduler.dao;

import com.yorku.roomscheduler.model.Booking;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.yorku.roomscheduler.patterns.state.*;

/**
 * Data Access Object for Booking operations
 */
public class BookingDAO {
    
    private static final String CSV_FILE = "src/main/resources/data/bookings.csv";
    private static final String[] HEADERS = {"bookingId", "userId", "roomId", "startTime", "endTime", "status", "totalCost", "hourlyRate"};
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    
    public BookingDAO() {
        initializeCSVFile();
    }
    
    private void initializeCSVFile() {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                try (CSVWriter writer = new CSVWriter(new FileWriter(file))) {
                    writer.writeNext(HEADERS);
                }
                System.out.println("Created bookings.csv with headers");
            } catch (IOException e) {
                System.err.println("Error creating bookings.csv: " + e.getMessage());
            }
        }
    }
    
    public boolean saveBooking(Booking booking) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE, true))) {
            String[] record = {
                booking.getBookingId(),
                booking.getUserId(),
                booking.getRoomId(),
                booking.getStartTime().format(formatter),
                booking.getEndTime().format(formatter),
                booking.getCurrentStateName(),
                String.valueOf(booking.getTotalCost()),
                String.valueOf(booking.getHourlyRate())
            };
            writer.writeNext(record);
            return true;
        } catch (IOException e) {
            System.err.println("Error saving booking: " + e.getMessage());
            return false;
        }
    }
    
    public List<Booking> getBookingsByUser(String userId) {
        List<Booking> userBookings = new ArrayList<>();
        System.out.println("DEBUG DAO: Searching for userId: " + userId);
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
            	System.out.println("DEBUG DAO: Read line - userId in CSV: [" + line[1] + "]");
                if (line[1].equals(userId)) {
                	System.out.println("DEBUG DAO: MATCH FOUND!");
                    Booking booking = reconstructBooking(line);
                    if (booking != null) {
                        userBookings.add(booking);
                    }
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading bookings: " + e.getMessage());
        }
        System.out.println("DEBUG DAO: Returning " + userBookings.size() + " bookings");
        return userBookings;
    }
    
    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                Booking booking = reconstructBooking(line);
                if (booking != null) {
                    bookings.add(booking);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading bookings: " + e.getMessage());
        }
        return bookings;
    }
    
    public Booking findById(String bookingId) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[0].equals(bookingId)) {
                    return reconstructBooking(line);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error finding booking: " + e.getMessage());
        }
        return null;
    }
    
    public boolean updateBooking(Booking booking) {
        List<Booking> bookings = getAllBookings();
        boolean found = false;
        
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBookingId().equals(booking.getBookingId())) {
                bookings.set(i, booking);
                found = true;
                break;
            }
        }
        
        if (found) {
            return rewriteCSV(bookings);
        }
        return false;
    }
    
    private boolean rewriteCSV(List<Booking> bookings) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE))) {
            writer.writeNext(HEADERS);
            for (Booking booking : bookings) {
                String[] record = {
                    booking.getBookingId(),
                    booking.getUserId(),
                    booking.getRoomId(),
                    booking.getStartTime().format(formatter),
                    booking.getEndTime().format(formatter),
                    booking.getCurrentStateName(),
                    String.valueOf(booking.getTotalCost()),
                    String.valueOf(booking.getHourlyRate())
                };
                writer.writeNext(record);
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error rewriting bookings.csv: " + e.getMessage());
            return false;
        }
    }
    
    private Booking reconstructBooking(String[] line) {
        try {
            String bookingId = line[0];
            String userId = line[1];
            String roomId = line[2];
            LocalDateTime startTime = LocalDateTime.parse(line[3], formatter);
            LocalDateTime endTime = LocalDateTime.parse(line[4], formatter);
            String stateName = line[5];
            double totalCost = Double.parseDouble(line[6]);
            double hourlyRate = Double.parseDouble(line[7]);
            
            System.out.println("DEBUG RECONSTRUCT: State from CSV: [" + stateName + "]");
            
            Booking booking = new Booking(bookingId, userId, roomId, startTime, endTime, totalCost);
            booking.setHourlyRate(hourlyRate);
            
            System.out.println("DEBUG RECONSTRUCT: About to restore state...");
            
            switch (stateName) {
            case "PENDING":
                booking.setState(new PendingState());
                break;
            case "CONFIRMED":
            	System.out.println("DEBUG RECONSTRUCT: Setting to CONFIRMED");
                booking.setState(new ConfirmedState());
                break;
            case "CHECKED_IN":
                booking.setState(new CheckedInState());
                break;
            case "COMPLETED":
                booking.setState(new CompletedState());
                break;
            case "CANCELLED":
                booking.setState(new CancelledState());
                break;
            case "FORFEITED":
                booking.setState(new ForfeitedState());
                break;
        }
        
        return booking;
        } catch (Exception e) {
            System.err.println("Error reconstructing booking: " + e.getMessage());
            return null;
        }
    }
}