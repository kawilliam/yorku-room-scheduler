package com.yorku.roomscheduler.patterns.strategy;

public interface PaymentStrategy {
    boolean processPayment(double amount, String accountDetails);
    boolean refund(String transactionId, double amount);
    String getPaymentMethodName();
}


