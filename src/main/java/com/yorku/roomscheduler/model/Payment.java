package com.yorku.roomscheduler.model;

import com.yorku.roomscheduler.model.enums.PaymentMethod;
import java.time.LocalDateTime;

public class Payment {
    private String paymentId;
    private String bookingId;
    private double amount;
    private PaymentMethod method;
    private String transactionId;
    private String status;
    private LocalDateTime timestamp;
    
    public Payment(String paymentId, String bookingId, double amount, PaymentMethod method) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.method = method;
        this.timestamp = LocalDateTime.now();
        this.status = "PENDING";
    }
    
    public void markCompleted(String transactionId) {
        this.transactionId = transactionId;
        this.status = "COMPLETED";
    }
    
    // Getters
    public String getPaymentId() { return paymentId; }
    public String getBookingId() { return bookingId; }
    public double getAmount() { return amount; }
    public PaymentMethod getMethod() { return method; }
    public String getStatus() { return status; }
}
