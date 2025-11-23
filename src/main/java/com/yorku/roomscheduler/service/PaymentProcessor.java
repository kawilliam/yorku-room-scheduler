package com.yorku.roomscheduler.service;

import com.yorku.roomscheduler.patterns.strategy.PaymentStrategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    
    // Set the payment method at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    
    // Process payment using current strategy
    public boolean processPayment(double amount, String accountDetails) {
        if (paymentStrategy == null) {
            System.out.println("❌ No payment method selected!");
            return false;
        }
        
        System.out.println("Using payment method: " + paymentStrategy.getPaymentMethodName());
        return paymentStrategy.processPayment(amount, accountDetails);
    }
    
    public boolean refundPayment(String transactionId, double amount) {
        if (paymentStrategy == null) {
            return false;
        }
        return paymentStrategy.refund(transactionId, amount);
    }
}
