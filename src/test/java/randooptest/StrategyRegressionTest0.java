package randooptest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrategyRegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.Class<?> wildcardClass1 = creditCardPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        java.lang.Class<?> wildcardClass7 = creditCardPayment1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        java.lang.Class<?> wildcardClass10 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 1L, "");
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment(0.0d, "hi!");
        java.lang.String str10 = creditCardPayment1.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
        boolean boolean18 = paymentProcessor0.processPayment((double) 1.0f, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.Class<?> wildcardClass11 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.refund("hi!", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        java.lang.Class<?> wildcardClass7 = creditCardPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        java.lang.Class<?> wildcardClass13 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) 0L, "hi!");
        boolean boolean14 = creditCardPayment7.refund("Credit Card", 100.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        boolean boolean8 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.refund("Credit Card", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.refund("Institutional Billing", (double) (byte) 1);
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.refund("", (double) 1L);
        boolean boolean13 = debitCardPayment0.refund("Institutional Billing", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) (short) 10);
        java.lang.Class<?> wildcardClass19 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.processPayment(0.0d, "Institutional Billing");
        boolean boolean18 = institutionalBilling0.refund("Credit Card", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = creditCardPayment4.refund("Credit Card", (double) (short) 1);
        java.lang.String str13 = creditCardPayment4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 10.0d);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass6 = institutionalBilling0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.refund("", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 100, "hi!");
        boolean boolean15 = institutionalBilling0.refund("Credit Card", (double) 0L);
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.refund("hi!", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        java.lang.Class<?> wildcardClass7 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str3 = debitCardPayment0.getPaymentMethodName();
        boolean boolean6 = debitCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        java.lang.String str7 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Debit Card" + "'", str3, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Debit Card" + "'", str7, "Debit Card");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        boolean boolean15 = paymentProcessor0.refundPayment("hi!", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        boolean boolean24 = paymentProcessor0.processPayment((double) (byte) 100, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str10 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card" + "'", str10, "Debit Card");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        boolean boolean6 = debitCardPayment0.processPayment((double) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean13 = creditCardPayment0.processPayment(100.0d, "hi!");
        boolean boolean16 = creditCardPayment0.refund("Credit Card", 100.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
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
        boolean boolean32 = paymentProcessor0.refundPayment("", (double) 'a');
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
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        boolean boolean10 = debitCardPayment0.refund("", (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Credit Card", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) 1, "Credit Card");
        java.lang.Class<?> wildcardClass13 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
        java.lang.Class<?> wildcardClass19 = creditCardPayment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) (-1));
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        boolean boolean10 = creditCardPayment0.refund("Credit Card", (double) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Institutional Billing", (double) 10);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("hi!", (double) 1);
        java.lang.Class<?> wildcardClass13 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.refund("Institutional Billing", (double) (byte) 1);
        java.lang.Class<?> wildcardClass8 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 100);
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean15 = creditCardPayment0.processPayment((double) 10, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.refundPayment("Debit Card", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Institutional Billing", 1.0d);
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.Class<?> wildcardClass18 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 'a', "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean18 = creditCardPayment0.processPayment((double) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        boolean boolean10 = creditCardPayment0.refund("", (double) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean15 = debitCardPayment0.processPayment(10.0d, "Institutional Billing");
        boolean boolean18 = debitCardPayment0.processPayment((double) (byte) 0, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str3 = debitCardPayment0.getPaymentMethodName();
        boolean boolean6 = debitCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean9 = debitCardPayment0.processPayment((double) (short) 10, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Debit Card" + "'", str3, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling4 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean7 = institutionalBilling4.refund("", (double) 100);
        boolean boolean10 = institutionalBilling4.processPayment((double) 10.0f, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling4);
        boolean boolean14 = institutionalBilling4.processPayment((double) 100, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str9 = institutionalBilling0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass10 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Institutional Billing" + "'", str9, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        boolean boolean13 = creditCardPayment0.refund("hi!", (double) (-1L));
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        boolean boolean18 = paymentProcessor0.processPayment(1.0d, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment19 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str20 = creditCardPayment19.getPaymentMethodName();
        boolean boolean23 = creditCardPayment19.processPayment((double) (-1L), "");
        java.lang.String str24 = creditCardPayment19.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "hi!");
        java.lang.Class<?> wildcardClass7 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (-1.0d));
        boolean boolean13 = institutionalBilling0.processPayment((double) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        java.lang.Class<?> wildcardClass16 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.refund("Institutional Billing", (double) 10L);
        boolean boolean15 = debitCardPayment0.processPayment((double) 1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.processPayment((double) 100.0f, "");
        boolean boolean6 = creditCardPayment0.refund("", (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        boolean boolean59 = institutionalBilling38.refund("Debit Card", (double) 10.0f);
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment(0.0d, "hi!");
        boolean boolean12 = creditCardPayment1.refund("hi!", (-1.0d));
        boolean boolean15 = creditCardPayment1.processPayment((double) 0.0f, "Credit Card");
        java.lang.Class<?> wildcardClass16 = creditCardPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Debit Card", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 100, "hi!");
        boolean boolean15 = institutionalBilling0.refund("hi!", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) ' ', "Institutional Billing");
        boolean boolean16 = creditCardPayment0.processPayment((double) 10, "Institutional Billing");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.processPayment((double) 100.0f, "");
        java.lang.Class<?> wildcardClass15 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) (-1), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean13 = debitCardPayment0.processPayment((double) (-1L), "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("hi!", (double) (short) 0);
        boolean boolean14 = creditCardPayment0.refund("Debit Card", 100.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
        boolean boolean21 = paymentProcessor0.processPayment((double) 10, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean12 = institutionalBilling0.processPayment((double) '#', "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("hi!", (double) '#');
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("Institutional Billing", (double) (-1.0f));
        boolean boolean14 = institutionalBilling0.processPayment((double) (short) 100, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("hi!", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment((double) 1L, "Debit Card");
        java.lang.String str10 = creditCardPayment1.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Debit Card", (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) (short) -1, "");
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("", 1.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) (byte) 100);
        boolean boolean12 = paymentProcessor0.processPayment((double) 1, "");
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) ' ');
        boolean boolean18 = paymentProcessor0.refundPayment("hi!", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) ' ', "Institutional Billing");
        boolean boolean16 = creditCardPayment0.processPayment((double) 10, "Institutional Billing");
        boolean boolean19 = creditCardPayment0.processPayment((double) (byte) 0, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        boolean boolean13 = creditCardPayment4.refund("hi!", 0.0d);
        java.lang.String str14 = creditCardPayment4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("hi!", (double) '#');
        java.lang.Class<?> wildcardClass7 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((double) 1L, "Debit Card");
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) ' ');
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        boolean boolean25 = paymentProcessor0.processPayment((double) 100L, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass3 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) ' ', "Institutional Billing");
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.Class<?> wildcardClass4 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor10 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment11 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean14 = creditCardPayment11.refund("Credit Card", (double) (byte) 10);
        java.lang.String str15 = creditCardPayment11.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment11);
        boolean boolean19 = paymentProcessor10.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str21 = creditCardPayment20.getPaymentMethodName();
        boolean boolean24 = creditCardPayment20.processPayment((double) (-1L), "");
        boolean boolean27 = creditCardPayment20.refund("hi!", (double) ' ');
        java.lang.String str28 = creditCardPayment20.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment20);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling30 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean33 = institutionalBilling30.refund("Credit Card", (double) (short) 1);
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        boolean boolean37 = institutionalBilling30.refund("", (double) 100.0f);
        java.lang.String str38 = institutionalBilling30.getPaymentMethodName();
        boolean boolean41 = institutionalBilling30.processPayment((double) (short) -1, "hi!");
        java.lang.String str42 = institutionalBilling30.getPaymentMethodName();
        boolean boolean45 = institutionalBilling30.refund("Debit Card", (double) 0.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        boolean boolean49 = paymentProcessor0.refundPayment("Credit Card", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Institutional Billing" + "'", str42, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        boolean boolean27 = paymentProcessor0.processPayment((double) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
        boolean boolean43 = institutionalBilling33.refund("Credit Card", (double) '4');
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.processPayment((double) 0, "Institutional Billing");
        java.lang.Class<?> wildcardClass13 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean17 = debitCardPayment0.processPayment((double) 0.0f, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        boolean boolean27 = creditCardPayment16.processPayment((double) (-1.0f), "");
        java.lang.String str28 = creditCardPayment16.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        boolean boolean27 = creditCardPayment16.refund("", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str16 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Debit Card" + "'", str16, "Debit Card");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) 10L);
        boolean boolean23 = debitCardPayment0.refund("Credit Card", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean11 = debitCardPayment0.processPayment((double) 10, "Debit Card");
        boolean boolean14 = debitCardPayment0.refund("Institutional Billing", (double) 10.0f);
        boolean boolean17 = debitCardPayment0.refund("Institutional Billing", (double) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.refund("Debit Card", 1.0d);
        boolean boolean10 = debitCardPayment0.refund("", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        java.lang.Class<?> wildcardClass25 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str3 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Debit Card" + "'", str3, "Debit Card");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean17 = debitCardPayment0.processPayment(100.0d, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) 0);
        boolean boolean23 = debitCardPayment0.processPayment((double) (-1), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor10 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment11 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean14 = creditCardPayment11.refund("Credit Card", (double) (byte) 10);
        java.lang.String str15 = creditCardPayment11.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment11);
        boolean boolean19 = paymentProcessor10.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str21 = creditCardPayment20.getPaymentMethodName();
        boolean boolean24 = creditCardPayment20.processPayment((double) (-1L), "");
        boolean boolean27 = creditCardPayment20.refund("hi!", (double) ' ');
        java.lang.String str28 = creditCardPayment20.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment20);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling30 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean33 = institutionalBilling30.refund("Credit Card", (double) (short) 1);
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        boolean boolean37 = institutionalBilling30.refund("", (double) 100.0f);
        java.lang.String str38 = institutionalBilling30.getPaymentMethodName();
        boolean boolean41 = institutionalBilling30.processPayment((double) (short) -1, "hi!");
        java.lang.String str42 = institutionalBilling30.getPaymentMethodName();
        boolean boolean45 = institutionalBilling30.refund("Debit Card", (double) 0.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        java.lang.Class<?> wildcardClass47 = institutionalBilling30.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Institutional Billing" + "'", str42, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        boolean boolean59 = institutionalBilling38.processPayment((-1.0d), "Institutional Billing");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("hi!", (double) 0);
        boolean boolean7 = creditCardPayment0.processPayment((double) 10, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        boolean boolean7 = creditCardPayment0.processPayment((double) ' ', "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 0.0d);
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) '#');
        boolean boolean12 = paymentProcessor0.refundPayment("Credit Card", (double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) 10L, "");
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.processPayment(0.0d, "Institutional Billing");
        boolean boolean18 = institutionalBilling0.processPayment((double) (byte) 10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        boolean boolean15 = paymentProcessor0.processPayment((double) (short) 100, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str24 = debitCardPayment16.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean28 = paymentProcessor0.refundPayment("Debit Card", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean13 = debitCardPayment0.processPayment((double) 1, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (short) 10);
        boolean boolean12 = institutionalBilling0.refund("Debit Card", (double) (short) 1);
        java.lang.Class<?> wildcardClass13 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        java.lang.Class<?> wildcardClass10 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment22 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean25 = debitCardPayment22.processPayment((double) 0, "hi!");
        java.lang.String str26 = debitCardPayment22.getPaymentMethodName();
        boolean boolean29 = debitCardPayment22.processPayment((double) 1L, "");
        boolean boolean32 = debitCardPayment22.processPayment((double) (short) 0, "Institutional Billing");
        boolean boolean35 = debitCardPayment22.processPayment((double) (short) -1, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment22);
        java.lang.Class<?> wildcardClass37 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Debit Card" + "'", str26, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) ' ', "Institutional Billing");
        boolean boolean16 = creditCardPayment0.processPayment((double) (short) -1, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str13 = debitCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass14 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Debit Card" + "'", str13, "Debit Card");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        java.lang.String str55 = institutionalBilling46.getPaymentMethodName();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Institutional Billing" + "'", str55, "Institutional Billing");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        boolean boolean15 = creditCardPayment7.processPayment((double) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.processPayment((double) (byte) 0, "Debit Card");
        boolean boolean12 = institutionalBilling0.processPayment((double) (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.refund("Credit Card", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.processPayment((double) 100.0f, "");
        boolean boolean6 = creditCardPayment0.processPayment((double) (byte) 100, "Institutional Billing");
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean15 = paymentProcessor0.refundPayment("", (double) '#');
        java.lang.Class<?> wildcardClass16 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("hi!", (double) 0);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.processPayment((double) 1.0f, "");
        java.lang.Class<?> wildcardClass10 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Credit Card", (double) 0.0f);
        boolean boolean9 = institutionalBilling0.processPayment(100.0d, "");
        java.lang.Class<?> wildcardClass10 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        boolean boolean25 = debitCardPayment10.refund("", (double) 10.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 0.0f, "hi!");
        java.lang.Class<?> wildcardClass7 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", 0.0d);
        boolean boolean13 = creditCardPayment0.refund("Debit Card", (double) 10.0f);
        boolean boolean16 = creditCardPayment0.processPayment((double) 0L, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.processPayment((double) 10, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", (double) 10);
        boolean boolean15 = paymentProcessor0.processPayment((double) (short) -1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.Class<?> wildcardClass8 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        boolean boolean18 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        boolean boolean25 = debitCardPayment10.processPayment(0.0d, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.processPayment(0.0d, "Institutional Billing");
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str17 = institutionalBilling0.getPaymentMethodName();
        boolean boolean20 = institutionalBilling0.refund("", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Institutional Billing" + "'", str17, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        boolean boolean24 = paymentProcessor0.processPayment((double) 0.0f, "hi!");
        boolean boolean27 = paymentProcessor0.refundPayment("", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        boolean boolean18 = creditCardPayment7.refund("hi!", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("", 0.0d);
        java.lang.String str17 = institutionalBilling13.getPaymentMethodName();
        boolean boolean20 = institutionalBilling13.processPayment(10.0d, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        boolean boolean24 = paymentProcessor0.processPayment(1.0d, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Institutional Billing" + "'", str17, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 'a', "");
        boolean boolean7 = debitCardPayment0.refund("hi!", (double) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean14 = debitCardPayment0.refund("hi!", (double) 'a');
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) 10L);
        boolean boolean23 = debitCardPayment0.processPayment((double) (byte) -1, "Institutional Billing");
        java.lang.Class<?> wildcardClass24 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        java.lang.Class<?> wildcardClass24 = institutionalBilling10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        boolean boolean7 = institutionalBilling0.processPayment((double) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass8 = institutionalBilling0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        boolean boolean29 = paymentProcessor0.refundPayment("Debit Card", (double) (-1L));
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment30 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean33 = debitCardPayment30.processPayment((double) 0, "hi!");
        java.lang.String str34 = debitCardPayment30.getPaymentMethodName();
        java.lang.String str35 = debitCardPayment30.getPaymentMethodName();
        boolean boolean38 = debitCardPayment30.refund("Institutional Billing", (double) 1L);
        boolean boolean41 = debitCardPayment30.processPayment((double) 0L, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment30);
        java.lang.Class<?> wildcardClass43 = debitCardPayment30.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean13 = creditCardPayment0.processPayment((double) 10.0f, "Debit Card");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((double) 1L, "Debit Card");
        boolean boolean18 = institutionalBilling0.refund("", (double) (byte) 0);
        boolean boolean21 = institutionalBilling0.refund("Credit Card", 0.0d);
        boolean boolean24 = institutionalBilling0.refund("", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment(0.0d, "hi!");
        boolean boolean12 = creditCardPayment1.refund("hi!", (-1.0d));
        boolean boolean15 = creditCardPayment1.processPayment((double) 0.0f, "Credit Card");
        boolean boolean18 = creditCardPayment1.refund("", (double) 100);
        boolean boolean21 = creditCardPayment1.refund("Credit Card", (double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean17 = debitCardPayment0.processPayment((-1.0d), "Credit Card");
        boolean boolean20 = debitCardPayment0.processPayment(1.0d, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean12 = institutionalBilling0.refund("Debit Card", (double) 100.0f);
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.refund("", (double) 10L);
        boolean boolean7 = institutionalBilling0.refund("Debit Card", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.processPayment((double) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 100);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor7 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean10 = paymentProcessor7.refundPayment("Credit Card", (double) 0L);
        boolean boolean13 = paymentProcessor7.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = paymentProcessor7.refundPayment("", (double) 0);
        boolean boolean19 = paymentProcessor7.processPayment((double) 100L, "Institutional Billing");
        boolean boolean22 = paymentProcessor7.processPayment((double) (short) 100, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment23 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean26 = debitCardPayment23.processPayment((double) 0, "hi!");
        java.lang.String str27 = debitCardPayment23.getPaymentMethodName();
        boolean boolean30 = debitCardPayment23.processPayment((double) 1L, "");
        java.lang.String str31 = debitCardPayment23.getPaymentMethodName();
        boolean boolean34 = debitCardPayment23.processPayment((double) 0.0f, "");
        boolean boolean37 = debitCardPayment23.refund("Debit Card", (double) (byte) -1);
        boolean boolean40 = debitCardPayment23.processPayment((double) 10L, "hi!");
        paymentProcessor7.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment23);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment23);
        boolean boolean45 = paymentProcessor0.refundPayment("Credit Card", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Debit Card" + "'", str27, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Debit Card" + "'", str31, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean8 = debitCardPayment0.processPayment((-1.0d), "Debit Card");
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        boolean boolean42 = paymentProcessor0.processPayment((double) (-1L), "");
        boolean boolean45 = paymentProcessor0.refundPayment("hi!", (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("hi!", (double) '#');
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) '#');
        boolean boolean13 = institutionalBilling0.processPayment((double) (-1.0f), "");
        boolean boolean16 = institutionalBilling0.processPayment((double) 10.0f, "Credit Card");
        java.lang.Class<?> wildcardClass17 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        boolean boolean32 = paymentProcessor0.processPayment((double) '#', "Debit Card");
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
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) (-1));
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.processPayment((double) 10.0f, "Credit Card");
        boolean boolean13 = institutionalBilling0.processPayment((double) 1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        java.lang.String str28 = debitCardPayment16.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Debit Card" + "'", str28, "Debit Card");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.refund("Debit Card", 10.0d);
        java.lang.String str12 = institutionalBilling0.getPaymentMethodName();
        boolean boolean15 = institutionalBilling0.refund("hi!", (double) 10.0f);
        java.lang.Class<?> wildcardClass16 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Institutional Billing" + "'", str12, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean25 = institutionalBilling13.refund("Credit Card", (double) (-1L));
        boolean boolean28 = institutionalBilling13.refund("Institutional Billing", (double) ' ');
        java.lang.String str29 = institutionalBilling13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        java.lang.Class<?> wildcardClass31 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Institutional Billing" + "'", str29, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        boolean boolean26 = paymentProcessor0.refundPayment("hi!", (double) (byte) 10);
        boolean boolean29 = paymentProcessor0.refundPayment("Institutional Billing", (double) ' ');
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling30 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean33 = institutionalBilling30.refund("", (double) 100);
        boolean boolean36 = institutionalBilling30.refund("hi!", (double) '#');
        java.lang.String str37 = institutionalBilling30.getPaymentMethodName();
        java.lang.String str38 = institutionalBilling30.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Institutional Billing" + "'", str37, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("Debit Card", (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        java.lang.Class<?> wildcardClass33 = institutionalBilling20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.refund("Institutional Billing", (double) (byte) 1);
        boolean boolean10 = debitCardPayment0.refund("", (double) (-1L));
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        java.lang.String str25 = institutionalBilling20.getPaymentMethodName();
        boolean boolean28 = institutionalBilling20.refund("hi!", 10.0d);
        boolean boolean31 = institutionalBilling20.processPayment((double) (-1), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Institutional Billing" + "'", str25, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.processPayment((double) '4', "Institutional Billing");
        boolean boolean12 = institutionalBilling0.processPayment((double) '4', "");
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((-1.0d), "Debit Card");
        java.lang.Class<?> wildcardClass16 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Debit Card", (double) (short) 10);
        boolean boolean6 = debitCardPayment0.processPayment((double) 1.0f, "hi!");
        boolean boolean9 = debitCardPayment0.refund("Institutional Billing", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        boolean boolean29 = paymentProcessor0.processPayment((double) '#', "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) -1, "Credit Card");
        boolean boolean10 = creditCardPayment0.processPayment((double) (short) -1, "Credit Card");
        boolean boolean13 = creditCardPayment0.processPayment(10.0d, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        boolean boolean42 = paymentProcessor0.processPayment((double) (-1L), "");
        boolean boolean45 = paymentProcessor0.refundPayment("Debit Card", 0.0d);
        boolean boolean48 = paymentProcessor0.processPayment((-1.0d), "");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean14 = debitCardPayment0.refund("hi!", (double) 'a');
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        java.lang.String str22 = creditCardPayment1.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        java.lang.String str24 = institutionalBilling13.getPaymentMethodName();
        boolean boolean27 = institutionalBilling13.processPayment((double) (byte) 1, "hi!");
        boolean boolean30 = institutionalBilling13.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean33 = institutionalBilling13.processPayment((double) (-1L), "hi!");
        boolean boolean36 = institutionalBilling13.processPayment((double) 0.0f, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Institutional Billing" + "'", str24, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        boolean boolean98 = paymentProcessor0.refundPayment("hi!", (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        java.lang.String str11 = creditCardPayment4.getPaymentMethodName();
        boolean boolean14 = creditCardPayment4.refund("Institutional Billing", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.refund("Debit Card", 1.0d);
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        java.lang.String str24 = institutionalBilling13.getPaymentMethodName();
        boolean boolean27 = institutionalBilling13.processPayment((double) (byte) 1, "hi!");
        boolean boolean30 = institutionalBilling13.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str31 = institutionalBilling13.getPaymentMethodName();
        boolean boolean34 = institutionalBilling13.processPayment((double) 100.0f, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Institutional Billing" + "'", str24, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Institutional Billing" + "'", str31, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
        boolean boolean26 = paymentProcessor0.refundPayment("hi!", (double) (byte) 10);
        boolean boolean29 = paymentProcessor0.refundPayment("Institutional Billing", (double) ' ');
        boolean boolean32 = paymentProcessor0.processPayment((double) (-1), "Credit Card");
        java.lang.Class<?> wildcardClass33 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        java.lang.String str23 = creditCardPayment10.getPaymentMethodName();
        boolean boolean26 = creditCardPayment10.processPayment((double) (byte) 0, "Institutional Billing");
        java.lang.String str27 = creditCardPayment10.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Credit Card" + "'", str23, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        boolean boolean6 = debitCardPayment0.refund("Credit Card", (double) (short) 0);
        boolean boolean9 = debitCardPayment0.refund("hi!", (double) '#');
        boolean boolean12 = debitCardPayment0.refund("hi!", (double) 100L);
        boolean boolean15 = debitCardPayment0.processPayment((double) (short) 100, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment((double) (-1.0f), "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.processPayment((double) 10.0f, "Credit Card");
        java.lang.Class<?> wildcardClass11 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.refund("hi!", 0.0d);
        boolean boolean13 = creditCardPayment0.refund("", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 1.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((double) 1L, "Debit Card");
        boolean boolean18 = institutionalBilling0.refund("", (double) (byte) 0);
        java.lang.String str19 = institutionalBilling0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass20 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Institutional Billing" + "'", str19, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        java.lang.Class<?> wildcardClass31 = creditCardPayment13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        boolean boolean26 = paymentProcessor0.refundPayment("Institutional Billing", 100.0d);
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
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        boolean boolean31 = debitCardPayment16.processPayment(0.0d, "Credit Card");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0.0f);
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("", (double) 0);
        boolean boolean17 = institutionalBilling0.refund("", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((double) 1.0f, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        boolean boolean42 = paymentProcessor0.processPayment((double) (byte) 10, "");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) (short) 10);
        boolean boolean21 = paymentProcessor0.processPayment((double) (-1.0f), "");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment22 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str23 = creditCardPayment22.getPaymentMethodName();
        boolean boolean26 = creditCardPayment22.processPayment((double) (-1L), "");
        boolean boolean29 = creditCardPayment22.processPayment((double) 1L, "");
        boolean boolean32 = creditCardPayment22.processPayment((double) 100.0f, "Debit Card");
        java.lang.String str33 = creditCardPayment22.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Credit Card" + "'", str23, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Credit Card" + "'", str33, "Credit Card");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Institutional Billing", 1.0d);
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.refund("Credit Card", (double) (short) 100);
        boolean boolean10 = debitCardPayment0.refund("", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) 1, "Institutional Billing");
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (double) 1);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean12 = creditCardPayment0.processPayment((double) 1, "Institutional Billing");
        boolean boolean15 = creditCardPayment0.processPayment((-1.0d), "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("hi!", (double) 1);
        boolean boolean15 = paymentProcessor0.refundPayment("Credit Card", (double) (short) 0);
        boolean boolean18 = paymentProcessor0.refundPayment("Debit Card", (double) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) 0.0f, "hi!");
        java.lang.String str25 = creditCardPayment0.getPaymentMethodName();
        boolean boolean28 = creditCardPayment0.refund("", (double) (byte) 0);
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
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        java.lang.String str7 = creditCardPayment1.getPaymentMethodName();
        boolean boolean10 = creditCardPayment1.processPayment((double) (short) 10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        boolean boolean38 = paymentProcessor0.processPayment((double) 100L, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) 0, "Debit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean16 = debitCardPayment13.processPayment((double) 0, "hi!");
        java.lang.String str17 = debitCardPayment13.getPaymentMethodName();
        boolean boolean20 = debitCardPayment13.processPayment((double) 1L, "");
        boolean boolean23 = debitCardPayment13.refund("", (double) 1L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        boolean boolean27 = debitCardPayment13.refund("Credit Card", (double) 100L);
        boolean boolean30 = debitCardPayment13.refund("hi!", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0, "");
        java.lang.Class<?> wildcardClass10 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) ' ', "hi!");
        boolean boolean17 = debitCardPayment0.processPayment(0.0d, "");
        boolean boolean20 = debitCardPayment0.refund("Credit Card", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean14 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean17 = debitCardPayment0.processPayment((double) 0L, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (-1.0d));
        boolean boolean13 = institutionalBilling0.refund("Credit Card", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        boolean boolean45 = paymentProcessor0.processPayment((double) 1, "Debit Card");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling4 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean7 = institutionalBilling4.refund("", (double) 100);
        boolean boolean10 = institutionalBilling4.processPayment((double) 10.0f, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling4);
        boolean boolean14 = paymentProcessor0.refundPayment("Credit Card", (double) 10.0f);
        boolean boolean17 = paymentProcessor0.refundPayment("hi!", (double) 100.0f);
        java.lang.Class<?> wildcardClass18 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.processPayment(0.0d, "Institutional Billing");
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment((double) 10.0f, "");
        boolean boolean22 = institutionalBilling0.refund("Debit Card", (double) 10);
        java.lang.Class<?> wildcardClass23 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.processPayment((double) (short) 10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0.0f);
        java.lang.Class<?> wildcardClass11 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.processPayment(0.0d, "Institutional Billing");
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str17 = institutionalBilling0.getPaymentMethodName();
        boolean boolean20 = institutionalBilling0.processPayment(0.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Institutional Billing" + "'", str17, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (short) 10);
        boolean boolean12 = institutionalBilling0.refund("hi!", (-1.0d));
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        boolean boolean16 = institutionalBilling0.refund("Institutional Billing", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.refund("hi!", 0.0d);
        boolean boolean13 = debitCardPayment0.refund("Debit Card", (double) 0.0f);
        boolean boolean16 = debitCardPayment0.processPayment((double) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        boolean boolean15 = paymentProcessor0.refundPayment("Credit Card", (double) (-1));
        java.lang.Class<?> wildcardClass16 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.processPayment((double) 0.0f, "Credit Card");
        java.lang.String str22 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Institutional Billing", 1.0d);
        boolean boolean6 = debitCardPayment0.processPayment((double) 10L, "Credit Card");
        boolean boolean9 = debitCardPayment0.refund("Debit Card", (double) 1.0f);
        boolean boolean12 = debitCardPayment0.refund("Debit Card", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) 1, "Credit Card");
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        boolean boolean17 = institutionalBilling0.processPayment(0.0d, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        boolean boolean23 = paymentProcessor0.processPayment((double) (-1.0f), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean15 = debitCardPayment0.refund("Institutional Billing", (double) (byte) 0);
        boolean boolean18 = debitCardPayment0.processPayment((double) 0, "Credit Card");
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment(0.0d, "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) 10, "Institutional Billing");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str18 = creditCardPayment4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        boolean boolean8 = institutionalBilling0.processPayment((double) '#', "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = creditCardPayment0.refund("", (double) 100.0f);
        boolean boolean13 = creditCardPayment0.refund("Credit Card", (double) (-1.0f));
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        boolean boolean18 = creditCardPayment0.refund("Credit Card", (double) 100);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) (short) 100, "Debit Card");
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) 10.0f);
        boolean boolean10 = creditCardPayment0.refund("Debit Card", (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean17 = institutionalBilling0.refund("Institutional Billing", (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) (byte) -1, "Debit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) -1, "Credit Card");
        boolean boolean13 = debitCardPayment0.processPayment((double) (byte) 10, "hi!");
        java.lang.String str14 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.processPayment((double) ' ', "Debit Card");
        boolean boolean13 = debitCardPayment0.refund("Credit Card", (double) 10.0f);
        boolean boolean16 = debitCardPayment0.refund("", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Institutional Billing", (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        java.lang.Class<?> wildcardClass26 = paymentProcessor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
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
        boolean boolean32 = paymentProcessor0.refundPayment("Credit Card", (double) 10.0f);
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.refund("Debit Card", 1.0d);
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 10.0f, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.processPayment(0.0d, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor10 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment11 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean14 = creditCardPayment11.refund("Credit Card", (double) (byte) 10);
        java.lang.String str15 = creditCardPayment11.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment11);
        boolean boolean19 = paymentProcessor10.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str21 = creditCardPayment20.getPaymentMethodName();
        boolean boolean24 = creditCardPayment20.processPayment((double) (-1L), "");
        boolean boolean27 = creditCardPayment20.refund("hi!", (double) ' ');
        java.lang.String str28 = creditCardPayment20.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment20);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling30 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean33 = institutionalBilling30.refund("Credit Card", (double) (short) 1);
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        boolean boolean37 = institutionalBilling30.refund("", (double) 100.0f);
        java.lang.String str38 = institutionalBilling30.getPaymentMethodName();
        boolean boolean41 = institutionalBilling30.processPayment((double) (short) -1, "hi!");
        java.lang.String str42 = institutionalBilling30.getPaymentMethodName();
        boolean boolean45 = institutionalBilling30.refund("Debit Card", (double) 0.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        boolean boolean49 = paymentProcessor0.refundPayment("Credit Card", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Institutional Billing" + "'", str42, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.processPayment((double) 10.0f, "Credit Card");
        boolean boolean13 = institutionalBilling0.refund("hi!", (double) (short) 0);
        boolean boolean16 = institutionalBilling0.processPayment((double) (byte) -1, "Credit Card");
        boolean boolean19 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str6 = institutionalBilling0.getPaymentMethodName();
        boolean boolean9 = institutionalBilling0.refund("hi!", (double) ' ');
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Institutional Billing" + "'", str6, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling4 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean7 = institutionalBilling4.refund("", (double) 100);
        boolean boolean10 = institutionalBilling4.processPayment((double) 10.0f, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling4);
        boolean boolean14 = institutionalBilling4.processPayment(10.0d, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        boolean boolean21 = creditCardPayment13.processPayment(100.0d, "");
        boolean boolean24 = creditCardPayment13.refund("hi!", (double) (-1.0f));
        boolean boolean27 = creditCardPayment13.refund("Institutional Billing", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("Institutional Billing", (double) 10);
        java.lang.Class<?> wildcardClass15 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment(0.0d, "Debit Card");
        boolean boolean13 = creditCardPayment0.processPayment((double) 10, "Institutional Billing");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        boolean boolean11 = institutionalBilling0.processPayment((double) 100.0f, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        boolean boolean18 = paymentProcessor0.processPayment((double) (short) 100, "");
        boolean boolean21 = paymentProcessor0.processPayment((double) (-1), "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        boolean boolean19 = creditCardPayment7.processPayment(100.0d, "Debit Card");
        boolean boolean22 = creditCardPayment7.refund("hi!", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        boolean boolean21 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str17 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str18 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Institutional Billing" + "'", str17, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Institutional Billing" + "'", str18, "Institutional Billing");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment33 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str34 = debitCardPayment33.getPaymentMethodName();
        boolean boolean37 = debitCardPayment33.refund("hi!", (double) 0L);
        boolean boolean40 = debitCardPayment33.processPayment((double) (short) 0, "Credit Card");
        boolean boolean43 = debitCardPayment33.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment33);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (byte) 100);
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        java.lang.Class<?> wildcardClass24 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        java.lang.String str24 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment((double) '4', "Credit Card");
        boolean boolean10 = institutionalBilling0.processPayment((double) (short) 100, "Credit Card");
        java.lang.Class<?> wildcardClass11 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean24 = creditCardPayment0.processPayment((double) (byte) 100, "");
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        boolean boolean8 = institutionalBilling0.processPayment((double) 0.0f, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean13 = debitCardPayment0.processPayment((double) 0, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        boolean boolean47 = paymentProcessor0.processPayment((double) 10.0f, "");
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
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.refund("Debit Card", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((-1.0d), "Debit Card");
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str17 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Institutional Billing" + "'", str17, "Institutional Billing");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        boolean boolean47 = institutionalBilling26.processPayment((double) 1L, "hi!");
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling16 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean19 = institutionalBilling16.refund("", 0.0d);
        java.lang.String str20 = institutionalBilling16.getPaymentMethodName();
        boolean boolean23 = institutionalBilling16.processPayment(10.0d, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Institutional Billing" + "'", str20, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) '4', "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str14 = debitCardPayment13.getPaymentMethodName();
        boolean boolean17 = debitCardPayment13.processPayment((double) 100, "");
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str21 = debitCardPayment20.getPaymentMethodName();
        boolean boolean24 = debitCardPayment20.refund("hi!", (double) 0L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment20);
        boolean boolean28 = paymentProcessor0.processPayment((double) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) '4');
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean9 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        boolean boolean12 = paymentProcessor0.processPayment((double) 100, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) '4', "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str14 = debitCardPayment13.getPaymentMethodName();
        boolean boolean17 = debitCardPayment13.processPayment((double) 100, "");
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        boolean boolean22 = debitCardPayment13.processPayment((double) 100.0f, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        boolean boolean24 = paymentProcessor0.processPayment((double) (short) 1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.refundPayment("hi!", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        boolean boolean10 = creditCardPayment0.refund("", (double) 10L);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.refund("Institutional Billing", (double) 0.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        boolean boolean30 = paymentProcessor0.refundPayment("hi!", (double) 0.0f);
        boolean boolean33 = paymentProcessor0.processPayment(0.0d, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
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
        boolean boolean30 = paymentProcessor0.processPayment((double) '#', "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0L);
        boolean boolean13 = institutionalBilling0.refund("Debit Card", 1.0d);
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 10);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment((double) (-1.0f), "");
        boolean boolean10 = institutionalBilling0.processPayment((double) 0, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.refund("Institutional Billing", (double) (byte) 1);
        boolean boolean10 = debitCardPayment0.refund("", (double) (-1L));
        boolean boolean13 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean16 = debitCardPayment0.processPayment((double) (short) 100, "Debit Card");
        boolean boolean19 = debitCardPayment0.processPayment(0.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 1, "Debit Card");
        boolean boolean18 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean21 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        boolean boolean24 = creditCardPayment0.refund("Institutional Billing", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
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
        boolean boolean19 = creditCardPayment7.processPayment(100.0d, "Debit Card");
        boolean boolean22 = creditCardPayment7.processPayment(0.0d, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment18 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str19 = debitCardPayment18.getPaymentMethodName();
        boolean boolean22 = debitCardPayment18.processPayment((double) 'a', "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment18);
        java.lang.Class<?> wildcardClass24 = debitCardPayment18.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean11 = debitCardPayment0.processPayment((double) 10, "Debit Card");
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str13 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Debit Card" + "'", str13, "Debit Card");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        java.lang.String str24 = institutionalBilling13.getPaymentMethodName();
        boolean boolean27 = institutionalBilling13.processPayment((double) (byte) 1, "hi!");
        boolean boolean30 = institutionalBilling13.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean33 = institutionalBilling13.refund("", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Institutional Billing" + "'", str24, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("hi!", (double) '#');
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) '#');
        boolean boolean13 = institutionalBilling0.processPayment((double) (-1.0f), "");
        java.lang.Class<?> wildcardClass14 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor16 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment17 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean20 = creditCardPayment17.refund("Credit Card", (double) (byte) 10);
        java.lang.String str21 = creditCardPayment17.getPaymentMethodName();
        paymentProcessor16.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment17);
        boolean boolean25 = paymentProcessor16.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str27 = creditCardPayment26.getPaymentMethodName();
        boolean boolean30 = creditCardPayment26.processPayment((double) (-1L), "");
        boolean boolean33 = creditCardPayment26.refund("hi!", (double) ' ');
        java.lang.String str34 = creditCardPayment26.getPaymentMethodName();
        paymentProcessor16.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling36 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean39 = institutionalBilling36.refund("Credit Card", (double) (short) 1);
        paymentProcessor16.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling36);
        boolean boolean43 = institutionalBilling36.refund("", (double) 100.0f);
        java.lang.String str44 = institutionalBilling36.getPaymentMethodName();
        boolean boolean47 = institutionalBilling36.processPayment((double) (short) -1, "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling36);
        java.lang.String str49 = institutionalBilling36.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Credit Card" + "'", str34, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Institutional Billing" + "'", str44, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Institutional Billing" + "'", str49, "Institutional Billing");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        boolean boolean14 = creditCardPayment7.refund("hi!", (double) ' ');
        java.lang.String str15 = creditCardPayment7.getPaymentMethodName();
        java.lang.String str16 = creditCardPayment7.getPaymentMethodName();
        boolean boolean19 = creditCardPayment7.processPayment(100.0d, "");
        boolean boolean22 = creditCardPayment7.refund("Institutional Billing", (double) 10);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.refund("Institutional Billing", (double) (byte) 1);
        boolean boolean10 = debitCardPayment0.refund("", (double) (-1L));
        boolean boolean13 = debitCardPayment0.refund("hi!", (double) 1L);
        boolean boolean16 = debitCardPayment0.processPayment((double) (short) 100, "Debit Card");
        java.lang.String str17 = debitCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass18 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) (-1L), "");
        boolean boolean23 = creditCardPayment16.refund("hi!", (double) ' ');
        java.lang.String str24 = creditCardPayment16.getPaymentMethodName();
        java.lang.String str25 = creditCardPayment16.getPaymentMethodName();
        boolean boolean28 = creditCardPayment16.processPayment(100.0d, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Credit Card" + "'", str24, "Credit Card");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Credit Card" + "'", str25, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        boolean boolean38 = paymentProcessor0.processPayment((double) 0, "");
        boolean boolean41 = paymentProcessor0.refundPayment("Debit Card", 0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) (short) 1, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment48 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean51 = debitCardPayment48.processPayment((double) 0, "hi!");
        java.lang.String str52 = debitCardPayment48.getPaymentMethodName();
        boolean boolean55 = debitCardPayment48.processPayment((double) 1L, "");
        java.lang.String str56 = debitCardPayment48.getPaymentMethodName();
        boolean boolean59 = debitCardPayment48.processPayment((double) 0.0f, "");
        boolean boolean62 = debitCardPayment48.refund("Debit Card", (double) (byte) -1);
        boolean boolean65 = debitCardPayment48.refund("hi!", (-1.0d));
        boolean boolean68 = debitCardPayment48.processPayment((double) ' ', "Credit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment48);
        boolean boolean72 = debitCardPayment48.processPayment((double) '4', "Credit Card");
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Debit Card" + "'", str52, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Debit Card" + "'", str56, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean20 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        boolean boolean23 = debitCardPayment0.refund("Institutional Billing", (double) 1.0f);
        boolean boolean26 = debitCardPayment0.refund("Credit Card", (double) (-1));
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment28 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str29 = creditCardPayment28.getPaymentMethodName();
        boolean boolean32 = creditCardPayment28.processPayment((double) 0L, "hi!");
        boolean boolean35 = creditCardPayment28.refund("Institutional Billing", (double) 10);
        boolean boolean38 = creditCardPayment28.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean41 = creditCardPayment28.refund("hi!", (double) (-1.0f));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment28);
        java.lang.String str43 = creditCardPayment28.getPaymentMethodName();
        java.lang.String str44 = creditCardPayment28.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Credit Card" + "'", str29, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Credit Card" + "'", str43, "Credit Card");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Credit Card" + "'", str44, "Credit Card");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Institutional Billing", (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.refund("", (double) (-1));
        boolean boolean12 = institutionalBilling0.processPayment((double) (-1), "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.refund("Credit Card", (double) (-1.0f));
        boolean boolean10 = debitCardPayment0.processPayment((double) 'a', "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) 0L, "hi!");
        boolean boolean11 = creditCardPayment4.refund("Credit Card", 100.0d);
        boolean boolean14 = creditCardPayment4.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean18 = paymentProcessor0.refundPayment("Institutional Billing", (double) 100);
        boolean boolean21 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.refund("Credit Card", (double) 0.0f);
        boolean boolean7 = institutionalBilling0.processPayment((double) 100L, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean7 = debitCardPayment0.refund("Debit Card", 1.0d);
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("Debit Card", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) (-1));
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (double) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean17 = debitCardPayment0.processPayment((-1.0d), "Institutional Billing");
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) ' ', "hi!");
        boolean boolean17 = debitCardPayment0.processPayment(0.0d, "");
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        boolean boolean22 = paymentProcessor0.processPayment((double) 100.0f, "Institutional Billing");
        boolean boolean25 = paymentProcessor0.processPayment((double) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (-1.0d));
        boolean boolean13 = institutionalBilling0.processPayment((double) (byte) -1, "Credit Card");
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 0.0d);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor7 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean10 = paymentProcessor7.refundPayment("Credit Card", (double) 0L);
        boolean boolean13 = paymentProcessor7.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = paymentProcessor7.refundPayment("", (double) 0);
        boolean boolean19 = paymentProcessor7.processPayment((double) 100L, "Institutional Billing");
        boolean boolean22 = paymentProcessor7.processPayment((double) (short) 100, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment23 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean26 = debitCardPayment23.processPayment((double) 0, "hi!");
        java.lang.String str27 = debitCardPayment23.getPaymentMethodName();
        boolean boolean30 = debitCardPayment23.processPayment((double) 1L, "");
        java.lang.String str31 = debitCardPayment23.getPaymentMethodName();
        boolean boolean34 = debitCardPayment23.processPayment((double) 0.0f, "");
        boolean boolean37 = debitCardPayment23.refund("Debit Card", (double) (byte) -1);
        boolean boolean40 = debitCardPayment23.processPayment((double) 10L, "hi!");
        paymentProcessor7.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment23);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment23);
        boolean boolean45 = paymentProcessor0.processPayment(1.0d, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Debit Card" + "'", str27, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Debit Card" + "'", str31, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        boolean boolean6 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 0);
        boolean boolean9 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean17 = debitCardPayment0.processPayment((-1.0d), "Credit Card");
        java.lang.String str18 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str19 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        boolean boolean6 = debitCardPayment0.refund("Credit Card", (double) (short) 0);
        boolean boolean9 = debitCardPayment0.refund("Debit Card", (double) 1.0f);
        java.lang.String str10 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        boolean boolean15 = debitCardPayment0.processPayment((double) 0L, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card" + "'", str10, "Debit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) 10.0f);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        boolean boolean14 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean17 = creditCardPayment0.refund("Debit Card", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 100, "hi!");
        boolean boolean15 = institutionalBilling0.refund("Credit Card", (double) 0L);
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.refund("", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 0L, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Institutional Billing", 0.0d);
        boolean boolean15 = paymentProcessor0.processPayment((double) (byte) 1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) 100, "hi!");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.processPayment((-1.0d), "Credit Card");
        boolean boolean13 = debitCardPayment0.refund("", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = paymentProcessor0.processPayment((double) 10.0f, "hi!");
        boolean boolean15 = paymentProcessor0.processPayment((double) 1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        boolean boolean47 = institutionalBilling23.processPayment((double) (short) 1, "Credit Card");
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
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Institutional Billing", 1.0d);
        boolean boolean6 = debitCardPayment0.processPayment((double) 10L, "Credit Card");
        java.lang.String str7 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Debit Card" + "'", str7, "Debit Card");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
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
        java.lang.Class<?> wildcardClass36 = institutionalBilling20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.processPayment((double) '#', "Credit Card");
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1.0f), "hi!");
        boolean boolean11 = debitCardPayment0.refund("Debit Card", (double) (byte) 0);
        boolean boolean14 = debitCardPayment0.refund("Institutional Billing", (double) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
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
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str27 = creditCardPayment26.getPaymentMethodName();
        boolean boolean30 = creditCardPayment26.processPayment((double) 0L, "hi!");
        boolean boolean33 = creditCardPayment26.refund("Credit Card", 100.0d);
        java.lang.String str34 = creditCardPayment26.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        boolean boolean38 = paymentProcessor0.refundPayment("Debit Card", (double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Credit Card" + "'", str34, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean12 = creditCardPayment4.refund("Institutional Billing", (double) (short) 0);
        boolean boolean15 = creditCardPayment4.refund("Debit Card", (double) 100.0f);
        java.lang.String str16 = creditCardPayment4.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1.0f), "");
        boolean boolean11 = debitCardPayment0.processPayment(0.0d, "Institutional Billing");
        boolean boolean14 = debitCardPayment0.refund("Institutional Billing", (double) 100L);
        boolean boolean17 = debitCardPayment0.refund("Debit Card", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str8 = creditCardPayment7.getPaymentMethodName();
        boolean boolean11 = creditCardPayment7.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment7);
        java.lang.Class<?> wildcardClass13 = creditCardPayment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        java.lang.String str1 = institutionalBilling0.getPaymentMethodName();
        boolean boolean4 = institutionalBilling0.processPayment((double) 0L, "Institutional Billing");
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str6 = institutionalBilling0.getPaymentMethodName();
        boolean boolean9 = institutionalBilling0.processPayment((double) 0L, "");
        boolean boolean12 = institutionalBilling0.processPayment((double) 0.0f, "Credit Card");
        boolean boolean15 = institutionalBilling0.refund("", (double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Institutional Billing" + "'", str1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Institutional Billing" + "'", str6, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment22 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean25 = debitCardPayment22.processPayment((double) 0, "hi!");
        java.lang.String str26 = debitCardPayment22.getPaymentMethodName();
        boolean boolean29 = debitCardPayment22.processPayment((double) (byte) -1, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment22);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling31 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean34 = institutionalBilling31.refund("", (double) 100);
        boolean boolean37 = institutionalBilling31.refund("hi!", (double) '#');
        java.lang.String str38 = institutionalBilling31.getPaymentMethodName();
        java.lang.String str39 = institutionalBilling31.getPaymentMethodName();
        boolean boolean42 = institutionalBilling31.refund("Institutional Billing", (double) (-1.0f));
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Debit Card" + "'", str26, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Institutional Billing" + "'", str39, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = creditCardPayment0.processPayment((double) 100.0f, "Debit Card");
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.refund("hi!", 10.0d);
        boolean boolean17 = creditCardPayment0.processPayment((double) '4', "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.refundPayment("Credit Card", (-1.0d));
        boolean boolean9 = paymentProcessor0.refundPayment("", 100.0d);
        boolean boolean12 = paymentProcessor0.processPayment((double) 'a', "");
        boolean boolean15 = paymentProcessor0.refundPayment("Debit Card", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", 0.0d);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.refund("", (double) (short) -1);
        boolean boolean23 = debitCardPayment0.refund("", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 100, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean17 = debitCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.processPayment((double) 10L, "hi!");
        boolean boolean20 = debitCardPayment0.refund("Credit Card", (double) (byte) -1);
        boolean boolean23 = debitCardPayment0.refund("hi!", (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.processPayment((double) 0.0f, "hi!");
        boolean boolean12 = creditCardPayment0.refund("Institutional Billing", (double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor10 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment11 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean14 = creditCardPayment11.refund("Credit Card", (double) (byte) 10);
        java.lang.String str15 = creditCardPayment11.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment11);
        boolean boolean19 = paymentProcessor10.refundPayment("Debit Card", (double) (byte) 10);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str21 = creditCardPayment20.getPaymentMethodName();
        boolean boolean24 = creditCardPayment20.processPayment((double) (-1L), "");
        boolean boolean27 = creditCardPayment20.refund("hi!", (double) ' ');
        java.lang.String str28 = creditCardPayment20.getPaymentMethodName();
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment20);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling30 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean33 = institutionalBilling30.refund("Credit Card", (double) (short) 1);
        paymentProcessor10.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        boolean boolean37 = institutionalBilling30.refund("", (double) 100.0f);
        java.lang.String str38 = institutionalBilling30.getPaymentMethodName();
        boolean boolean41 = institutionalBilling30.processPayment((double) (short) -1, "hi!");
        java.lang.String str42 = institutionalBilling30.getPaymentMethodName();
        boolean boolean45 = institutionalBilling30.refund("Debit Card", (double) 0.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling30);
        boolean boolean49 = institutionalBilling30.processPayment((double) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Credit Card" + "'", str21, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Institutional Billing" + "'", str38, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Institutional Billing" + "'", str42, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.processPayment((double) 1.0f, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.refund("Credit Card", (double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.refund("", 0.0d);
        boolean boolean14 = debitCardPayment0.processPayment((double) (byte) -1, "Institutional Billing");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) 10L);
        boolean boolean23 = debitCardPayment0.processPayment((double) (byte) 0, "");
        java.lang.Class<?> wildcardClass24 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) (byte) 10, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        boolean boolean15 = paymentProcessor0.processPayment((double) (short) 100, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str24 = debitCardPayment16.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean28 = debitCardPayment16.refund("Institutional Billing", (double) (-1.0f));
        boolean boolean31 = debitCardPayment16.processPayment((double) (byte) 10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        boolean boolean9 = institutionalBilling0.refund("", (double) (-1));
        boolean boolean12 = institutionalBilling0.refund("hi!", (double) 'a');
        boolean boolean15 = institutionalBilling0.processPayment((double) 0.0f, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) ' ', "Credit Card");
        boolean boolean6 = paymentProcessor0.processPayment((double) 100L, "Institutional Billing");
        boolean boolean9 = paymentProcessor0.processPayment(100.0d, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 10);
        boolean boolean6 = institutionalBilling0.refund("", (double) 1L);
        boolean boolean9 = institutionalBilling0.processPayment((double) 10, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        boolean boolean24 = paymentProcessor0.refundPayment("", (double) (short) -1);
        java.lang.Class<?> wildcardClass25 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.processPayment((double) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean20 = debitCardPayment0.refund("Institutional Billing", (double) 10L);
        boolean boolean23 = debitCardPayment0.processPayment((double) (byte) 0, "");
        boolean boolean26 = debitCardPayment0.processPayment((-1.0d), "Credit Card");
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
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean12 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) 10, "");
        java.lang.String str16 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str17 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor30 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment31 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str32 = creditCardPayment31.getPaymentMethodName();
        boolean boolean35 = creditCardPayment31.processPayment((double) (-1L), "");
        paymentProcessor30.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment31);
        boolean boolean39 = paymentProcessor30.processPayment((double) 0L, "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment40 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean43 = debitCardPayment40.processPayment((double) 0, "hi!");
        java.lang.String str44 = debitCardPayment40.getPaymentMethodName();
        boolean boolean47 = debitCardPayment40.processPayment((double) 1L, "");
        boolean boolean50 = debitCardPayment40.processPayment((double) (short) 0, "Institutional Billing");
        java.lang.String str51 = debitCardPayment40.getPaymentMethodName();
        paymentProcessor30.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment40);
        java.lang.String str53 = debitCardPayment40.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Debit Card" + "'", str25, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Credit Card" + "'", str32, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Debit Card" + "'", str44, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Debit Card" + "'", str51, "Debit Card");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Debit Card" + "'", str53, "Debit Card");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        boolean boolean24 = paymentProcessor0.processPayment((-1.0d), "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        boolean boolean18 = paymentProcessor0.processPayment((double) 10L, "");
        boolean boolean21 = paymentProcessor0.refundPayment("Credit Card", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) 1, "Credit Card");
        java.lang.String str13 = institutionalBilling0.getPaymentMethodName();
        boolean boolean16 = institutionalBilling0.refund("Credit Card", (double) 10);
        boolean boolean19 = institutionalBilling0.refund("Credit Card", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Institutional Billing" + "'", str13, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
        boolean boolean39 = institutionalBilling20.refund("Institutional Billing", (double) (byte) 0);
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
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("Debit Card", (double) 0);
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        boolean boolean22 = paymentProcessor0.processPayment((double) 100.0f, "Institutional Billing");
        boolean boolean25 = paymentProcessor0.processPayment((double) 10L, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        boolean boolean30 = creditCardPayment0.processPayment((double) 10, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment22 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean25 = debitCardPayment22.processPayment((double) 0, "hi!");
        java.lang.String str26 = debitCardPayment22.getPaymentMethodName();
        boolean boolean29 = debitCardPayment22.processPayment((double) 1L, "");
        boolean boolean32 = debitCardPayment22.processPayment((double) (short) 0, "Institutional Billing");
        boolean boolean35 = debitCardPayment22.processPayment((double) (short) -1, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment22);
        boolean boolean39 = debitCardPayment22.processPayment((double) 1, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Debit Card" + "'", str26, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment(100.0d, "Debit Card");
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) 0L, "Debit Card");
        boolean boolean15 = paymentProcessor0.refundPayment("hi!", (double) 100.0f);
        boolean boolean18 = paymentProcessor0.refundPayment("Institutional Billing", (double) 0);
        java.lang.Class<?> wildcardClass19 = paymentProcessor0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (-1L));
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.refund("Debit Card", (double) 100.0f);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.processPayment((double) 10, "Credit Card");
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0.0f);
        boolean boolean13 = institutionalBilling0.refund("hi!", (double) (-1));
        boolean boolean16 = institutionalBilling0.processPayment((double) (byte) -1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str6 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean10 = creditCardPayment0.processPayment((double) '4', "Debit Card");
        boolean boolean13 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        boolean boolean16 = creditCardPayment0.refund("Debit Card", (double) (short) 0);
        java.lang.Class<?> wildcardClass17 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        boolean boolean18 = debitCardPayment0.refund("hi!", (double) 100);
        boolean boolean21 = debitCardPayment0.refund("", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("hi!", (double) '#');
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) '#');
        boolean boolean13 = institutionalBilling0.processPayment((double) (-1.0f), "");
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        boolean boolean17 = institutionalBilling0.refund("", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) 1, "Credit Card");
        boolean boolean15 = institutionalBilling0.processPayment((double) 100, "");
        boolean boolean18 = institutionalBilling0.refund("Credit Card", (double) (byte) 0);
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
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        java.lang.String str34 = debitCardPayment19.getPaymentMethodName();
        java.lang.Class<?> wildcardClass35 = debitCardPayment19.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.processPayment((double) (byte) 0, "Institutional Billing");
        boolean boolean10 = creditCardPayment0.refund("", (double) 10L);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.processPayment((double) (short) 100, "Credit Card");
        boolean boolean17 = creditCardPayment0.processPayment((double) (short) 10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.processPayment((double) 1.0f, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Debit Card", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
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
        boolean boolean54 = paymentProcessor0.processPayment(100.0d, "Institutional Billing");
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) '4');
        boolean boolean10 = creditCardPayment0.refund("Debit Card", (double) 10L);
        boolean boolean13 = creditCardPayment0.refund("Credit Card", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (-1.0d));
        boolean boolean13 = creditCardPayment0.processPayment((double) 10.0f, "Debit Card");
        boolean boolean16 = creditCardPayment0.processPayment((double) (byte) 100, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        boolean boolean26 = creditCardPayment7.processPayment(0.0d, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean12 = creditCardPayment0.processPayment((double) (-1), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment26 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str27 = creditCardPayment26.getPaymentMethodName();
        boolean boolean30 = creditCardPayment26.processPayment((double) 0L, "hi!");
        boolean boolean33 = creditCardPayment26.refund("Credit Card", 100.0d);
        java.lang.String str34 = creditCardPayment26.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment26);
        boolean boolean38 = creditCardPayment26.refund("Credit Card", (double) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Credit Card" + "'", str34, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
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
        boolean boolean26 = institutionalBilling13.processPayment((double) ' ', "hi!");
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Institutional Billing", (double) (byte) 10);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment((double) (-1.0f), "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
        boolean boolean29 = paymentProcessor0.refundPayment("Debit Card", (double) (-1L));
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment30 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean33 = debitCardPayment30.processPayment((double) 0, "hi!");
        java.lang.String str34 = debitCardPayment30.getPaymentMethodName();
        java.lang.String str35 = debitCardPayment30.getPaymentMethodName();
        boolean boolean38 = debitCardPayment30.refund("Institutional Billing", (double) 1L);
        boolean boolean41 = debitCardPayment30.processPayment((double) 0L, "Debit Card");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment30);
        boolean boolean45 = paymentProcessor0.refundPayment("Institutional Billing", 1.0d);
        boolean boolean48 = paymentProcessor0.processPayment((double) (short) 0, "Debit Card");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Debit Card" + "'", str34, "Debit Card");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        java.lang.String str35 = debitCardPayment22.getPaymentMethodName();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Debit Card" + "'", str35, "Debit Card");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.processPayment((double) 1, "Credit Card");
        boolean boolean15 = institutionalBilling0.processPayment((double) 100, "");
        java.lang.Class<?> wildcardClass16 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        boolean boolean14 = paymentProcessor0.processPayment(0.0d, "hi!");
        boolean boolean17 = paymentProcessor0.processPayment(10.0d, "Institutional Billing");
        boolean boolean20 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment21 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str22 = creditCardPayment21.getPaymentMethodName();
        boolean boolean25 = creditCardPayment21.processPayment((double) (-1L), "");
        boolean boolean28 = creditCardPayment21.refund("hi!", (double) ' ');
        java.lang.String str29 = creditCardPayment21.getPaymentMethodName();
        boolean boolean32 = creditCardPayment21.refund("Debit Card", 0.0d);
        boolean boolean35 = creditCardPayment21.processPayment((double) (short) 100, "hi!");
        boolean boolean38 = creditCardPayment21.refund("", (double) 0.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Credit Card" + "'", str29, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        boolean boolean17 = paymentProcessor0.processPayment((double) (-1L), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        java.lang.String str25 = institutionalBilling20.getPaymentMethodName();
        boolean boolean28 = institutionalBilling20.refund("hi!", 10.0d);
        java.lang.String str29 = institutionalBilling20.getPaymentMethodName();
        boolean boolean32 = institutionalBilling20.refund("hi!", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Institutional Billing" + "'", str25, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Institutional Billing" + "'", str29, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.processPayment((double) ' ', "Debit Card");
        boolean boolean13 = debitCardPayment0.refund("Credit Card", (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) '4', "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str14 = debitCardPayment13.getPaymentMethodName();
        boolean boolean17 = debitCardPayment13.processPayment((double) 100, "");
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        boolean boolean22 = debitCardPayment13.processPayment((double) 0.0f, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
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
        boolean boolean24 = paymentProcessor0.refundPayment("hi!", (double) (short) 10);
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
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) (short) 100, "Debit Card");
        boolean boolean7 = debitCardPayment0.refund("", (double) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean11 = debitCardPayment0.processPayment((double) 10, "Debit Card");
        boolean boolean14 = debitCardPayment0.refund("Institutional Billing", (double) 10.0f);
        boolean boolean17 = debitCardPayment0.processPayment((-1.0d), "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("Institutional Billing", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) 0.0f, "");
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) '4');
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.refund("Debit Card", (double) (byte) 100);
        boolean boolean23 = debitCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean26 = debitCardPayment0.processPayment(0.0d, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        boolean boolean14 = debitCardPayment0.refund("hi!", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        boolean boolean54 = debitCardPayment36.refund("Debit Card", (double) 100L);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean10 = debitCardPayment7.processPayment((double) 0, "hi!");
        java.lang.String str11 = debitCardPayment7.getPaymentMethodName();
        boolean boolean14 = debitCardPayment7.processPayment((double) 1L, "");
        boolean boolean17 = debitCardPayment7.processPayment((double) (short) 0, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment7);
        boolean boolean21 = paymentProcessor0.refundPayment("hi!", (double) 1.0f);
        boolean boolean24 = paymentProcessor0.processPayment((double) (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str2 = debitCardPayment0.getPaymentMethodName();
        boolean boolean5 = debitCardPayment0.refund("", (double) (short) 0);
        boolean boolean8 = debitCardPayment0.processPayment((double) (-1), "Credit Card");
        boolean boolean11 = debitCardPayment0.refund("Debit Card", (double) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Debit Card" + "'", str2, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        java.lang.String str11 = creditCardPayment4.getPaymentMethodName();
        boolean boolean14 = creditCardPayment4.refund("Credit Card", (double) 0.0f);
        java.lang.String str15 = creditCardPayment4.getPaymentMethodName();
        boolean boolean18 = creditCardPayment4.processPayment((double) 100, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("Institutional Billing", (double) (short) 0);
        boolean boolean12 = paymentProcessor0.processPayment((double) (short) 1, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling13 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean16 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean19 = institutionalBilling13.refund("", (double) (byte) 10);
        boolean boolean22 = institutionalBilling13.refund("Credit Card", (double) (short) 1);
        boolean boolean25 = institutionalBilling13.refund("Credit Card", (double) (-1L));
        boolean boolean28 = institutionalBilling13.refund("Institutional Billing", (double) ' ');
        java.lang.String str29 = institutionalBilling13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling13);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment31 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean34 = creditCardPayment31.refund("Credit Card", (double) (byte) 10);
        boolean boolean37 = creditCardPayment31.processPayment((double) (short) 100, "");
        boolean boolean40 = creditCardPayment31.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean43 = creditCardPayment31.processPayment(0.0d, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment31);
        boolean boolean47 = creditCardPayment31.processPayment((double) 10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Institutional Billing" + "'", str29, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("Credit Card", (double) 10.0f);
        boolean boolean21 = paymentProcessor0.processPayment(10.0d, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
        java.lang.Class<?> wildcardClass40 = paymentProcessor0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.processPayment((double) (short) -1, "Credit Card");
        boolean boolean12 = institutionalBilling0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean15 = institutionalBilling0.refund("hi!", 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
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
        boolean boolean26 = paymentProcessor0.refundPayment("hi!", (double) (byte) 10);
        boolean boolean29 = paymentProcessor0.processPayment((double) 10.0f, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        boolean boolean11 = debitCardPayment0.processPayment((double) 0L, "Debit Card");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        boolean boolean17 = debitCardPayment0.processPayment((double) 1.0f, "Institutional Billing");
        boolean boolean20 = debitCardPayment0.processPayment((double) 0.0f, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.refund("hi!", 0.0d);
        boolean boolean13 = debitCardPayment0.processPayment(0.0d, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.refund("hi!", 0.0d);
        boolean boolean13 = debitCardPayment0.processPayment((-1.0d), "");
        boolean boolean16 = debitCardPayment0.processPayment((double) 1L, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        boolean boolean38 = institutionalBilling20.processPayment((double) 100, "");
        java.lang.String str39 = institutionalBilling20.getPaymentMethodName();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Institutional Billing" + "'", str39, "Institutional Billing");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("Debit Card", 0.0d);
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) 10.0f);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        boolean boolean14 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        boolean boolean17 = creditCardPayment0.processPayment((double) 1L, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        java.lang.String str10 = creditCardPayment4.getPaymentMethodName();
        boolean boolean13 = creditCardPayment4.refund("hi!", 0.0d);
        boolean boolean16 = creditCardPayment4.refund("", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0L);
        boolean boolean13 = institutionalBilling0.processPayment((double) '4', "Debit Card");
        boolean boolean16 = institutionalBilling0.refund("Institutional Billing", 100.0d);
        boolean boolean19 = institutionalBilling0.processPayment((double) 100.0f, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        boolean boolean13 = debitCardPayment0.processPayment(100.0d, "Institutional Billing");
        java.lang.String str14 = debitCardPayment0.getPaymentMethodName();
        boolean boolean17 = debitCardPayment0.refund("", (-1.0d));
        java.lang.String str18 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        java.lang.String str28 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) -1, "");
        boolean boolean14 = debitCardPayment0.processPayment((double) 100, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.refund("Credit Card", (double) 0.0f);
        boolean boolean9 = institutionalBilling0.processPayment((double) (byte) 0, "");
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) (short) 10, "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean14 = debitCardPayment0.processPayment((double) ' ', "hi!");
        java.lang.String str15 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean10 = debitCardPayment7.processPayment((double) 0, "hi!");
        java.lang.String str11 = debitCardPayment7.getPaymentMethodName();
        boolean boolean14 = debitCardPayment7.processPayment((double) 1L, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment7);
        boolean boolean18 = paymentProcessor0.refundPayment("Institutional Billing", (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.refund("", (double) 10.0f);
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment(100.0d, "");
        boolean boolean22 = institutionalBilling0.refund("Institutional Billing", (double) 'a');
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
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Institutional Billing", (double) (short) 0);
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.processPayment((double) 1.0f, "");
        boolean boolean12 = paymentProcessor0.refundPayment("Debit Card", (double) ' ');
        boolean boolean15 = paymentProcessor0.processPayment((double) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.processPayment((double) 10, "Credit Card");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean7 = creditCardPayment4.refund("Credit Card", (double) (byte) 10);
        boolean boolean10 = creditCardPayment4.processPayment((double) (short) 100, "");
        boolean boolean13 = creditCardPayment4.processPayment((double) 'a', "Credit Card");
        boolean boolean16 = creditCardPayment4.refund("hi!", (double) 100.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean20 = paymentProcessor0.refundPayment("Institutional Billing", (double) 0L);
        boolean boolean23 = paymentProcessor0.refundPayment("Credit Card", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
        boolean boolean32 = paymentProcessor0.refundPayment("Institutional Billing", (double) (-1.0f));
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
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("Credit Card", (double) (-1));
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) 100L);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("", 0.0d);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (-1.0d));
        boolean boolean13 = institutionalBilling0.processPayment((double) (-1L), "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        boolean boolean6 = institutionalBilling0.processPayment((double) 1, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", (double) (short) 10);
        java.lang.String str10 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Institutional Billing" + "'", str10, "Institutional Billing");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "");
        boolean boolean10 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) ' ');
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) (short) -1, "");
        boolean boolean14 = creditCardPayment0.processPayment((double) (byte) 100, "Debit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.refund("Debit Card", (double) (short) 10);
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.refund("", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        boolean boolean8 = institutionalBilling0.refund("Debit Card", (double) 100.0f);
        boolean boolean11 = institutionalBilling0.processPayment((double) (-1.0f), "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.processPayment((double) 0.0f, "hi!");
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str5 = institutionalBilling0.getPaymentMethodName();
        boolean boolean8 = institutionalBilling0.refund("Debit Card", (double) (short) 0);
        boolean boolean11 = institutionalBilling0.processPayment((double) (-1L), "Debit Card");
        boolean boolean14 = institutionalBilling0.refund("Debit Card", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Institutional Billing" + "'", str5, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.processPayment((double) (byte) 1, "Debit Card");
        java.lang.String str11 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str12 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card" + "'", str12, "Debit Card");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean10 = debitCardPayment7.processPayment((double) 0, "hi!");
        java.lang.String str11 = debitCardPayment7.getPaymentMethodName();
        boolean boolean14 = debitCardPayment7.processPayment((double) 1L, "");
        boolean boolean17 = debitCardPayment7.processPayment((double) (short) 0, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment7);
        java.lang.String str19 = debitCardPayment7.getPaymentMethodName();
        java.lang.String str20 = debitCardPayment7.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) '4', "Institutional Billing");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str14 = debitCardPayment13.getPaymentMethodName();
        boolean boolean17 = debitCardPayment13.processPayment((double) 100, "");
        java.lang.String str18 = debitCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment20 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str21 = debitCardPayment20.getPaymentMethodName();
        boolean boolean24 = debitCardPayment20.refund("hi!", (double) 0L);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment20);
        boolean boolean28 = debitCardPayment20.processPayment(100.0d, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("hi!", (double) 10.0f);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) 1.0f, "Debit Card");
        boolean boolean14 = creditCardPayment0.refund("Institutional Billing", (double) (byte) -1);
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str16 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.refund("", (double) 10.0f);
        boolean boolean18 = institutionalBilling0.refund("Institutional Billing", (double) 0.0f);
        boolean boolean21 = institutionalBilling0.processPayment(0.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean11 = debitCardPayment0.processPayment((double) (short) -1, "");
        boolean boolean14 = debitCardPayment0.processPayment(0.0d, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean6 = creditCardPayment0.processPayment((double) (short) 100, "");
        boolean boolean9 = creditCardPayment0.refund("hi!", (double) 100);
        boolean boolean12 = creditCardPayment0.processPayment((double) (byte) 1, "Institutional Billing");
        boolean boolean15 = creditCardPayment0.refund("", (double) 100.0f);
        boolean boolean18 = creditCardPayment0.processPayment((double) (byte) 0, "Debit Card");
        boolean boolean21 = creditCardPayment0.refund("Credit Card", (double) 100);
        java.lang.String str22 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        boolean boolean6 = paymentProcessor0.processPayment((double) 'a', "Credit Card");
        boolean boolean9 = paymentProcessor0.refundPayment("", (double) 0);
        com.yorku.roomscheduler.patterns.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy10);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor12 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean15 = paymentProcessor12.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str17 = creditCardPayment16.getPaymentMethodName();
        boolean boolean20 = creditCardPayment16.processPayment((double) 0L, "hi!");
        boolean boolean23 = creditCardPayment16.refund("Credit Card", 100.0d);
        boolean boolean26 = creditCardPayment16.refund("hi!", 0.0d);
        paymentProcessor12.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment16);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment28 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str29 = creditCardPayment28.getPaymentMethodName();
        boolean boolean32 = creditCardPayment28.processPayment((double) 0L, "hi!");
        boolean boolean35 = creditCardPayment28.processPayment((double) (byte) 0, "Institutional Billing");
        paymentProcessor12.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment28);
        boolean boolean39 = creditCardPayment28.refund("", (double) 0.0f);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment28);
        java.lang.String str41 = creditCardPayment28.getPaymentMethodName();
        boolean boolean44 = creditCardPayment28.processPayment(0.0d, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Credit Card" + "'", str29, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Credit Card" + "'", str41, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((double) 1L, "Debit Card");
        boolean boolean18 = institutionalBilling0.refund("", (double) (byte) 0);
        java.lang.String str19 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str20 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Institutional Billing" + "'", str19, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Institutional Billing" + "'", str20, "Institutional Billing");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        boolean boolean31 = debitCardPayment16.processPayment((double) 10, "Debit Card");
        boolean boolean34 = debitCardPayment16.processPayment((double) (short) 100, "Institutional Billing");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str8 = institutionalBilling0.getPaymentMethodName();
        java.lang.String str9 = institutionalBilling0.getPaymentMethodName();
        boolean boolean12 = institutionalBilling0.refund("Debit Card", (double) 1.0f);
        boolean boolean15 = institutionalBilling0.refund("", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Institutional Billing" + "'", str8, "Institutional Billing");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Institutional Billing" + "'", str9, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
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
        boolean boolean21 = creditCardPayment13.processPayment(100.0d, "");
        boolean boolean24 = creditCardPayment13.processPayment((double) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.processPayment((double) 1L, "");
        boolean boolean12 = paymentProcessor0.processPayment((double) 10L, "hi!");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment13 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean16 = debitCardPayment13.processPayment((double) 0, "hi!");
        java.lang.String str17 = debitCardPayment13.getPaymentMethodName();
        boolean boolean20 = debitCardPayment13.processPayment((double) (byte) -1, "Debit Card");
        java.lang.String str21 = debitCardPayment13.getPaymentMethodName();
        boolean boolean24 = debitCardPayment13.processPayment((double) 10.0f, "hi!");
        java.lang.String str25 = debitCardPayment13.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment13);
        boolean boolean29 = debitCardPayment13.refund("Credit Card", (double) 1L);
        boolean boolean32 = debitCardPayment13.refund("Institutional Billing", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Debit Card" + "'", str21, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Debit Card" + "'", str25, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
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
        boolean boolean30 = paymentProcessor0.processPayment((double) (byte) 1, "Credit Card");
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
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
        boolean boolean21 = paymentProcessor0.refundPayment("", (double) 1.0f);
        boolean boolean24 = paymentProcessor0.processPayment((double) 0.0f, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.refund("Institutional Billing", (double) 1L);
        java.lang.String str9 = debitCardPayment0.getPaymentMethodName();
        boolean boolean12 = debitCardPayment0.processPayment((double) (short) 10, "");
        boolean boolean15 = debitCardPayment0.processPayment(10.0d, "Institutional Billing");
        boolean boolean18 = debitCardPayment0.processPayment((double) 0L, "");
        java.lang.String str19 = debitCardPayment0.getPaymentMethodName();
        boolean boolean22 = debitCardPayment0.refund("hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card" + "'", str9, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.processPayment((double) 1L, "Debit Card");
        boolean boolean18 = institutionalBilling0.refund("", (double) (byte) 0);
        boolean boolean21 = institutionalBilling0.processPayment((double) (short) -1, "");
        java.lang.String str22 = institutionalBilling0.getPaymentMethodName();
        boolean boolean25 = institutionalBilling0.processPayment(0.0d, "Debit Card");
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
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        java.lang.Class<?> wildcardClass21 = creditCardPayment10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("", (double) (-1L));
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.refund("Institutional Billing", (double) 10);
        java.lang.String str15 = institutionalBilling0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Institutional Billing" + "'", str15, "Institutional Billing");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.processPayment((double) 100.0f, "");
        boolean boolean6 = creditCardPayment0.processPayment((double) (byte) 100, "Institutional Billing");
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
        boolean boolean30 = paymentProcessor0.refundPayment("Credit Card", (double) 10.0f);
        boolean boolean33 = paymentProcessor0.processPayment((double) 100L, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment((double) (byte) 1, "Institutional Billing");
        java.lang.String str20 = institutionalBilling0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass21 = institutionalBilling0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Institutional Billing" + "'", str20, "Institutional Billing");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0, "Debit Card");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor27 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment28 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean31 = creditCardPayment28.refund("Credit Card", (double) (byte) 10);
        java.lang.String str32 = creditCardPayment28.getPaymentMethodName();
        paymentProcessor27.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment28);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment34 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str35 = creditCardPayment34.getPaymentMethodName();
        boolean boolean38 = creditCardPayment34.processPayment((double) (-1L), "");
        paymentProcessor27.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment34);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling40 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean43 = institutionalBilling40.refund("", 0.0d);
        boolean boolean46 = institutionalBilling40.refund("Institutional Billing", (double) 1L);
        boolean boolean49 = institutionalBilling40.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor27.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling40);
        java.lang.String str51 = institutionalBilling40.getPaymentMethodName();
        boolean boolean54 = institutionalBilling40.processPayment((double) (byte) 1, "hi!");
        boolean boolean57 = institutionalBilling40.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean60 = institutionalBilling40.processPayment((double) (-1L), "hi!");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling40);
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor62 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment63 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean66 = creditCardPayment63.refund("Credit Card", (double) (byte) 10);
        java.lang.String str67 = creditCardPayment63.getPaymentMethodName();
        paymentProcessor62.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment63);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment69 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str70 = creditCardPayment69.getPaymentMethodName();
        boolean boolean73 = creditCardPayment69.processPayment((double) (-1L), "");
        paymentProcessor62.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment69);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling75 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean78 = institutionalBilling75.refund("", 0.0d);
        boolean boolean81 = institutionalBilling75.refund("Institutional Billing", (double) 1L);
        boolean boolean84 = institutionalBilling75.processPayment((double) (short) 0, "Credit Card");
        paymentProcessor62.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling75);
        java.lang.String str86 = institutionalBilling75.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling75);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Credit Card" + "'", str32, "Credit Card");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Credit Card" + "'", str35, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Institutional Billing" + "'", str51, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Credit Card" + "'", str67, "Credit Card");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Credit Card" + "'", str70, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Institutional Billing" + "'", str86, "Institutional Billing");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment7 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean10 = debitCardPayment7.processPayment((double) 0, "hi!");
        java.lang.String str11 = debitCardPayment7.getPaymentMethodName();
        boolean boolean14 = debitCardPayment7.processPayment((double) 1L, "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment7);
        boolean boolean18 = debitCardPayment7.refund("Credit Card", (double) (short) 10);
        boolean boolean21 = debitCardPayment7.processPayment((double) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Debit Card" + "'", str11, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.refund("hi!", (double) '#');
        java.lang.String str7 = institutionalBilling0.getPaymentMethodName();
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) '#');
        java.lang.String str11 = institutionalBilling0.getPaymentMethodName();
        boolean boolean14 = institutionalBilling0.processPayment(0.0d, "");
        boolean boolean17 = institutionalBilling0.refund("Debit Card", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Institutional Billing" + "'", str7, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Institutional Billing" + "'", str11, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Credit Card", (double) 0.0f);
        boolean boolean12 = paymentProcessor0.refundPayment("", (double) 'a');
        boolean boolean15 = paymentProcessor0.processPayment(10.0d, "Credit Card");
        boolean boolean18 = paymentProcessor0.refundPayment("", (double) (short) 10);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling19 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean22 = institutionalBilling19.refund("", 0.0d);
        java.lang.String str23 = institutionalBilling19.getPaymentMethodName();
        boolean boolean26 = institutionalBilling19.processPayment(10.0d, "");
        java.lang.String str27 = institutionalBilling19.getPaymentMethodName();
        boolean boolean30 = institutionalBilling19.refund("Debit Card", 10.0d);
        java.lang.String str31 = institutionalBilling19.getPaymentMethodName();
        boolean boolean34 = institutionalBilling19.refund("hi!", (double) 10.0f);
        boolean boolean37 = institutionalBilling19.processPayment((double) (-1), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Institutional Billing" + "'", str23, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Institutional Billing" + "'", str27, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Institutional Billing" + "'", str31, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        boolean boolean31 = creditCardPayment16.processPayment((-1.0d), "hi!");
        boolean boolean34 = creditCardPayment16.processPayment((double) ' ', "Institutional Billing");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.processPayment((double) 100, "");
        java.lang.String str5 = debitCardPayment0.getPaymentMethodName();
        boolean boolean8 = debitCardPayment0.processPayment((double) 'a', "Credit Card");
        boolean boolean11 = debitCardPayment0.refund("", 0.0d);
        boolean boolean14 = debitCardPayment0.processPayment((double) (short) -1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        boolean boolean10 = debitCardPayment0.processPayment((double) (short) 0, "Institutional Billing");
        boolean boolean13 = debitCardPayment0.refund("Credit Card", 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", 0.0d);
        java.lang.String str4 = institutionalBilling0.getPaymentMethodName();
        boolean boolean7 = institutionalBilling0.processPayment(10.0d, "");
        boolean boolean10 = institutionalBilling0.refund("Debit Card", (double) 0.0f);
        boolean boolean13 = institutionalBilling0.processPayment((double) (byte) 100, "hi!");
        java.lang.String str14 = institutionalBilling0.getPaymentMethodName();
        boolean boolean17 = institutionalBilling0.refund("hi!", (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Institutional Billing" + "'", str4, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Institutional Billing" + "'", str14, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        java.lang.String str1 = debitCardPayment0.getPaymentMethodName();
        boolean boolean4 = debitCardPayment0.refund("hi!", (double) 0L);
        boolean boolean7 = debitCardPayment0.processPayment((double) (short) 0, "Credit Card");
        boolean boolean10 = debitCardPayment0.refund("hi!", 0.0d);
        boolean boolean13 = debitCardPayment0.processPayment((double) 0.0f, "Debit Card");
        java.lang.String str14 = debitCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Debit Card" + "'", str1, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card" + "'", str14, "Debit Card");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean3 = debitCardPayment0.processPayment((double) 0, "hi!");
        java.lang.String str4 = debitCardPayment0.getPaymentMethodName();
        boolean boolean7 = debitCardPayment0.processPayment((double) 1L, "");
        java.lang.String str8 = debitCardPayment0.getPaymentMethodName();
        boolean boolean11 = debitCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean14 = debitCardPayment0.refund("Debit Card", (double) (byte) -1);
        boolean boolean17 = debitCardPayment0.refund("hi!", (-1.0d));
        boolean boolean20 = debitCardPayment0.refund("Debit Card", (double) (byte) 100);
        boolean boolean23 = debitCardPayment0.processPayment((double) (-1L), "Institutional Billing");
        boolean boolean26 = debitCardPayment0.processPayment((double) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) (-1L), "");
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) -1, "Credit Card");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("Institutional Billing", 100.0d);
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        boolean boolean57 = institutionalBilling46.processPayment((double) '#', "Credit Card");
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
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 0L, "hi!");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        com.yorku.roomscheduler.patterns.strategy.DebitCardPayment debitCardPayment16 = new com.yorku.roomscheduler.patterns.strategy.DebitCardPayment();
        boolean boolean19 = debitCardPayment16.processPayment((double) 0, "hi!");
        java.lang.String str20 = debitCardPayment16.getPaymentMethodName();
        boolean boolean23 = debitCardPayment16.refund("Institutional Billing", (double) (byte) 1);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) debitCardPayment16);
        boolean boolean27 = debitCardPayment16.processPayment(10.0d, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card" + "'", str20, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Debit Card", 1.0d);
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment4 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str5 = creditCardPayment4.getPaymentMethodName();
        boolean boolean8 = creditCardPayment4.processPayment((double) 0L, "hi!");
        boolean boolean11 = creditCardPayment4.refund("Credit Card", 100.0d);
        boolean boolean14 = creditCardPayment4.refund("hi!", 0.0d);
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment4);
        boolean boolean18 = paymentProcessor0.refundPayment("Credit Card", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str2 = creditCardPayment1.getPaymentMethodName();
        boolean boolean5 = creditCardPayment1.processPayment((double) (-1L), "");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = creditCardPayment1.processPayment((double) 1L, "Debit Card");
        java.lang.Class<?> wildcardClass10 = creditCardPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("", (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean6 = institutionalBilling0.refund("", (double) (byte) 10);
        boolean boolean9 = institutionalBilling0.refund("Credit Card", (double) (short) 1);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) (-1L));
        boolean boolean15 = institutionalBilling0.refund("Institutional Billing", (double) ' ');
        java.lang.String str16 = institutionalBilling0.getPaymentMethodName();
        boolean boolean19 = institutionalBilling0.processPayment(100.0d, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Institutional Billing" + "'", str16, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling0 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean3 = institutionalBilling0.refund("", (double) 100);
        boolean boolean6 = institutionalBilling0.processPayment((double) 10.0f, "Institutional Billing");
        boolean boolean9 = institutionalBilling0.refund("Debit Card", 10.0d);
        boolean boolean12 = institutionalBilling0.refund("Credit Card", (double) 10.0f);
        boolean boolean15 = institutionalBilling0.refund("", (double) 10.0f);
        boolean boolean18 = institutionalBilling0.refund("Institutional Billing", (double) 0.0f);
        boolean boolean21 = institutionalBilling0.processPayment((double) (short) 100, "Institutional Billing");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        java.lang.String str22 = creditCardPayment7.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Credit Card" + "'", str22, "Credit Card");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        boolean boolean37 = institutionalBilling20.processPayment((double) 'a', "hi!");
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
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment1 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean4 = creditCardPayment1.refund("Credit Card", (double) (byte) 10);
        java.lang.String str5 = creditCardPayment1.getPaymentMethodName();
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) creditCardPayment1);
        boolean boolean9 = paymentProcessor0.refundPayment("Debit Card", (double) (byte) 10);
        boolean boolean12 = paymentProcessor0.processPayment((double) 100.0f, "Credit Card");
        boolean boolean15 = paymentProcessor0.processPayment((-1.0d), "");
        boolean boolean18 = paymentProcessor0.processPayment((double) (short) 100, "");
        boolean boolean21 = paymentProcessor0.refundPayment("", (double) 0.0f);
        boolean boolean24 = paymentProcessor0.processPayment((double) (short) 100, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.yorku.roomscheduler.service.PaymentProcessor paymentProcessor0 = new com.yorku.roomscheduler.service.PaymentProcessor();
        boolean boolean3 = paymentProcessor0.refundPayment("Credit Card", (double) 0L);
        com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling institutionalBilling4 = new com.yorku.roomscheduler.patterns.strategy.InstitutionalBilling();
        boolean boolean7 = institutionalBilling4.refund("", (double) 100);
        boolean boolean10 = institutionalBilling4.processPayment((double) 10.0f, "Institutional Billing");
        paymentProcessor0.setPaymentStrategy((com.yorku.roomscheduler.patterns.strategy.PaymentStrategy) institutionalBilling4);
        boolean boolean14 = paymentProcessor0.processPayment((double) (-1L), "");
        boolean boolean17 = paymentProcessor0.processPayment((double) 10L, "");
        boolean boolean20 = paymentProcessor0.refundPayment("Credit Card", (double) (short) 10);
        boolean boolean23 = paymentProcessor0.refundPayment("hi!", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}

