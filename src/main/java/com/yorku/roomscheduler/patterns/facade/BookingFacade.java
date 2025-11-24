package com.yorku.roomscheduler.patterns.facade;

import com.yorku.roomscheduler.model.Booking;
import com.yorku.roomscheduler.model.users.User;
import com.yorku.roomscheduler.service.*;
import com.yorku.roomscheduler.patterns.strategy.PaymentStrategy;
import com.yorku.roomscheduler.patterns.state.PendingState;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * FACADE PATTERN
 * Simplifies the complex booking process by providing a unified interface
 * to multiple subsystems: RoomManager, PaymentProcessor, EmailService, RoomSensor
 */
public class BookingFacade {
    // Subsystems
    private RoomManager roomManager;
    private PaymentProcessor paymentProcessor;
    private EmailService emailService;
    private RoomSensor roomSensor;
    
    private int bookingIdCounter = 1;
    
    public BookingFacade() {
        this.roomManager = new RoomManager();
        this.paymentProcessor = new PaymentProcessor();
        this.emailService = new EmailService();
    }
    
    /**
     * ONE SIMPLE METHOD to create a complete booking
     * Handles: availability check, cost calculation, payment, email, room locking
     */
    public Booking createBooking(User user, String roomId, 
                                 LocalDateTime startTime, LocalDateTime endTime,
                                 PaymentStrategy paymentMethod, String paymentDetails) {
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("CREATING BOOKING (using Facade Pattern)");
        System.out.println("=".repeat(60));
        
        try {
            // STEP 1: Check room availability
            System.out.println("\nStep 1: Checking room availability...");
            if (!roomManager.isRoomAvailable(roomId, startTime, endTime)) {
                System.out.println("Room not available!");
                return null;
            }
            
            // STEP 2: Calculate cost
            System.out.println("\nStep 2: Calculating cost...");
            long hours = ChronoUnit.HOURS.between(startTime, endTime);
            double totalCost = hours * user.getHourlyRate();
            double deposit = totalCost * 0.5; // 50% deposit
            System.out.println("Duration: " + hours + " hours");
            System.out.println("Hourly rate: $" + user.getHourlyRate());
            System.out.println("Total cost: $" + totalCost);
            System.out.println("Deposit required: $" + deposit);
            
            // STEP 3: Process payment
            System.out.println("\nStep 3: Processing payment...");
            paymentProcessor.setPaymentStrategy(paymentMethod);
            boolean paymentSuccess = paymentProcessor.processPayment(deposit, paymentDetails);
            
            if (!paymentSuccess) {
                System.out.println("Payment failed!");
                return null;
            }
            
            // STEP 4: Create booking
            System.out.println("\nStep 4: Creating booking record...");
            String bookingId = "B" + String.format("%03d", bookingIdCounter++);
            Booking booking = new Booking(bookingId, user.getUserId(), roomId, 
                                         startTime, endTime, totalCost);
            booking.setHourlyRate(user.getHourlyRate());
            
            System.out.println("DEBUG FACADE: Before confirmPayment - State: " + booking.getCurrentStateName());
            
            // Move to CONFIRMED state
            ((PendingState)booking.getState()).confirmPayment(booking);
            
            System.out.println("DEBUG FACADE: After confirmPayment - State: " + booking.getCurrentStateName());
            
            // STEP 5: Lock the room
            System.out.println("\nStep 5: Reserving room...");
            roomManager.lockRoom(roomId);
            
            // STEP 6: Send confirmation email
            System.out.println("\nStep 6: Sending confirmation email...");
            emailService.sendBookingConfirmation(user.getEmail(), booking);
            
            // STEP 7: Set up room sensor (if available)
            System.out.println("\n🔧 Step 7: Configuring room sensor...");
            // Sensor setup would happen here in real system
            
            System.out.println("\n" + "=".repeat(60));
            System.out.println("BOOKING CREATED SUCCESSFULLY!");
            System.out.println("Booking ID: " + bookingId);
            System.out.println("=".repeat(60) + "\n");
            
            return booking;
            
        } catch (Exception e) {
            System.out.println("Error creating booking: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * ONE SIMPLE METHOD to cancel a booking
     * Handles: cancellation, refund, email, room unlocking
     */
    public boolean cancelBooking(Booking booking, User user) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("CANCELLING BOOKING (using Facade Pattern)");
        System.out.println("=".repeat(60));
        
        try {
            // STEP 1: Cancel the booking (uses State pattern)
            System.out.println("\nStep 1: Cancelling booking...");
            booking.cancel();
            
            if (!booking.getCurrentStateName().equals("CANCELLED")) {
                System.out.println("Cannot cancel booking in current state!");
                return false;
            }
            
            // STEP 2: Process refund
            System.out.println("\nStep 2: Processing refund...");
            double refundAmount = booking.getTotalCost() * 0.5; // Refund deposit
            System.out.println("Refunding: $" + refundAmount);
            
            // STEP 3: Unlock room
            System.out.println("\nStep 3: Releasing room...");
            roomManager.unlockRoom(booking.getRoomId());
            
            // STEP 4: Send cancellation email
            System.out.println("\nStep 4: Sending cancellation notice...");
            emailService.sendCancellationNotice(user.getEmail(), booking.getBookingId());
            
            System.out.println("\n" + "=".repeat(60));
            System.out.println("BOOKING CANCELLED SUCCESSFULLY!");
            System.out.println("=".repeat(60) + "\n");
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error cancelling booking: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * ONE SIMPLE METHOD to extend a booking
     */
    public boolean extendBooking(Booking booking, int additionalHours, 
                                 User user, PaymentStrategy paymentMethod, String paymentDetails) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("EXTENDING BOOKING (using Facade Pattern)");
        System.out.println("=".repeat(60));
        
        try {
            // STEP 1: Check if extension is allowed (uses State pattern)
            System.out.println("\nStep 1: Checking if extension allowed...");
            if (!booking.getCurrentStateName().equals("CHECKED_IN")) {
                System.out.println("Can only extend after check-in!");
                return false;
            }
            
            // STEP 2: Check room availability for extended time
            LocalDateTime newEndTime = booking.getEndTime().plusHours(additionalHours);
            System.out.println("\nStep 2: Checking availability...");
            if (!roomManager.isRoomAvailable(booking.getRoomId(), 
                                            booking.getEndTime(), newEndTime)) {
                System.out.println("Room not available for extension!");
                return false;
            }
            
            // STEP 3: Calculate additional cost
            System.out.println("\nStep 3: Calculating additional cost...");
            double additionalCost = additionalHours * user.getHourlyRate();
            System.out.println("Additional hours: " + additionalHours);
            System.out.println("Additional cost: $" + additionalCost);
            
            // STEP 4: Process payment
            System.out.println("\nStep 4: Processing payment...");
            paymentProcessor.setPaymentStrategy(paymentMethod);
            boolean paymentSuccess = paymentProcessor.processPayment(additionalCost, paymentDetails);
            
            if (!paymentSuccess) {
                System.out.println("Payment failed!");
                return false;
            }
            
            // STEP 5: Extend the booking
            System.out.println("\nStep 5: Extending booking...");
            booking.extend(additionalHours);
            
            // STEP 6: Send confirmation
            System.out.println("\nStep 6: Sending extension confirmation...");
            System.out.println("Extension confirmed!");
            
            System.out.println("\n" + "=".repeat(60));
            System.out.println("BOOKING EXTENDED SUCCESSFULLY!");
            System.out.println("New end time: " + booking.getEndTime());
            System.out.println("=".repeat(60) + "\n");
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error extending booking: " + e.getMessage());
            return false;
        }
    }
}
