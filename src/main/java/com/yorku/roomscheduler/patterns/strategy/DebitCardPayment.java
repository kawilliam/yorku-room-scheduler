package com.yorku.roomscheduler.patterns.strategy;

public class DebitCardPayment implements PaymentStrategy {
    
    @Override
    public boolean processPayment(double amount, String cardNumber) {
        System.out.println("Processing debit card payment: $" + amount);
        System.out.println("Card: " + maskCardNumber(cardNumber));
        
        if (cardNumber.length() == 16) {
            System.out.println("Payment successful!");
            return true;
        } else {
            System.out.println("Invalid card number!");
            return false;
        }
    }
    
    @Override
    public boolean refund(String transactionId, double amount) {
        System.out.println("Refunding $" + amount + " to debit card (Transaction: " + transactionId + ")");
        return true;
    }
    
    @Override
    public String getPaymentMethodName() {
        return "Debit Card";
    }
    
    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() >= 4) {
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        }
        return cardNumber;
    }
}
