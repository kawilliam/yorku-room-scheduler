package randooptest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacadeRegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            booking6.setState(bookingState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.state.BookingState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.lang.Class<?> wildcardClass10 = bookingState9.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.Class<?> wildcardClass9 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        booking6.cancel();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime10 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        boolean boolean10 = creditCardPayment0.refund("Credit Card", (double) 0);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getCurrentStateName();
        double double13 = booking6.getHourlyRate();
        java.lang.String str14 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver24 = null;
        booking20.addObserver(bookingObserver24);
        booking20.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState28 = booking20.getState();
        booking6.setState(bookingState28);
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState28);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.Class<?> wildcardClass15 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.extend(100);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        java.lang.Class<?> wildcardClass16 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.complete();
        booking6.extend((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        double double13 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        java.lang.Class<?> wildcardClass10 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.yorku.roomscheduler.model.Booking booking21 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime18, localDateTime19, 0.0d);
        java.time.LocalDateTime localDateTime22 = null;
        booking21.setEndTime(localDateTime22);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState24 = booking21.getState();
        boolean boolean25 = booking21.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState26 = booking21.getState();
        java.lang.String str27 = booking21.getRoomId();
        java.lang.String str28 = booking21.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState29 = booking21.getState();
        booking6.setState(bookingState29);
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(bookingState29);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) (byte) 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean14 = creditCardPayment0.processPayment(10.0d, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.forfeitDeposit();
        java.lang.String str11 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDateTime8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        booking6.cancel();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.yorku.roomscheduler.model.Booking booking33 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime30, localDateTime31, 0.0d);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setEndTime(localDateTime34);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking33.getState();
        boolean boolean37 = booking33.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking33.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        java.lang.Class<?> wildcardClass41 = bookingState38.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        boolean boolean14 = booking6.isCheckedIn();
        java.lang.String str15 = booking6.getBookingId();
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        java.lang.Class<?> wildcardClass16 = bookingStatus15.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime12 = null;
        booking6.setEndTime(localDateTime12);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.lang.String str11 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getTotalCost();
        java.lang.String str14 = booking6.getRoomId();
        boolean boolean15 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        java.lang.String str11 = booking6.getCurrentStateName();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.roomscheduler.model.Booking booking15 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime12, localDateTime13, 0.0d);
        java.time.LocalDateTime localDateTime16 = null;
        booking15.setEndTime(localDateTime16);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking15.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking15.addObserver(bookingObserver19);
        booking15.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        boolean boolean33 = booking29.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking29.getState();
        booking15.setState(bookingState34);
        booking6.setState(bookingState34);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.processPayment((double) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.lang.String str12 = booking6.getUserId();
        double double13 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.lang.String str20 = booking19.getUserId();
        booking19.confirmBooking();
        java.lang.String str22 = booking19.getBookingId();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime27, localDateTime28, 0.0d);
        java.time.LocalDateTime localDateTime31 = null;
        booking30.setEndTime(localDateTime31);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking30.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver34 = null;
        booking30.addObserver(bookingObserver34);
        booking30.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking30.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        java.lang.String str41 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.Class<?> wildcardClass13 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.lang.Class<?> wildcardClass11 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "hi!", "", localDateTime3, localDateTime4, (double) 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking22.addObserver(bookingObserver26);
        booking22.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver40 = null;
        booking36.addObserver(bookingObserver40);
        booking36.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState44 = booking36.getState();
        booking22.setState(bookingState44);
        booking6.setState(bookingState44);
        java.lang.String str47 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver48 = null;
        booking6.removeObserver(bookingObserver48);
        java.lang.Class<?> wildcardClass50 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PENDING" + "'", str47, "PENDING");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.confirmBooking();
        double double11 = booking6.getTotalCost();
        java.lang.Class<?> wildcardClass12 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getHourlyRate();
        booking6.cancel();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.setHourlyRate((double) (-1.0f));
        java.lang.Class<?> wildcardClass22 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        java.lang.Class<?> wildcardClass16 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking17.addObserver(bookingObserver21);
        booking17.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking17.getState();
        booking6.setState(bookingState25);
        java.lang.Class<?> wildcardClass27 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking22.addObserver(bookingObserver26);
        booking22.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver40 = null;
        booking36.addObserver(bookingObserver40);
        booking36.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState44 = booking36.getState();
        booking22.setState(bookingState44);
        booking6.setState(bookingState44);
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.setHourlyRate((double) (-1L));
        java.lang.Class<?> wildcardClass11 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        java.lang.String str16 = booking6.getRoomId();
        double double17 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        boolean boolean24 = booking20.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        booking6.setState(bookingState25);
        java.lang.String str27 = booking6.getRoomId();
        booking6.extend(0);
        java.lang.Class<?> wildcardClass30 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        java.time.LocalDateTime localDateTime26 = booking22.getEndTime();
        double double27 = booking22.getTotalCost();
        booking22.cancel();
        booking22.setHourlyRate(10.0d);
        java.lang.String str31 = booking22.getBookingId();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.yorku.roomscheduler.model.Booking booking38 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime35, localDateTime36, 0.0d);
        java.time.LocalDateTime localDateTime39 = null;
        booking38.setEndTime(localDateTime39);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState41 = booking38.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver42 = null;
        booking38.addObserver(bookingObserver42);
        booking38.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        com.yorku.roomscheduler.model.Booking booking52 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime49, localDateTime50, 0.0d);
        java.time.LocalDateTime localDateTime53 = null;
        booking52.setEndTime(localDateTime53);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState55 = booking52.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver56 = null;
        booking52.addObserver(bookingObserver56);
        booking52.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState60 = booking52.getState();
        booking38.setState(bookingState60);
        booking22.setState(bookingState60);
        booking6.setState(bookingState60);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertNotNull(bookingState60);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        double double15 = booking6.getTotalCost();
        booking6.extend((int) '4');
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        booking6.confirmBooking();
        boolean boolean13 = booking6.isCheckedIn();
        booking6.setHourlyRate((double) 'a');
        booking6.complete();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        boolean boolean24 = booking20.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        booking6.setState(bookingState25);
        java.lang.String str27 = booking6.getRoomId();
        booking6.complete();
        booking6.setHourlyRate((-1.0d));
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        booking6.setHourlyRate(0.0d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.setHourlyRate((double) (-1.0f));
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver33 = null;
        booking29.addObserver(bookingObserver33);
        booking29.setHourlyRate((double) (byte) 0);
        double double37 = booking29.getTotalCost();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        com.yorku.roomscheduler.model.Booking booking44 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime41, localDateTime42, 0.0d);
        java.time.LocalDateTime localDateTime45 = null;
        booking44.setEndTime(localDateTime45);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState47 = booking44.getState();
        boolean boolean48 = booking44.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState49 = booking44.getState();
        java.lang.String str50 = booking44.getRoomId();
        java.lang.String str51 = booking44.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState52 = booking44.getState();
        booking29.setState(bookingState52);
        booking6.setState(bookingState52);
        java.time.LocalDateTime localDateTime55 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNull(localDateTime55);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getHourlyRate();
        boolean boolean11 = booking6.isCheckedIn();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.setHourlyRate((double) (-1.0f));
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver33 = null;
        booking29.addObserver(bookingObserver33);
        booking29.setHourlyRate((double) (byte) 0);
        double double37 = booking29.getTotalCost();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        com.yorku.roomscheduler.model.Booking booking44 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime41, localDateTime42, 0.0d);
        java.time.LocalDateTime localDateTime45 = null;
        booking44.setEndTime(localDateTime45);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState47 = booking44.getState();
        boolean boolean48 = booking44.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState49 = booking44.getState();
        java.lang.String str50 = booking44.getRoomId();
        java.lang.String str51 = booking44.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState52 = booking44.getState();
        booking29.setState(bookingState52);
        booking6.setState(bookingState52);
        double double55 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str3 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("Credit Card", 10.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Credit Card" + "'", str3, "Credit Card");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.complete();
        java.time.LocalDateTime localDateTime13 = booking6.getEndTime();
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.lang.Class<?> wildcardClass13 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (-1.0f));
        double double7 = booking6.getTotalCost();
        java.lang.Class<?> wildcardClass8 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.addObserver(bookingObserver7);
        booking6.setHourlyRate((double) (-1.0f));
        double double11 = booking6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        java.lang.String str10 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        booking6.cancel();
        boolean boolean14 = booking6.isCheckedIn();
        java.lang.String str15 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CANCELLED" + "'", str15, "CANCELLED");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getUserId();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.addObserver(bookingObserver7);
        booking6.setHourlyRate((double) (-1.0f));
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        boolean boolean14 = booking6.isCheckedIn();
        java.lang.String str15 = booking6.getBookingId();
        double double16 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        java.lang.String str13 = booking6.getUserId();
        boolean boolean14 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        double double12 = booking6.getHourlyRate();
        booking6.cancel();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.cancel();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        double double13 = booking6.getHourlyRate();
        java.lang.String str14 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("PENDING", 0.0d);
        boolean boolean6 = creditCardPayment0.processPayment((double) 1L, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.lang.String str17 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.yorku.roomscheduler.model.Booking booking25 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime22, localDateTime23, 0.0d);
        java.lang.String str26 = booking25.getUserId();
        java.lang.String str27 = booking25.getRoomId();
        java.lang.String str28 = booking25.getUserId();
        java.lang.String str29 = booking25.getCurrentStateName();
        double double30 = booking25.getHourlyRate();
        java.lang.String str31 = booking25.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking25.getState();
        booking6.setState(bookingState32);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PENDING" + "'", str29, "PENDING");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("PENDING", (double) 0.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        booking6.setHourlyRate((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = booking6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        booking6.confirmBooking();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.lang.Class<?> wildcardClass11 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        boolean boolean7 = booking6.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, (double) 10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        java.lang.String str17 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PENDING" + "'", str17, "PENDING");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        booking6.confirmBooking();
        boolean boolean13 = booking6.isCheckedIn();
        booking6.setHourlyRate((double) 'a');
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        boolean boolean26 = booking22.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking22.getState();
        java.lang.String str28 = booking22.getRoomId();
        java.lang.String str29 = booking22.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState30 = booking22.getState();
        booking6.setState(bookingState30);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(bookingState30);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str3 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.processPayment((double) 100.0f, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Credit Card" + "'", str3, "Credit Card");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (-1.0f));
        double double7 = booking6.getTotalCost();
        java.lang.String str8 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        java.lang.String str20 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking6.getState();
        double double22 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        boolean boolean24 = booking20.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        booking6.setState(bookingState25);
        java.lang.String str27 = booking6.getRoomId();
        booking6.extend(0);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver30 = null;
        booking6.addObserver(bookingObserver30);
        java.lang.String str32 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        double double14 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState15 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState15);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.cancel();
        booking6.extend((int) '#');
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.setHourlyRate((double) (-1.0f));
        java.lang.String str22 = booking6.getBookingId();
        booking6.extend((int) (byte) 10);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver25 = null;
        booking6.removeObserver(bookingObserver25);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        booking6.cancel();
        booking6.complete();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime12 = booking6.getStartTime();
        java.lang.String str13 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime12 = booking6.getStartTime();
        boolean boolean13 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.setHourlyRate((double) (-1.0f));
        booking6.confirmBooking();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking6.addObserver(bookingObserver23);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus25 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus25.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("CANCELLED", (double) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        double double12 = booking6.getTotalCost();
        booking6.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.String str15 = booking6.getUserId();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        java.lang.String str7 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.extend((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        booking6.checkIn();
        double double14 = booking6.getHourlyRate();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        java.lang.String str15 = booking6.getBookingId();
        double double16 = booking6.getTotalCost();
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        java.lang.Class<?> wildcardClass8 = bookingStatus7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver11 = null;
        booking6.addObserver(bookingObserver11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        booking6.confirmBooking();
        booking6.extend((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        booking6.cancel();
        booking6.setHourlyRate((double) 1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.addObserver(bookingObserver15);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.yorku.roomscheduler.model.Booking booking23 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime20, localDateTime21, 0.0d);
        java.time.LocalDateTime localDateTime24 = null;
        booking23.setEndTime(localDateTime24);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState26 = booking23.getState();
        java.time.LocalDateTime localDateTime27 = booking23.getEndTime();
        java.lang.String str28 = booking23.getCurrentStateName();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        com.yorku.roomscheduler.model.Booking booking35 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime32, localDateTime33, 0.0d);
        java.time.LocalDateTime localDateTime36 = null;
        booking35.setEndTime(localDateTime36);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking35.getState();
        java.time.LocalDateTime localDateTime39 = booking35.getEndTime();
        java.lang.String str40 = booking35.getBookingId();
        java.lang.String str41 = booking35.getRoomId();
        booking35.checkIn();
        booking35.forfeitDeposit();
        java.lang.String str44 = booking35.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState45 = booking35.getState();
        booking23.setState(bookingState45);
        booking6.setState(bookingState45);
        java.lang.Class<?> wildcardClass48 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PENDING" + "'", str28, "PENDING");
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.complete();
        java.lang.String str13 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.lang.String str17 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking6.addObserver(bookingObserver19);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        double double9 = booking6.getTotalCost();
        boolean boolean10 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver24 = null;
        booking20.addObserver(bookingObserver24);
        booking20.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState28 = booking20.getState();
        booking6.setState(bookingState28);
        boolean boolean30 = booking6.isCheckedIn();
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.forfeitDeposit();
        booking6.cancel();
        booking6.extend((int) (short) -1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, 100.0d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, 10.0d);
        java.time.LocalDateTime localDateTime7 = booking6.getEndTime();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking17.addObserver(bookingObserver21);
        booking17.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking17.getState();
        booking6.setState(bookingState25);
        boolean boolean27 = booking6.isCheckedIn();
        boolean boolean28 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        booking6.extend((int) ' ');
        double double12 = booking6.getHourlyRate();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        booking6.cancel();
        java.lang.Class<?> wildcardClass10 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        double double13 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime14 = null;
        booking6.setEndTime(localDateTime14);
        double double16 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.yorku.roomscheduler.model.Booking booking16 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime13, localDateTime14, 0.0d);
        java.time.LocalDateTime localDateTime17 = null;
        booking16.setEndTime(localDateTime17);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState19 = booking16.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver20 = null;
        booking16.addObserver(bookingObserver20);
        booking16.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime27, localDateTime28, 0.0d);
        java.time.LocalDateTime localDateTime31 = null;
        booking30.setEndTime(localDateTime31);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking30.getState();
        boolean boolean34 = booking30.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking30.getState();
        booking16.setState(bookingState35);
        booking6.setState(bookingState35);
        java.lang.String str38 = booking6.getRoomId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver39 = null;
        booking6.removeObserver(bookingObserver39);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Credit Card", (double) (-1.0f));
        boolean boolean12 = creditCardPayment0.processPayment((double) 0, "Credit Card");
        boolean boolean15 = creditCardPayment0.refund("CANCELLED", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        java.lang.String str13 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking22.addObserver(bookingObserver26);
        booking22.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver40 = null;
        booking36.addObserver(bookingObserver40);
        booking36.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState44 = booking36.getState();
        booking22.setState(bookingState44);
        booking6.setState(bookingState44);
        java.lang.String str47 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver48 = null;
        booking6.removeObserver(bookingObserver48);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver50 = null;
        booking6.removeObserver(bookingObserver50);
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PENDING" + "'", str47, "PENDING");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDateTime9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) 10L, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        java.lang.String str7 = booking6.getRoomId();
        java.lang.String str8 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        java.lang.String str13 = booking6.getCurrentStateName();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CANCELLED" + "'", str13, "CANCELLED");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        booking6.forfeitDeposit();
        java.lang.Class<?> wildcardClass16 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus9 = booking6.getStatus();
        booking6.checkIn();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus9.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "", "hi!", localDateTime3, localDateTime4, 10.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.setHourlyRate((double) (-1.0f));
        booking6.confirmBooking();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking6.addObserver(bookingObserver23);
        java.lang.String str25 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PENDING" + "'", str25, "PENDING");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        booking6.extend((int) '#');
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.removeObserver(bookingObserver16);
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState19 = null;
        // The following exception was thrown during execution in test generation
        try {
            booking6.setState(bookingState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.state.BookingState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("CANCELLED", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        booking6.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        booking6.setEndTime(localDateTime12);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        double double15 = booking6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        booking6.confirmBooking();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.lang.String str12 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.removeObserver(bookingObserver13);
        boolean boolean15 = booking6.isCheckedIn();
        double double16 = booking6.getHourlyRate();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime10 = null;
        booking6.setEndTime(localDateTime10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.lang.String str12 = booking6.getUserId();
        java.lang.String str13 = booking6.getBookingId();
        boolean boolean14 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "Credit Card", "CANCELLED", localDateTime3, localDateTime4, 1.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        java.lang.String str9 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        java.lang.Class<?> wildcardClass14 = bookingState13.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        java.lang.String str15 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        booking6.cancel();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getUserId();
        boolean boolean14 = booking6.isCheckedIn();
        booking6.extend((int) (byte) 1);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("hi!", (double) '#');
        boolean boolean18 = creditCardPayment0.refund("hi!", (double) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean7 = creditCardPayment0.processPayment(0.0d, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) (byte) 100);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "hi!", "Credit Card", localDateTime3, localDateTime4, (double) '#');
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.yorku.roomscheduler.model.Booking booking33 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime30, localDateTime31, 0.0d);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setEndTime(localDateTime34);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking33.getState();
        boolean boolean37 = booking33.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking33.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver41 = null;
        booking6.addObserver(bookingObserver41);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver43 = null;
        booking6.addObserver(bookingObserver43);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingState38);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "PENDING", localDateTime3, localDateTime4, 100.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        double double13 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        boolean boolean9 = booking6.isCheckedIn();
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.yorku.roomscheduler.model.Booking booking33 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime30, localDateTime31, 0.0d);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setEndTime(localDateTime34);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking33.getState();
        boolean boolean37 = booking33.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking33.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        java.lang.Class<?> wildcardClass41 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getUserId();
        boolean boolean14 = booking6.isCheckedIn();
        java.lang.String str15 = booking6.getCurrentStateName();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PENDING" + "'", str15, "PENDING");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        booking6.extend((int) (byte) -1);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking22.addObserver(bookingObserver26);
        booking22.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver40 = null;
        booking36.addObserver(bookingObserver40);
        booking36.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState44 = booking36.getState();
        booking22.setState(bookingState44);
        booking6.setState(bookingState44);
        java.lang.String str47 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver48 = null;
        booking6.removeObserver(bookingObserver48);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver50 = null;
        booking6.removeObserver(bookingObserver50);
        java.time.LocalDateTime localDateTime52 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PENDING" + "'", str47, "PENDING");
        org.junit.Assert.assertNull(localDateTime52);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.extend(1);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState12 = booking6.getState();
        booking6.complete();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.refund("PENDING", (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.forfeitDeposit();
        java.lang.String str9 = booking6.getRoomId();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        double double12 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, (double) 1.0f);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getHourlyRate();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver11 = null;
        booking6.addObserver(bookingObserver11);
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        booking6.checkIn();
        booking6.setHourlyRate((double) 1L);
        booking6.forfeitDeposit();
        java.lang.String str13 = booking6.getRoomId();
        booking6.extend((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        java.lang.String str15 = booking6.getUserId();
        double double16 = booking6.getTotalCost();
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        booking6.confirmBooking();
        boolean boolean13 = booking6.isCheckedIn();
        booking6.setHourlyRate((double) 'a');
        java.lang.String str16 = booking6.getUserId();
        booking6.confirmBooking();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        booking6.confirmBooking();
        boolean boolean10 = booking6.isCheckedIn();
        double double11 = booking6.getTotalCost();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("", (double) '4');
        boolean boolean8 = creditCardPayment0.refund("CANCELLED", (double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.lang.String str20 = booking19.getUserId();
        booking19.confirmBooking();
        java.lang.String str22 = booking19.getBookingId();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime27, localDateTime28, 0.0d);
        java.time.LocalDateTime localDateTime31 = null;
        booking30.setEndTime(localDateTime31);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking30.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver34 = null;
        booking30.addObserver(bookingObserver34);
        booking30.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking30.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.yorku.roomscheduler.model.Booking booking47 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime44, localDateTime45, 0.0d);
        java.time.LocalDateTime localDateTime48 = null;
        booking47.setEndTime(localDateTime48);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState50 = booking47.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver51 = null;
        booking47.addObserver(bookingObserver51);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        com.yorku.roomscheduler.model.Booking booking59 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime56, localDateTime57, 0.0d);
        booking59.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus61 = booking59.getStatus();
        java.time.LocalDateTime localDateTime62 = null;
        booking59.setEndTime(localDateTime62);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        com.yorku.roomscheduler.model.Booking booking70 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime67, localDateTime68, 0.0d);
        java.time.LocalDateTime localDateTime71 = null;
        booking70.setEndTime(localDateTime71);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState73 = booking70.getState();
        boolean boolean74 = booking70.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState75 = booking70.getState();
        booking59.setState(bookingState75);
        booking47.setState(bookingState75);
        booking6.setState(bookingState75);
        java.lang.String str79 = booking6.getCurrentStateName();
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus61.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "PENDING" + "'", str79, "PENDING");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        booking6.extend((int) '#');
        booking6.complete();
        booking6.complete();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        com.yorku.roomscheduler.model.Booking booking24 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime21, localDateTime22, 0.0d);
        java.time.LocalDateTime localDateTime25 = null;
        booking24.setEndTime(localDateTime25);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking24.getState();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.yorku.roomscheduler.model.Booking booking34 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime31, localDateTime32, 0.0d);
        booking34.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus36 = booking34.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        booking34.setEndTime(localDateTime37);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        com.yorku.roomscheduler.model.Booking booking45 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime42, localDateTime43, 0.0d);
        java.time.LocalDateTime localDateTime46 = null;
        booking45.setEndTime(localDateTime46);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState48 = booking45.getState();
        boolean boolean49 = booking45.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState50 = booking45.getState();
        booking34.setState(bookingState50);
        booking24.setState(bookingState50);
        booking6.setState(bookingState50);
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertTrue("'" + bookingStatus36 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus36.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookingState50);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "", "hi!", localDateTime3, localDateTime4, (-1.0d));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState15 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState15);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("PENDING", 0.0d);
        boolean boolean6 = creditCardPayment0.processPayment(0.0d, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, 1.0d);
        booking6.checkIn();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        booking6.complete();
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.forfeitDeposit();
        double double9 = booking6.getHourlyRate();
        booking6.complete();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = booking6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean14 = creditCardPayment0.processPayment((double) 0L, "PENDING");
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        boolean boolean18 = creditCardPayment0.processPayment((double) 100L, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.setHourlyRate((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking22.addObserver(bookingObserver26);
        booking22.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver40 = null;
        booking36.addObserver(bookingObserver40);
        booking36.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState44 = booking36.getState();
        booking22.setState(bookingState44);
        booking6.setState(bookingState44);
        java.lang.String str47 = booking6.getCurrentStateName();
        booking6.complete();
        double double49 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PENDING" + "'", str47, "PENDING");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (short) -1);
        boolean boolean7 = booking6.isCheckedIn();
        java.lang.Class<?> wildcardClass8 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment((double) (byte) -1, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        double double13 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        boolean boolean24 = booking20.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking20.removeObserver(bookingObserver26);
        java.time.LocalDateTime localDateTime28 = booking20.getStartTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState29 = booking20.getState();
        double double30 = booking20.getHourlyRate();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking20.getState();
        booking6.setState(bookingState31);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver33 = null;
        booking6.addObserver(bookingObserver33);
        double double35 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState10 = booking6.getState();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.refund("hi!", (double) (short) -1);
        boolean boolean11 = creditCardPayment0.processPayment((double) (byte) -1, "Credit Card");
        boolean boolean14 = creditCardPayment0.processPayment((double) (-1), "Credit Card");
        boolean boolean17 = creditCardPayment0.processPayment(0.0d, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.forfeitDeposit();
        java.lang.String str10 = booking6.getUserId();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDateTime12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        boolean boolean7 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver8 = null;
        booking6.addObserver(bookingObserver8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("", (double) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        boolean boolean21 = booking17.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking17.getState();
        booking6.setState(bookingState22);
        java.time.LocalDateTime localDateTime24 = booking6.getEndTime();
        booking6.extend((int) '#');
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.yorku.roomscheduler.model.Booking booking18 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime15, localDateTime16, 0.0d);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setEndTime(localDateTime19);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking18.getState();
        java.time.LocalDateTime localDateTime22 = booking18.getEndTime();
        java.lang.String str23 = booking18.getBookingId();
        java.lang.String str24 = booking18.getRoomId();
        booking18.checkIn();
        booking18.forfeitDeposit();
        java.lang.String str27 = booking18.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState28 = booking18.getState();
        booking6.setState(bookingState28);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver40 = null;
        booking36.addObserver(bookingObserver40);
        booking36.extend((-1));
        booking36.extend((int) '#');
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        com.yorku.roomscheduler.model.Booking booking52 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime49, localDateTime50, 0.0d);
        java.time.LocalDateTime localDateTime53 = null;
        booking52.setEndTime(localDateTime53);
        java.time.LocalDateTime localDateTime55 = booking52.getStartTime();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        com.yorku.roomscheduler.model.Booking booking62 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime59, localDateTime60, 0.0d);
        java.time.LocalDateTime localDateTime63 = null;
        booking62.setEndTime(localDateTime63);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState65 = booking62.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver66 = null;
        booking62.addObserver(bookingObserver66);
        booking62.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        com.yorku.roomscheduler.model.Booking booking76 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime73, localDateTime74, 0.0d);
        java.time.LocalDateTime localDateTime77 = null;
        booking76.setEndTime(localDateTime77);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState79 = booking76.getState();
        boolean boolean80 = booking76.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState81 = booking76.getState();
        booking62.setState(bookingState81);
        booking52.setState(bookingState81);
        booking36.setState(bookingState81);
        booking6.setState(bookingState81);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNull(localDateTime55);
        org.junit.Assert.assertNotNull(bookingState65);
        org.junit.Assert.assertNotNull(bookingState79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(bookingState81);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.cancel();
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.refund("hi!", (double) (short) -1);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.processPayment((double) (short) -1, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        double double12 = booking6.getTotalCost();
        java.lang.String str13 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        double double13 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        boolean boolean24 = booking20.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking20.removeObserver(bookingObserver26);
        java.time.LocalDateTime localDateTime28 = booking20.getStartTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState29 = booking20.getState();
        double double30 = booking20.getHourlyRate();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking20.getState();
        booking6.setState(bookingState31);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver33 = null;
        booking6.addObserver(bookingObserver33);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertNotNull(bookingState35);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        booking6.setHourlyRate((double) 1.0f);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.extend((int) ' ');
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "", localDateTime3, localDateTime4, (double) (byte) 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        booking6.complete();
        double double18 = booking6.getTotalCost();
        java.lang.String str19 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        booking6.confirmBooking();
        booking6.complete();
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.yorku.roomscheduler.model.Booking booking18 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime15, localDateTime16, 0.0d);
        booking18.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus20 = booking18.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        booking18.setEndTime(localDateTime21);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        boolean boolean33 = booking29.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking29.getState();
        booking18.setState(bookingState34);
        booking6.setState(bookingState34);
        java.lang.String str37 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime10 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        java.lang.String str12 = booking6.getBookingId();
        java.lang.Class<?> wildcardClass13 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        booking6.extend((int) '#');
        booking6.complete();
        booking6.setHourlyRate((double) 10);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.lang.String str12 = booking6.getUserId();
        java.lang.String str13 = booking6.getBookingId();
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        java.lang.String str20 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking6.getState();
        booking6.complete();
        boolean boolean23 = booking6.isCheckedIn();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        java.lang.String str12 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        java.lang.String str8 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        booking6.confirmBooking();
        double double18 = booking6.getHourlyRate();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        booking6.forfeitDeposit();
        booking6.forfeitDeposit();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.cancel();
        booking6.extend((int) '#');
        booking6.cancel();
        java.lang.Class<?> wildcardClass15 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.checkIn();
        java.lang.String str12 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.removeObserver(bookingObserver13);
        booking6.extend(0);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking17.addObserver(bookingObserver21);
        booking17.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking17.getState();
        booking6.setState(bookingState25);
        double double27 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        boolean boolean12 = booking6.isCheckedIn();
        booking6.extend((int) '4');
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) 1.0f);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver8 = null;
        booking6.removeObserver(bookingObserver8);
        java.lang.Class<?> wildcardClass10 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Credit Card", (double) (-1.0f));
        boolean boolean12 = creditCardPayment0.processPayment((double) 0, "Credit Card");
        boolean boolean15 = creditCardPayment0.refund("hi!", (double) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getTotalCost();
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.yorku.roomscheduler.model.Booking booking21 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime18, localDateTime19, 0.0d);
        booking21.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus23 = booking21.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        booking21.setEndTime(localDateTime24);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.yorku.roomscheduler.model.Booking booking32 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime29, localDateTime30, 0.0d);
        java.time.LocalDateTime localDateTime33 = null;
        booking32.setEndTime(localDateTime33);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking32.getState();
        boolean boolean36 = booking32.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState37 = booking32.getState();
        booking21.setState(bookingState37);
        booking6.setState(bookingState37);
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus23.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingState37);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        boolean boolean9 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.yorku.roomscheduler.model.Booking booking16 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime13, localDateTime14, 0.0d);
        booking16.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking16.getStatus();
        java.time.LocalDateTime localDateTime19 = null;
        booking16.setEndTime(localDateTime19);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.yorku.roomscheduler.model.Booking booking27 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime24, localDateTime25, 0.0d);
        java.time.LocalDateTime localDateTime28 = null;
        booking27.setEndTime(localDateTime28);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState30 = booking27.getState();
        boolean boolean31 = booking27.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking27.getState();
        booking16.setState(bookingState32);
        booking6.setState(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment(0.0d, "hi!");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.lang.String str20 = booking19.getUserId();
        booking19.confirmBooking();
        java.lang.String str22 = booking19.getBookingId();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime27, localDateTime28, 0.0d);
        java.time.LocalDateTime localDateTime31 = null;
        booking30.setEndTime(localDateTime31);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking30.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver34 = null;
        booking30.addObserver(bookingObserver34);
        booking30.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking30.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.yorku.roomscheduler.model.Booking booking47 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime44, localDateTime45, 0.0d);
        java.time.LocalDateTime localDateTime48 = null;
        booking47.setEndTime(localDateTime48);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState50 = booking47.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver51 = null;
        booking47.addObserver(bookingObserver51);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        com.yorku.roomscheduler.model.Booking booking59 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime56, localDateTime57, 0.0d);
        booking59.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus61 = booking59.getStatus();
        java.time.LocalDateTime localDateTime62 = null;
        booking59.setEndTime(localDateTime62);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        com.yorku.roomscheduler.model.Booking booking70 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime67, localDateTime68, 0.0d);
        java.time.LocalDateTime localDateTime71 = null;
        booking70.setEndTime(localDateTime71);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState73 = booking70.getState();
        boolean boolean74 = booking70.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState75 = booking70.getState();
        booking59.setState(bookingState75);
        booking47.setState(bookingState75);
        booking6.setState(bookingState75);
        boolean boolean79 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus61.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        java.lang.String str7 = booking6.getRoomId();
        java.lang.String str8 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        boolean boolean9 = booking6.isCheckedIn();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking17.addObserver(bookingObserver21);
        booking17.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking17.getState();
        booking6.setState(bookingState25);
        double double27 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime28 = booking6.getEndTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(localDateTime28);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.removeObserver(bookingObserver13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        java.lang.String str14 = booking6.getRoomId();
        booking6.complete();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getCurrentStateName();
        java.lang.String str14 = booking6.getUserId();
        java.lang.String str15 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PENDING" + "'", str15, "PENDING");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        java.lang.String str14 = booking6.getUserId();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        java.lang.String str16 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        booking6.extend((int) (short) -1);
        java.lang.String str15 = booking6.getCurrentStateName();
        java.lang.String str16 = booking6.getUserId();
        double double17 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PENDING" + "'", str15, "PENDING");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState18);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        java.lang.Class<?> wildcardClass12 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.setHourlyRate((-1.0d));
        booking6.confirmBooking();
        java.lang.String str18 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PENDING" + "'", str18, "PENDING");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.Class<?> wildcardClass12 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.addObserver(bookingObserver7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "", "hi!", localDateTime3, localDateTime4, (double) 0L);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        java.lang.String str13 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime17, localDateTime18, (double) '4');
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.yorku.roomscheduler.model.Booking booking27 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime24, localDateTime25, 0.0d);
        booking27.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus29 = booking27.getStatus();
        java.time.LocalDateTime localDateTime30 = null;
        booking27.setEndTime(localDateTime30);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.yorku.roomscheduler.model.Booking booking38 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime35, localDateTime36, 0.0d);
        java.time.LocalDateTime localDateTime39 = null;
        booking38.setEndTime(localDateTime39);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState41 = booking38.getState();
        boolean boolean42 = booking38.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState43 = booking38.getState();
        booking27.setState(bookingState43);
        booking20.setState(bookingState43);
        booking6.setState(bookingState43);
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus29.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingState43);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        double double12 = booking6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "PENDING", "Credit Card", localDateTime3, localDateTime4, (double) '#');
        booking6.confirmBooking();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState10 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(bookingState10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime13 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "hi!", "", localDateTime3, localDateTime4, (double) '4');
        booking6.cancel();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver24 = null;
        booking20.addObserver(bookingObserver24);
        booking20.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState28 = booking20.getState();
        booking6.setState(bookingState28);
        booking6.extend(0);
        java.time.LocalDateTime localDateTime32 = null;
        booking6.setEndTime(localDateTime32);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState28);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.lang.String str12 = booking6.getUserId();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        java.lang.String str20 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking6.getState();
        booking6.complete();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.lang.String str11 = booking6.getUserId();
        boolean boolean12 = booking6.isCheckedIn();
        booking6.checkIn();
        java.lang.String str14 = booking6.getUserId();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        double double13 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.addObserver(bookingObserver7);
        // The following exception was thrown during execution in test generation
        try {
            booking6.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getRoomId();
        java.lang.String str16 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        booking6.confirmBooking();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        // The following exception was thrown during execution in test generation
        try {
            booking6.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        java.lang.String str11 = booking6.getRoomId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus13 = booking6.getStatus();
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED + "'", bookingStatus13.equals(com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) (byte) 1);
        boolean boolean7 = creditCardPayment0.refund("", (double) ' ');
        boolean boolean10 = creditCardPayment0.processPayment((double) ' ', "hi!");
        boolean boolean13 = creditCardPayment0.refund("CANCELLED", (double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.complete();
        java.lang.String str16 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) (byte) 1);
        boolean boolean7 = creditCardPayment0.refund("", (double) ' ');
        boolean boolean10 = creditCardPayment0.processPayment(1.0d, "PENDING");
        boolean boolean13 = creditCardPayment0.processPayment((double) 0, "");
        boolean boolean16 = creditCardPayment0.refund("PENDING", (double) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        booking6.setHourlyRate(0.0d);
        java.lang.String str9 = booking6.getRoomId();
        java.lang.String str10 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime13 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        double double9 = booking6.getTotalCost();
        java.lang.String str10 = booking6.getUserId();
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        boolean boolean10 = creditCardPayment0.refund("CANCELLED", (double) 100);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.addObserver(bookingObserver7);
        booking6.setHourlyRate((double) (-1.0f));
        booking6.setHourlyRate((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        boolean boolean13 = creditCardPayment0.processPayment((double) 10.0f, "PENDING");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        boolean boolean17 = creditCardPayment0.processPayment(10.0d, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        java.lang.String str14 = booking6.getRoomId();
        boolean boolean15 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.lang.String str17 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.yorku.roomscheduler.model.Booking booking25 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime22, localDateTime23, 0.0d);
        java.time.LocalDateTime localDateTime26 = null;
        booking25.setEndTime(localDateTime26);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState28 = booking25.getState();
        boolean boolean29 = booking25.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState30 = booking25.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver31 = null;
        booking25.removeObserver(bookingObserver31);
        java.time.LocalDateTime localDateTime33 = booking25.getStartTime();
        java.time.LocalDateTime localDateTime34 = booking25.getStartTime();
        java.time.LocalDateTime localDateTime35 = booking25.getEndTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking25.getState();
        booking6.setState(bookingState36);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver38 = null;
        booking6.addObserver(bookingObserver38);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState40 = booking6.getState();
        booking6.setHourlyRate((double) 0L);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNull(localDateTime33);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState40);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.lang.String str12 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking17.addObserver(bookingObserver21);
        booking17.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking17.getState();
        booking6.setState(bookingState25);
        booking6.setHourlyRate((double) (byte) 1);
        booking6.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState25);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "CANCELLED", "PENDING", localDateTime3, localDateTime4, (double) 100L);
        booking6.confirmBooking();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.complete();
        boolean boolean13 = booking6.isCheckedIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.extend((int) ' ');
        java.lang.String str12 = booking6.getRoomId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.addObserver(bookingObserver13);
        java.lang.Class<?> wildcardClass15 = booking6.getClass();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "CANCELLED", localDateTime3, localDateTime4, (double) 100.0f);
        booking6.checkIn();
        java.lang.String str8 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        booking6.setHourlyRate((double) (short) -1);
        double double9 = booking6.getTotalCost();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Credit Card", (double) (short) 0);
        boolean boolean12 = creditCardPayment0.refund("hi!", (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        boolean boolean10 = creditCardPayment0.refund("PENDING", (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.String str15 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.yorku.roomscheduler.model.Booking booking25 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime22, localDateTime23, 0.0d);
        java.time.LocalDateTime localDateTime26 = null;
        booking25.setEndTime(localDateTime26);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState28 = booking25.getState();
        boolean boolean29 = booking25.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState30 = booking25.getState();
        java.lang.String str31 = booking25.getRoomId();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.yorku.roomscheduler.model.Booking booking38 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime35, localDateTime36, 0.0d);
        java.time.LocalDateTime localDateTime39 = null;
        booking38.setEndTime(localDateTime39);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState41 = booking38.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver42 = null;
        booking38.addObserver(bookingObserver42);
        booking38.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        com.yorku.roomscheduler.model.Booking booking52 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime49, localDateTime50, 0.0d);
        java.time.LocalDateTime localDateTime53 = null;
        booking52.setEndTime(localDateTime53);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState55 = booking52.getState();
        boolean boolean56 = booking52.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState57 = booking52.getState();
        booking38.setState(bookingState57);
        booking25.setState(bookingState57);
        booking6.setState(bookingState57);
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(bookingState57);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (short) -1);
        boolean boolean7 = booking6.isCheckedIn();
        booking6.extend((int) '#');
        booking6.extend((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        double double16 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime17 = null;
        booking6.setEndTime(localDateTime17);
        booking6.setHourlyRate((double) '#');
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        booking6.cancel();
        boolean boolean14 = booking6.isCheckedIn();
        java.lang.String str15 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        booking6.confirmBooking();
        double double18 = booking6.getHourlyRate();
        double double19 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        double double16 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        booking6.extend((int) (short) -1);
        java.lang.String str15 = booking6.getCurrentStateName();
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PENDING" + "'", str15, "PENDING");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        booking6.setHourlyRate((double) (-1));
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver9 = null;
        booking6.addObserver(bookingObserver9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        java.lang.String str20 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking6.getState();
        booking6.complete();
        boolean boolean23 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime27, localDateTime28, 0.0d);
        java.time.LocalDateTime localDateTime31 = null;
        booking30.setEndTime(localDateTime31);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking30.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver34 = null;
        booking30.addObserver(bookingObserver34);
        booking30.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        com.yorku.roomscheduler.model.Booking booking44 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime41, localDateTime42, 0.0d);
        java.time.LocalDateTime localDateTime45 = null;
        booking44.setEndTime(localDateTime45);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState47 = booking44.getState();
        boolean boolean48 = booking44.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState49 = booking44.getState();
        booking30.setState(bookingState49);
        java.lang.String str51 = booking30.getRoomId();
        booking30.extend(0);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver54 = null;
        booking30.addObserver(bookingObserver54);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState56 = booking30.getState();
        booking6.setState(bookingState56);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(bookingState56);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking22.addObserver(bookingObserver26);
        booking22.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver40 = null;
        booking36.addObserver(bookingObserver40);
        booking36.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState44 = booking36.getState();
        booking22.setState(bookingState44);
        booking6.setState(bookingState44);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus47 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertTrue("'" + bookingStatus47 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus47.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.lang.String str20 = booking19.getUserId();
        booking19.confirmBooking();
        java.lang.String str22 = booking19.getBookingId();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime27, localDateTime28, 0.0d);
        java.time.LocalDateTime localDateTime31 = null;
        booking30.setEndTime(localDateTime31);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking30.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver34 = null;
        booking30.addObserver(bookingObserver34);
        booking30.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking30.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.yorku.roomscheduler.model.Booking booking47 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime44, localDateTime45, 0.0d);
        java.time.LocalDateTime localDateTime48 = null;
        booking47.setEndTime(localDateTime48);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState50 = booking47.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver51 = null;
        booking47.addObserver(bookingObserver51);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        com.yorku.roomscheduler.model.Booking booking59 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime56, localDateTime57, 0.0d);
        booking59.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus61 = booking59.getStatus();
        java.time.LocalDateTime localDateTime62 = null;
        booking59.setEndTime(localDateTime62);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        com.yorku.roomscheduler.model.Booking booking70 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime67, localDateTime68, 0.0d);
        java.time.LocalDateTime localDateTime71 = null;
        booking70.setEndTime(localDateTime71);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState73 = booking70.getState();
        boolean boolean74 = booking70.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState75 = booking70.getState();
        booking59.setState(bookingState75);
        booking47.setState(bookingState75);
        booking6.setState(bookingState75);
        java.time.LocalDateTime localDateTime79 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus61.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertNull(localDateTime79);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        booking6.cancel();
        booking6.complete();
        java.lang.String str11 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CANCELLED" + "'", str11, "CANCELLED");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "PENDING", "CANCELLED", localDateTime3, localDateTime4, (double) '#');
        booking6.setHourlyRate(10.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        booking6.setHourlyRate((double) (-1));
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver9 = null;
        booking6.removeObserver(bookingObserver9);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        booking17.forfeitDeposit();
        booking17.setHourlyRate((double) '4');
        java.lang.String str24 = booking17.getBookingId();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.yorku.roomscheduler.model.Booking booking31 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime28, localDateTime29, (double) '4');
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.yorku.roomscheduler.model.Booking booking38 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime35, localDateTime36, 0.0d);
        booking38.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus40 = booking38.getStatus();
        java.time.LocalDateTime localDateTime41 = null;
        booking38.setEndTime(localDateTime41);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        com.yorku.roomscheduler.model.Booking booking49 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime46, localDateTime47, 0.0d);
        java.time.LocalDateTime localDateTime50 = null;
        booking49.setEndTime(localDateTime50);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState52 = booking49.getState();
        boolean boolean53 = booking49.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState54 = booking49.getState();
        booking38.setState(bookingState54);
        booking31.setState(bookingState54);
        booking17.setState(bookingState54);
        booking6.setState(bookingState54);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus40 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus40.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(bookingState54);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("CANCELLED", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        booking6.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        java.time.LocalDateTime localDateTime24 = booking20.getEndTime();
        java.lang.String str25 = booking20.getCurrentStateName();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.yorku.roomscheduler.model.Booking booking32 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime29, localDateTime30, 0.0d);
        java.time.LocalDateTime localDateTime33 = null;
        booking32.setEndTime(localDateTime33);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking32.getState();
        java.time.LocalDateTime localDateTime36 = booking32.getEndTime();
        java.lang.String str37 = booking32.getBookingId();
        java.lang.String str38 = booking32.getRoomId();
        booking32.checkIn();
        booking32.forfeitDeposit();
        java.lang.String str41 = booking32.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState42 = booking32.getState();
        booking20.setState(bookingState42);
        booking6.setState(bookingState42);
        java.lang.String str45 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PENDING" + "'", str25, "PENDING");
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "hi!", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.setHourlyRate((double) 1L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus9 = booking6.getStatus();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus9.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.setHourlyRate((double) (-1L));
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (double) 10L);
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.yorku.roomscheduler.model.Booking booking16 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime13, localDateTime14, 0.0d);
        java.time.LocalDateTime localDateTime17 = null;
        booking16.setEndTime(localDateTime17);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState19 = booking16.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver20 = null;
        booking16.addObserver(bookingObserver20);
        booking16.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime27, localDateTime28, 0.0d);
        java.time.LocalDateTime localDateTime31 = null;
        booking30.setEndTime(localDateTime31);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking30.getState();
        boolean boolean34 = booking30.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking30.getState();
        booking16.setState(bookingState35);
        booking6.setState(bookingState35);
        java.time.LocalDateTime localDateTime38 = null;
        booking6.setEndTime(localDateTime38);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookingState35);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime10 = null;
        booking6.setEndTime(localDateTime10);
        boolean boolean12 = booking6.isCheckedIn();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.lang.String str11 = booking6.getUserId();
        boolean boolean12 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        boolean boolean23 = booking19.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState24 = booking19.getState();
        java.lang.String str25 = booking19.getRoomId();
        java.lang.String str26 = booking19.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking19.getState();
        booking6.setState(bookingState27);
        java.lang.String str29 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.refund("hi!", (double) (short) -1);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.setHourlyRate((double) (-1.0f));
        java.lang.String str22 = booking6.getBookingId();
        booking6.extend((int) (byte) 10);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus25 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus25.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.roomscheduler.model.Booking booking15 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime12, localDateTime13, 0.0d);
        booking15.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking15.getStatus();
        java.time.LocalDateTime localDateTime18 = null;
        booking15.setEndTime(localDateTime18);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.roomscheduler.model.Booking booking26 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime23, localDateTime24, 0.0d);
        java.time.LocalDateTime localDateTime27 = null;
        booking26.setEndTime(localDateTime27);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState29 = booking26.getState();
        boolean boolean30 = booking26.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking26.getState();
        booking15.setState(bookingState31);
        booking6.setState(bookingState31);
        booking6.cancel();
        booking6.confirmBooking();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookingState31);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        boolean boolean14 = booking6.isCheckedIn();
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        booking6.confirmBooking();
        boolean boolean13 = booking6.isCheckedIn();
        booking6.setHourlyRate((double) 'a');
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.setHourlyRate((-1.0d));
        booking6.confirmBooking();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        booking6.checkIn();
        booking6.setHourlyRate((double) 1L);
        java.time.LocalDateTime localDateTime12 = null;
        booking6.setEndTime(localDateTime12);
        double double14 = booking6.getTotalCost();
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getBookingId();
        booking6.complete();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState10 = booking6.getState();
        java.lang.Class<?> wildcardClass11 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        boolean boolean24 = booking20.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        booking6.setState(bookingState25);
        java.lang.String str27 = booking6.getRoomId();
        booking6.complete();
        booking6.extend((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        double double15 = booking6.getTotalCost();
        booking6.forfeitDeposit();
        java.lang.String str17 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CANCELLED" + "'", str17, "CANCELLED");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.lang.String str13 = booking6.getBookingId();
        booking6.forfeitDeposit();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        booking6.extend((int) '#');
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        booking6.complete();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        boolean boolean19 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean14 = creditCardPayment0.processPayment((double) (-1), "");
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        boolean boolean18 = creditCardPayment0.refund("", (double) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime16 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
        java.time.LocalDateTime localDateTime18 = booking6.getStartTime();
        java.lang.String str19 = booking6.getUserId();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.complete();
        java.time.LocalDateTime localDateTime13 = booking6.getEndTime();
        booking6.confirmBooking();
        java.lang.String str15 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        booking13.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        booking13.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        com.yorku.roomscheduler.model.Booking booking24 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime21, localDateTime22, 0.0d);
        java.time.LocalDateTime localDateTime25 = null;
        booking24.setEndTime(localDateTime25);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking24.getState();
        boolean boolean28 = booking24.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState29 = booking24.getState();
        booking13.setState(bookingState29);
        booking6.setState(bookingState29);
        java.lang.String str32 = booking6.getRoomId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver33 = null;
        booking6.addObserver(bookingObserver33);
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        double double15 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        java.time.LocalDateTime localDateTime17 = null;
        booking6.setEndTime(localDateTime17);
        boolean boolean19 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        booking6.extend((int) '#');
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.removeObserver(bookingObserver16);
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking6.removeObserver(bookingObserver19);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        booking6.cancel();
        booking6.cancel();
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        boolean boolean10 = creditCardPayment0.refund("Credit Card", (double) 100.0f);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, 10.0d);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getCurrentStateName();
        booking6.setHourlyRate((double) 10.0f);
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.lang.String str9 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.time.LocalDateTime localDateTime11 = booking6.getEndTime();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getTotalCost();
        java.lang.String str14 = booking6.getUserId();
        booking6.forfeitDeposit();
        java.lang.String str16 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.complete();
        boolean boolean13 = booking6.isCheckedIn();
        boolean boolean14 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.addObserver(bookingObserver15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        boolean boolean10 = creditCardPayment0.refund("Credit Card", (double) 'a');
        boolean boolean13 = creditCardPayment0.refund("hi!", (double) 100.0f);
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        booking6.checkIn();
        java.lang.String str10 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        boolean boolean24 = booking20.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        booking6.setState(bookingState25);
        java.lang.String str27 = booking6.getRoomId();
        booking6.complete();
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (-1.0f));
        double double7 = booking6.getTotalCost();
        booking6.checkIn();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        booking6.cancel();
        booking6.cancel();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        booking6.extend(100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        java.lang.String str8 = booking6.getCurrentStateName();
        booking6.confirmBooking();
        booking6.cancel();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "PENDING", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = booking6.getEndTime();
        java.lang.String str8 = booking6.getCurrentStateName();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime12 = booking6.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime13 = booking6.getEndTime();
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getUserId();
        booking6.confirmBooking();
        boolean boolean13 = booking6.isCheckedIn();
        booking6.setHourlyRate((double) 'a');
        java.lang.String str16 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        booking6.cancel();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.yorku.roomscheduler.model.Booking booking23 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime20, localDateTime21, (double) 10.0f);
        booking23.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking23.getState();
        booking6.setState(bookingState25);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState25);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        booking6.cancel();
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        java.lang.String str15 = booking6.getRoomId();
        booking6.complete();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
        java.time.LocalDateTime localDateTime18 = null;
        booking6.setEndTime(localDateTime18);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        booking6.forfeitDeposit();
        booking6.complete();
        booking6.confirmBooking();
        java.lang.String str16 = booking6.getBookingId();
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        booking6.extend((int) (short) 1);
        booking6.setHourlyRate((double) (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) -1, "hi!");
        java.lang.String str16 = creditCardPayment0.getPaymentMethodName();
        boolean boolean19 = creditCardPayment0.refund("CANCELLED", (double) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getTotalCost();
        double double14 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.String str15 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState15 = booking6.getState();
        double double16 = booking6.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.cancel();
        double double12 = booking6.getTotalCost();
        double double13 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState15 = booking6.getState();
        double double16 = booking6.getHourlyRate();
        double double17 = booking6.getHourlyRate();
        booking6.complete();
        java.lang.Class<?> wildcardClass19 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = booking6.getEndTime();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        double double15 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        boolean boolean17 = booking6.isCheckedIn();
        booking6.cancel();
        boolean boolean19 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        java.lang.String str8 = booking6.getCurrentStateName();
        double double9 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.yorku.roomscheduler.model.Booking booking16 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime13, localDateTime14, 0.0d);
        java.time.LocalDateTime localDateTime17 = null;
        booking16.setEndTime(localDateTime17);
        double double19 = booking16.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus20 = booking16.getStatus();
        java.lang.String str21 = booking16.getUserId();
        java.lang.String str22 = booking16.getBookingId();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        booking29.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus31 = booking29.getStatus();
        java.time.LocalDateTime localDateTime32 = null;
        booking29.setEndTime(localDateTime32);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        com.yorku.roomscheduler.model.Booking booking40 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime37, localDateTime38, 0.0d);
        java.time.LocalDateTime localDateTime41 = null;
        booking40.setEndTime(localDateTime41);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState43 = booking40.getState();
        boolean boolean44 = booking40.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState45 = booking40.getState();
        booking29.setState(bookingState45);
        booking16.setState(bookingState45);
        booking6.setState(bookingState45);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus31.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(bookingState45);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        java.lang.String str9 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("CANCELLED", (double) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.complete();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime20 = booking6.getStartTime();
        boolean boolean21 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getCurrentStateName();
        java.lang.String str9 = booking6.getRoomId();
        booking6.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        boolean boolean14 = booking6.isCheckedIn();
        java.lang.String str15 = booking6.getBookingId();
        java.lang.String str16 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime17 = booking6.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking6.confirmBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        java.lang.String str11 = booking6.getRoomId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getEndTime();
        java.lang.String str15 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        booking6.confirmBooking();
        java.lang.String str10 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        booking6.forfeitDeposit();
        java.lang.String str12 = booking6.getUserId();
        java.lang.String str13 = booking6.getCurrentStateName();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (byte) 1);
        booking6.confirmBooking();
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("", (double) 100);
        boolean boolean10 = creditCardPayment0.refund("PENDING", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        java.lang.String str15 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            booking6.setState(bookingState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.state.BookingState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        java.lang.String str7 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean14 = creditCardPayment0.processPayment((double) 0L, "PENDING");
        boolean boolean17 = creditCardPayment0.processPayment((double) 10L, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.lang.String str9 = booking6.getCurrentStateName();
        java.lang.String str10 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.extend(0);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        boolean boolean13 = booking6.isCheckedIn();
        java.lang.String str14 = booking6.getBookingId();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "CANCELLED", "CANCELLED", localDateTime3, localDateTime4, (double) 100L);
        boolean boolean7 = booking6.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getTotalCost();
        booking6.cancel();
        double double15 = booking6.getHourlyRate();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, 1.0d);
        java.lang.String str7 = booking6.getCurrentStateName();
        booking6.extend((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.setHourlyRate((double) (-1L));
        booking6.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        boolean boolean8 = booking6.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("PENDING", 0.0d);
        boolean boolean6 = creditCardPayment0.refund("PENDING", 100.0d);
        boolean boolean9 = creditCardPayment0.processPayment((double) (short) 10, "CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        booking6.forfeitDeposit();
        java.lang.String str17 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.lang.String str17 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        booking6.confirmBooking();
        java.lang.String str20 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.roomscheduler.model.Booking booking15 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime12, localDateTime13, 0.0d);
        booking15.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking15.getStatus();
        java.time.LocalDateTime localDateTime18 = null;
        booking15.setEndTime(localDateTime18);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.roomscheduler.model.Booking booking26 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime23, localDateTime24, 0.0d);
        java.time.LocalDateTime localDateTime27 = null;
        booking26.setEndTime(localDateTime27);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState29 = booking26.getState();
        boolean boolean30 = booking26.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking26.getState();
        booking15.setState(bookingState31);
        booking6.setState(bookingState31);
        java.time.LocalDateTime localDateTime34 = booking6.getEndTime();
        java.lang.String str35 = booking6.getUserId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getUserId();
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.complete();
        boolean boolean13 = booking6.isCheckedIn();
        booking6.confirmBooking();
        boolean boolean15 = booking6.isCheckedIn();
        double double16 = booking6.getTotalCost();
        double double17 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        booking6.setEndTime(localDateTime12);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        java.lang.String str15 = booking6.getRoomId();
        java.lang.String str16 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.extend((int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment(1.0d, "");
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.yorku.roomscheduler.model.Booking booking33 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime30, localDateTime31, 0.0d);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setEndTime(localDateTime34);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking33.getState();
        boolean boolean37 = booking33.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState38 = booking33.getState();
        booking19.setState(bookingState38);
        booking6.setState(bookingState38);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver41 = null;
        booking6.addObserver(bookingObserver41);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState43 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState43);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        boolean boolean16 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        booking6.setEndTime(localDateTime12);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        java.lang.String str15 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        booking6.extend(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        double double16 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime17 = null;
        booking6.setEndTime(localDateTime17);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus19 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus19.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        booking6.confirmBooking();
        java.lang.String str13 = booking6.getBookingId();
        java.lang.String str14 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getCurrentStateName();
        booking6.extend((int) (short) 0);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) 100.0f);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        booking6.confirmBooking();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.extend((int) (byte) 0);
        java.lang.String str13 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        double double11 = booking6.getHourlyRate();
        booking6.cancel();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus13 = booking6.getStatus();
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState15 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus13.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(bookingState15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (-1.0f));
        double double7 = booking6.getTotalCost();
        java.lang.String str8 = booking6.getCurrentStateName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        boolean boolean16 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        boolean boolean13 = booking6.isCheckedIn();
        boolean boolean14 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime15 = null;
        booking6.setEndTime(localDateTime15);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Credit Card", (double) (short) 0);
        boolean boolean12 = creditCardPayment0.processPayment((double) 1.0f, "hi!");
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        java.lang.String str14 = booking6.getRoomId();
        boolean boolean15 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        java.lang.Class<?> wildcardClass17 = bookingState16.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        java.time.LocalDateTime localDateTime17 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getCurrentStateName();
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.addObserver(bookingObserver15);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        booking6.extend((-1));
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.lang.String str9 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.removeObserver(bookingObserver10);
        boolean boolean12 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.addObserver(bookingObserver13);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime11 = booking6.getEndTime();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.removeObserver(bookingObserver13);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        booking6.forfeitDeposit();
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        double double12 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "", "PENDING", localDateTime3, localDateTime4, (double) (byte) 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.lang.String str17 = booking6.getRoomId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver18 = null;
        booking6.addObserver(bookingObserver18);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.roomscheduler.model.Booking booking26 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime23, localDateTime24, 0.0d);
        booking26.confirmBooking();
        java.time.LocalDateTime localDateTime28 = booking26.getStartTime();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        com.yorku.roomscheduler.model.Booking booking35 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime32, localDateTime33, 0.0d);
        booking35.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus37 = booking35.getStatus();
        java.time.LocalDateTime localDateTime38 = null;
        booking35.setEndTime(localDateTime38);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        com.yorku.roomscheduler.model.Booking booking46 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime43, localDateTime44, 0.0d);
        java.time.LocalDateTime localDateTime47 = null;
        booking46.setEndTime(localDateTime47);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState49 = booking46.getState();
        boolean boolean50 = booking46.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking46.getState();
        booking35.setState(bookingState51);
        booking26.setState(bookingState51);
        booking6.setState(bookingState51);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver55 = null;
        booking6.addObserver(bookingObserver55);
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        com.yorku.roomscheduler.model.Booking booking63 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime60, localDateTime61, (double) 10.0f);
        booking63.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState65 = booking63.getState();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState66 = booking63.getState();
        booking6.setState(bookingState66);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus37.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNotNull(bookingState65);
        org.junit.Assert.assertNotNull(bookingState66);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        boolean boolean10 = creditCardPayment0.refund("PENDING", (double) (-1L));
        boolean boolean13 = creditCardPayment0.processPayment((double) '4', "hi!");
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime10 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        java.lang.String str20 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking6.getState();
        booking6.complete();
        boolean boolean23 = booking6.isCheckedIn();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.lang.String str11 = booking6.getCurrentStateName();
        java.lang.String str12 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.removeObserver(bookingObserver10);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        booking6.setHourlyRate((double) 100);
        booking6.extend(100);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        booking6.setHourlyRate(10.0d);
        double double15 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        booking6.extend(0);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.yorku.roomscheduler.model.Booking booking18 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime15, localDateTime16, 0.0d);
        booking18.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus20 = booking18.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        booking18.setEndTime(localDateTime21);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        boolean boolean33 = booking29.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking29.getState();
        booking18.setState(bookingState34);
        booking6.setState(bookingState34);
        boolean boolean37 = booking6.isCheckedIn();
        java.lang.String str38 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.extend((int) (byte) -1);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState12 = booking6.getState();
        booking6.setHourlyRate((double) 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(bookingState12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.lang.String str12 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.removeObserver(bookingObserver13);
        boolean boolean15 = booking6.isCheckedIn();
        double double16 = booking6.getHourlyRate();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment(1.0d, "Credit Card");
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Credit Card", 0.0d);
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        java.lang.String str15 = booking6.getBookingId();
        double double16 = booking6.getTotalCost();
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        java.lang.String str20 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime21 = booking6.getStartTime();
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        booking6.setHourlyRate((double) (short) 0);
        booking6.complete();
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getUserId();
        booking6.setHourlyRate((double) (byte) 100);
        double double10 = booking6.getHourlyRate();
        boolean boolean11 = booking6.isCheckedIn();
        java.lang.String str12 = booking6.getBookingId();
        java.lang.String str13 = booking6.getUserId();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.String str15 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        java.lang.String str17 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.cancel();
        booking6.extend((int) '#');
        booking6.cancel();
        booking6.setHourlyRate((double) (short) 100);
        booking6.setHourlyRate((double) 1L);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.extend((-1));
        boolean boolean14 = booking6.isCheckedIn();
        double double15 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        double double17 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        booking6.setHourlyRate((double) 100);
        double double19 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState20);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        java.lang.String str8 = booking6.getCurrentStateName();
        booking6.extend((int) (short) 100);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getTotalCost();
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.yorku.roomscheduler.model.Booking booking21 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime18, localDateTime19, 0.0d);
        booking21.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus23 = booking21.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        booking21.setEndTime(localDateTime24);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.yorku.roomscheduler.model.Booking booking32 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime29, localDateTime30, 0.0d);
        java.time.LocalDateTime localDateTime33 = null;
        booking32.setEndTime(localDateTime33);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking32.getState();
        boolean boolean36 = booking32.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState37 = booking32.getState();
        booking21.setState(bookingState37);
        booking6.setState(bookingState37);
        java.lang.String str40 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus41 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus23.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PENDING" + "'", str40, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus41 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus41.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        java.lang.String str14 = booking6.getBookingId();
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.lang.String str17 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        java.time.LocalDateTime localDateTime19 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.setHourlyRate((double) (byte) 0);
        double double14 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.String str15 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking6.removeObserver(bookingObserver19);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.lang.String str17 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        boolean boolean9 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.removeObserver(bookingObserver10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        double double13 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver24 = null;
        booking20.addObserver(bookingObserver24);
        booking20.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.yorku.roomscheduler.model.Booking booking34 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime31, localDateTime32, 0.0d);
        java.time.LocalDateTime localDateTime35 = null;
        booking34.setEndTime(localDateTime35);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState37 = booking34.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver38 = null;
        booking34.addObserver(bookingObserver38);
        booking34.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState42 = booking34.getState();
        booking20.setState(bookingState42);
        booking6.setState(bookingState42);
        java.lang.String str45 = booking6.getBookingId();
        java.lang.String str46 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        booking6.extend((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("PENDING", 0.0d);
        boolean boolean6 = creditCardPayment0.refund("PENDING", 100.0d);
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.checkIn();
        java.lang.String str21 = booking6.getUserId();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getCurrentStateName();
        java.lang.String str9 = booking6.getRoomId();
        booking6.setHourlyRate((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("hi!", (double) '#');
        boolean boolean18 = creditCardPayment0.refund("", (double) (-1));
        java.lang.String str19 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Credit Card" + "'", str19, "Credit Card");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getUserId();
        double double8 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.processPayment((double) 'a', "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment(1.0d, "hi!");
        boolean boolean13 = creditCardPayment0.refund("Credit Card", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean10 = creditCardPayment0.refund("", (double) '#');
        boolean boolean13 = creditCardPayment0.refund("Credit Card", (double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("", (double) (short) 10);
        boolean boolean8 = creditCardPayment0.processPayment(10.0d, "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getCurrentStateName();
        booking6.setHourlyRate((double) 10.0f);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.complete();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus13 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus13.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.yorku.roomscheduler.model.Booking booking18 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime15, localDateTime16, 0.0d);
        booking18.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus20 = booking18.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        booking18.setEndTime(localDateTime21);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        boolean boolean33 = booking29.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking29.getState();
        booking18.setState(bookingState34);
        booking6.setState(bookingState34);
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime14, localDateTime15, 0.0d);
        java.time.LocalDateTime localDateTime18 = null;
        booking17.setEndTime(localDateTime18);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking17.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking17.addObserver(bookingObserver21);
        booking17.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking17.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver26 = null;
        booking17.addObserver(bookingObserver26);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.yorku.roomscheduler.model.Booking booking34 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime31, localDateTime32, 0.0d);
        java.time.LocalDateTime localDateTime35 = null;
        booking34.setEndTime(localDateTime35);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState37 = booking34.getState();
        java.time.LocalDateTime localDateTime38 = booking34.getEndTime();
        java.lang.String str39 = booking34.getCurrentStateName();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        com.yorku.roomscheduler.model.Booking booking46 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime43, localDateTime44, 0.0d);
        java.time.LocalDateTime localDateTime47 = null;
        booking46.setEndTime(localDateTime47);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState49 = booking46.getState();
        java.time.LocalDateTime localDateTime50 = booking46.getEndTime();
        java.lang.String str51 = booking46.getBookingId();
        java.lang.String str52 = booking46.getRoomId();
        booking46.checkIn();
        booking46.forfeitDeposit();
        java.lang.String str55 = booking46.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState56 = booking46.getState();
        booking34.setState(bookingState56);
        booking17.setState(bookingState56);
        booking6.setState(bookingState56);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PENDING" + "'", str39, "PENDING");
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(localDateTime50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(bookingState56);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.complete();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime20 = booking6.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = localDateTime20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        booking6.confirmBooking();
        double double10 = booking6.getHourlyRate();
        booking6.confirmBooking();
        booking6.setHourlyRate((double) 1);
        double double14 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.roomscheduler.model.Booking booking15 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime12, localDateTime13, 0.0d);
        booking15.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking15.getStatus();
        java.time.LocalDateTime localDateTime18 = null;
        booking15.setEndTime(localDateTime18);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.roomscheduler.model.Booking booking26 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime23, localDateTime24, 0.0d);
        java.time.LocalDateTime localDateTime27 = null;
        booking26.setEndTime(localDateTime27);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState29 = booking26.getState();
        boolean boolean30 = booking26.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking26.getState();
        booking15.setState(bookingState31);
        booking6.setState(bookingState31);
        java.time.LocalDateTime localDateTime34 = booking6.getEndTime();
        java.lang.String str35 = booking6.getCurrentStateName();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PENDING" + "'", str35, "PENDING");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.processPayment(0.0d, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
        booking6.complete();
        double double16 = booking6.getHourlyRate();
        java.lang.String str17 = booking6.getUserId();
        java.lang.Class<?> wildcardClass18 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        booking6.complete();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking6.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, 10.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        java.time.LocalDateTime localDateTime17 = booking13.getEndTime();
        java.lang.String str18 = booking13.getBookingId();
        java.lang.String str19 = booking13.getRoomId();
        booking13.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking13.getState();
        booking6.setState(bookingState21);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(bookingState21);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        double double11 = booking6.getHourlyRate();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        double double14 = booking6.getHourlyRate();
        booking6.checkIn();
        double double16 = booking6.getHourlyRate();
        double double17 = booking6.getHourlyRate();
        booking6.extend((int) (byte) 100);
        java.time.LocalDateTime localDateTime20 = booking6.getStartTime();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        boolean boolean17 = booking13.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.checkIn();
        double double21 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "", "Credit Card", localDateTime3, localDateTime4, (double) (short) 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "PENDING", "hi!", localDateTime3, localDateTime4, (double) (byte) -1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment(1.0d, "Credit Card");
        boolean boolean7 = creditCardPayment0.processPayment((double) 10, "PENDING");
        boolean boolean10 = creditCardPayment0.refund("", 100.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        booking6.complete();
        boolean boolean15 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.lang.String str23 = booking22.getUserId();
        booking22.confirmBooking();
        java.lang.String str25 = booking22.getBookingId();
        booking22.checkIn();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.yorku.roomscheduler.model.Booking booking33 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime30, localDateTime31, 0.0d);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setEndTime(localDateTime34);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking33.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver37 = null;
        booking33.addObserver(bookingObserver37);
        booking33.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState41 = booking33.getState();
        booking22.setState(bookingState41);
        booking6.setState(bookingState41);
        java.time.LocalDateTime localDateTime44 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNull(localDateTime44);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.String str15 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        booking6.extend((int) '#');
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getHourlyRate();
        booking6.confirmBooking();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean14 = creditCardPayment0.refund("Credit Card", (double) (short) 1);
        boolean boolean17 = creditCardPayment0.processPayment((double) ' ', "hi!");
        boolean boolean20 = creditCardPayment0.processPayment((double) 100L, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.cancel();
        booking6.extend((int) '#');
        booking6.cancel();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.yorku.roomscheduler.model.Booking booking21 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime18, localDateTime19, 0.0d);
        java.time.LocalDateTime localDateTime22 = null;
        booking21.setEndTime(localDateTime22);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState24 = booking21.getState();
        booking6.setState(bookingState24);
        java.time.LocalDateTime localDateTime26 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        booking6.setHourlyRate((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        booking6.complete();
        java.time.LocalDateTime localDateTime15 = booking6.getEndTime();
        booking6.setHourlyRate((double) '4');
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        booking6.extend((int) (short) -1);
        booking6.extend((int) '4');
        boolean boolean16 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        booking6.extend((int) ' ');
        booking6.setHourlyRate((double) (-1.0f));
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime17 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver18 = null;
        booking6.addObserver(bookingObserver18);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        java.lang.String str15 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        java.lang.Class<?> wildcardClass17 = bookingState16.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        booking6.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.time.LocalDateTime localDateTime21 = null;
        booking20.setEndTime(localDateTime21);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking20.getState();
        java.time.LocalDateTime localDateTime24 = booking20.getEndTime();
        java.lang.String str25 = booking20.getCurrentStateName();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.yorku.roomscheduler.model.Booking booking32 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime29, localDateTime30, 0.0d);
        java.time.LocalDateTime localDateTime33 = null;
        booking32.setEndTime(localDateTime33);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking32.getState();
        java.time.LocalDateTime localDateTime36 = booking32.getEndTime();
        java.lang.String str37 = booking32.getBookingId();
        java.lang.String str38 = booking32.getRoomId();
        booking32.checkIn();
        booking32.forfeitDeposit();
        java.lang.String str41 = booking32.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState42 = booking32.getState();
        booking20.setState(bookingState42);
        booking6.setState(bookingState42);
        booking6.setHourlyRate((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PENDING" + "'", str25, "PENDING");
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(bookingState42);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus15 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        booking6.setHourlyRate((double) 100);
        java.lang.String str19 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PENDING" + "'", str19, "PENDING");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime13 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
    }
}

