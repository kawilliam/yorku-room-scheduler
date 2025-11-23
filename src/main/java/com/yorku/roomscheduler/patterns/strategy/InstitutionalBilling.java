package com.yorku.roomscheduler.patterns.strategy;

public class InstitutionalBilling implements PaymentStrategy {
    
    @Override
    public boolean processPayment(double amount, String departmentCode) {
        System.out.println("Billing to department: " + departmentCode);
        System.out.println("Amount: $" + amount);
        System.out.println("Institutional billing processed!");
        return true;
    }
    
    @Override
    public boolean refund(String transactionId, double amount) {
        System.out.println("Crediting $" + amount + " to department account");
        return true;
    }
    
    @Override
    public String getPaymentMethodName() {
        return "Institutional Billing";
    }
}
