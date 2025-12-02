package randooptest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrategyRegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean17 = debitCardPayment0.processPayment(100.0d, "Institutional Billing");
        java.lang.String str18 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = creditCardPayment0.refund("", (double) 100.0f);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.refund("Debit Card", 1.0d);
        boolean boolean10 = debitCardPayment0.refund("Institutional Billing", 1.0d);
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling10 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str11 = institutionalBilling10.getPaymentMethodName();
        boolean boolean14 = institutionalBilling10.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str15 = institutionalBilling10.getPaymentMethodName();
        java.lang.String str16 = institutionalBilling10.getPaymentMethodName();
        boolean boolean19 = institutionalBilling10.refund("Debit Card", (double) '4');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling10);
        boolean boolean23 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment24 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean27 = debitCardPayment24.processPayment((double) 0, "hi!");
        java.lang.String str28 = debitCardPayment24.getPaymentMethodName();
        boolean boolean31 = debitCardPayment24.processPayment((double) 1L, "");
        java.lang.String str32 = debitCardPayment24.getPaymentMethodName();
        boolean boolean35 = debitCardPayment24.processPayment((double) 0.0f, "");
        boolean boolean38 = debitCardPayment24.refund("Debit Card", (double) (byte) -1);
        boolean boolean41 = debitCardPayment24.refund("hi!", (-1.0d));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment24);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment43 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean46 = debitCardPayment43.processPayment((double) 0, "hi!");
        java.lang.String str47 = debitCardPayment43.getPaymentMethodName();
        boolean boolean50 = debitCardPayment43.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str51 = debitCardPayment43.getPaymentMethodName();
        boolean boolean54 = debitCardPayment43.refund("hi!", (double) 1L);
        boolean boolean57 = debitCardPayment43.processPayment((double) 0L, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment43);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor59 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean62 = paymentProcessor59.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment63 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str64 = creditCardPayment63.getPaymentMethodName();
        boolean boolean67 = creditCardPayment63.processPayment((double) 0L, "hi!");
        boolean boolean70 = creditCardPayment63.refund("Credit Card", 100.0d);
        boolean boolean73 = creditCardPayment63.refund("hi!", 0.0d);
        paymentProcessor59.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment63);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment75 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str76 = creditCardPayment75.getPaymentMethodName();
        boolean boolean79 = creditCardPayment75.processPayment((double) 0L, "hi!");
        boolean boolean82 = creditCardPayment75.processPayment((double) (byte) 0, "Institutional Billing");
        paymentProcessor59.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment75);
        boolean boolean86 = creditCardPayment75.refund("", (double) 0.0f);
        java.lang.String str87 = creditCardPayment75.getPaymentMethodName();
        boolean boolean90 = creditCardPayment75.processPayment((-1.0d), "hi!");
        boolean boolean93 = creditCardPayment75.processPayment((double) ' ', "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Debit Card" + "'", str28, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Debit Card" + "'", str32, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Debit Card" + "'", str47, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Debit Card" + "'", str51, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Credit Card" + "'", str64, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Credit Card" + "'", str76, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Credit Card" + "'", str87, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.processPayment(0.0d, "");
        boolean boolean17 = paymentProcessor0.processPayment((double) 0L, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("hi!", (double) 10.0f);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str24 = debitCardPayment16.getPaymentMethodName();
        boolean boolean27 = debitCardPayment16.refund("hi!", (double) 1L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean31 = debitCardPayment16.refund("", (double) (byte) 0);
        boolean boolean34 = debitCardPayment16.processPayment((double) 1L, "Institutional Billing");
        boolean boolean37 = debitCardPayment16.refund("Debit Card", (double) (byte) 1);
        boolean boolean40 = debitCardPayment16.processPayment((double) 100L, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean11 = debitCardPayment0.refund("", (double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.processPayment(0.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.processPayment((double) (byte) 0, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        boolean boolean26 = paymentProcessor0.refundPayment("Debit Card", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean17 = institutionalBilling0.processPayment((double) (-1L), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.processPayment((double) 100, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) (byte) -1, "Debit Card");
        boolean boolean20 = debitCardPayment10.processPayment((double) (byte) -1, "Credit Card");
        boolean boolean23 = debitCardPayment10.processPayment((double) (byte) 10, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        java.lang.Class<?> wildcardClass25 = debitCardPayment10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 100, "hi!");
        boolean boolean17 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean20 = debitCardPayment0.processPayment((double) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) 100.0f, "hi!");
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1.0f), "");
        boolean boolean11 = debitCardPayment0.processPayment(0.0d, "Institutional Billing");
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        boolean boolean15 = debitCardPayment0.refund("", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("Debit Card", 10.0d);
        java.lang.String str12 = institutionalBilling0.getPaymentMethodName();
        boolean boolean15 = institutionalBilling0.refund("Credit Card", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Institutional Billing" + "'", str12, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean17 = debitCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean20 = debitCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str14 = creditCardPayment13.getPaymentMethodName();
        boolean boolean17 = creditCardPayment13.processPayment((double) (-1L), "");
        boolean boolean20 = creditCardPayment13.refund("hi!", (double) ' ');
        boolean boolean23 = creditCardPayment13.refund("Institutional Billing", (-1.0d));
        boolean boolean26 = creditCardPayment13.processPayment((double) 10.0f, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment13);
        boolean boolean30 = creditCardPayment13.refund("hi!", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling10 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str11 = institutionalBilling10.getPaymentMethodName();
        boolean boolean14 = institutionalBilling10.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str15 = institutionalBilling10.getPaymentMethodName();
        java.lang.String str16 = institutionalBilling10.getPaymentMethodName();
        boolean boolean19 = institutionalBilling10.refund("Debit Card", (double) '4');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling10);
        boolean boolean23 = institutionalBilling10.refund("hi!", (double) (-1.0f));
        boolean boolean26 = institutionalBilling10.processPayment((double) (short) 100, "hi!");
        boolean boolean29 = institutionalBilling10.processPayment((double) (-1L), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Credit Card", (double) 0.0f);
        boolean boolean9 = institutionalBilling0.processPayment((double) 1.0f, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((-1.0d), "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean24 = paymentProcessor0.refundPayment("Debit Card", (double) 100);
        boolean boolean27 = paymentProcessor0.processPayment((double) 0.0f, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling23 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean26 = institutionalBilling23.refund("", 0.0d);
        boolean boolean29 = institutionalBilling23.processPayment((double) 1, "Institutional Billing");
        boolean boolean32 = institutionalBilling23.refund("Debit Card", (double) (short) 10);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (-1L));
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.refundPayment("hi!", (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment(0.0d, "Debit Card");
        boolean boolean15 = paymentProcessor0.processPayment((double) 1L, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean22 = paymentProcessor13.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment23 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str24 = creditCardPayment23.getPaymentMethodName();
        boolean boolean27 = creditCardPayment23.processPayment((double) (-1L), "");
        boolean boolean30 = creditCardPayment23.refund("hi!", (double) ' ');
        java.lang.String str31 = creditCardPayment23.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment23);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling33 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean36 = institutionalBilling33.refund("Credit Card", (double) (short) 1);
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling33);
        java.lang.String str38 = institutionalBilling33.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling33);
        boolean boolean42 = paymentProcessor0.refundPayment("Credit Card", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Credit Card" + "'", str31, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment(0.0d, "Debit Card");
        java.lang.Class<?> wildcardClass13 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("", (double) (short) -1);
        java.lang.String str21 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str22 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Debit Card" + "'", str22, "Debit Card");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean22 = paymentProcessor13.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment23 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str24 = creditCardPayment23.getPaymentMethodName();
        boolean boolean27 = creditCardPayment23.processPayment((double) (-1L), "");
        boolean boolean30 = creditCardPayment23.refund("hi!", (double) ' ');
        java.lang.String str31 = creditCardPayment23.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment23);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling33 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean36 = institutionalBilling33.refund("Credit Card", (double) (short) 1);
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling33);
        java.lang.String str38 = institutionalBilling33.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling33);
        java.lang.String str40 = institutionalBilling33.getPaymentMethodName();
        java.lang.Class<?> wildcardClass41 = institutionalBilling33.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Credit Card" + "'", str31, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Institutional Billing" + "'", str40, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean16 = creditCardPayment13.refund("Credit Card", (double) (byte) 10);
        boolean boolean19 = creditCardPayment13.processPayment((double) (short) 100, "");
        boolean boolean22 = creditCardPayment13.processPayment((double) 'a', "Credit Card");
        boolean boolean25 = creditCardPayment13.refund("Credit Card", (double) 0);
        boolean boolean28 = creditCardPayment13.refund("", (double) 0L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 1, "");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) ' ');
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str17 = debitCardPayment16.getPaymentMethodName();
        boolean boolean20 = debitCardPayment16.processPayment((double) 100, "");
        boolean boolean23 = debitCardPayment16.refund("Debit Card", 1.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean27 = paymentProcessor0.refundPayment("Debit Card", (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        boolean boolean31 = institutionalBilling20.processPayment((double) (short) -1, "hi!");
        boolean boolean34 = institutionalBilling20.refund("hi!", (double) (short) 100);
        boolean boolean37 = institutionalBilling20.refund("hi!", (double) 1);
        boolean boolean40 = institutionalBilling20.processPayment((double) 100, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) '4');
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean13 = creditCardPayment0.refund("Debit Card", (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        java.lang.String str29 = institutionalBilling20.getPaymentMethodName();
        java.lang.String str30 = institutionalBilling20.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Institutional Billing" + "'", str29, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Institutional Billing" + "'", str30, "Institutional Billing");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment(0.0d, "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) 10, "Institutional Billing");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        boolean boolean17 = creditCardPayment0.processPayment(0.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean22 = institutionalBilling0.processPayment((double) (short) 1, "");
        java.lang.String str23 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Institutional Billing" + "'", str23, "Institutional Billing");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 1, "");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) ' ');
        java.lang.Class<?> wildcardClass16 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean10 = debitCardPayment7.processPayment((double) 0, "hi!");
        java.lang.String str11 = debitCardPayment7.getPaymentMethodName();
        java.lang.String str12 = debitCardPayment7.getPaymentMethodName();
        boolean boolean15 = debitCardPayment7.processPayment((double) (short) 10, "Credit Card");
        boolean boolean18 = debitCardPayment7.processPayment((double) (short) 1, "hi!");
        boolean boolean21 = debitCardPayment7.processPayment((double) '4', "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment7);
        java.lang.Class<?> wildcardClass23 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        boolean boolean18 = paymentProcessor0.processPayment((double) (short) 100, "");
        boolean boolean21 = paymentProcessor0.refundPayment("hi!", 100.0d);
        boolean boolean24 = paymentProcessor0.refundPayment("Institutional Billing", (-1.0d));
        boolean boolean27 = paymentProcessor0.refundPayment("hi!", (double) 100.0f);
        boolean boolean30 = paymentProcessor0.processPayment((double) (byte) 0, "hi!");
        boolean boolean33 = paymentProcessor0.processPayment((double) 1.0f, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor25 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean29 = creditCardPayment26.refund("Credit Card", (double) (byte) 10);
        java.lang.String str30 = creditCardPayment26.getPaymentMethodName();
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment32 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str33 = creditCardPayment32.getPaymentMethodName();
        boolean boolean36 = creditCardPayment32.processPayment((double) (-1L), "");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment32);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling38 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean41 = institutionalBilling38.refund("", 0.0d);
        boolean boolean44 = institutionalBilling38.refund("Institutional Billing", (double) 1L);
        boolean boolean47 = institutionalBilling38.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        java.lang.String str49 = institutionalBilling38.getPaymentMethodName();
        boolean boolean52 = institutionalBilling38.processPayment((double) (byte) 1, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        boolean boolean56 = institutionalBilling38.processPayment((double) 0, "hi!");
        boolean boolean59 = institutionalBilling38.processPayment((double) 'a', "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Credit Card" + "'", str30, "Credit Card");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Credit Card" + "'", str33, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Institutional Billing" + "'", str49, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) (byte) 0, "hi!");
        java.lang.String str16 = creditCardPayment7.getPaymentMethodName();
        java.lang.String str17 = creditCardPayment7.getPaymentMethodName();
        boolean boolean20 = creditCardPayment7.processPayment((double) 0.0f, "Credit Card");
        java.lang.String str21 = creditCardPayment7.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = creditCardPayment0.refund("", (double) 100.0f);
        boolean boolean13 = creditCardPayment0.refund("Institutional Billing", (double) 10L);
        boolean boolean16 = creditCardPayment0.refund("Institutional Billing", (double) 100.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Credit Card", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1.0f), "hi!");
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean14 = debitCardPayment0.processPayment((double) 10L, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean13 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        java.lang.String str14 = debitCardPayment0.getPaymentMethodName();
        boolean boolean17 = debitCardPayment0.refund("", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean17 = debitCardPayment0.refund("", (double) (byte) -1);
        boolean boolean20 = debitCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean23 = debitCardPayment0.refund("", (double) 1.0f);
        boolean boolean26 = debitCardPayment0.processPayment((double) '4', "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean15 = debitCardPayment0.refund("Institutional Billing", (double) (byte) 0);
        boolean boolean18 = debitCardPayment0.processPayment((double) (-1L), "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.processPayment((double) 0, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) (byte) -1, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean27 = debitCardPayment16.processPayment(0.0d, "Debit Card");
        boolean boolean30 = debitCardPayment16.refund("", (double) (byte) -1);
        boolean boolean33 = debitCardPayment16.refund("", (-1.0d));
        boolean boolean36 = debitCardPayment16.processPayment((double) 'a', "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor25 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean29 = creditCardPayment26.refund("Credit Card", (double) (byte) 10);
        java.lang.String str30 = creditCardPayment26.getPaymentMethodName();
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment32 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str33 = creditCardPayment32.getPaymentMethodName();
        boolean boolean36 = creditCardPayment32.processPayment((double) (-1L), "");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment32);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling38 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean41 = institutionalBilling38.refund("", 0.0d);
        boolean boolean44 = institutionalBilling38.refund("Institutional Billing", (double) 1L);
        boolean boolean47 = institutionalBilling38.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        java.lang.String str49 = institutionalBilling38.getPaymentMethodName();
        boolean boolean52 = institutionalBilling38.processPayment((double) (byte) 1, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        boolean boolean56 = paymentProcessor0.processPayment((double) (byte) 10, "Institutional Billing");
        java.lang.Class<?> wildcardClass57 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Credit Card" + "'", str30, "Credit Card");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Credit Card" + "'", str33, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Institutional Billing" + "'", str49, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling4 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean7 = institutionalBilling4.refund("", (double) 100);
        boolean boolean10 = institutionalBilling4.processPayment((double) 10.0f, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling4);
        java.lang.String str12 = institutionalBilling4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Institutional Billing" + "'", str12, "Institutional Billing");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Institutional Billing", (double) 10);
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean13 = creditCardPayment0.refund("hi!", (double) (-1.0f));
        boolean boolean16 = creditCardPayment0.processPayment((double) 10, "hi!");
        java.lang.Class<?> wildcardClass17 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.processPayment((double) (byte) 10, "Institutional Billing");
        boolean boolean21 = paymentProcessor0.processPayment(0.0d, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean20 = paymentProcessor0.refundPayment("Institutional Billing", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean23 = debitCardPayment0.processPayment((double) 'a', "");
        boolean boolean26 = debitCardPayment0.refund("", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.processPayment((double) 1L, "Institutional Billing");
        boolean boolean15 = creditCardPayment0.processPayment((double) '#', "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", 0.0d);
        boolean boolean9 = institutionalBilling0.processPayment((double) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Credit Card");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) 1);
        java.lang.Class<?> wildcardClass16 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) 0L, "hi!");
        boolean boolean11 = creditCardPayment4.refund("Credit Card", 100.0d);
        boolean boolean14 = creditCardPayment4.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) 0L, "hi!");
        boolean boolean23 = creditCardPayment16.processPayment((double) (byte) 0, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        boolean boolean27 = creditCardPayment16.refund("", (double) 0.0f);
        java.lang.String str28 = creditCardPayment16.getPaymentMethodName();
        java.lang.String str29 = creditCardPayment16.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Credit Card" + "'", str29, "Credit Card");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean9 = paymentProcessor0.processPayment((double) 0, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Credit Card", (double) (-1));
        boolean boolean15 = paymentProcessor0.refundPayment("Credit Card", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.processPayment((double) 'a', "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean22 = paymentProcessor13.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean25 = paymentProcessor13.refundPayment("", (double) 'a');
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor26 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment27 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean30 = creditCardPayment27.refund("Credit Card", (double) (byte) 10);
        java.lang.String str31 = creditCardPayment27.getPaymentMethodName();
        paymentProcessor26.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment27);
        boolean boolean35 = paymentProcessor26.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment36 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str37 = creditCardPayment36.getPaymentMethodName();
        boolean boolean40 = creditCardPayment36.processPayment((double) (-1L), "");
        boolean boolean43 = creditCardPayment36.refund("hi!", (double) ' ');
        java.lang.String str44 = creditCardPayment36.getPaymentMethodName();
        paymentProcessor26.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment36);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling46 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean49 = institutionalBilling46.refund("Credit Card", (double) (short) 1);
        paymentProcessor26.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling46);
        java.lang.String str51 = institutionalBilling46.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling46);
        java.lang.String str53 = institutionalBilling46.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling46);
        boolean boolean57 = institutionalBilling46.processPayment((-1.0d), "");
        boolean boolean60 = institutionalBilling46.refund("Debit Card", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Credit Card" + "'", str31, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Credit Card" + "'", str37, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Credit Card" + "'", str44, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Institutional Billing" + "'", str51, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Institutional Billing" + "'", str53, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        boolean boolean31 = institutionalBilling20.processPayment((double) (short) -1, "hi!");
        boolean boolean34 = institutionalBilling20.refund("hi!", (double) (short) 100);
        java.lang.String str35 = institutionalBilling20.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Institutional Billing" + "'", str35, "Institutional Billing");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("hi!", (double) '#');
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) '#');
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("", 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        boolean boolean22 = paymentProcessor0.refundPayment("hi!", (double) 1);
        boolean boolean25 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (byte) -1);
        java.lang.Class<?> wildcardClass19 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("hi!", (double) 10.0f);
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", 0.0d);
        boolean boolean21 = paymentProcessor0.processPayment((double) '4', "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        boolean boolean22 = paymentProcessor0.processPayment((double) (short) 0, "Debit Card");
        boolean boolean25 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 100, "hi!");
        boolean boolean15 = institutionalBilling0.refund("Credit Card", (double) 0L);
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str17 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str18 = institutionalBilling0.getPaymentMethodName();
        boolean boolean21 = institutionalBilling0.processPayment((double) (short) -1, "");
        boolean boolean24 = institutionalBilling0.processPayment((double) 100L, "Institutional Billing");
        boolean boolean27 = institutionalBilling0.processPayment((double) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Institutional Billing" + "'", str17, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Institutional Billing" + "'", str18, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.processPayment((double) (byte) 10, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean22 = creditCardPayment19.refund("Credit Card", (double) (byte) 10);
        java.lang.String str23 = creditCardPayment19.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment19);
        boolean boolean27 = creditCardPayment19.processPayment((double) 0, "Debit Card");
        java.lang.Class<?> wildcardClass28 = creditCardPayment19.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Credit Card" + "'", str23, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 10);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment((double) (-1.0f), "");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = creditCardPayment0.refund("", (double) 100.0f);
        boolean boolean13 = creditCardPayment0.refund("Credit Card", (double) (-1.0f));
        boolean boolean16 = creditCardPayment0.refund("Institutional Billing", (double) 100.0f);
        boolean boolean19 = creditCardPayment0.processPayment(0.0d, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Credit Card", (double) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean17 = debitCardPayment0.processPayment((-1.0d), "Institutional Billing");
        boolean boolean20 = debitCardPayment0.processPayment(0.0d, "hi!");
        boolean boolean23 = debitCardPayment0.refund("Credit Card", (double) '#');
        boolean boolean26 = debitCardPayment0.processPayment((double) (short) 1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        boolean boolean12 = paymentProcessor0.refundPayment("hi!", (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = creditCardPayment4.refund("Credit Card", (double) (short) 1);
        boolean boolean15 = creditCardPayment4.refund("hi!", 100.0d);
        boolean boolean18 = creditCardPayment4.refund("Institutional Billing", (double) (-1L));
        boolean boolean21 = creditCardPayment4.refund("", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) (byte) 0, "hi!");
        boolean boolean18 = creditCardPayment7.refund("", (double) '4');
        boolean boolean21 = creditCardPayment7.processPayment((-1.0d), "");
        boolean boolean24 = creditCardPayment7.refund("Debit Card", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0L);
        boolean boolean13 = institutionalBilling0.processPayment((double) '4', "Debit Card");
        boolean boolean16 = institutionalBilling0.processPayment((double) (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Institutional Billing", (double) (short) 0);
        boolean boolean7 = creditCardPayment0.refund("Debit Card", (double) 1);
        boolean boolean10 = creditCardPayment0.refund("", (double) 1);
        boolean boolean13 = creditCardPayment0.refund("Debit Card", (double) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.refund("Debit Card", (double) '#');
        boolean boolean18 = creditCardPayment7.refund("Credit Card", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 10);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean22 = debitCardPayment19.processPayment((double) 0, "hi!");
        java.lang.String str23 = debitCardPayment19.getPaymentMethodName();
        boolean boolean26 = debitCardPayment19.refund("Institutional Billing", (double) (byte) 1);
        boolean boolean29 = debitCardPayment19.refund("", (double) (-1L));
        boolean boolean32 = debitCardPayment19.refund("hi!", (double) 1L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment19);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment34 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean37 = debitCardPayment34.processPayment((double) 0, "hi!");
        java.lang.String str38 = debitCardPayment34.getPaymentMethodName();
        boolean boolean41 = debitCardPayment34.processPayment((double) 1L, "");
        java.lang.String str42 = debitCardPayment34.getPaymentMethodName();
        boolean boolean45 = debitCardPayment34.processPayment((double) 0.0f, "");
        boolean boolean48 = debitCardPayment34.refund("Debit Card", (double) (byte) -1);
        boolean boolean51 = debitCardPayment34.refund("hi!", (-1.0d));
        boolean boolean54 = debitCardPayment34.refund("Debit Card", (double) (byte) 100);
        boolean boolean57 = debitCardPayment34.processPayment((double) (-1L), "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment34);
        boolean boolean61 = debitCardPayment34.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str62 = debitCardPayment34.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Debit Card" + "'", str38, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Debit Card" + "'", str42, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Debit Card" + "'", str62, "Debit Card");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment(0.0d, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling4 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean7 = institutionalBilling4.refund("", (double) 100);
        boolean boolean10 = institutionalBilling4.processPayment((double) 10.0f, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling4);
        boolean boolean14 = paymentProcessor0.processPayment((double) (-1L), "");
        boolean boolean17 = paymentProcessor0.processPayment((double) 10L, "");
        java.lang.Class<?> wildcardClass18 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Institutional Billing", (double) 100L);
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) -1, "Credit Card");
        boolean boolean10 = creditCardPayment0.processPayment((double) (short) -1, "Credit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) 10, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        boolean boolean12 = paymentProcessor0.processPayment((double) 0L, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.processPayment((double) 'a', "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) (short) 10);
        boolean boolean21 = paymentProcessor0.processPayment((double) (-1), "Credit Card");
        boolean boolean24 = paymentProcessor0.processPayment((double) (byte) 10, "Credit Card");
        boolean boolean27 = paymentProcessor0.processPayment((double) 1L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment28 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean31 = creditCardPayment28.refund("Credit Card", (double) (byte) 10);
        boolean boolean34 = creditCardPayment28.processPayment((double) (short) 100, "");
        boolean boolean37 = creditCardPayment28.processPayment((double) 'a', "Credit Card");
        boolean boolean40 = creditCardPayment28.refund("Credit Card", (double) 0);
        boolean boolean43 = creditCardPayment28.refund("hi!", (double) 0L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (-1.0d));
        boolean boolean13 = institutionalBilling0.processPayment((double) (byte) -1, "Credit Card");
        java.lang.Class<?> wildcardClass14 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean14 = institutionalBilling0.processPayment((double) 1, "");
        boolean boolean17 = institutionalBilling0.processPayment((double) (short) 0, "Debit Card");
        java.lang.Class<?> wildcardClass18 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.processPayment((double) ' ', "Debit Card");
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (-1L));
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.refundPayment("hi!", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        java.lang.Class<?> wildcardClass11 = creditCardPayment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        boolean boolean31 = institutionalBilling20.refund("", (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment(0.0d, "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) 100, "");
        boolean boolean16 = creditCardPayment0.processPayment((double) 1.0f, "hi!");
        boolean boolean19 = creditCardPayment0.refund("Institutional Billing", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Institutional Billing", (double) (short) 0);
        boolean boolean7 = creditCardPayment0.refund("Debit Card", (double) 1);
        boolean boolean10 = creditCardPayment0.processPayment((double) (short) 0, "Debit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean10 = creditCardPayment0.refund("", (double) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.processPayment((double) 1, "hi!");
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean20 = paymentProcessor0.processPayment((double) '#', "Institutional Billing");
        boolean boolean23 = paymentProcessor0.processPayment((double) 100L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment24 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str25 = debitCardPayment24.getPaymentMethodName();
        boolean boolean28 = debitCardPayment24.processPayment((double) (short) 100, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment24);
        boolean boolean32 = paymentProcessor0.processPayment((double) (byte) 100, "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor33 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment34 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean37 = creditCardPayment34.refund("Credit Card", (double) (byte) 10);
        java.lang.String str38 = creditCardPayment34.getPaymentMethodName();
        paymentProcessor33.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment34);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment40 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str41 = creditCardPayment40.getPaymentMethodName();
        boolean boolean44 = creditCardPayment40.processPayment((double) (-1L), "");
        paymentProcessor33.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment40);
        boolean boolean48 = creditCardPayment40.refund("hi!", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment40);
        boolean boolean52 = paymentProcessor0.refundPayment("Credit Card", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Debit Card" + "'", str25, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Credit Card" + "'", str38, "Credit Card");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Credit Card" + "'", str41, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling10 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str11 = institutionalBilling10.getPaymentMethodName();
        boolean boolean14 = institutionalBilling10.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str15 = institutionalBilling10.getPaymentMethodName();
        java.lang.String str16 = institutionalBilling10.getPaymentMethodName();
        boolean boolean19 = institutionalBilling10.refund("Debit Card", (double) '4');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling10);
        boolean boolean23 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        boolean boolean26 = paymentProcessor0.processPayment((double) '#', "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment27 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str28 = creditCardPayment27.getPaymentMethodName();
        boolean boolean31 = creditCardPayment27.refund("hi!", (double) 0);
        boolean boolean34 = creditCardPayment27.refund("Debit Card", (double) 0);
        boolean boolean37 = creditCardPayment27.refund("hi!", (double) (short) -1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) ' ', "Institutional Billing");
        boolean boolean16 = creditCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean19 = creditCardPayment0.refund("hi!", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) (-1), "Debit Card");
        boolean boolean18 = creditCardPayment7.processPayment((double) 0.0f, "Debit Card");
        java.lang.String str19 = creditCardPayment7.getPaymentMethodName();
        java.lang.String str20 = creditCardPayment7.getPaymentMethodName();
        boolean boolean23 = creditCardPayment7.refund("", (double) (short) 0);
        java.lang.String str24 = creditCardPayment7.getPaymentMethodName();
        java.lang.String str25 = creditCardPayment7.getPaymentMethodName();
        boolean boolean28 = creditCardPayment7.processPayment((double) (-1L), "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Credit Card" + "'", str25, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (byte) 100);
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 1, "");
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.refund("", (double) (short) 100);
        boolean boolean18 = institutionalBilling0.processPayment(1.0d, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "hi!");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) (short) 10);
        boolean boolean21 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor21 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment22 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean25 = creditCardPayment22.refund("Credit Card", (double) (byte) 10);
        java.lang.String str26 = creditCardPayment22.getPaymentMethodName();
        paymentProcessor21.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment22);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment28 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str29 = creditCardPayment28.getPaymentMethodName();
        boolean boolean32 = creditCardPayment28.processPayment((double) (-1L), "");
        paymentProcessor21.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment28);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling34 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean37 = institutionalBilling34.refund("", 0.0d);
        boolean boolean40 = institutionalBilling34.refund("Institutional Billing", (double) 1L);
        boolean boolean43 = institutionalBilling34.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor21.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling34);
        java.lang.String str45 = institutionalBilling34.getPaymentMethodName();
        boolean boolean48 = institutionalBilling34.processPayment((double) (byte) 1, "hi!");
        boolean boolean51 = institutionalBilling34.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str52 = institutionalBilling34.getPaymentMethodName();
        java.lang.String str53 = institutionalBilling34.getPaymentMethodName();
        boolean boolean56 = institutionalBilling34.processPayment((double) 'a', "hi!");
        java.lang.String str57 = institutionalBilling34.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Credit Card" + "'", str26, "Credit Card");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Credit Card" + "'", str29, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Institutional Billing" + "'", str45, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Institutional Billing" + "'", str52, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Institutional Billing" + "'", str53, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Institutional Billing" + "'", str57, "Institutional Billing");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", 0.0d);
        boolean boolean13 = creditCardPayment0.processPayment((double) '4', "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean11 = debitCardPayment0.processPayment((double) '#', "Institutional Billing");
        boolean boolean14 = debitCardPayment0.processPayment((double) (byte) 0, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str20 = creditCardPayment19.getPaymentMethodName();
        boolean boolean23 = creditCardPayment19.refund("hi!", (double) 0);
        java.lang.String str24 = creditCardPayment19.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean15 = debitCardPayment0.processPayment(10.0d, "Institutional Billing");
        boolean boolean18 = debitCardPayment0.processPayment((double) 0L, "");
        boolean boolean21 = debitCardPayment0.processPayment((double) (short) 100, "Credit Card");
        boolean boolean24 = debitCardPayment0.refund("Debit Card", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.processPayment((double) 100.0f, "");
        boolean boolean17 = paymentProcessor0.processPayment((double) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) '#', "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean13 = debitCardPayment0.processPayment(100.0d, "Institutional Billing");
        java.lang.String str14 = debitCardPayment0.getPaymentMethodName();
        boolean boolean17 = debitCardPayment0.refund("", (-1.0d));
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((double) 10L, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Institutional Billing", (double) 100L);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean12 = institutionalBilling0.refund("", (double) (short) -1);
        boolean boolean15 = institutionalBilling0.refund("Credit Card", 10.0d);
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        boolean boolean13 = creditCardPayment4.refund("hi!", 0.0d);
        boolean boolean16 = creditCardPayment4.refund("", (double) 100);
        boolean boolean19 = creditCardPayment4.refund("hi!", 1.0d);
        boolean boolean22 = creditCardPayment4.processPayment((double) '#', "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean20 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        boolean boolean23 = debitCardPayment0.processPayment((double) 0, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.processPayment((double) 0, "Institutional Billing");
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) 0.0f);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor19 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean23 = creditCardPayment20.refund("Credit Card", (double) (byte) 10);
        java.lang.String str24 = creditCardPayment20.getPaymentMethodName();
        paymentProcessor19.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment20);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str27 = creditCardPayment26.getPaymentMethodName();
        boolean boolean30 = creditCardPayment26.processPayment((double) (-1L), "");
        paymentProcessor19.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        boolean boolean34 = paymentProcessor19.refundPayment("hi!", (double) 10.0f);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor35 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment36 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean39 = debitCardPayment36.processPayment((double) 0, "hi!");
        java.lang.String str40 = debitCardPayment36.getPaymentMethodName();
        java.lang.String str41 = debitCardPayment36.getPaymentMethodName();
        boolean boolean44 = debitCardPayment36.processPayment((double) 'a', "Credit Card");
        paymentProcessor35.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment36);
        java.lang.String str46 = debitCardPayment36.getPaymentMethodName();
        boolean boolean49 = debitCardPayment36.refund("", (double) (byte) 1);
        paymentProcessor19.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment36);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment36);
        java.lang.Class<?> wildcardClass52 = debitCardPayment36.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Debit Card" + "'", str40, "Debit Card");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Debit Card" + "'", str41, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Debit Card" + "'", str46, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean16 = debitCardPayment13.processPayment((double) 0, "hi!");
        java.lang.String str17 = debitCardPayment13.getPaymentMethodName();
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        boolean boolean21 = debitCardPayment13.processPayment((double) (-1.0f), "");
        boolean boolean24 = debitCardPayment13.processPayment(0.0d, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling10 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str11 = institutionalBilling10.getPaymentMethodName();
        boolean boolean14 = institutionalBilling10.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str15 = institutionalBilling10.getPaymentMethodName();
        java.lang.String str16 = institutionalBilling10.getPaymentMethodName();
        boolean boolean19 = institutionalBilling10.refund("Debit Card", (double) '4');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling10);
        boolean boolean23 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment24 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean27 = debitCardPayment24.processPayment((double) 0, "hi!");
        java.lang.String str28 = debitCardPayment24.getPaymentMethodName();
        boolean boolean31 = debitCardPayment24.processPayment((double) 1L, "");
        java.lang.String str32 = debitCardPayment24.getPaymentMethodName();
        boolean boolean35 = debitCardPayment24.processPayment((double) 0.0f, "");
        boolean boolean38 = debitCardPayment24.refund("Debit Card", (double) (byte) -1);
        boolean boolean41 = debitCardPayment24.refund("hi!", (-1.0d));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment24);
        boolean boolean45 = paymentProcessor0.refundPayment("", (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Debit Card" + "'", str28, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Debit Card" + "'", str32, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean16 = debitCardPayment13.processPayment((double) 0, "hi!");
        java.lang.String str17 = debitCardPayment13.getPaymentMethodName();
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        boolean boolean21 = debitCardPayment13.refund("Institutional Billing", (double) 1L);
        boolean boolean24 = debitCardPayment13.processPayment((double) 0L, "Debit Card");
        boolean boolean27 = debitCardPayment13.processPayment(0.0d, "Credit Card");
        boolean boolean30 = debitCardPayment13.processPayment((double) 10.0f, "Debit Card");
        boolean boolean33 = debitCardPayment13.refund("Institutional Billing", (double) 10L);
        boolean boolean36 = debitCardPayment13.processPayment((double) (byte) -1, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        boolean boolean40 = debitCardPayment13.refund("Debit Card", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) 0.0f, "hi!");
        boolean boolean27 = creditCardPayment0.processPayment((double) 1L, "hi!");
        java.lang.String str28 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) -1, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) 10);
        boolean boolean17 = debitCardPayment0.processPayment((double) 1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.processPayment((double) 100.0f, "Institutional Billing");
        boolean boolean12 = institutionalBilling0.processPayment((double) (-1.0f), "Debit Card");
        boolean boolean15 = institutionalBilling0.processPayment((double) (-1L), "");
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.refund("Credit Card", (double) 0.0f);
        boolean boolean7 = institutionalBilling0.refund("", (double) 100.0f);
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        boolean boolean13 = creditCardPayment4.refund("hi!", 0.0d);
        boolean boolean16 = creditCardPayment4.refund("", (double) 100);
        boolean boolean19 = creditCardPayment4.processPayment((double) (short) 1, "Credit Card");
        java.lang.String str20 = creditCardPayment4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling23 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean26 = institutionalBilling23.refund("", (double) 100);
        boolean boolean29 = institutionalBilling23.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean32 = institutionalBilling23.refund("Debit Card", 10.0d);
        boolean boolean35 = institutionalBilling23.refund("Credit Card", (double) 10.0f);
        boolean boolean38 = institutionalBilling23.processPayment(0.0d, "Institutional Billing");
        java.lang.String str39 = institutionalBilling23.getPaymentMethodName();
        boolean boolean42 = institutionalBilling23.processPayment((double) 10.0f, "");
        java.lang.String str43 = institutionalBilling23.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling23);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling45 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean48 = institutionalBilling45.refund("", (double) 100);
        boolean boolean51 = institutionalBilling45.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean54 = institutionalBilling45.refund("Debit Card", 10.0d);
        boolean boolean57 = institutionalBilling45.processPayment((double) (byte) 100, "hi!");
        boolean boolean60 = institutionalBilling45.refund("Credit Card", (double) 0L);
        java.lang.String str61 = institutionalBilling45.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling45);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor63 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment64 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean67 = creditCardPayment64.refund("Credit Card", (double) (byte) 10);
        java.lang.String str68 = creditCardPayment64.getPaymentMethodName();
        paymentProcessor63.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment64);
        boolean boolean72 = paymentProcessor63.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment73 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str74 = creditCardPayment73.getPaymentMethodName();
        boolean boolean77 = creditCardPayment73.processPayment((double) (-1L), "");
        boolean boolean80 = creditCardPayment73.refund("hi!", (double) ' ');
        java.lang.String str81 = creditCardPayment73.getPaymentMethodName();
        paymentProcessor63.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment73);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling83 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean86 = institutionalBilling83.refund("Credit Card", (double) (short) 1);
        paymentProcessor63.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling83);
        boolean boolean90 = institutionalBilling83.refund("", (double) 100.0f);
        java.lang.String str91 = institutionalBilling83.getPaymentMethodName();
        boolean boolean94 = institutionalBilling83.processPayment((double) (short) -1, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling83);
        java.lang.Class<?> wildcardClass96 = institutionalBilling83.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Institutional Billing" + "'", str39, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Institutional Billing" + "'", str43, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Institutional Billing" + "'", str61, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Credit Card" + "'", str68, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Credit Card" + "'", str74, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Credit Card" + "'", str81, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Institutional Billing" + "'", str91, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.refund("Credit Card", (double) 0);
        boolean boolean15 = creditCardPayment0.refund("", (double) 0L);
        boolean boolean18 = creditCardPayment0.processPayment((double) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((double) 1L, "Debit Card");
        boolean boolean18 = institutionalBilling0.refund("", (double) (byte) 0);
        boolean boolean21 = institutionalBilling0.refund("Credit Card", 0.0d);
        boolean boolean24 = institutionalBilling0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean27 = institutionalBilling0.refund("Debit Card", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("Debit Card", 0.0d);
        boolean boolean14 = creditCardPayment0.processPayment((double) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 10);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean22 = debitCardPayment19.processPayment((double) 0, "hi!");
        java.lang.String str23 = debitCardPayment19.getPaymentMethodName();
        boolean boolean26 = debitCardPayment19.refund("Institutional Billing", (double) (byte) 1);
        boolean boolean29 = debitCardPayment19.refund("", (double) (-1L));
        boolean boolean32 = debitCardPayment19.refund("hi!", (double) 1L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment19);
        boolean boolean36 = paymentProcessor0.refundPayment("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean20 = paymentProcessor0.processPayment((double) '#', "Institutional Billing");
        boolean boolean23 = paymentProcessor0.refundPayment("Debit Card", (double) 0.0f);
        boolean boolean26 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        java.lang.Class<?> wildcardClass27 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((-1.0d), "Debit Card");
        boolean boolean18 = institutionalBilling0.processPayment((double) (-1L), "hi!");
        boolean boolean21 = institutionalBilling0.processPayment((double) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.processPayment((double) (byte) 0, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment24 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str25 = debitCardPayment24.getPaymentMethodName();
        boolean boolean28 = debitCardPayment24.refund("hi!", (double) 0L);
        boolean boolean31 = debitCardPayment24.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment24);
        java.lang.String str33 = debitCardPayment24.getPaymentMethodName();
        java.lang.String str34 = debitCardPayment24.getPaymentMethodName();
        java.lang.String str35 = debitCardPayment24.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Debit Card" + "'", str25, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Debit Card" + "'", str33, "Debit Card");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass9 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.processPayment((double) ' ', "Credit Card");
        boolean boolean23 = debitCardPayment0.refund("Institutional Billing", (double) 10L);
        boolean boolean26 = debitCardPayment0.refund("Institutional Billing", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean25 = debitCardPayment10.processPayment((double) 100, "Credit Card");
        boolean boolean28 = debitCardPayment10.processPayment((double) (short) 100, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        java.lang.String str11 = creditCardPayment4.getPaymentMethodName();
        boolean boolean14 = creditCardPayment4.processPayment((double) 0.0f, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = creditCardPayment4.refund("Credit Card", 0.0d);
        java.lang.String str13 = creditCardPayment4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) 10.0f);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        java.lang.Class<?> wildcardClass12 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Debit Card", (double) (short) 10);
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1L), "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.processPayment((double) (byte) 0, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment24 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str25 = debitCardPayment24.getPaymentMethodName();
        boolean boolean28 = debitCardPayment24.refund("hi!", (double) 0L);
        boolean boolean31 = debitCardPayment24.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment24);
        java.lang.String str33 = debitCardPayment24.getPaymentMethodName();
        java.lang.String str34 = debitCardPayment24.getPaymentMethodName();
        boolean boolean37 = debitCardPayment24.processPayment((double) (short) 100, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Debit Card" + "'", str25, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Debit Card" + "'", str33, "Debit Card");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.refund("", (double) 100L);
        boolean boolean15 = debitCardPayment0.processPayment((double) 10, "");
        boolean boolean18 = debitCardPayment0.processPayment((double) 100L, "");
        java.lang.String str19 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean17 = debitCardPayment0.refund("", (double) (byte) -1);
        boolean boolean20 = debitCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean23 = debitCardPayment0.refund("", (double) 1.0f);
        boolean boolean26 = debitCardPayment0.refund("Institutional Billing", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str6 = institutionalBilling0.getPaymentMethodName();
        boolean boolean9 = institutionalBilling0.refund("hi!", (double) ' ');
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 100, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Institutional Billing" + "'", str6, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 1, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean16 = debitCardPayment13.processPayment((double) 0, "hi!");
        java.lang.String str17 = debitCardPayment13.getPaymentMethodName();
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        boolean boolean21 = debitCardPayment13.refund("Institutional Billing", (double) 1L);
        boolean boolean24 = debitCardPayment13.processPayment((double) 0L, "Debit Card");
        boolean boolean27 = debitCardPayment13.refund("Credit Card", (double) '#');
        java.lang.String str28 = debitCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        boolean boolean32 = debitCardPayment13.refund("Debit Card", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Debit Card" + "'", str28, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) (byte) 100, "");
        boolean boolean27 = creditCardPayment0.processPayment((double) (byte) 100, "");
        boolean boolean30 = creditCardPayment0.refund("Credit Card", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((-1.0d), "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean24 = paymentProcessor0.refundPayment("", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean25 = paymentProcessor0.refundPayment("Debit Card", (double) 0.0f);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str27 = creditCardPayment26.getPaymentMethodName();
        boolean boolean30 = creditCardPayment26.processPayment((double) (-1L), "");
        boolean boolean33 = creditCardPayment26.processPayment((double) 1L, "");
        boolean boolean36 = creditCardPayment26.refund("", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        boolean boolean40 = paymentProcessor0.processPayment(0.0d, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment(0.0d, "hi!");
        boolean boolean12 = creditCardPayment1.refund("hi!", (-1.0d));
        boolean boolean15 = creditCardPayment1.processPayment((double) 0.0f, "Credit Card");
        boolean boolean18 = creditCardPayment1.refund("", (double) 100);
        boolean boolean21 = creditCardPayment1.processPayment((double) 0, "");
        boolean boolean24 = creditCardPayment1.processPayment((double) (short) 10, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.refund("", (double) (-1.0f));
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean13 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean16 = debitCardPayment0.processPayment((double) (short) -1, "Institutional Billing");
        java.lang.Class<?> wildcardClass17 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.processPayment((double) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) 0L, "hi!");
        boolean boolean8 = creditCardPayment1.refund("Credit Card", 100.0d);
        boolean boolean11 = creditCardPayment1.processPayment((double) '4', "Debit Card");
        boolean boolean14 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        boolean boolean17 = creditCardPayment1.processPayment((double) ' ', "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment((double) (short) 1, "Institutional Billing");
        boolean boolean22 = institutionalBilling0.processPayment((double) 1.0f, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling10 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str11 = institutionalBilling10.getPaymentMethodName();
        boolean boolean14 = institutionalBilling10.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str15 = institutionalBilling10.getPaymentMethodName();
        java.lang.String str16 = institutionalBilling10.getPaymentMethodName();
        boolean boolean19 = institutionalBilling10.refund("Debit Card", (double) '4');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling10);
        boolean boolean23 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment24 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean27 = debitCardPayment24.processPayment((double) 0, "hi!");
        java.lang.String str28 = debitCardPayment24.getPaymentMethodName();
        boolean boolean31 = debitCardPayment24.processPayment((double) 1L, "");
        java.lang.String str32 = debitCardPayment24.getPaymentMethodName();
        boolean boolean35 = debitCardPayment24.processPayment((double) 0.0f, "");
        boolean boolean38 = debitCardPayment24.refund("Debit Card", (double) (byte) -1);
        boolean boolean41 = debitCardPayment24.refund("hi!", (-1.0d));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment24);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment43 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean46 = debitCardPayment43.processPayment((double) 0, "hi!");
        java.lang.String str47 = debitCardPayment43.getPaymentMethodName();
        boolean boolean50 = debitCardPayment43.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str51 = debitCardPayment43.getPaymentMethodName();
        boolean boolean54 = debitCardPayment43.refund("hi!", (double) 1L);
        boolean boolean57 = debitCardPayment43.processPayment((double) 0L, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment43);
        boolean boolean61 = debitCardPayment43.refund("Debit Card", (double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Debit Card" + "'", str28, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Debit Card" + "'", str32, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Debit Card" + "'", str47, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Debit Card" + "'", str51, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.refund("Debit Card", 1.0d);
        boolean boolean10 = debitCardPayment0.processPayment((double) 100, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) 0L, "hi!");
        boolean boolean11 = creditCardPayment4.refund("Credit Card", 100.0d);
        boolean boolean14 = creditCardPayment4.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean18 = creditCardPayment4.processPayment((double) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment(100.0d, "Debit Card");
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str13 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Debit Card" + "'", str13, "Debit Card");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 0L, "Debit Card");
        boolean boolean15 = paymentProcessor0.refundPayment("hi!", (double) 100.0f);
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (short) 10);
        boolean boolean21 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment((double) '4', "Credit Card");
        boolean boolean10 = institutionalBilling0.processPayment((double) 100.0f, "Debit Card");
        boolean boolean13 = institutionalBilling0.processPayment((double) 10, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 10);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor19 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean22 = paymentProcessor19.refundPayment("Credit Card", (double) 0L);
        boolean boolean25 = paymentProcessor19.processPayment((double) 'a', "Credit Card");
        boolean boolean28 = paymentProcessor19.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean31 = paymentProcessor19.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor32 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment33 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean36 = creditCardPayment33.refund("Credit Card", (double) (byte) 10);
        java.lang.String str37 = creditCardPayment33.getPaymentMethodName();
        paymentProcessor32.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment33);
        paymentProcessor19.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment33);
        boolean boolean42 = creditCardPayment33.refund("Credit Card", (double) 0L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment33);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment44 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean47 = debitCardPayment44.processPayment((double) 0, "hi!");
        java.lang.String str48 = debitCardPayment44.getPaymentMethodName();
        java.lang.String str49 = debitCardPayment44.getPaymentMethodName();
        boolean boolean52 = debitCardPayment44.processPayment((double) (short) 10, "Credit Card");
        boolean boolean55 = debitCardPayment44.processPayment((double) (short) 1, "hi!");
        boolean boolean58 = debitCardPayment44.processPayment((double) '4', "Debit Card");
        boolean boolean61 = debitCardPayment44.processPayment((-1.0d), "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment44);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Credit Card" + "'", str37, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Debit Card" + "'", str48, "Debit Card");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Debit Card" + "'", str49, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) 0L, "hi!");
        boolean boolean11 = creditCardPayment4.refund("Credit Card", 100.0d);
        boolean boolean14 = creditCardPayment4.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean18 = paymentProcessor0.refundPayment("Credit Card", (double) (-1.0f));
        boolean boolean21 = paymentProcessor0.refundPayment("Debit Card", (double) 'a');
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy22);
        java.lang.Class<?> wildcardClass24 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor4 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment5 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean8 = creditCardPayment5.refund("Credit Card", (double) (byte) 10);
        java.lang.String str9 = creditCardPayment5.getPaymentMethodName();
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment5);
        boolean boolean13 = paymentProcessor4.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean16 = paymentProcessor4.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment17 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean20 = creditCardPayment17.refund("Credit Card", (double) (byte) 10);
        java.lang.String str21 = creditCardPayment17.getPaymentMethodName();
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        boolean boolean25 = creditCardPayment17.processPayment(100.0d, "");
        boolean boolean28 = creditCardPayment17.refund("hi!", (double) (-1.0f));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        boolean boolean32 = creditCardPayment17.processPayment((double) 'a', "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.processPayment(0.0d, "hi!");
        boolean boolean17 = paymentProcessor0.refundPayment("hi!", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling4 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean7 = institutionalBilling4.refund("", (double) 100);
        boolean boolean10 = institutionalBilling4.processPayment((double) 10.0f, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling4);
        boolean boolean14 = paymentProcessor0.refundPayment("Credit Card", (double) 10.0f);
        boolean boolean17 = paymentProcessor0.refundPayment("hi!", (double) 100.0f);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment18 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str19 = creditCardPayment18.getPaymentMethodName();
        boolean boolean22 = creditCardPayment18.processPayment((double) (-1L), "");
        boolean boolean25 = creditCardPayment18.refund("hi!", (double) ' ');
        java.lang.String str26 = creditCardPayment18.getPaymentMethodName();
        java.lang.String str27 = creditCardPayment18.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment18);
        boolean boolean31 = paymentProcessor0.processPayment((double) (byte) 100, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Credit Card" + "'", str26, "Credit Card");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor25 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean29 = creditCardPayment26.refund("Credit Card", (double) (byte) 10);
        java.lang.String str30 = creditCardPayment26.getPaymentMethodName();
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment32 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str33 = creditCardPayment32.getPaymentMethodName();
        boolean boolean36 = creditCardPayment32.processPayment((double) (-1L), "");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment32);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling38 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean41 = institutionalBilling38.refund("", 0.0d);
        boolean boolean44 = institutionalBilling38.refund("Institutional Billing", (double) 1L);
        boolean boolean47 = institutionalBilling38.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        java.lang.String str49 = institutionalBilling38.getPaymentMethodName();
        boolean boolean52 = institutionalBilling38.processPayment((double) (byte) 1, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        boolean boolean56 = institutionalBilling38.refund("Institutional Billing", (double) ' ');
        boolean boolean59 = institutionalBilling38.refund("Debit Card", (double) (byte) 0);
        java.lang.String str60 = institutionalBilling38.getPaymentMethodName();
        boolean boolean63 = institutionalBilling38.refund("hi!", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Credit Card" + "'", str30, "Credit Card");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Credit Card" + "'", str33, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Institutional Billing" + "'", str49, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Institutional Billing" + "'", str60, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Institutional Billing", 1.0d);
        boolean boolean6 = debitCardPayment0.processPayment((double) (byte) 1, "hi!");
        boolean boolean9 = debitCardPayment0.refund("", (double) 1.0f);
        boolean boolean12 = debitCardPayment0.refund("Institutional Billing", (double) (short) 10);
        boolean boolean15 = debitCardPayment0.refund("Institutional Billing", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", 0.0d);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str21 = creditCardPayment20.getPaymentMethodName();
        boolean boolean24 = creditCardPayment20.processPayment((double) (-1L), "");
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment20);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling26 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean29 = institutionalBilling26.refund("", 0.0d);
        boolean boolean32 = institutionalBilling26.refund("Institutional Billing", (double) 1L);
        boolean boolean35 = institutionalBilling26.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling26);
        java.lang.String str37 = institutionalBilling26.getPaymentMethodName();
        boolean boolean40 = institutionalBilling26.processPayment((double) (byte) 1, "hi!");
        boolean boolean43 = institutionalBilling26.processPayment((double) (byte) 100, "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling26);
        boolean boolean47 = institutionalBilling26.processPayment((double) (-1.0f), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Institutional Billing" + "'", str37, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.refund("Credit Card", (double) 0);
        boolean boolean15 = creditCardPayment0.refund("hi!", (double) 0L);
        boolean boolean18 = creditCardPayment0.refund("hi!", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Institutional Billing", 1.0d);
        boolean boolean6 = debitCardPayment0.processPayment((double) (byte) 1, "hi!");
        boolean boolean9 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean12 = debitCardPayment0.refund("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment(0.0d, "hi!");
        boolean boolean12 = creditCardPayment1.refund("hi!", (-1.0d));
        boolean boolean15 = creditCardPayment1.processPayment((double) 0.0f, "Credit Card");
        boolean boolean18 = creditCardPayment1.refund("", (double) 100);
        boolean boolean21 = creditCardPayment1.processPayment((double) 0, "");
        boolean boolean24 = creditCardPayment1.processPayment((double) 100L, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        java.lang.Class<?> wildcardClass10 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean4 = debitCardPayment1.processPayment((double) 0, "hi!");
        java.lang.String str5 = debitCardPayment1.getPaymentMethodName();
        java.lang.String str6 = debitCardPayment1.getPaymentMethodName();
        boolean boolean9 = debitCardPayment1.processPayment((double) 'a', "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment1);
        java.lang.String str11 = debitCardPayment1.getPaymentMethodName();
        boolean boolean14 = debitCardPayment1.processPayment((double) 0L, "Credit Card");
        java.lang.String str15 = debitCardPayment1.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) 0.0f, "hi!");
        boolean boolean27 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        java.lang.String str28 = creditCardPayment0.getPaymentMethodName();
        boolean boolean31 = creditCardPayment0.processPayment((double) (-1L), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (byte) -1);
        boolean boolean21 = paymentProcessor0.processPayment((double) (byte) 0, "Debit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment22 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str23 = debitCardPayment22.getPaymentMethodName();
        java.lang.String str24 = debitCardPayment22.getPaymentMethodName();
        boolean boolean27 = debitCardPayment22.processPayment((double) '#', "Credit Card");
        boolean boolean30 = debitCardPayment22.processPayment((double) (-1.0f), "hi!");
        boolean boolean33 = debitCardPayment22.refund("Debit Card", (double) (byte) 0);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment22);
        boolean boolean37 = paymentProcessor0.refundPayment("", (double) '#');
        boolean boolean40 = paymentProcessor0.refundPayment("Debit Card", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 10, "Debit Card");
        boolean boolean7 = creditCardPayment0.processPayment((double) 10L, "Debit Card");
        boolean boolean10 = creditCardPayment0.processPayment(0.0d, "Institutional Billing");
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean20 = paymentProcessor0.processPayment((double) '#', "Institutional Billing");
        boolean boolean23 = paymentProcessor0.refundPayment("Debit Card", (double) 0.0f);
        boolean boolean26 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean29 = paymentProcessor0.processPayment((double) 0.0f, "Debit Card");
        boolean boolean32 = paymentProcessor0.processPayment((double) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        boolean boolean17 = paymentProcessor0.refundPayment("Institutional Billing", (double) (-1.0f));
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling18 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str19 = institutionalBilling18.getPaymentMethodName();
        boolean boolean22 = institutionalBilling18.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str23 = institutionalBilling18.getPaymentMethodName();
        java.lang.String str24 = institutionalBilling18.getPaymentMethodName();
        boolean boolean27 = institutionalBilling18.processPayment((double) (byte) 1, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling18);
        boolean boolean31 = institutionalBilling18.refund("Institutional Billing", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Institutional Billing" + "'", str19, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Institutional Billing" + "'", str23, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Institutional Billing" + "'", str24, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        boolean boolean31 = institutionalBilling20.processPayment((double) (short) -1, "hi!");
        boolean boolean34 = institutionalBilling20.refund("hi!", (double) (short) 100);
        boolean boolean37 = institutionalBilling20.refund("hi!", (double) 1);
        java.lang.Class<?> wildcardClass38 = institutionalBilling20.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling23 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean26 = institutionalBilling23.refund("", (double) 100);
        boolean boolean29 = institutionalBilling23.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean32 = institutionalBilling23.refund("Debit Card", 10.0d);
        boolean boolean35 = institutionalBilling23.refund("Credit Card", (double) 10.0f);
        boolean boolean38 = institutionalBilling23.processPayment(0.0d, "Institutional Billing");
        java.lang.String str39 = institutionalBilling23.getPaymentMethodName();
        boolean boolean42 = institutionalBilling23.processPayment((double) 10.0f, "");
        java.lang.String str43 = institutionalBilling23.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling23);
        boolean boolean47 = institutionalBilling23.refund("hi!", (double) 0);
        boolean boolean50 = institutionalBilling23.processPayment((double) '#', "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Institutional Billing" + "'", str39, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Institutional Billing" + "'", str43, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1.0f), "hi!");
        boolean boolean11 = debitCardPayment0.processPayment((double) 'a', "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean23 = debitCardPayment0.processPayment((double) 100.0f, "Debit Card");
        boolean boolean26 = debitCardPayment0.processPayment((double) ' ', "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) (short) 100, "Debit Card");
        boolean boolean7 = debitCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean10 = debitCardPayment0.refund("Credit Card", (double) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("Credit Card", 0.0d);
        java.lang.String str21 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) 10.0f);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        boolean boolean14 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        boolean boolean18 = creditCardPayment0.refund("Credit Card", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        java.lang.String str11 = creditCardPayment4.getPaymentMethodName();
        java.lang.String str12 = creditCardPayment4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Credit Card", (double) 0.0f);
        boolean boolean9 = institutionalBilling0.processPayment((double) (byte) 0, "");
        boolean boolean12 = institutionalBilling0.processPayment(100.0d, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("hi!", (double) 0);
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean25 = paymentProcessor0.refundPayment("Debit Card", (double) 0.0f);
        boolean boolean28 = paymentProcessor0.refundPayment("hi!", (double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) (byte) 100, "");
        java.lang.String str25 = creditCardPayment0.getPaymentMethodName();
        boolean boolean28 = creditCardPayment0.refund("hi!", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Credit Card" + "'", str25, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean15 = debitCardPayment0.refund("Institutional Billing", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean23 = creditCardPayment14.refund("Credit Card", (double) 0L);
        boolean boolean26 = creditCardPayment14.processPayment((double) 100, "Institutional Billing");
        java.lang.String str27 = creditCardPayment14.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("", 0.0d);
        boolean boolean19 = institutionalBilling13.refund("Institutional Billing", (double) 1L);
        boolean boolean22 = institutionalBilling13.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        boolean boolean26 = paymentProcessor0.processPayment(100.0d, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling27 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean30 = institutionalBilling27.refund("", (double) 100);
        boolean boolean33 = institutionalBilling27.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean36 = institutionalBilling27.refund("Debit Card", 10.0d);
        boolean boolean39 = institutionalBilling27.refund("Credit Card", (double) 10.0f);
        boolean boolean42 = institutionalBilling27.processPayment(0.0d, "Institutional Billing");
        java.lang.String str43 = institutionalBilling27.getPaymentMethodName();
        boolean boolean46 = institutionalBilling27.processPayment((double) 10.0f, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling27);
        boolean boolean50 = institutionalBilling27.processPayment((double) (short) -1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Institutional Billing" + "'", str43, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean13 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean16 = debitCardPayment0.processPayment((double) 100L, "Debit Card");
        java.lang.String str17 = debitCardPayment0.getPaymentMethodName();
        boolean boolean20 = debitCardPayment0.processPayment((double) (-1L), "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        boolean boolean22 = paymentProcessor0.refundPayment("Credit Card", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean17 = debitCardPayment0.processPayment(100.0d, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) 0);
        boolean boolean23 = debitCardPayment0.refund("Institutional Billing", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Institutional Billing", (double) (short) 0);
        boolean boolean7 = creditCardPayment0.refund("Debit Card", (double) 1);
        boolean boolean10 = creditCardPayment0.refund("", (double) 1);
        boolean boolean13 = creditCardPayment0.refund("", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) (short) 0, "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor4 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment5 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean8 = creditCardPayment5.refund("Credit Card", (double) (byte) 10);
        java.lang.String str9 = creditCardPayment5.getPaymentMethodName();
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment5);
        boolean boolean13 = paymentProcessor4.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str15 = creditCardPayment14.getPaymentMethodName();
        boolean boolean18 = creditCardPayment14.processPayment((double) (-1L), "");
        boolean boolean21 = creditCardPayment14.refund("hi!", (double) ' ');
        java.lang.String str22 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling24 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean27 = institutionalBilling24.refund("Credit Card", (double) (short) 1);
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling24);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor29 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment30 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean33 = creditCardPayment30.refund("Credit Card", (double) (byte) 10);
        java.lang.String str34 = creditCardPayment30.getPaymentMethodName();
        paymentProcessor29.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment30);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment36 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str37 = creditCardPayment36.getPaymentMethodName();
        boolean boolean40 = creditCardPayment36.processPayment((double) (-1L), "");
        paymentProcessor29.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment36);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling42 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean45 = institutionalBilling42.refund("", 0.0d);
        boolean boolean48 = institutionalBilling42.refund("Institutional Billing", (double) 1L);
        boolean boolean51 = institutionalBilling42.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor29.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling42);
        java.lang.String str53 = institutionalBilling42.getPaymentMethodName();
        boolean boolean56 = institutionalBilling42.processPayment((double) (byte) 1, "hi!");
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling42);
        boolean boolean60 = institutionalBilling42.processPayment((double) 0, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling42);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Credit Card" + "'", str34, "Credit Card");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Credit Card" + "'", str37, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Institutional Billing" + "'", str53, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Institutional Billing", (double) 10);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("hi!", (double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.processPayment((double) 100.0f, "Institutional Billing");
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean4 = debitCardPayment1.processPayment((double) 0, "hi!");
        java.lang.String str5 = debitCardPayment1.getPaymentMethodName();
        java.lang.String str6 = debitCardPayment1.getPaymentMethodName();
        boolean boolean9 = debitCardPayment1.processPayment((double) 'a', "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment1);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor11 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean14 = paymentProcessor11.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment15 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str16 = creditCardPayment15.getPaymentMethodName();
        boolean boolean19 = creditCardPayment15.processPayment((double) 0L, "hi!");
        boolean boolean22 = creditCardPayment15.refund("Credit Card", 100.0d);
        boolean boolean25 = creditCardPayment15.refund("hi!", 0.0d);
        paymentProcessor11.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment15);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment15);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling28 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean31 = institutionalBilling28.refund("", (double) 100);
        boolean boolean34 = institutionalBilling28.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean37 = institutionalBilling28.refund("Debit Card", 10.0d);
        boolean boolean40 = institutionalBilling28.processPayment((double) 1, "Credit Card");
        java.lang.String str41 = institutionalBilling28.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Institutional Billing" + "'", str41, "Institutional Billing");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment((double) 10, "Institutional Billing");
        boolean boolean18 = paymentProcessor0.processPayment((double) 'a', "Debit Card");
        boolean boolean21 = paymentProcessor0.refundPayment("", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Institutional Billing", (double) (short) 0);
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean10 = creditCardPayment0.processPayment((double) 100.0f, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = creditCardPayment4.refund("Credit Card", 0.0d);
        boolean boolean15 = creditCardPayment4.refund("hi!", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment(0.0d, "hi!");
        boolean boolean12 = creditCardPayment1.refund("hi!", (-1.0d));
        boolean boolean15 = creditCardPayment1.processPayment((double) 0.0f, "Credit Card");
        boolean boolean18 = creditCardPayment1.refund("", (double) 100);
        boolean boolean21 = creditCardPayment1.refund("", (double) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((-1.0d), "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean24 = paymentProcessor0.refundPayment("Debit Card", (double) 100);
        boolean boolean27 = paymentProcessor0.processPayment((double) (short) 10, "");
        java.lang.Class<?> wildcardClass28 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) (-1L), "");
        java.lang.String str21 = creditCardPayment16.getPaymentMethodName();
        java.lang.String str22 = creditCardPayment16.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        boolean boolean26 = paymentProcessor0.refundPayment("hi!", 0.0d);
        boolean boolean29 = paymentProcessor0.processPayment((-1.0d), "hi!");
        boolean boolean32 = paymentProcessor0.refundPayment("Institutional Billing", (double) 0L);
        boolean boolean35 = paymentProcessor0.refundPayment("Credit Card", (double) 'a');
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment36 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str37 = creditCardPayment36.getPaymentMethodName();
        boolean boolean40 = creditCardPayment36.processPayment((double) 0, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment36);
        boolean boolean44 = paymentProcessor0.processPayment((double) 0L, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Credit Card" + "'", str37, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        boolean boolean18 = paymentProcessor0.processPayment((double) (short) 100, "");
        boolean boolean21 = paymentProcessor0.refundPayment("hi!", 100.0d);
        boolean boolean24 = paymentProcessor0.refundPayment("Institutional Billing", (-1.0d));
        boolean boolean27 = paymentProcessor0.refundPayment("hi!", (double) 100.0f);
        boolean boolean30 = paymentProcessor0.processPayment((double) (byte) 0, "hi!");
        boolean boolean33 = paymentProcessor0.processPayment((double) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean23 = creditCardPayment14.refund("Credit Card", (double) 0L);
        boolean boolean26 = creditCardPayment14.processPayment((double) 100, "Institutional Billing");
        boolean boolean29 = creditCardPayment14.refund("", (double) (byte) 10);
        java.lang.String str30 = creditCardPayment14.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Credit Card" + "'", str30, "Credit Card");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        boolean boolean18 = paymentProcessor0.processPayment((double) (short) 100, "");
        boolean boolean21 = paymentProcessor0.refundPayment("hi!", 100.0d);
        boolean boolean24 = paymentProcessor0.refundPayment("Institutional Billing", (-1.0d));
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling25 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean28 = institutionalBilling25.refund("", (double) 100);
        boolean boolean31 = institutionalBilling25.refund("hi!", (double) '#');
        java.lang.String str32 = institutionalBilling25.getPaymentMethodName();
        boolean boolean35 = institutionalBilling25.refund("Debit Card", (double) '#');
        boolean boolean38 = institutionalBilling25.processPayment((double) (-1.0f), "");
        boolean boolean41 = institutionalBilling25.processPayment((double) 10.0f, "Credit Card");
        boolean boolean44 = institutionalBilling25.refund("Credit Card", (double) (short) 0);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Institutional Billing" + "'", str32, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor10 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment11 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean14 = creditCardPayment11.refund("Credit Card", (double) (byte) 10);
        java.lang.String str15 = creditCardPayment11.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment11);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment17 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str18 = creditCardPayment17.getPaymentMethodName();
        boolean boolean21 = creditCardPayment17.processPayment((double) (-1L), "");
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        boolean boolean25 = paymentProcessor10.refundPayment("hi!", (double) 10.0f);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean29 = debitCardPayment26.processPayment((double) 0, "hi!");
        java.lang.String str30 = debitCardPayment26.getPaymentMethodName();
        boolean boolean33 = debitCardPayment26.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str34 = debitCardPayment26.getPaymentMethodName();
        boolean boolean37 = debitCardPayment26.refund("hi!", (double) 1L);
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment26);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment26);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor40 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment41 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean44 = creditCardPayment41.refund("Credit Card", (double) (byte) 10);
        java.lang.String str45 = creditCardPayment41.getPaymentMethodName();
        paymentProcessor40.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment41);
        boolean boolean49 = paymentProcessor40.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean52 = paymentProcessor40.processPayment((double) 100.0f, "Credit Card");
        boolean boolean55 = paymentProcessor40.processPayment((-1.0d), "");
        boolean boolean58 = paymentProcessor40.processPayment((double) (short) 100, "");
        boolean boolean61 = paymentProcessor40.refundPayment("hi!", 100.0d);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment62 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean65 = debitCardPayment62.processPayment((double) 0, "hi!");
        java.lang.String str66 = debitCardPayment62.getPaymentMethodName();
        boolean boolean69 = debitCardPayment62.processPayment((double) 1L, "");
        boolean boolean72 = debitCardPayment62.processPayment((double) (short) 0, "Institutional Billing");
        boolean boolean75 = debitCardPayment62.processPayment((double) (short) -1, "");
        paymentProcessor40.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment62);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment62);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment78 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str79 = creditCardPayment78.getPaymentMethodName();
        boolean boolean82 = creditCardPayment78.processPayment((double) (-1L), "");
        boolean boolean85 = creditCardPayment78.processPayment((double) 1L, "");
        boolean boolean88 = creditCardPayment78.refund("", (double) 100.0f);
        boolean boolean91 = creditCardPayment78.refund("Credit Card", (double) (-1.0f));
        boolean boolean94 = creditCardPayment78.processPayment((double) ' ', "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment78);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Debit Card" + "'", str30, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Credit Card" + "'", str45, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Debit Card" + "'", str66, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Credit Card" + "'", str79, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.refund("", (double) 10L);
        boolean boolean7 = institutionalBilling0.processPayment((double) (short) 100, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment(0.0d, "Debit Card");
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((-1.0d), "");
        boolean boolean15 = creditCardPayment0.refund("", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        java.lang.String str29 = institutionalBilling20.getPaymentMethodName();
        boolean boolean32 = institutionalBilling20.processPayment((double) (byte) 0, "Credit Card");
        boolean boolean35 = institutionalBilling20.processPayment((double) 100.0f, "");
        java.lang.String str36 = institutionalBilling20.getPaymentMethodName();
        boolean boolean39 = institutionalBilling20.processPayment((double) 0L, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Institutional Billing" + "'", str29, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Institutional Billing" + "'", str36, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str14 = creditCardPayment13.getPaymentMethodName();
        boolean boolean17 = creditCardPayment13.processPayment((double) (-1L), "");
        boolean boolean20 = creditCardPayment13.refund("hi!", (double) ' ');
        boolean boolean23 = creditCardPayment13.refund("Institutional Billing", (-1.0d));
        boolean boolean26 = creditCardPayment13.processPayment((double) 10.0f, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment13);
        boolean boolean30 = paymentProcessor0.refundPayment("hi!", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean13 = creditCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean16 = creditCardPayment0.refund("hi!", (double) 10L);
        boolean boolean19 = creditCardPayment0.refund("", (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean15 = paymentProcessor0.processPayment((double) 0.0f, "Debit Card");
        java.lang.Class<?> wildcardClass16 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean7 = debitCardPayment4.processPayment((double) 0, "hi!");
        java.lang.String str8 = debitCardPayment4.getPaymentMethodName();
        boolean boolean11 = debitCardPayment4.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str12 = debitCardPayment4.getPaymentMethodName();
        boolean boolean15 = debitCardPayment4.refund("hi!", (double) 1L);
        boolean boolean18 = debitCardPayment4.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean21 = debitCardPayment4.refund("", (double) (byte) -1);
        boolean boolean24 = debitCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean27 = debitCardPayment4.refund("", (double) 1.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment4);
        boolean boolean31 = debitCardPayment4.processPayment((double) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.refund("hi!", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling23 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean26 = institutionalBilling23.refund("", (double) 100);
        boolean boolean29 = institutionalBilling23.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean32 = institutionalBilling23.refund("Debit Card", 10.0d);
        boolean boolean35 = institutionalBilling23.refund("Credit Card", (double) 10.0f);
        boolean boolean38 = institutionalBilling23.processPayment(0.0d, "Institutional Billing");
        java.lang.String str39 = institutionalBilling23.getPaymentMethodName();
        boolean boolean42 = institutionalBilling23.processPayment((double) 10.0f, "");
        java.lang.String str43 = institutionalBilling23.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling23);
        boolean boolean47 = paymentProcessor0.refundPayment("", (double) 1L);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor48 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment49 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str50 = creditCardPayment49.getPaymentMethodName();
        boolean boolean53 = creditCardPayment49.processPayment((double) (-1L), "");
        paymentProcessor48.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment49);
        boolean boolean57 = paymentProcessor48.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment58 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean61 = debitCardPayment58.processPayment((double) 0, "hi!");
        java.lang.String str62 = debitCardPayment58.getPaymentMethodName();
        boolean boolean65 = debitCardPayment58.processPayment((double) 1L, "");
        boolean boolean68 = debitCardPayment58.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str69 = debitCardPayment58.getPaymentMethodName();
        paymentProcessor48.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment58);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling71 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean74 = institutionalBilling71.refund("", (double) 100);
        boolean boolean77 = institutionalBilling71.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean80 = institutionalBilling71.refund("Debit Card", 10.0d);
        boolean boolean83 = institutionalBilling71.refund("Credit Card", (double) 10.0f);
        boolean boolean86 = institutionalBilling71.processPayment(0.0d, "Institutional Billing");
        java.lang.String str87 = institutionalBilling71.getPaymentMethodName();
        boolean boolean90 = institutionalBilling71.processPayment((double) 10.0f, "");
        java.lang.String str91 = institutionalBilling71.getPaymentMethodName();
        paymentProcessor48.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling71);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling71);
        boolean boolean96 = paymentProcessor0.processPayment((double) (byte) -1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Institutional Billing" + "'", str39, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Institutional Billing" + "'", str43, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Credit Card" + "'", str50, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Debit Card" + "'", str62, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Debit Card" + "'", str69, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Institutional Billing" + "'", str87, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Institutional Billing" + "'", str91, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.processPayment((double) (byte) 0, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        boolean boolean26 = institutionalBilling13.refund("", (double) (short) 10);
        boolean boolean29 = institutionalBilling13.processPayment((double) '#', "Credit Card");
        boolean boolean32 = institutionalBilling13.refund("hi!", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor25 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean29 = creditCardPayment26.refund("Credit Card", (double) (byte) 10);
        java.lang.String str30 = creditCardPayment26.getPaymentMethodName();
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment32 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str33 = creditCardPayment32.getPaymentMethodName();
        boolean boolean36 = creditCardPayment32.processPayment((double) (-1L), "");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment32);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling38 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean41 = institutionalBilling38.refund("", 0.0d);
        boolean boolean44 = institutionalBilling38.refund("Institutional Billing", (double) 1L);
        boolean boolean47 = institutionalBilling38.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor25.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        java.lang.String str49 = institutionalBilling38.getPaymentMethodName();
        boolean boolean52 = institutionalBilling38.processPayment((double) (byte) 1, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling38);
        java.lang.Class<?> wildcardClass54 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Credit Card" + "'", str30, "Credit Card");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Credit Card" + "'", str33, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Institutional Billing" + "'", str49, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str6 = institutionalBilling0.getPaymentMethodName();
        boolean boolean9 = institutionalBilling0.processPayment((double) (byte) 1, "");
        boolean boolean12 = institutionalBilling0.processPayment((double) (short) 10, "Credit Card");
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Institutional Billing" + "'", str6, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean17 = debitCardPayment0.processPayment((double) 100L, "Credit Card");
        boolean boolean20 = debitCardPayment0.processPayment((double) 1, "hi!");
        boolean boolean23 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) (byte) 100, "Institutional Billing");
        boolean boolean14 = debitCardPayment0.refund("Institutional Billing", (double) (-1L));
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 1, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean16 = debitCardPayment13.processPayment((double) 0, "hi!");
        java.lang.String str17 = debitCardPayment13.getPaymentMethodName();
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        boolean boolean21 = debitCardPayment13.refund("Institutional Billing", (double) 1L);
        boolean boolean24 = debitCardPayment13.processPayment((double) 0L, "Debit Card");
        boolean boolean27 = debitCardPayment13.refund("Credit Card", (double) '#');
        java.lang.String str28 = debitCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        boolean boolean32 = paymentProcessor0.processPayment((double) 10L, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Debit Card" + "'", str28, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        boolean boolean8 = creditCardPayment0.refund("Debit Card", (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean17 = institutionalBilling0.processPayment((double) (-1.0f), "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) ' ', "Institutional Billing");
        boolean boolean16 = creditCardPayment0.processPayment((double) 10.0f, "hi!");
        java.lang.Class<?> wildcardClass17 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str17 = debitCardPayment16.getPaymentMethodName();
        boolean boolean20 = debitCardPayment16.refund("hi!", (double) 0L);
        boolean boolean23 = debitCardPayment16.processPayment((double) (short) 0, "Credit Card");
        boolean boolean26 = debitCardPayment16.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean29 = debitCardPayment16.processPayment(100.0d, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean20 = paymentProcessor0.processPayment((double) '#', "Institutional Billing");
        boolean boolean23 = paymentProcessor0.processPayment((double) 100L, "");
        boolean boolean26 = paymentProcessor0.processPayment((double) 0.0f, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment27 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean30 = debitCardPayment27.processPayment((double) 0, "hi!");
        java.lang.String str31 = debitCardPayment27.getPaymentMethodName();
        boolean boolean34 = debitCardPayment27.processPayment((double) 1L, "");
        java.lang.String str35 = debitCardPayment27.getPaymentMethodName();
        boolean boolean38 = debitCardPayment27.processPayment(100.0d, "Debit Card");
        java.lang.String str39 = debitCardPayment27.getPaymentMethodName();
        boolean boolean42 = debitCardPayment27.refund("Debit Card", (double) 'a');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Debit Card" + "'", str31, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Debit Card" + "'", str39, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) -1, "Credit Card");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling10 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str11 = institutionalBilling10.getPaymentMethodName();
        boolean boolean14 = institutionalBilling10.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str15 = institutionalBilling10.getPaymentMethodName();
        java.lang.String str16 = institutionalBilling10.getPaymentMethodName();
        boolean boolean19 = institutionalBilling10.refund("Debit Card", (double) '4');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling10);
        boolean boolean23 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        boolean boolean26 = paymentProcessor0.refundPayment("", 1.0d);
        boolean boolean29 = paymentProcessor0.refundPayment("Credit Card", (double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("Credit Card", (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean17 = debitCardPayment0.processPayment((double) 100L, "Credit Card");
        boolean boolean20 = debitCardPayment0.processPayment((double) 1, "hi!");
        boolean boolean23 = debitCardPayment0.refund("hi!", (double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.processPayment((double) 1L, "Credit Card");
        boolean boolean21 = debitCardPayment0.refund("hi!", (double) (byte) 10);
        java.lang.String str22 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Debit Card" + "'", str22, "Debit Card");
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) (-1L), "");
        java.lang.String str21 = creditCardPayment16.getPaymentMethodName();
        java.lang.String str22 = creditCardPayment16.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        boolean boolean26 = paymentProcessor0.refundPayment("hi!", 0.0d);
        boolean boolean29 = paymentProcessor0.processPayment((-1.0d), "hi!");
        boolean boolean32 = paymentProcessor0.refundPayment("Institutional Billing", (double) 0L);
        boolean boolean35 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean38 = paymentProcessor0.refundPayment("", (double) (byte) 10);
        boolean boolean41 = paymentProcessor0.refundPayment("Institutional Billing", (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment((double) '4', "Credit Card");
        boolean boolean10 = institutionalBilling0.processPayment((double) (short) 100, "Credit Card");
        boolean boolean13 = institutionalBilling0.processPayment((double) (short) 10, "Institutional Billing");
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        boolean boolean18 = institutionalBilling0.processPayment((-1.0d), "hi!");
        boolean boolean21 = institutionalBilling0.processPayment((double) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str9 = institutionalBilling0.getPaymentMethodName();
        boolean boolean12 = institutionalBilling0.refund("", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Institutional Billing" + "'", str9, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.refund("Credit Card", (double) 0);
        boolean boolean15 = creditCardPayment0.refund("hi!", (double) 0L);
        java.lang.String str16 = creditCardPayment0.getPaymentMethodName();
        boolean boolean19 = creditCardPayment0.processPayment(10.0d, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.processPayment((double) 1, "hi!");
        boolean boolean12 = institutionalBilling0.processPayment(0.0d, "Institutional Billing");
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("", 0.0d);
        boolean boolean19 = institutionalBilling13.refund("Institutional Billing", (double) 1L);
        boolean boolean22 = institutionalBilling13.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        boolean boolean26 = institutionalBilling13.processPayment((double) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.refund("", (double) (-1));
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        boolean boolean13 = institutionalBilling0.processPayment((double) 1.0f, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 1, "");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) ' ');
        boolean boolean18 = paymentProcessor0.refundPayment("Credit Card", (double) 100.0f);
        boolean boolean21 = paymentProcessor0.processPayment((double) ' ', "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("Debit Card", 10.0d);
        java.lang.String str12 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        boolean boolean16 = institutionalBilling0.processPayment((double) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Institutional Billing" + "'", str12, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.refund("hi!", (double) 100.0f);
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.processPayment(0.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.refund("Debit Card", 1.0d);
        boolean boolean10 = debitCardPayment0.refund("", (double) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        boolean boolean31 = institutionalBilling20.processPayment((double) (short) -1, "hi!");
        java.lang.String str32 = institutionalBilling20.getPaymentMethodName();
        boolean boolean35 = institutionalBilling20.refund("Debit Card", (double) 0.0f);
        java.lang.String str36 = institutionalBilling20.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Institutional Billing" + "'", str32, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Institutional Billing" + "'", str36, "Institutional Billing");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", 0.0d);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean16 = creditCardPayment13.refund("Credit Card", (double) (byte) 10);
        java.lang.String str17 = creditCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment13);
        boolean boolean21 = creditCardPayment13.processPayment((-1.0d), "");
        java.lang.String str22 = creditCardPayment13.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) (-1), "Debit Card");
        boolean boolean18 = creditCardPayment7.processPayment((double) 0.0f, "Debit Card");
        java.lang.String str19 = creditCardPayment7.getPaymentMethodName();
        boolean boolean22 = creditCardPayment7.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean25 = creditCardPayment7.processPayment((double) 1, "hi!");
        boolean boolean28 = creditCardPayment7.processPayment((double) 100L, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean15 = debitCardPayment0.processPayment(10.0d, "Institutional Billing");
        boolean boolean18 = debitCardPayment0.processPayment((double) 0L, "");
        boolean boolean21 = debitCardPayment0.processPayment((double) (short) 100, "Credit Card");
        java.lang.String str22 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Debit Card" + "'", str22, "Debit Card");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.refund("Debit Card", (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean9 = paymentProcessor0.processPayment((double) 0, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Credit Card", (double) (-1));
        boolean boolean15 = paymentProcessor0.processPayment((double) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.refund("hi!", 0.0d);
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) 10.0f, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.processPayment((double) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.processPayment((double) 0, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) (byte) -1, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean27 = paymentProcessor0.refundPayment("", (double) 100);
        boolean boolean30 = paymentProcessor0.processPayment((double) 0, "Debit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment31 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean34 = debitCardPayment31.processPayment((double) 0, "hi!");
        java.lang.String str35 = debitCardPayment31.getPaymentMethodName();
        java.lang.String str36 = debitCardPayment31.getPaymentMethodName();
        boolean boolean39 = debitCardPayment31.processPayment((double) (short) 10, "Credit Card");
        boolean boolean42 = debitCardPayment31.processPayment((double) (short) 1, "hi!");
        boolean boolean45 = debitCardPayment31.processPayment((double) '4', "Debit Card");
        java.lang.String str46 = debitCardPayment31.getPaymentMethodName();
        java.lang.String str47 = debitCardPayment31.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Debit Card" + "'", str36, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Debit Card" + "'", str46, "Debit Card");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Debit Card" + "'", str47, "Debit Card");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean15 = creditCardPayment0.refund("", (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        boolean boolean6 = debitCardPayment0.refund("Credit Card", (double) (short) 0);
        boolean boolean9 = debitCardPayment0.refund("hi!", (double) '#');
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str6 = institutionalBilling0.getPaymentMethodName();
        boolean boolean9 = institutionalBilling0.processPayment((double) 0L, "");
        boolean boolean12 = institutionalBilling0.processPayment((double) 0.0f, "Credit Card");
        boolean boolean15 = institutionalBilling0.processPayment((double) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Institutional Billing" + "'", str6, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "");
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment((double) 10, "Institutional Billing");
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", 100.0d);
        boolean boolean15 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) 1L, "");
        boolean boolean26 = debitCardPayment16.refund("Debit Card", (double) 0);
        boolean boolean29 = debitCardPayment16.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean32 = debitCardPayment16.processPayment((double) 100L, "Debit Card");
        java.lang.String str33 = debitCardPayment16.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Debit Card" + "'", str33, "Debit Card");
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (byte) -1);
        boolean boolean21 = paymentProcessor0.processPayment((double) 1L, "hi!");
        java.lang.Class<?> wildcardClass22 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        boolean boolean17 = paymentProcessor0.refundPayment("Institutional Billing", (double) (-1.0f));
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling18 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str19 = institutionalBilling18.getPaymentMethodName();
        boolean boolean22 = institutionalBilling18.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str23 = institutionalBilling18.getPaymentMethodName();
        java.lang.String str24 = institutionalBilling18.getPaymentMethodName();
        boolean boolean27 = institutionalBilling18.processPayment((double) (byte) 1, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling18);
        boolean boolean31 = institutionalBilling18.processPayment((double) 100, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Institutional Billing" + "'", str19, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Institutional Billing" + "'", str23, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Institutional Billing" + "'", str24, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean17 = debitCardPayment0.processPayment(10.0d, "");
        java.lang.String str18 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(0.0d, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str3 = debitCardPayment0.getPaymentMethodName();
        boolean boolean6 = debitCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean9 = debitCardPayment0.refund("", (double) ' ');
        java.lang.String str10 = debitCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Debit Card" + "'", str3, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card" + "'", str10, "Debit Card");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", 0.0d);
        boolean boolean15 = paymentProcessor0.processPayment((double) 0.0f, "Debit Card");
        java.lang.Class<?> wildcardClass16 = paymentProcessor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment((double) (byte) 1, "Institutional Billing");
        java.lang.Class<?> wildcardClass20 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str9 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Institutional Billing" + "'", str9, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) (byte) 100, "");
        java.lang.String str25 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str26 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Credit Card" + "'", str25, "Credit Card");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Credit Card" + "'", str26, "Credit Card");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        boolean boolean13 = institutionalBilling0.refund("hi!", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) (-1L), "");
        java.lang.String str21 = creditCardPayment16.getPaymentMethodName();
        java.lang.String str22 = creditCardPayment16.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        boolean boolean26 = paymentProcessor0.refundPayment("Debit Card", (double) 0);
        boolean boolean29 = paymentProcessor0.processPayment((double) (byte) 0, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (byte) -1);
        boolean boolean21 = paymentProcessor0.processPayment((double) (byte) 0, "Debit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment22 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str23 = debitCardPayment22.getPaymentMethodName();
        java.lang.String str24 = debitCardPayment22.getPaymentMethodName();
        boolean boolean27 = debitCardPayment22.processPayment((double) '#', "Credit Card");
        boolean boolean30 = debitCardPayment22.processPayment((double) (-1.0f), "hi!");
        boolean boolean33 = debitCardPayment22.refund("Debit Card", (double) (byte) 0);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment22);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor35 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean38 = paymentProcessor35.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment39 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str40 = creditCardPayment39.getPaymentMethodName();
        boolean boolean43 = creditCardPayment39.processPayment((double) (-1L), "");
        paymentProcessor35.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment39);
        java.lang.String str45 = creditCardPayment39.getPaymentMethodName();
        boolean boolean48 = creditCardPayment39.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment39);
        java.lang.String str50 = creditCardPayment39.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Credit Card" + "'", str40, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Credit Card" + "'", str45, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Credit Card" + "'", str50, "Credit Card");
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.processPayment((double) 10L, "hi!");
        boolean boolean20 = debitCardPayment0.refund("Credit Card", (double) (byte) -1);
        java.lang.String str21 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor4 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment5 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean8 = creditCardPayment5.refund("Credit Card", (double) (byte) 10);
        java.lang.String str9 = creditCardPayment5.getPaymentMethodName();
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment5);
        boolean boolean13 = paymentProcessor4.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean16 = paymentProcessor4.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment17 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean20 = creditCardPayment17.refund("Credit Card", (double) (byte) 10);
        java.lang.String str21 = creditCardPayment17.getPaymentMethodName();
        paymentProcessor4.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        boolean boolean25 = creditCardPayment17.processPayment(100.0d, "");
        boolean boolean28 = creditCardPayment17.refund("hi!", (double) (-1.0f));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment30 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean33 = debitCardPayment30.processPayment((double) 0, "hi!");
        java.lang.String str34 = debitCardPayment30.getPaymentMethodName();
        java.lang.String str35 = debitCardPayment30.getPaymentMethodName();
        boolean boolean38 = debitCardPayment30.refund("Institutional Billing", (double) 100);
        java.lang.String str39 = debitCardPayment30.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Debit Card" + "'", str39, "Debit Card");
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0.0f);
        boolean boolean13 = institutionalBilling0.processPayment((double) (byte) 100, "hi!");
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        boolean boolean17 = institutionalBilling0.processPayment((double) '4', "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.refund("Credit Card", (double) '#');
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str16 = debitCardPayment0.getPaymentMethodName();
        boolean boolean19 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean22 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean25 = debitCardPayment0.refund("Credit Card", (double) 0);
        boolean boolean28 = debitCardPayment0.refund("Debit Card", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Debit Card" + "'", str16, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.processPayment((double) ' ', "Credit Card");
        boolean boolean23 = debitCardPayment0.refund("hi!", (double) (byte) 10);
        boolean boolean26 = debitCardPayment0.processPayment((double) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) (-1), "Debit Card");
        boolean boolean18 = creditCardPayment7.processPayment((double) 0.0f, "Debit Card");
        java.lang.String str19 = creditCardPayment7.getPaymentMethodName();
        java.lang.String str20 = creditCardPayment7.getPaymentMethodName();
        boolean boolean23 = creditCardPayment7.refund("", (double) (short) 0);
        java.lang.String str24 = creditCardPayment7.getPaymentMethodName();
        java.lang.String str25 = creditCardPayment7.getPaymentMethodName();
        boolean boolean28 = creditCardPayment7.processPayment((double) 1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Credit Card" + "'", str25, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor10 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment11 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean14 = creditCardPayment11.refund("Credit Card", (double) (byte) 10);
        java.lang.String str15 = creditCardPayment11.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment11);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment17 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str18 = creditCardPayment17.getPaymentMethodName();
        boolean boolean21 = creditCardPayment17.processPayment((double) (-1L), "");
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        boolean boolean25 = paymentProcessor10.refundPayment("hi!", (double) 10.0f);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean29 = debitCardPayment26.processPayment((double) 0, "hi!");
        java.lang.String str30 = debitCardPayment26.getPaymentMethodName();
        boolean boolean33 = debitCardPayment26.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str34 = debitCardPayment26.getPaymentMethodName();
        boolean boolean37 = debitCardPayment26.refund("hi!", (double) 1L);
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment26);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment26);
        boolean boolean42 = debitCardPayment26.refund("Credit Card", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Debit Card" + "'", str30, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment(0.0d, "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) 100, "");
        boolean boolean16 = creditCardPayment0.processPayment((double) 1.0f, "hi!");
        boolean boolean19 = creditCardPayment0.processPayment((double) (byte) 0, "");
        boolean boolean22 = creditCardPayment0.refund("Credit Card", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10);
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) (byte) 1);
        boolean boolean18 = paymentProcessor0.processPayment((double) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("Debit Card", 0.0d);
        boolean boolean14 = creditCardPayment0.processPayment((double) (short) 100, "hi!");
        boolean boolean17 = creditCardPayment0.processPayment((double) 1L, "Debit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.refund("Credit Card", (double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("", 0.0d);
        boolean boolean14 = debitCardPayment0.processPayment(100.0d, "Institutional Billing");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (short) 10);
        boolean boolean12 = institutionalBilling0.refund("hi!", (-1.0d));
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        boolean boolean17 = institutionalBilling0.refund("Institutional Billing", (double) 1);
        boolean boolean20 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.processPayment((double) 0, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) (byte) -1, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean27 = paymentProcessor0.refundPayment("", (double) 100);
        boolean boolean30 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        boolean boolean22 = paymentProcessor0.refundPayment("hi!", (double) 1);
        boolean boolean25 = paymentProcessor0.refundPayment("hi!", (-1.0d));
        boolean boolean28 = paymentProcessor0.refundPayment("Credit Card", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("", 0.0d);
        boolean boolean19 = institutionalBilling13.refund("Institutional Billing", (double) 1L);
        boolean boolean22 = institutionalBilling13.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        boolean boolean26 = paymentProcessor0.processPayment(100.0d, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling27 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean30 = institutionalBilling27.refund("", (double) 100);
        boolean boolean33 = institutionalBilling27.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean36 = institutionalBilling27.refund("Debit Card", 10.0d);
        boolean boolean39 = institutionalBilling27.refund("Credit Card", (double) 10.0f);
        boolean boolean42 = institutionalBilling27.processPayment(0.0d, "Institutional Billing");
        java.lang.String str43 = institutionalBilling27.getPaymentMethodName();
        boolean boolean46 = institutionalBilling27.processPayment((double) 10.0f, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling27);
        boolean boolean50 = paymentProcessor0.refundPayment("Debit Card", (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Institutional Billing" + "'", str43, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 10);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean22 = debitCardPayment19.processPayment((double) 0, "hi!");
        java.lang.String str23 = debitCardPayment19.getPaymentMethodName();
        boolean boolean26 = debitCardPayment19.refund("Institutional Billing", (double) (byte) 1);
        boolean boolean29 = debitCardPayment19.refund("", (double) (-1L));
        boolean boolean32 = debitCardPayment19.refund("hi!", (double) 1L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment19);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment34 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean37 = debitCardPayment34.processPayment((double) 0, "hi!");
        java.lang.String str38 = debitCardPayment34.getPaymentMethodName();
        boolean boolean41 = debitCardPayment34.processPayment((double) 1L, "");
        java.lang.String str42 = debitCardPayment34.getPaymentMethodName();
        boolean boolean45 = debitCardPayment34.processPayment((double) 0.0f, "");
        boolean boolean48 = debitCardPayment34.refund("Debit Card", (double) (byte) -1);
        boolean boolean51 = debitCardPayment34.refund("hi!", (-1.0d));
        boolean boolean54 = debitCardPayment34.refund("Debit Card", (double) (byte) 100);
        boolean boolean57 = debitCardPayment34.processPayment((double) (-1L), "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment34);
        boolean boolean61 = debitCardPayment34.processPayment((double) (short) 0, "Institutional Billing");
        boolean boolean64 = debitCardPayment34.refund("", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Debit Card" + "'", str38, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Debit Card" + "'", str42, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (byte) 100);
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 1, "");
        boolean boolean15 = institutionalBilling0.refund("Credit Card", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.processPayment((double) 0, "Institutional Billing");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean16 = paymentProcessor13.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment17 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean20 = creditCardPayment17.refund("Credit Card", (double) (byte) 10);
        boolean boolean23 = creditCardPayment17.processPayment((double) (short) 100, "");
        boolean boolean26 = creditCardPayment17.processPayment((double) 'a', "Credit Card");
        boolean boolean29 = creditCardPayment17.refund("hi!", (double) 100.0f);
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        boolean boolean34 = paymentProcessor0.processPayment((double) '4', "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment35 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str36 = creditCardPayment35.getPaymentMethodName();
        boolean boolean39 = creditCardPayment35.processPayment((double) 0L, "hi!");
        boolean boolean42 = creditCardPayment35.refund("Institutional Billing", (double) 10);
        boolean boolean45 = creditCardPayment35.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean48 = creditCardPayment35.refund("hi!", (double) (-1.0f));
        boolean boolean51 = creditCardPayment35.processPayment((double) 100L, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Credit Card" + "'", str36, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        boolean boolean12 = paymentProcessor0.processPayment((double) 10L, "hi!");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean25 = institutionalBilling13.refund("Credit Card", (double) (-1L));
        boolean boolean28 = institutionalBilling13.refund("Institutional Billing", (double) ' ');
        java.lang.String str29 = institutionalBilling13.getPaymentMethodName();
        boolean boolean32 = institutionalBilling13.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean35 = institutionalBilling13.processPayment((double) 10, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Institutional Billing" + "'", str29, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("Debit Card", (double) (-1L));
        boolean boolean8 = debitCardPayment0.processPayment((double) '#', "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean17 = debitCardPayment0.processPayment((double) 100L, "Credit Card");
        java.lang.String str18 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) ' ', "hi!");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor10 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean13 = paymentProcessor10.refundPayment("Credit Card", (double) 0L);
        boolean boolean16 = paymentProcessor10.processPayment((double) 'a', "Credit Card");
        boolean boolean19 = paymentProcessor10.refundPayment("", (double) 0);
        boolean boolean22 = paymentProcessor10.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling23 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean26 = institutionalBilling23.refund("Credit Card", (double) (short) 1);
        boolean boolean29 = institutionalBilling23.refund("", (double) (byte) 10);
        boolean boolean32 = institutionalBilling23.processPayment((double) (byte) 0, "Debit Card");
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling23);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment34 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str35 = debitCardPayment34.getPaymentMethodName();
        boolean boolean38 = debitCardPayment34.refund("hi!", (double) 0L);
        boolean boolean41 = debitCardPayment34.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment34);
        java.lang.String str43 = debitCardPayment34.getPaymentMethodName();
        java.lang.String str44 = debitCardPayment34.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment34);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment46 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str47 = creditCardPayment46.getPaymentMethodName();
        boolean boolean50 = creditCardPayment46.processPayment((double) 0L, "hi!");
        boolean boolean53 = creditCardPayment46.refund("Credit Card", 100.0d);
        boolean boolean56 = creditCardPayment46.processPayment((double) '4', "Debit Card");
        boolean boolean59 = creditCardPayment46.processPayment((double) 100, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment46);
        boolean boolean63 = paymentProcessor0.refundPayment("hi!", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Debit Card" + "'", str43, "Debit Card");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Debit Card" + "'", str44, "Debit Card");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Credit Card" + "'", str47, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (byte) -1);
        boolean boolean21 = paymentProcessor0.refundPayment("hi!", (double) (short) 10);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy22);
        boolean boolean26 = paymentProcessor0.refundPayment("", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1.0f), "hi!");
        boolean boolean11 = debitCardPayment0.refund("", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("hi!", (double) 1);
        boolean boolean15 = paymentProcessor0.refundPayment("hi!", (-1.0d));
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) 10L);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.refund("Debit Card", (double) (byte) 100);
        boolean boolean23 = debitCardPayment0.refund("Institutional Billing", (double) '#');
        boolean boolean26 = debitCardPayment0.refund("Credit Card", (double) (-1L));
        java.lang.String str27 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Debit Card" + "'", str27, "Debit Card");
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.processPayment((double) (byte) 0, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        boolean boolean26 = institutionalBilling13.refund("", (double) (short) 10);
        java.lang.String str27 = institutionalBilling13.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Institutional Billing" + "'", str27, "Institutional Billing");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.processPayment((double) 1L, "Credit Card");
        boolean boolean21 = debitCardPayment0.refund("Credit Card", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("", 0.0d);
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("Credit Card", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 0, "Credit Card");
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) 1.0f, "hi!");
        java.lang.String str13 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Debit Card" + "'", str13, "Debit Card");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean8 = debitCardPayment0.processPayment((-1.0d), "Debit Card");
        boolean boolean11 = debitCardPayment0.refund("", (double) 10.0f);
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        boolean boolean15 = debitCardPayment0.processPayment((double) 100L, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) (-1), "Debit Card");
        boolean boolean18 = creditCardPayment7.processPayment((double) 0.0f, "Debit Card");
        java.lang.String str19 = creditCardPayment7.getPaymentMethodName();
        boolean boolean22 = creditCardPayment7.processPayment(1.0d, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        boolean boolean8 = institutionalBilling0.processPayment((-1.0d), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 0, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((-1.0d), "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean24 = paymentProcessor0.refundPayment("Debit Card", (double) 100);
        boolean boolean27 = paymentProcessor0.processPayment((double) (short) 10, "");
        boolean boolean30 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean13 = creditCardPayment0.processPayment(100.0d, "hi!");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        boolean boolean17 = creditCardPayment0.refund("", (double) 0.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        boolean boolean22 = paymentProcessor0.refundPayment("hi!", (double) 1);
        boolean boolean25 = paymentProcessor0.processPayment((double) 1L, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.processPayment((double) 0, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) (byte) -1, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        java.lang.String str25 = debitCardPayment16.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Debit Card" + "'", str25, "Debit Card");
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        boolean boolean10 = creditCardPayment0.refund("", (double) 10L);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.processPayment((double) (short) 100, "Credit Card");
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Debit Card", (double) (short) 10);
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str6 = debitCardPayment0.getPaymentMethodName();
        boolean boolean9 = debitCardPayment0.refund("", 0.0d);
        boolean boolean12 = debitCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.processPayment((double) ' ', "Credit Card");
        java.lang.String str21 = debitCardPayment0.getPaymentMethodName();
        boolean boolean24 = debitCardPayment0.processPayment(10.0d, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        boolean boolean7 = institutionalBilling0.processPayment((double) (byte) 10, "hi!");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("hi!", (double) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str14 = creditCardPayment13.getPaymentMethodName();
        boolean boolean17 = creditCardPayment13.processPayment((double) (-1L), "");
        boolean boolean20 = creditCardPayment13.refund("hi!", (double) ' ');
        boolean boolean23 = creditCardPayment13.refund("Institutional Billing", (-1.0d));
        boolean boolean26 = creditCardPayment13.processPayment((double) 10.0f, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment13);
        boolean boolean30 = creditCardPayment13.refund("", (double) (short) 100);
        java.lang.String str31 = creditCardPayment13.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Credit Card" + "'", str31, "Credit Card");
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.processPayment((double) ' ', "Credit Card");
        boolean boolean23 = debitCardPayment0.refund("hi!", (double) (byte) 10);
        java.lang.String str24 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) 0L, "hi!");
        boolean boolean11 = creditCardPayment4.refund("Credit Card", 100.0d);
        boolean boolean14 = creditCardPayment4.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean18 = paymentProcessor0.processPayment((double) 1, "hi!");
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling10 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str11 = institutionalBilling10.getPaymentMethodName();
        boolean boolean14 = institutionalBilling10.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str15 = institutionalBilling10.getPaymentMethodName();
        java.lang.String str16 = institutionalBilling10.getPaymentMethodName();
        boolean boolean19 = institutionalBilling10.refund("Debit Card", (double) '4');
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling10);
        boolean boolean23 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment24 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean27 = debitCardPayment24.processPayment((double) 0, "hi!");
        java.lang.String str28 = debitCardPayment24.getPaymentMethodName();
        boolean boolean31 = debitCardPayment24.processPayment((double) 1L, "");
        java.lang.String str32 = debitCardPayment24.getPaymentMethodName();
        boolean boolean35 = debitCardPayment24.processPayment((double) 0.0f, "");
        boolean boolean38 = debitCardPayment24.refund("Debit Card", (double) (byte) -1);
        boolean boolean41 = debitCardPayment24.refund("hi!", (-1.0d));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment24);
        boolean boolean45 = debitCardPayment24.refund("Institutional Billing", (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Debit Card" + "'", str28, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Debit Card" + "'", str32, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean23 = creditCardPayment14.processPayment((double) (short) 100, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) '4');
        boolean boolean10 = creditCardPayment0.processPayment((double) (byte) 0, "hi!");
        boolean boolean13 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.refund("Credit Card", (double) (short) 10);
        java.lang.String str19 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str3 = debitCardPayment0.getPaymentMethodName();
        boolean boolean6 = debitCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean9 = debitCardPayment0.refund("", (double) ' ');
        java.lang.String str10 = debitCardPayment0.getPaymentMethodName();
        boolean boolean13 = debitCardPayment0.processPayment((double) 100, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Debit Card" + "'", str3, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card" + "'", str10, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean20 = paymentProcessor0.processPayment((double) '#', "Institutional Billing");
        boolean boolean23 = paymentProcessor0.refundPayment("Debit Card", (double) 0.0f);
        boolean boolean26 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling27 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str28 = institutionalBilling27.getPaymentMethodName();
        boolean boolean31 = institutionalBilling27.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str32 = institutionalBilling27.getPaymentMethodName();
        java.lang.String str33 = institutionalBilling27.getPaymentMethodName();
        java.lang.String str34 = institutionalBilling27.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling27);
        java.lang.String str36 = institutionalBilling27.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Institutional Billing" + "'", str32, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Institutional Billing" + "'", str33, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Institutional Billing" + "'", str34, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Institutional Billing" + "'", str36, "Institutional Billing");
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((double) (-1.0f), "Institutional Billing");
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean23 = creditCardPayment14.refund("Credit Card", (double) 0L);
        java.lang.String str24 = creditCardPayment14.getPaymentMethodName();
        boolean boolean27 = creditCardPayment14.processPayment((double) '#', "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) 10);
        boolean boolean21 = paymentProcessor0.refundPayment("Institutional Billing", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.processPayment((double) (byte) 0, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        java.lang.String str24 = institutionalBilling13.getPaymentMethodName();
        boolean boolean27 = institutionalBilling13.refund("Institutional Billing", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Institutional Billing" + "'", str24, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str6 = institutionalBilling0.getPaymentMethodName();
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) '4');
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        boolean boolean13 = institutionalBilling0.processPayment((double) 100, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Institutional Billing" + "'", str6, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) (-1L), "");
        java.lang.String str21 = creditCardPayment16.getPaymentMethodName();
        java.lang.String str22 = creditCardPayment16.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        java.lang.String str24 = creditCardPayment16.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean13 = creditCardPayment0.processPayment(100.0d, "hi!");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 10);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean22 = debitCardPayment19.processPayment((double) 0, "hi!");
        java.lang.String str23 = debitCardPayment19.getPaymentMethodName();
        boolean boolean26 = debitCardPayment19.refund("Institutional Billing", (double) (byte) 1);
        boolean boolean29 = debitCardPayment19.refund("", (double) (-1L));
        boolean boolean32 = debitCardPayment19.refund("hi!", (double) 1L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment19);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment34 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean37 = debitCardPayment34.processPayment((double) 0, "hi!");
        java.lang.String str38 = debitCardPayment34.getPaymentMethodName();
        boolean boolean41 = debitCardPayment34.processPayment((double) 1L, "");
        java.lang.String str42 = debitCardPayment34.getPaymentMethodName();
        boolean boolean45 = debitCardPayment34.processPayment((double) 0.0f, "");
        boolean boolean48 = debitCardPayment34.refund("Debit Card", (double) (byte) -1);
        boolean boolean51 = debitCardPayment34.refund("hi!", (-1.0d));
        boolean boolean54 = debitCardPayment34.refund("Debit Card", (double) (byte) 100);
        boolean boolean57 = debitCardPayment34.processPayment((double) (-1L), "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment34);
        boolean boolean61 = debitCardPayment34.processPayment((double) (short) 0, "Institutional Billing");
        boolean boolean64 = debitCardPayment34.processPayment((double) 1.0f, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Debit Card" + "'", str38, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Debit Card" + "'", str42, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.processPayment((double) 'a', "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean22 = paymentProcessor13.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean25 = paymentProcessor13.refundPayment("", (double) 'a');
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor26 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment27 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean30 = creditCardPayment27.refund("Credit Card", (double) (byte) 10);
        java.lang.String str31 = creditCardPayment27.getPaymentMethodName();
        paymentProcessor26.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment27);
        boolean boolean35 = paymentProcessor26.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment36 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str37 = creditCardPayment36.getPaymentMethodName();
        boolean boolean40 = creditCardPayment36.processPayment((double) (-1L), "");
        boolean boolean43 = creditCardPayment36.refund("hi!", (double) ' ');
        java.lang.String str44 = creditCardPayment36.getPaymentMethodName();
        paymentProcessor26.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment36);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling46 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean49 = institutionalBilling46.refund("Credit Card", (double) (short) 1);
        paymentProcessor26.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling46);
        java.lang.String str51 = institutionalBilling46.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling46);
        java.lang.String str53 = institutionalBilling46.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling46);
        boolean boolean57 = paymentProcessor0.refundPayment("Institutional Billing", (double) 1L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment58 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str59 = creditCardPayment58.getPaymentMethodName();
        boolean boolean62 = creditCardPayment58.processPayment((double) 0L, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment58);
        boolean boolean66 = paymentProcessor0.refundPayment("hi!", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Credit Card" + "'", str31, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Credit Card" + "'", str37, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Credit Card" + "'", str44, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Institutional Billing" + "'", str51, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Institutional Billing" + "'", str53, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Credit Card" + "'", str59, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) (-1), "Debit Card");
        boolean boolean18 = creditCardPayment7.processPayment((double) 0.0f, "Debit Card");
        java.lang.String str19 = creditCardPayment7.getPaymentMethodName();
        java.lang.String str20 = creditCardPayment7.getPaymentMethodName();
        boolean boolean23 = creditCardPayment7.refund("Credit Card", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.processPayment((double) (byte) 10, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean22 = creditCardPayment19.refund("Credit Card", (double) (byte) 10);
        java.lang.String str23 = creditCardPayment19.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment19);
        java.lang.String str25 = creditCardPayment19.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Credit Card" + "'", str23, "Credit Card");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Credit Card" + "'", str25, "Credit Card");
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "hi!");
        boolean boolean9 = institutionalBilling0.refund("", 0.0d);
        boolean boolean12 = institutionalBilling0.refund("hi!", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.refund("", (double) 10.0f);
        boolean boolean18 = institutionalBilling0.refund("Institutional Billing", (double) 0.0f);
        boolean boolean21 = institutionalBilling0.refund("hi!", (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.processPayment((double) ' ', "Debit Card");
        boolean boolean13 = debitCardPayment0.refund("Credit Card", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str14 = creditCardPayment13.getPaymentMethodName();
        boolean boolean17 = creditCardPayment13.processPayment((double) 0, "Debit Card");
        boolean boolean20 = creditCardPayment13.refund("Credit Card", 0.0d);
        boolean boolean23 = creditCardPayment13.refund("Credit Card", (double) (byte) 1);
        java.lang.String str24 = creditCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment13);
        java.lang.String str26 = creditCardPayment13.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Credit Card" + "'", str26, "Credit Card");
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        boolean boolean13 = institutionalBilling0.refund("", (double) 0);
        boolean boolean16 = institutionalBilling0.processPayment(1.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 1, "");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment(1.0d, "");
        boolean boolean12 = creditCardPayment1.processPayment((double) 1.0f, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) 1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean23 = debitCardPayment0.processPayment((double) 'a', "");
        boolean boolean26 = debitCardPayment0.refund("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling20 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean23 = institutionalBilling20.refund("Credit Card", (double) (short) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling20);
        boolean boolean27 = institutionalBilling20.refund("", (double) 100.0f);
        java.lang.String str28 = institutionalBilling20.getPaymentMethodName();
        boolean boolean31 = institutionalBilling20.processPayment((double) (short) -1, "hi!");
        java.lang.String str32 = institutionalBilling20.getPaymentMethodName();
        boolean boolean35 = institutionalBilling20.refund("Institutional Billing", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Institutional Billing" + "'", str28, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Institutional Billing" + "'", str32, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) '4', "Debit Card");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.processPayment((double) (short) -1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        boolean boolean22 = creditCardPayment10.refund("hi!", 10.0d);
        boolean boolean25 = creditCardPayment10.processPayment((double) (short) -1, "");
        boolean boolean28 = creditCardPayment10.processPayment((double) 0.0f, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) (short) -1, "");
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("Institutional Billing", (double) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (short) 10);
        boolean boolean12 = institutionalBilling0.refund("Institutional Billing", (double) (-1L));
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((double) 1L, "Debit Card");
        boolean boolean18 = institutionalBilling0.refund("", (double) (byte) 0);
        boolean boolean21 = institutionalBilling0.processPayment((double) (short) -1, "");
        java.lang.String str22 = institutionalBilling0.getPaymentMethodName();
        boolean boolean25 = institutionalBilling0.processPayment(1.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Institutional Billing" + "'", str22, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.refund("hi!", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", 0.0d);
        boolean boolean12 = paymentProcessor0.processPayment((double) 0, "Debit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor13 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment14 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean17 = creditCardPayment14.refund("Credit Card", (double) (byte) 10);
        java.lang.String str18 = creditCardPayment14.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment14);
        boolean boolean22 = paymentProcessor13.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment23 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str24 = creditCardPayment23.getPaymentMethodName();
        boolean boolean27 = creditCardPayment23.processPayment((double) (-1L), "");
        boolean boolean30 = creditCardPayment23.refund("hi!", (double) ' ');
        java.lang.String str31 = creditCardPayment23.getPaymentMethodName();
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment23);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling33 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean36 = institutionalBilling33.refund("Credit Card", (double) (short) 1);
        paymentProcessor13.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling33);
        java.lang.String str38 = institutionalBilling33.getPaymentMethodName();
        java.lang.String str39 = institutionalBilling33.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling33);
        boolean boolean43 = paymentProcessor0.processPayment((double) (-1), "");
        boolean boolean46 = paymentProcessor0.processPayment((double) 100.0f, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Credit Card" + "'", str31, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Institutional Billing" + "'", str39, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean9 = paymentProcessor0.refundPayment("hi!", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("Debit Card", 10.0d);
        java.lang.String str12 = institutionalBilling0.getPaymentMethodName();
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", 10.0d);
        boolean boolean18 = institutionalBilling0.refund("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Institutional Billing" + "'", str12, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0L);
        boolean boolean13 = institutionalBilling0.processPayment((double) '4', "Debit Card");
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        boolean boolean17 = institutionalBilling0.processPayment((double) (byte) -1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 10);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.refund("Institutional Billing", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment((double) (byte) 1, "Institutional Billing");
        java.lang.String str20 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str21 = institutionalBilling0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass22 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Institutional Billing" + "'", str20, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Institutional Billing" + "'", str21, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (byte) 10, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Institutional Billing", (double) 10);
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean13 = creditCardPayment0.refund("hi!", (double) (-1.0f));
        boolean boolean16 = creditCardPayment0.processPayment((double) 10, "hi!");
        boolean boolean19 = creditCardPayment0.refund("hi!", (double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.processPayment(0.0d, "");
        java.lang.Class<?> wildcardClass15 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        boolean boolean15 = paymentProcessor0.processPayment((double) 10.0f, "Credit Card");
        boolean boolean18 = paymentProcessor0.processPayment(1.0d, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("Institutional Billing", (double) 0);
        boolean boolean21 = paymentProcessor0.processPayment((double) (byte) 10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) ' ', "Debit Card");
        boolean boolean23 = debitCardPayment10.refund("Credit Card", (double) 10.0f);
        java.lang.String str24 = debitCardPayment10.getPaymentMethodName();
        boolean boolean27 = debitCardPayment10.processPayment((double) 0, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        java.lang.String str29 = debitCardPayment10.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Debit Card" + "'", str29, "Debit Card");
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Credit Card");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) 1);
        boolean boolean18 = paymentProcessor0.refundPayment("Institutional Billing", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Credit Card");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) 1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) 0L, "hi!");
        boolean boolean23 = creditCardPayment16.refund("Credit Card", 100.0d);
        boolean boolean26 = creditCardPayment16.processPayment((double) '4', "Debit Card");
        boolean boolean29 = creditCardPayment16.processPayment((double) ' ', "Institutional Billing");
        boolean boolean32 = creditCardPayment16.processPayment((double) 10, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean16 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        java.lang.String str17 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean20 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        boolean boolean23 = debitCardPayment0.refund("Institutional Billing", (double) (-1L));
        boolean boolean26 = debitCardPayment0.refund("hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("Institutional Billing", (double) 0);
        boolean boolean21 = paymentProcessor0.refundPayment("", (double) (short) 0);
        boolean boolean24 = paymentProcessor0.processPayment((double) 0.0f, "");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling25 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean28 = institutionalBilling25.refund("", (double) 100);
        boolean boolean31 = institutionalBilling25.processPayment((double) 10.0f, "Institutional Billing");
        java.lang.String str32 = institutionalBilling25.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Institutional Billing" + "'", str32, "Institutional Billing");
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) 0.0f, "hi!");
        boolean boolean27 = creditCardPayment0.refund("", (double) 'a');
        boolean boolean30 = creditCardPayment0.refund("Credit Card", (double) (short) 100);
        boolean boolean33 = creditCardPayment0.processPayment((double) 10L, "Debit Card");
        boolean boolean36 = creditCardPayment0.refund("Institutional Billing", 10.0d);
        boolean boolean39 = creditCardPayment0.processPayment(0.0d, "Debit Card");
        java.lang.String str40 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Credit Card" + "'", str40, "Credit Card");
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((-1.0d), "Debit Card");
        boolean boolean18 = institutionalBilling0.processPayment((double) (-1L), "hi!");
        java.lang.String str19 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Institutional Billing" + "'", str19, "Institutional Billing");
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (byte) -1);
        boolean boolean21 = paymentProcessor0.processPayment((double) (byte) 0, "Debit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor22 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment23 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean26 = creditCardPayment23.refund("Credit Card", (double) (byte) 10);
        java.lang.String str27 = creditCardPayment23.getPaymentMethodName();
        paymentProcessor22.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment23);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment29 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str30 = creditCardPayment29.getPaymentMethodName();
        boolean boolean33 = creditCardPayment29.processPayment((double) (-1L), "");
        paymentProcessor22.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment29);
        boolean boolean37 = paymentProcessor22.refundPayment("Institutional Billing", (double) 10);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor38 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment39 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean42 = creditCardPayment39.refund("Credit Card", (double) (byte) 10);
        java.lang.String str43 = creditCardPayment39.getPaymentMethodName();
        paymentProcessor38.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment39);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment45 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean48 = debitCardPayment45.processPayment((double) 0, "hi!");
        java.lang.String str49 = debitCardPayment45.getPaymentMethodName();
        boolean boolean52 = debitCardPayment45.processPayment((double) 1L, "");
        paymentProcessor38.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment45);
        paymentProcessor22.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment45);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment55 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str56 = creditCardPayment55.getPaymentMethodName();
        boolean boolean59 = creditCardPayment55.processPayment((double) (-1L), "");
        boolean boolean62 = creditCardPayment55.processPayment((double) 1L, "");
        boolean boolean65 = creditCardPayment55.processPayment((double) 100.0f, "Debit Card");
        java.lang.String str66 = creditCardPayment55.getPaymentMethodName();
        boolean boolean69 = creditCardPayment55.refund("hi!", 10.0d);
        boolean boolean72 = creditCardPayment55.processPayment((double) (short) 1, "hi!");
        paymentProcessor22.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment55);
        boolean boolean76 = creditCardPayment55.processPayment((double) 10.0f, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Credit Card" + "'", str30, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Credit Card" + "'", str43, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Debit Card" + "'", str49, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Credit Card" + "'", str56, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Credit Card" + "'", str66, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str11 = creditCardPayment10.getPaymentMethodName();
        boolean boolean14 = creditCardPayment10.processPayment((double) (-1L), "");
        boolean boolean17 = creditCardPayment10.refund("hi!", (double) ' ');
        java.lang.String str18 = creditCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment10);
        java.lang.String str20 = creditCardPayment10.getPaymentMethodName();
        java.lang.String str21 = creditCardPayment10.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment10 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean13 = debitCardPayment10.processPayment((double) 0, "hi!");
        java.lang.String str14 = debitCardPayment10.getPaymentMethodName();
        boolean boolean17 = debitCardPayment10.processPayment((double) 1L, "");
        boolean boolean20 = debitCardPayment10.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str21 = debitCardPayment10.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment10);
        boolean boolean25 = paymentProcessor0.processPayment(1.0d, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor26 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean29 = paymentProcessor26.refundPayment("Credit Card", (double) 0L);
        boolean boolean32 = paymentProcessor26.processPayment((double) 'a', "Credit Card");
        boolean boolean35 = paymentProcessor26.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean38 = paymentProcessor26.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor39 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment40 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean43 = creditCardPayment40.refund("Credit Card", (double) (byte) 10);
        java.lang.String str44 = creditCardPayment40.getPaymentMethodName();
        paymentProcessor39.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment40);
        paymentProcessor26.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment40);
        boolean boolean49 = creditCardPayment40.refund("Credit Card", (double) 0L);
        boolean boolean52 = creditCardPayment40.processPayment((double) 'a', "");
        boolean boolean55 = creditCardPayment40.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Credit Card" + "'", str44, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }
}

