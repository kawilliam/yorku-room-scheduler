package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.strategy.*;
import com.yorku.roomscheduler.service.PaymentProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Strategy Pattern - Payment Methods
 */
public class StrategyTest {
    
    @Test
    public void testCreditCardPayment() {
        System.out.println("\n=== TEST: Strategy Pattern - Credit Card ===");
        
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new CreditCardPayment());
        
        boolean result = processor.processPayment(100.0, "1234567812345678");
        assertTrue(result);
        
        System.out.println("Credit card payment successful!");
    }
    
    @Test
    public void testDebitCardPayment() {
        System.out.println("\n=== TEST: Strategy Pattern - Debit Card ===");
        
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new DebitCardPayment());
        
        boolean result = processor.processPayment(50.0, "8765432187654321");
        assertTrue(result);
        
        System.out.println("Debit card payment successful!");
    }
    
    @Test
    public void testInstitutionalBilling() {
        System.out.println("\n=== TEST: Strategy Pattern - Institutional Billing ===");
        
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new InstitutionalBilling());
        
        boolean result = processor.processPayment(200.0, "DEPT-CS");
        assertTrue(result);
        
        System.out.println("Institutional billing successful!");
    }
    
    @Test
    public void testSwitchingStrategies() {
        System.out.println("\n=== TEST: Strategy Pattern - Switch Payment Methods ===");
        
        PaymentProcessor processor = new PaymentProcessor();
        
        // First payment with credit card
        processor.setPaymentStrategy(new CreditCardPayment());
        boolean result1 = processor.processPayment(100.0, "1234567812345678");
        assertTrue(result1);
        
        // Second payment with debit card
        processor.setPaymentStrategy(new DebitCardPayment());
        boolean result2 = processor.processPayment(50.0, "8765432187654321");
        assertTrue(result2);
        
        // Third payment with institutional billing
        processor.setPaymentStrategy(new InstitutionalBilling());
        boolean result3 = processor.processPayment(200.0, "DEPT-ENG");
        assertTrue(result3);
        
        System.out.println("Successfully switched between 3 payment strategies!");
    }
    
    @Test
    public void testInvalidCardNumber() {
        System.out.println("\n=== TEST: Strategy Pattern - Invalid Card ===");
        
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new CreditCardPayment());
        
        // Invalid card number (not 16 digits)
        boolean result = processor.processPayment(100.0, "123");
        assertFalse(result);
        
        System.out.println("Correctly rejected invalid card!");
    }
    
    @Test
    public void testRefund() {
        System.out.println("\n=== TEST: Strategy Pattern - Refund ===");
        
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new CreditCardPayment());
        
        boolean result = processor.refundPayment("TXN-12345", 75.0);
        assertTrue(result);
        
        System.out.println("Refund processed successfully!");
    }
}