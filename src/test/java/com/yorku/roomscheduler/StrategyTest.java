package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.strategy.*;
import com.yorku.roomscheduler.service.PaymentProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {
    
    @Test
    public void testCreditCardPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new CreditCardPayment());
        
        boolean result = processor.processPayment(100.0, "1234567812345678");
        assertTrue(result);
    }
    
    @Test
    public void testDebitCardPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new DebitCardPayment());
        
        boolean result = processor.processPayment(50.0, "8765432187654321");
        assertTrue(result);
    }
    
    @Test
    public void testInstitutionalBilling() {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new InstitutionalBilling());
        
        boolean result = processor.processPayment(200.0, "DEPT-CS");
        assertTrue(result);
    }
    
    @Test
    public void testSwitchingStrategies() {
        PaymentProcessor processor = new PaymentProcessor();
        
        // First payment with credit card
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.processPayment(100.0, "1234567812345678");
        
        // Second payment with institutional billing
        processor.setPaymentStrategy(new InstitutionalBilling());
        processor.processPayment(200.0, "DEPT-ENG");
        
        // Strategy successfully switched!
    }
}
