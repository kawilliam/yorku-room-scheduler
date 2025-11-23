package com.yorku.roomscheduler.patterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    
    @Override
    public boolean processPayment(double amount, String cardNumber) {
        // Simulate credit card processing
        System.out.println("Processing credit card payment: $" + amount);
        System.out.println("Card: " + maskCardNumber(cardNumber));
        
        // Simulate validation
        if (cardNumber.length() == 16) {
            System.out.println("✅ Payment successful!");
            return true;
        } else {
            System.out.println("❌ Invalid card number!");
            return false;
        }
    }
    
    @Override
    public boolean refund(String transactionId, double amount) {
        System.out.println("Refunding $" + amount + " to credit card (Transaction: " + transactionId + ")");
        return true;
    }
    
    @Override
    public String getPaymentMethodName() {
        return "Credit Card";
    }
    
    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() >= 4) {
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        }
        return cardNumber;
    }
}
