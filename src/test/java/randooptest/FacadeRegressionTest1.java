package randooptest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacadeRegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        java.time.LocalDateTime localDateTime16 = null;
        booking6.setEndTime(localDateTime16);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver18 = null;
        booking6.addObserver(bookingObserver18);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        booking6.cancel();
        java.lang.String str11 = booking6.getUserId();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) (byte) 100);
        booking6.complete();
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean14 = creditCardPayment0.refund("PENDING", (double) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        booking6.cancel();
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        booking6.setHourlyRate((double) 100.0f);
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime18 = null;
        booking6.setEndTime(localDateTime18);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean14 = creditCardPayment0.processPayment((double) (-1), "");
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        boolean boolean18 = creditCardPayment0.refund("hi!", (double) ' ');
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        java.lang.String str9 = booking6.getBookingId();
        double double10 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "", localDateTime3, localDateTime4, (double) '#');
        java.lang.String str7 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime13 = booking6.getStartTime();
        java.lang.String str14 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, 1.0d);
        booking6.checkIn();
        double double8 = booking6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(bookingState13);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.String str15 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        booking6.cancel();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver24 = null;
        booking6.addObserver(bookingObserver24);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.Class<?> wildcardClass20 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment(0.0d, "hi!");
        boolean boolean8 = creditCardPayment0.refund("", (double) 10.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.String str41 = booking6.getUserId();
        booking6.cancel();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState43 = booking6.getState();
        java.time.LocalDateTime localDateTime44 = null;
        booking6.setEndTime(localDateTime44);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(bookingState43);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, 1.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getBookingId();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        booking6.setHourlyRate((double) (short) 0);
        boolean boolean14 = booking6.isCheckedIn();
        java.lang.String str15 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        booking6.complete();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "Credit Card", localDateTime3, localDateTime4, (double) (-1.0f));
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        double double8 = booking6.getHourlyRate();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        double double21 = booking6.getTotalCost();
        double double22 = booking6.getHourlyRate();
        java.lang.String str23 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus30 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus30.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        java.time.LocalDateTime localDateTime41 = null;
        booking6.setEndTime(localDateTime41);
        booking6.setHourlyRate((double) 0.0f);
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
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "CANCELLED", localDateTime3, localDateTime4, 10.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        java.time.LocalDateTime localDateTime10 = null;
        booking6.setEndTime(localDateTime10);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.yorku.roomscheduler.model.Booking booking18 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime15, localDateTime16, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus19 = booking18.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking18.getState();
        booking6.setState(bookingState20);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus19.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState20);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        java.time.LocalDateTime localDateTime38 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(localDateTime38);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus13.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.complete();
        booking6.complete();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        booking6.extend((int) (byte) 100);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        booking6.cancel();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus19 = booking6.getStatus();
        java.lang.String str20 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus19.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.confirmBooking();
        double double11 = booking6.getTotalCost();
        booking6.extend((int) (short) 100);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.lang.String str16 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        java.lang.Class<?> wildcardClass20 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.String str17 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        java.lang.String str10 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        booking6.extend((int) '4');
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        java.lang.String str11 = booking6.getRoomId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime13 = booking6.getStartTime();
        booking6.setHourlyRate((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        booking6.setHourlyRate((double) 10);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        booking6.setHourlyRate((double) (byte) -1);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        com.yorku.roomscheduler.model.Booking booking43 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime40, localDateTime41, 0.0d);
        java.lang.String str44 = booking43.getUserId();
        booking43.confirmBooking();
        java.time.LocalDateTime localDateTime46 = booking43.getEndTime();
        boolean boolean47 = booking43.isCheckedIn();
        java.lang.String str48 = booking43.getRoomId();
        java.lang.String str49 = booking43.getCurrentStateName();
        booking43.forfeitDeposit();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        com.yorku.roomscheduler.model.Booking booking57 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime54, localDateTime55, 0.0d);
        java.lang.String str58 = booking57.getUserId();
        booking57.confirmBooking();
        java.lang.String str60 = booking57.getBookingId();
        booking57.checkIn();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        com.yorku.roomscheduler.model.Booking booking68 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime65, localDateTime66, 0.0d);
        java.time.LocalDateTime localDateTime69 = null;
        booking68.setEndTime(localDateTime69);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState71 = booking68.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver72 = null;
        booking68.addObserver(bookingObserver72);
        booking68.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState76 = booking68.getState();
        booking57.setState(bookingState76);
        booking43.setState(bookingState76);
        booking6.setState(bookingState76);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PENDING" + "'", str49, "PENDING");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(bookingState71);
        org.junit.Assert.assertNotNull(bookingState76);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "PENDING", localDateTime3, localDateTime4, (double) 100.0f);
        java.lang.Class<?> wildcardClass7 = booking6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        double double9 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.Class<?> wildcardClass12 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        booking6.checkIn();
        java.lang.String str17 = booking6.getBookingId();
        boolean boolean18 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking6.removeObserver(bookingObserver19);
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "CANCELLED", "PENDING", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.addObserver(bookingObserver7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        java.lang.Class<?> wildcardClass14 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "PENDING", localDateTime3, localDateTime4, (double) 1.0f);
        java.lang.String str7 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        double double14 = booking6.getTotalCost();
        booking6.extend((-1));
        java.lang.String str17 = booking6.getCurrentStateName();
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PENDING" + "'", str17, "PENDING");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (short) 100);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "", localDateTime3, localDateTime4, (double) '4');
        booking6.checkIn();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        com.yorku.roomscheduler.model.Booking booking14 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime11, localDateTime12, 0.0d);
        java.time.LocalDateTime localDateTime15 = null;
        booking14.setEndTime(localDateTime15);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking14.getState();
        java.time.LocalDateTime localDateTime18 = booking14.getEndTime();
        double double19 = booking14.getTotalCost();
        booking14.cancel();
        booking14.setHourlyRate(10.0d);
        java.lang.String str23 = booking14.getRoomId();
        booking14.complete();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking14.getState();
        booking6.setState(bookingState25);
        double double27 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        double double15 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "PENDING", localDateTime3, localDateTime4, (double) ' ');
        booking6.cancel();
        java.lang.String str8 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.roomscheduler.model.Booking booking15 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime12, localDateTime13, 0.0d);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking22.getState();
        boolean boolean26 = booking22.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking22.getState();
        booking15.setState(bookingState27);
        java.lang.String str29 = booking15.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState30 = booking15.getState();
        booking6.setState(bookingState30);
        booking6.extend(0);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PENDING" + "'", str29, "PENDING");
        org.junit.Assert.assertNotNull(bookingState30);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus47 = booking6.getStatus();
        booking6.confirmBooking();
        java.lang.String str49 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus29.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertTrue("'" + bookingStatus47 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED + "'", bookingStatus47.equals(com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PENDING" + "'", str49, "PENDING");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        booking6.cancel();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        booking6.complete();
        double double31 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.lang.String str32 = booking6.getRoomId();
        double double33 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "hi!", "PENDING", localDateTime3, localDateTime4, 52.0d);
        java.lang.String str7 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, (double) (-1));
        java.lang.String str7 = booking6.getBookingId();
        java.lang.String str8 = booking6.getUserId();
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CANCELLED" + "'", str8, "CANCELLED");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setEndTime(localDateTime23);
        java.time.LocalDateTime localDateTime25 = booking22.getStartTime();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.yorku.roomscheduler.model.Booking booking32 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime29, localDateTime30, 0.0d);
        java.time.LocalDateTime localDateTime33 = null;
        booking32.setEndTime(localDateTime33);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking32.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver36 = null;
        booking32.addObserver(bookingObserver36);
        booking32.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        com.yorku.roomscheduler.model.Booking booking46 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime43, localDateTime44, 0.0d);
        java.time.LocalDateTime localDateTime47 = null;
        booking46.setEndTime(localDateTime47);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState49 = booking46.getState();
        boolean boolean50 = booking46.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking46.getState();
        booking32.setState(bookingState51);
        booking22.setState(bookingState51);
        booking6.setState(bookingState51);
        java.time.LocalDateTime localDateTime55 = null;
        booking6.setEndTime(localDateTime55);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bookingState51);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment(0.0d, "hi!");
        boolean boolean8 = creditCardPayment0.processPayment((double) 0.0f, "");
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment((double) '#', "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("", (double) 100);
        boolean boolean10 = creditCardPayment0.refund("CANCELLED", (double) 100L);
        boolean boolean13 = creditCardPayment0.refund("hi!", (double) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "hi!", "", localDateTime3, localDateTime4, (double) (short) 10);
        booking6.complete();
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        boolean boolean47 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver48 = null;
        booking6.removeObserver(bookingObserver48);
        double double50 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus29.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 52.0d + "'", double50 == 52.0d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.complete();
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("PENDING", 0.0d);
        boolean boolean6 = creditCardPayment0.refund("PENDING", 100.0d);
        boolean boolean9 = creditCardPayment0.refund("", (double) 100L);
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        boolean boolean13 = creditCardPayment0.processPayment((double) 100, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime19 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime11 = booking6.getEndTime();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        booking6.setHourlyRate((double) 'a');
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime11 = booking6.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getUserId();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        java.lang.String str10 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        java.time.LocalDateTime localDateTime18 = booking6.getStartTime();
        booking6.setHourlyRate((double) 0);
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.lang.String str21 = booking20.getUserId();
        booking20.confirmBooking();
        java.lang.String str23 = booking20.getBookingId();
        booking20.checkIn();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.yorku.roomscheduler.model.Booking booking31 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime28, localDateTime29, 0.0d);
        java.time.LocalDateTime localDateTime32 = null;
        booking31.setEndTime(localDateTime32);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking31.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver35 = null;
        booking31.addObserver(bookingObserver35);
        booking31.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking31.getState();
        booking20.setState(bookingState39);
        booking6.setState(bookingState39);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver42 = null;
        booking6.removeObserver(bookingObserver42);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNotNull(bookingState39);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean13 = creditCardPayment0.processPayment((double) (byte) -1, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.refund("", (double) 10);
        boolean boolean14 = creditCardPayment0.refund("CANCELLED", (double) '4');
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str16 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        double double48 = booking6.getHourlyRate();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PENDING" + "'", str47, "PENDING");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        java.lang.String str7 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        java.lang.String str17 = booking6.getUserId();
        booking6.cancel();
        booking6.forfeitDeposit();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.forfeitDeposit();
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.time.LocalDateTime localDateTime41 = null;
        booking6.setEndTime(localDateTime41);
        double double43 = booking6.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        java.lang.String str29 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime30 = null;
        booking6.setEndTime(localDateTime30);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PENDING" + "'", str29, "PENDING");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.refund("PENDING", (double) 10.0f);
        boolean boolean13 = creditCardPayment0.refund("Credit Card", 1.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.yorku.roomscheduler.model.Booking booking21 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime18, localDateTime19, 0.0d);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.yorku.roomscheduler.model.Booking booking28 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime25, localDateTime26, 0.0d);
        java.time.LocalDateTime localDateTime29 = null;
        booking28.setEndTime(localDateTime29);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking28.getState();
        boolean boolean32 = booking28.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking28.getState();
        booking21.setState(bookingState33);
        java.lang.String str35 = booking21.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking21.getState();
        booking6.setState(bookingState36);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PENDING" + "'", str35, "PENDING");
        org.junit.Assert.assertNotNull(bookingState36);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        booking6.setHourlyRate(0.0d);
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver8 = null;
        booking6.addObserver(bookingObserver8);
        double double10 = booking6.getTotalCost();
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        booking13.checkIn();
        java.lang.String str15 = booking13.getUserId();
        double double16 = booking13.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking13.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking13.getState();
        booking6.setState(bookingState18);
        booking6.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState18);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.extend((int) ' ');
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getRoomId();
        booking6.confirmBooking();
        booking6.complete();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, 10.0d);
        java.lang.String str7 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "", "hi!", localDateTime3, localDateTime4, (double) (byte) 10);
        booking6.cancel();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver41 = null;
        booking6.removeObserver(bookingObserver41);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus43 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertTrue("'" + bookingStatus43 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus43.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.time.LocalDateTime localDateTime16 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        double double11 = booking6.getHourlyRate();
        booking6.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
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
        booking6.forfeitDeposit();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver28 = null;
        booking19.addObserver(bookingObserver28);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        java.time.LocalDateTime localDateTime40 = booking36.getEndTime();
        java.lang.String str41 = booking36.getCurrentStateName();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        com.yorku.roomscheduler.model.Booking booking48 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime45, localDateTime46, 0.0d);
        java.time.LocalDateTime localDateTime49 = null;
        booking48.setEndTime(localDateTime49);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking48.getState();
        java.time.LocalDateTime localDateTime52 = booking48.getEndTime();
        java.lang.String str53 = booking48.getBookingId();
        java.lang.String str54 = booking48.getRoomId();
        booking48.checkIn();
        booking48.forfeitDeposit();
        java.lang.String str57 = booking48.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState58 = booking48.getState();
        booking36.setState(bookingState58);
        booking19.setState(bookingState58);
        booking6.setState(bookingState58);
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        com.yorku.roomscheduler.model.Booking booking69 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime66, localDateTime67, 0.0d);
        java.time.LocalDateTime localDateTime70 = null;
        booking69.setEndTime(localDateTime70);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState72 = booking69.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver73 = null;
        booking69.addObserver(bookingObserver73);
        booking69.setHourlyRate((double) (byte) 0);
        double double77 = booking69.getTotalCost();
        java.time.LocalDateTime localDateTime78 = booking69.getEndTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState79 = booking69.getState();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState80 = booking69.getState();
        java.time.LocalDateTime localDateTime81 = booking69.getStartTime();
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        com.yorku.roomscheduler.model.Booking booking88 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime85, localDateTime86, 0.0d);
        java.lang.String str89 = booking88.getUserId();
        booking88.confirmBooking();
        java.time.LocalDateTime localDateTime91 = booking88.getEndTime();
        booking88.extend((int) (byte) -1);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState94 = booking88.getState();
        booking69.setState(bookingState94);
        booking6.setState(bookingState94);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PENDING" + "'", str41, "PENDING");
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNull(localDateTime52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNotNull(bookingState72);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNull(localDateTime78);
        org.junit.Assert.assertNotNull(bookingState79);
        org.junit.Assert.assertNotNull(bookingState80);
        org.junit.Assert.assertNull(localDateTime81);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertNull(localDateTime91);
        org.junit.Assert.assertNotNull(bookingState94);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (short) -1);
        boolean boolean7 = booking6.isCheckedIn();
        booking6.extend((int) '#');
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.yorku.roomscheduler.model.Booking booking16 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime13, localDateTime14, 0.0d);
        java.time.LocalDateTime localDateTime17 = null;
        booking16.setEndTime(localDateTime17);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState19 = booking16.getState();
        java.time.LocalDateTime localDateTime20 = booking16.getEndTime();
        java.lang.String str21 = booking16.getBookingId();
        java.lang.String str22 = booking16.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState23 = booking16.getState();
        booking16.complete();
        boolean boolean25 = booking16.isCheckedIn();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.yorku.roomscheduler.model.Booking booking32 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime29, localDateTime30, 0.0d);
        java.lang.String str33 = booking32.getUserId();
        booking32.confirmBooking();
        java.lang.String str35 = booking32.getBookingId();
        booking32.checkIn();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        com.yorku.roomscheduler.model.Booking booking43 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime40, localDateTime41, 0.0d);
        java.time.LocalDateTime localDateTime44 = null;
        booking43.setEndTime(localDateTime44);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState46 = booking43.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver47 = null;
        booking43.addObserver(bookingObserver47);
        booking43.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking43.getState();
        booking32.setState(bookingState51);
        booking16.setState(bookingState51);
        booking6.setState(bookingState51);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(bookingState46);
        org.junit.Assert.assertNotNull(bookingState51);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "", localDateTime3, localDateTime4, (double) '#');
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        java.lang.String str10 = booking6.getUserId();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean13 = creditCardPayment0.refund("", (double) 10);
        boolean boolean16 = creditCardPayment0.refund("CANCELLED", (double) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        booking6.confirmBooking();
        double double10 = booking6.getHourlyRate();
        booking6.confirmBooking();
        booking6.setHourlyRate((double) 1);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        java.lang.String str7 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        booking6.setHourlyRate((double) (byte) 100);
        java.lang.String str18 = booking6.getCurrentStateName();
        double double19 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PENDING" + "'", str18, "PENDING");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        booking6.forfeitDeposit();
        double double16 = booking6.getTotalCost();
        double double17 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.setHourlyRate(100.0d);
        booking6.checkIn();
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver35 = null;
        booking6.addObserver(bookingObserver35);
        java.lang.String str37 = booking6.getRoomId();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "", localDateTime3, localDateTime4, 52.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus48 = booking6.getStatus();
        java.lang.String str49 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PENDING" + "'", str47, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus48.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PENDING" + "'", str49, "PENDING");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "CANCELLED", "PENDING", localDateTime3, localDateTime4, (double) 1.0f);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        java.lang.Class<?> wildcardClass14 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        booking6.extend((int) ' ');
        booking6.cancel();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, (double) 1);
        booking6.forfeitDeposit();
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        boolean boolean9 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState28 = booking6.getState();
        booking6.setHourlyRate(0.0d);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(bookingState28);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "", localDateTime3, localDateTime4, (double) 0);
        booking6.checkIn();
        booking6.complete();
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        java.lang.String str13 = booking6.getUserId();
        java.lang.String str14 = booking6.getRoomId();
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        booking6.cancel();
        java.lang.String str13 = booking6.getUserId();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) (byte) 1);
        boolean boolean7 = creditCardPayment0.processPayment(0.0d, "Credit Card");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.processPayment((double) 10L, "");
        boolean boolean14 = creditCardPayment0.processPayment((double) (-1.0f), "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus13.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        com.yorku.roomscheduler.model.Booking booking44 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime41, localDateTime42, 0.0d);
        java.lang.String str45 = booking44.getUserId();
        booking44.confirmBooking();
        java.lang.String str47 = booking44.getBookingId();
        booking44.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime50 = booking44.getStartTime();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        com.yorku.roomscheduler.model.Booking booking57 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime54, localDateTime55, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus58 = booking57.getStatus();
        java.lang.String str59 = booking57.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState60 = booking57.getState();
        booking44.setState(bookingState60);
        booking6.setState(bookingState60);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + bookingStatus58 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus58.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PENDING" + "'", str59, "PENDING");
        org.junit.Assert.assertNotNull(bookingState60);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        double double12 = booking6.getHourlyRate();
        booking6.setHourlyRate(0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        java.lang.String str18 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PENDING" + "'", str18, "PENDING");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "PENDING", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        booking6.extend((int) ' ');
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        booking6.checkIn();
        booking6.setHourlyRate((double) 0L);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.String str19 = booking6.getCurrentStateName();
        boolean boolean20 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PENDING" + "'", str19, "PENDING");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        java.lang.String str12 = booking6.getCurrentStateName();
        boolean boolean13 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        booking6.setHourlyRate(10.0d);
        booking6.setHourlyRate(1.0d);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.forfeitDeposit();
        java.lang.Class<?> wildcardClass10 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        java.lang.String str15 = booking6.getUserId();
        java.time.LocalDateTime localDateTime16 = null;
        booking6.setEndTime(localDateTime16);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        java.lang.String str16 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        booking6.forfeitDeposit();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getUserId();
        booking6.setHourlyRate((double) (byte) 100);
        double double10 = booking6.getHourlyRate();
        boolean boolean11 = booking6.isCheckedIn();
        double double12 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        booking6.checkIn();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.lang.String str14 = booking6.getUserId();
        java.time.LocalDateTime localDateTime15 = null;
        booking6.setEndTime(localDateTime15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("", (double) (short) 10);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState21);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        boolean boolean47 = booking6.isCheckedIn();
        double double48 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus49 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus29.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus49 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED + "'", bookingStatus49.equals(com.yorku.roomscheduler.model.enums.BookingStatus.FORFEITED));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PENDING" + "'", str15, "PENDING");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        booking6.cancel();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        booking20.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus22 = booking20.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        booking20.setEndTime(localDateTime23);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.yorku.roomscheduler.model.Booking booking31 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime28, localDateTime29, 0.0d);
        java.time.LocalDateTime localDateTime32 = null;
        booking31.setEndTime(localDateTime32);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking31.getState();
        boolean boolean35 = booking31.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState36 = booking31.getState();
        booking20.setState(bookingState36);
        booking6.setState(bookingState36);
        java.time.LocalDateTime localDateTime39 = null;
        booking6.setEndTime(localDateTime39);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus22.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookingState36);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        boolean boolean19 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getCurrentStateName();
        java.lang.String str9 = booking6.getRoomId();
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        java.lang.String str14 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        double double18 = booking6.getTotalCost();
        double double19 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        java.lang.String str17 = booking6.getBookingId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getUserId();
        booking6.extend((int) (short) 10);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime12 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking19.getState();
        booking6.setState(bookingState27);
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState27);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        boolean boolean7 = booking6.isCheckedIn();
        booking6.cancel();
        double double9 = booking6.getTotalCost();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        booking6.setHourlyRate((double) 100.0f);
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime18 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.lang.Class<?> wildcardClass15 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment(0.0d, "hi!");
        boolean boolean8 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean11 = creditCardPayment0.refund("PENDING", (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "", localDateTime3, localDateTime4, (double) '#');
        java.time.LocalDateTime localDateTime7 = booking6.getEndTime();
        booking6.confirmBooking();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.complete();
        booking6.cancel();
        booking6.complete();
        java.lang.String str12 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CANCELLED" + "'", str12, "CANCELLED");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.removeObserver(bookingObserver10);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        double double18 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime19 = booking6.getStartTime();
        java.lang.String str20 = booking6.getUserId();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.yorku.roomscheduler.model.Booking booking27 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime24, localDateTime25, 0.0d);
        booking27.checkIn();
        java.lang.String str29 = booking27.getUserId();
        double double30 = booking27.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus31 = booking27.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking27.getState();
        booking6.setState(bookingState32);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus31.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        booking6.confirmBooking();
        double double10 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver28 = null;
        booking19.addObserver(bookingObserver28);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        java.time.LocalDateTime localDateTime40 = booking36.getEndTime();
        java.lang.String str41 = booking36.getCurrentStateName();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        com.yorku.roomscheduler.model.Booking booking48 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime45, localDateTime46, 0.0d);
        java.time.LocalDateTime localDateTime49 = null;
        booking48.setEndTime(localDateTime49);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking48.getState();
        java.time.LocalDateTime localDateTime52 = booking48.getEndTime();
        java.lang.String str53 = booking48.getBookingId();
        java.lang.String str54 = booking48.getRoomId();
        booking48.checkIn();
        booking48.forfeitDeposit();
        java.lang.String str57 = booking48.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState58 = booking48.getState();
        booking36.setState(bookingState58);
        booking19.setState(bookingState58);
        booking6.setState(bookingState58);
        java.lang.String str62 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PENDING" + "'", str41, "PENDING");
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNull(localDateTime52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "CANCELLED", "PENDING", localDateTime3, localDateTime4, (double) 0);
        booking6.cancel();
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        booking6.extend((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.removeObserver(bookingObserver16);
        double double18 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        boolean boolean10 = creditCardPayment0.refund("Credit Card", (double) 'a');
        boolean boolean13 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean16 = creditCardPayment0.processPayment((double) (byte) 1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, (double) 1.0f);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.processPayment((double) (-1L), "PENDING");
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        double double9 = booking6.getTotalCost();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("", 52.0d);
        boolean boolean15 = creditCardPayment0.refund("", 0.0d);
        boolean boolean18 = creditCardPayment0.processPayment((double) (short) 100, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        booking6.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        booking6.setHourlyRate((double) (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.lang.String str21 = booking20.getUserId();
        java.lang.String str22 = booking20.getRoomId();
        java.lang.String str23 = booking20.getUserId();
        java.lang.String str24 = booking20.getCurrentStateName();
        double double25 = booking20.getHourlyRate();
        java.lang.String str26 = booking20.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking20.getState();
        booking6.setState(bookingState27);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver29 = null;
        booking6.addObserver(bookingObserver29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PENDING" + "'", str24, "PENDING");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(bookingState27);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.confirmBooking();
        java.lang.String str11 = booking6.getUserId();
        java.lang.Class<?> wildcardClass12 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "", localDateTime3, localDateTime4, (double) '#');
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        booking6.forfeitDeposit();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        double double11 = booking6.getHourlyRate();
        booking6.cancel();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        double double32 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking6.getStatus();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.refund("hi!", (double) (short) -1);
        boolean boolean11 = creditCardPayment0.processPayment((double) (byte) -1, "Credit Card");
        boolean boolean14 = creditCardPayment0.refund("PENDING", (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        booking6.checkIn();
        java.time.LocalDateTime localDateTime18 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime19 = null;
        booking6.setEndTime(localDateTime19);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver27 = null;
        booking6.addObserver(bookingObserver27);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver29 = null;
        booking6.removeObserver(bookingObserver29);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus31 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus31.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
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
        booking6.checkIn();
        booking6.extend((int) (byte) -1);
        java.lang.String str38 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) -1, "hi!");
        boolean boolean18 = creditCardPayment0.processPayment((double) '4', "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        java.lang.String str22 = booking6.getBookingId();
        double double23 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver11 = null;
        booking6.addObserver(bookingObserver11);
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (short) -1);
        boolean boolean7 = booking6.isCheckedIn();
        booking6.extend((int) '#');
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.lang.String str30 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(bookingState31);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        booking6.setHourlyRate((double) (byte) -1);
        booking6.extend(100);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.yorku.roomscheduler.model.Booking booking25 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime22, localDateTime23, 0.0d);
        java.lang.String str26 = booking25.getUserId();
        booking25.confirmBooking();
        java.lang.String str28 = booking25.getBookingId();
        booking25.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime31 = booking25.getStartTime();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.yorku.roomscheduler.model.Booking booking38 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime35, localDateTime36, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus39 = booking38.getStatus();
        java.lang.String str40 = booking38.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState41 = booking38.getState();
        booking25.setState(bookingState41);
        booking6.setState(bookingState41);
        double double44 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus39.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PENDING" + "'", str40, "PENDING");
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        java.lang.String str11 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.yorku.roomscheduler.model.Booking booking18 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime15, localDateTime16, 0.0d);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setEndTime(localDateTime19);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState21 = booking18.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver22 = null;
        booking18.addObserver(bookingObserver22);
        booking18.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.yorku.roomscheduler.model.Booking booking32 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime29, localDateTime30, 0.0d);
        java.lang.String str33 = booking32.getUserId();
        booking32.confirmBooking();
        java.time.LocalDateTime localDateTime35 = booking32.getEndTime();
        boolean boolean36 = booking32.isCheckedIn();
        java.time.LocalDateTime localDateTime37 = booking32.getStartTime();
        booking32.checkIn();
        double double39 = booking32.getTotalCost();
        double double40 = booking32.getTotalCost();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.yorku.roomscheduler.model.Booking booking47 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime44, localDateTime45, 0.0d);
        booking47.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus49 = booking47.getStatus();
        java.time.LocalDateTime localDateTime50 = null;
        booking47.setEndTime(localDateTime50);
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        com.yorku.roomscheduler.model.Booking booking58 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime55, localDateTime56, 0.0d);
        java.time.LocalDateTime localDateTime59 = null;
        booking58.setEndTime(localDateTime59);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState61 = booking58.getState();
        boolean boolean62 = booking58.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState63 = booking58.getState();
        booking47.setState(bookingState63);
        booking32.setState(bookingState63);
        booking18.setState(bookingState63);
        booking6.setState(bookingState63);
        booking6.complete();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus49 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus49.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(bookingState63);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.forfeitDeposit();
        double double10 = booking6.getTotalCost();
        boolean boolean11 = booking6.isCheckedIn();
        booking6.complete();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.forfeitDeposit();
        java.lang.String str9 = booking6.getRoomId();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.setHourlyRate(52.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 0L);
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver8 = null;
        booking6.removeObserver(bookingObserver8);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        boolean boolean14 = creditCardPayment0.processPayment((double) (-1), "");
        boolean boolean17 = creditCardPayment0.processPayment((double) (-1.0f), "CANCELLED");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        java.lang.String str14 = booking6.getBookingId();
        booking6.complete();
        java.lang.String str16 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.time.LocalDateTime localDateTime16 = booking6.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        // The following exception was thrown during execution in test generation
        try {
            booking6.forfeitDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PENDING" + "'", str29, "PENDING");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "", localDateTime3, localDateTime4, 1.0d);
        booking6.complete();
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        java.lang.String str13 = booking6.getBookingId();
        java.lang.String str14 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        boolean boolean10 = creditCardPayment0.refund("CANCELLED", (double) 100);
        boolean boolean13 = creditCardPayment0.refund("PENDING", 100.0d);
        java.lang.String str14 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.extend(10);
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        booking6.checkIn();
        booking6.cancel();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        java.lang.String str11 = booking6.getRoomId();
        booking6.confirmBooking();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        double double14 = booking6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        java.lang.String str7 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        booking6.cancel();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        java.lang.String str14 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.yorku.roomscheduler.model.Booking booking23 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime20, localDateTime21, 0.0d);
        java.time.LocalDateTime localDateTime24 = null;
        booking23.setEndTime(localDateTime24);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState26 = booking23.getState();
        booking23.forfeitDeposit();
        booking23.setHourlyRate((double) '4');
        booking23.cancel();
        boolean boolean31 = booking23.isCheckedIn();
        booking23.setHourlyRate((double) (short) 0);
        java.lang.String str34 = booking23.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking23.getState();
        booking6.setState(bookingState35);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(bookingState35);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment(0.0d, "hi!");
        boolean boolean8 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean11 = creditCardPayment0.refund("CANCELLED", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.lang.String str17 = booking6.getRoomId();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.setHourlyRate((double) (-1L));
        booking6.complete();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Credit Card", (double) (-1.0f));
        boolean boolean12 = creditCardPayment0.processPayment((double) 0, "Credit Card");
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        boolean boolean13 = booking6.isCheckedIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        double double10 = booking6.getHourlyRate();
        booking6.setHourlyRate((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.processPayment(1.0d, "Credit Card");
        boolean boolean7 = creditCardPayment0.refund("", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) -1, "hi!");
        boolean boolean18 = creditCardPayment0.refund("PENDING", (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "PENDING", "", localDateTime3, localDateTime4, (double) 0.0f);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.lang.String str17 = booking6.getRoomId();
        java.lang.String str18 = booking6.getUserId();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.confirmBooking();
        java.lang.String str11 = booking6.getUserId();
        booking6.setHourlyRate(10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        booking6.confirmBooking();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        booking6.confirmBooking();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(bookingState13);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        java.lang.String str13 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime14 = null;
        booking6.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        booking6.setEndTime(localDateTime16);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        booking6.addObserver(bookingObserver14);
        // The following exception was thrown during execution in test generation
        try {
            booking6.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        double double23 = booking6.getHourlyRate();
        booking6.setHourlyRate((double) 100L);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = booking6.getEndTime();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.lang.String str22 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.extend((int) (short) 0);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.setHourlyRate(0.0d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        booking6.extend((int) '4');
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState14);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.processPayment((double) (short) 1, "Credit Card");
        boolean boolean6 = creditCardPayment0.processPayment((double) 0, "Credit Card");
        boolean boolean9 = creditCardPayment0.processPayment((double) (byte) 100, "hi!");
        boolean boolean12 = creditCardPayment0.refund("hi!", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.refund("", (double) 10);
        boolean boolean14 = creditCardPayment0.refund("CANCELLED", (double) '4');
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        boolean boolean18 = creditCardPayment0.refund("", (double) (byte) 10);
        boolean boolean21 = creditCardPayment0.refund("hi!", (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("PENDING", 0.0d);
        boolean boolean6 = creditCardPayment0.refund("PENDING", 100.0d);
        boolean boolean9 = creditCardPayment0.refund("", (double) 100L);
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        boolean boolean14 = creditCardPayment0.refund("", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 0L);
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver9 = null;
        booking6.addObserver(bookingObserver9);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        com.yorku.roomscheduler.model.Booking booking23 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime20, localDateTime21, 0.0d);
        java.time.LocalDateTime localDateTime24 = null;
        booking23.setEndTime(localDateTime24);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState26 = booking23.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver27 = null;
        booking23.addObserver(bookingObserver27);
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
        booking23.setState(bookingState51);
        booking6.setState(bookingState51);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus37.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bookingState51);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.String str14 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
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
        booking6.checkIn();
        booking6.extend((int) (byte) -1);
        double double38 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        booking6.cancel();
        booking6.complete();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver11 = null;
        booking6.addObserver(bookingObserver11);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("", (double) '4');
        boolean boolean8 = creditCardPayment0.refund("", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime10 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus9 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus9.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.time.LocalDateTime localDateTime48 = booking6.getStartTime();
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
        org.junit.Assert.assertNull(localDateTime48);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        booking6.extend((int) (short) 100);
        java.time.LocalDateTime localDateTime82 = booking6.getStartTime();
        booking6.forfeitDeposit();
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
        org.junit.Assert.assertNull(localDateTime82);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        booking6.confirmBooking();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "hi!", "CANCELLED", localDateTime3, localDateTime4, (double) (short) 100);
        java.lang.String str7 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
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
        booking6.checkIn();
        booking6.extend((int) (byte) -1);
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
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
        booking6.checkIn();
        booking6.extend((int) (byte) -1);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver38 = null;
        booking6.addObserver(bookingObserver38);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "PENDING", localDateTime3, localDateTime4, (double) ' ');
        booking6.complete();
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("", (double) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.time.LocalDateTime localDateTime14 = booking6.getStartTime();
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
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        java.lang.String str13 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.lang.String str21 = booking20.getUserId();
        java.lang.String str22 = booking20.getRoomId();
        java.lang.String str23 = booking20.getUserId();
        java.lang.String str24 = booking20.getCurrentStateName();
        double double25 = booking20.getHourlyRate();
        java.lang.String str26 = booking20.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking20.getState();
        booking6.setState(bookingState27);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver29 = null;
        booking6.addObserver(bookingObserver29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PENDING" + "'", str24, "PENDING");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(bookingState27);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, 10.0d);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.roomscheduler.model.Booking booking13 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime10, localDateTime11, 0.0d);
        java.time.LocalDateTime localDateTime14 = null;
        booking13.setEndTime(localDateTime14);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking13.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking13.addObserver(bookingObserver17);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.yorku.roomscheduler.model.Booking booking25 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime22, localDateTime23, 0.0d);
        booking25.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus27 = booking25.getStatus();
        java.time.LocalDateTime localDateTime28 = null;
        booking25.setEndTime(localDateTime28);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        boolean boolean40 = booking36.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState41 = booking36.getState();
        booking25.setState(bookingState41);
        booking13.setState(bookingState41);
        booking6.setState(bookingState41);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus27.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookingState41);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = booking6.getStartTime();
        java.lang.String str14 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus9 = booking6.getStatus();
        java.time.LocalDateTime localDateTime10 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus9.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime13 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.lang.String str21 = booking20.getUserId();
        booking20.confirmBooking();
        java.time.LocalDateTime localDateTime23 = booking20.getEndTime();
        boolean boolean24 = booking20.isCheckedIn();
        java.time.LocalDateTime localDateTime25 = null;
        booking20.setEndTime(localDateTime25);
        booking20.checkIn();
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
        booking20.setState(bookingState56);
        booking6.setState(bookingState56);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.lang.String str17 = booking6.getRoomId();
        booking6.setHourlyRate(0.0d);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "PENDING", localDateTime3, localDateTime4, (double) '4');
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        booking6.confirmBooking();
        booking6.forfeitDeposit();
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, (double) (-1));
        double double7 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        boolean boolean9 = booking6.isCheckedIn();
        double double10 = booking6.getHourlyRate();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.Class<?> wildcardClass12 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", 100.0d);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        booking6.extend((-1));
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        booking6.setHourlyRate((double) (short) -1);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        double double9 = booking6.getHourlyRate();
        booking6.confirmBooking();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        double double16 = booking6.getHourlyRate();
        booking6.setHourlyRate((double) (byte) 10);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        booking6.extend((int) ' ');
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.removeObserver(bookingObserver12);
        booking6.checkIn();
        booking6.setHourlyRate((double) (-1));
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "Credit Card", localDateTime3, localDateTime4, (double) 100);
        booking6.complete();
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        double double10 = booking6.getHourlyRate();
        java.lang.String str11 = booking6.getRoomId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        boolean boolean7 = booking6.isCheckedIn();
        booking6.checkIn();
        booking6.setHourlyRate(1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.cancel();
        boolean boolean17 = booking6.isCheckedIn();
        java.lang.String str18 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        boolean boolean10 = creditCardPayment0.refund("PENDING", (double) (-1L));
        boolean boolean13 = creditCardPayment0.processPayment((double) 10, "CANCELLED");
        boolean boolean16 = creditCardPayment0.refund("", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        booking6.confirmBooking();
        java.lang.String str16 = booking6.getBookingId();
        java.lang.String str17 = booking6.getBookingId();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        boolean boolean17 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        booking6.setHourlyRate((double) (short) -1);
        booking6.cancel();
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "", localDateTime3, localDateTime4, (double) '#');
        booking6.complete();
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        double double9 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.confirmBooking();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean7 = creditCardPayment0.processPayment((double) (short) -1, "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.extend((int) (byte) -1);
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.lang.String str31 = booking30.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking30.getState();
        booking6.setState(bookingState32);
        double double34 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus35 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus35.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        booking6.extend((int) (byte) 10);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver18 = null;
        booking6.removeObserver(bookingObserver18);
        java.lang.String str20 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        java.lang.String str8 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.removeObserver(bookingObserver10);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        boolean boolean13 = booking6.isCheckedIn();
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.lang.String str55 = booking6.getUserId();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "hi!", localDateTime3, localDateTime4, (double) ' ');
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.processPayment((double) (short) 100, "PENDING");
        boolean boolean11 = creditCardPayment0.refund("CANCELLED", (double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "CANCELLED", "", localDateTime3, localDateTime4, (double) 10);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime11 = booking6.getEndTime();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        booking6.complete();
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        booking6.extend((int) ' ');
        booking6.forfeitDeposit();
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver11 = null;
        booking6.addObserver(bookingObserver11);
        boolean boolean13 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver8 = null;
        booking6.removeObserver(bookingObserver8);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        boolean boolean11 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "hi!", "", localDateTime3, localDateTime4, (double) '4');
        booking6.cancel();
        java.lang.String str8 = booking6.getUserId();
        booking6.extend((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean7 = creditCardPayment0.refund("", (double) (byte) 1);
        boolean boolean10 = creditCardPayment0.processPayment(1.0d, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.time.LocalDateTime localDateTime14 = booking6.getEndTime();
        double double15 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        double double41 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        java.lang.String str15 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        booking6.confirmBooking();
        java.lang.String str16 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        java.lang.String str12 = booking6.getUserId();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        booking6.cancel();
        booking6.cancel();
        java.lang.String str12 = booking6.getUserId();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 0L);
        java.lang.String str7 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        boolean boolean10 = creditCardPayment0.processPayment(0.0d, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        java.lang.String str27 = booking6.getBookingId();
        double double28 = booking6.getTotalCost();
        double double29 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        java.time.LocalDateTime localDateTime10 = booking6.getStartTime();
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        booking6.confirmBooking();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.extend((int) (byte) 0);
        booking6.confirmBooking();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.processPayment((double) 100L, "PENDING");
        java.lang.Class<?> wildcardClass12 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        java.time.LocalDateTime localDateTime30 = null;
        booking6.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver32 = null;
        booking6.removeObserver(bookingObserver32);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(bookingState28);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.extend(1);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.addObserver(bookingObserver13);
        booking6.extend((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) 'a');
        booking6.extend((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        double double9 = booking6.getTotalCost();
        java.lang.String str10 = booking6.getUserId();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        booking6.setHourlyRate((double) 100);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment(0.0d, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) 100.0f, "hi!");
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        boolean boolean16 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) 10.0f, "hi!");
        boolean boolean10 = creditCardPayment0.refund("hi!", (double) 100.0f);
        boolean boolean13 = creditCardPayment0.refund("", (double) 10);
        boolean boolean16 = creditCardPayment0.refund("hi!", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        booking6.checkIn();
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        boolean boolean18 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver23 = null;
        booking19.addObserver(bookingObserver23);
        booking19.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState27 = booking19.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver28 = null;
        booking19.addObserver(bookingObserver28);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.yorku.roomscheduler.model.Booking booking36 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime33, localDateTime34, 0.0d);
        java.time.LocalDateTime localDateTime37 = null;
        booking36.setEndTime(localDateTime37);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState39 = booking36.getState();
        java.time.LocalDateTime localDateTime40 = booking36.getEndTime();
        java.lang.String str41 = booking36.getCurrentStateName();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        com.yorku.roomscheduler.model.Booking booking48 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime45, localDateTime46, 0.0d);
        java.time.LocalDateTime localDateTime49 = null;
        booking48.setEndTime(localDateTime49);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking48.getState();
        java.time.LocalDateTime localDateTime52 = booking48.getEndTime();
        java.lang.String str53 = booking48.getBookingId();
        java.lang.String str54 = booking48.getRoomId();
        booking48.checkIn();
        booking48.forfeitDeposit();
        java.lang.String str57 = booking48.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState58 = booking48.getState();
        booking36.setState(bookingState58);
        booking19.setState(bookingState58);
        booking6.setState(bookingState58);
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime63 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PENDING" + "'", str41, "PENDING");
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNull(localDateTime52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNull(localDateTime63);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "PENDING", "", localDateTime3, localDateTime4, (double) (-1L));
        booking6.forfeitDeposit();
        booking6.checkIn();
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        boolean boolean13 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime14 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        booking6.setHourlyRate((double) (-1.0f));
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        boolean boolean14 = creditCardPayment0.refund("", (double) 1);
        java.lang.String str15 = creditCardPayment0.getPaymentMethodName();
        boolean boolean18 = creditCardPayment0.processPayment((-1.0d), "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getCurrentStateName();
        booking6.setHourlyRate((double) 10.0f);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        booking6.complete();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver13 = null;
        booking6.removeObserver(bookingObserver13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        java.lang.String str8 = booking6.getCurrentStateName();
        booking6.confirmBooking();
        booking6.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, (double) (short) 1);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        boolean boolean7 = booking6.isCheckedIn();
        java.lang.String str8 = booking6.getUserId();
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.lang.String str11 = booking6.getUserId();
        java.lang.String str12 = booking6.getRoomId();
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        booking6.extend((int) ' ');
        booking6.confirmBooking();
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        booking6.setHourlyRate((double) 'a');
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.yorku.roomscheduler.model.Booking booking20 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime17, localDateTime18, 0.0d);
        java.lang.String str21 = booking20.getUserId();
        java.lang.String str22 = booking20.getRoomId();
        boolean boolean23 = booking20.isCheckedIn();
        double double24 = booking20.getHourlyRate();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking20.getState();
        booking6.setState(bookingState25);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState25);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus22 = booking6.getStatus();
        booking6.confirmBooking();
        java.lang.String str24 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus22.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PENDING" + "'", str24, "PENDING");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("PENDING", 0.0d);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        boolean boolean7 = creditCardPayment0.refund("CANCELLED", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        booking6.checkIn();
        double double13 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.lang.String str11 = booking6.getUserId();
        boolean boolean12 = booking6.isCheckedIn();
        java.lang.String str13 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "CANCELLED", "Credit Card", localDateTime3, localDateTime4, (double) 1);
        java.lang.String str7 = booking6.getCurrentStateName();
        booking6.extend((int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
            booking6.forfeitDeposit();
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "PENDING", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime23 = booking22.getEndTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState24 = booking22.getState();
        booking6.setState(bookingState24);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(bookingState24);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        boolean boolean18 = booking6.isCheckedIn();
        booking6.checkIn();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
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
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.String str21 = booking6.getRoomId();
        booking6.extend((int) (short) 100);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "PENDING", "PENDING", localDateTime3, localDateTime4, 1.0d);
        double double7 = booking6.getTotalCost();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        boolean boolean14 = creditCardPayment0.processPayment(0.0d, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "PENDING", localDateTime3, localDateTime4, 100.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        java.lang.String str17 = booking6.getUserId();
        java.lang.String str18 = booking6.getBookingId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus19 = booking6.getStatus();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus20 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus19.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver18 = null;
        booking6.removeObserver(bookingObserver18);
        booking6.extend(100);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.refund("Credit Card", (double) 100L);
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.forfeitDeposit();
        java.lang.String str9 = booking6.getRoomId();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        double double12 = booking6.getTotalCost();
        java.lang.Class<?> wildcardClass13 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
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
        booking6.forfeitDeposit();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.removeObserver(bookingObserver15);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        java.lang.String str7 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.lang.String str9 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "hi!", "", localDateTime3, localDateTime4, (double) (short) 10);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        booking6.confirmBooking();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.processPayment((double) 100L, "PENDING");
        boolean boolean14 = creditCardPayment0.refund("hi!", (double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.lang.String str15 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        double double9 = booking6.getHourlyRate();
        booking6.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.lang.String str11 = booking6.getRoomId();
        booking6.confirmBooking();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (-1.0f));
        java.lang.String str7 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.lang.String str16 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        java.lang.String str16 = booking6.getUserId();
        java.lang.String str17 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver18 = null;
        booking6.removeObserver(bookingObserver18);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.lang.String str9 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.removeObserver(bookingObserver10);
        boolean boolean12 = booking6.isCheckedIn();
        double double13 = booking6.getTotalCost();
        booking6.extend((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        booking6.setHourlyRate((double) (short) -1);
        java.lang.String str9 = booking6.getCurrentStateName();
        double double10 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        java.lang.String str10 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        booking6.complete();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        booking6.setHourlyRate(0.0d);
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        com.yorku.roomscheduler.model.Booking booking54 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime51, localDateTime52, (double) 100L);
        java.lang.String str55 = booking54.getCurrentStateName();
        java.lang.String str56 = booking54.getBookingId();
        double double57 = booking54.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState58 = booking54.getState();
        booking6.setState(bookingState58);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PENDING" + "'", str55, "PENDING");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertNotNull(bookingState58);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "CANCELLED", "PENDING", localDateTime3, localDateTime4, (double) 1);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "", localDateTime3, localDateTime4, (double) '4');
        java.lang.String str7 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        booking6.confirmBooking();
        double double19 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        booking6.checkIn();
        java.lang.String str17 = booking6.getBookingId();
        boolean boolean18 = booking6.isCheckedIn();
        java.lang.String str19 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(bookingState20);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.setHourlyRate((double) (-1L));
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        java.lang.Class<?> wildcardClass14 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        booking6.complete();
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        booking6.confirmBooking();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState35 = booking6.getState();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertNotNull(bookingState35);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.String str31 = booking30.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking30.getState();
        booking6.setState(bookingState32);
        booking6.checkIn();
        booking6.complete();
        java.lang.String str36 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.time.LocalDateTime localDateTime7 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) '4');
        java.lang.String str13 = booking6.getCurrentStateName();
        double double14 = booking6.getHourlyRate();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.addObserver(bookingObserver15);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.yorku.roomscheduler.model.Booking booking23 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime20, localDateTime21, 0.0d);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.roomscheduler.model.Booking booking30 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime27, localDateTime28, (double) '4');
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.yorku.roomscheduler.model.Booking booking37 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime34, localDateTime35, 0.0d);
        booking37.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus39 = booking37.getStatus();
        java.time.LocalDateTime localDateTime40 = null;
        booking37.setEndTime(localDateTime40);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        com.yorku.roomscheduler.model.Booking booking48 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime45, localDateTime46, 0.0d);
        java.time.LocalDateTime localDateTime49 = null;
        booking48.setEndTime(localDateTime49);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking48.getState();
        boolean boolean52 = booking48.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState53 = booking48.getState();
        booking37.setState(bookingState53);
        booking30.setState(bookingState53);
        booking23.setState(bookingState53);
        booking6.setState(bookingState53);
        double double58 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus39.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "", localDateTime3, localDateTime4, (double) 'a');
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "Credit Card", "PENDING", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = booking6.getEndTime();
        booking6.cancel();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        booking6.complete();
        double double11 = booking6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        booking6.complete();
        double double11 = booking6.getTotalCost();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState14 = booking6.getState();
        java.time.LocalDateTime localDateTime15 = null;
        booking6.setEndTime(localDateTime15);
        booking6.setHourlyRate(1.0d);
        java.lang.String str19 = booking6.getCurrentStateName();
        boolean boolean20 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PENDING" + "'", str19, "PENDING");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getUserId();
        booking6.setHourlyRate((double) (byte) 100);
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "Credit Card", localDateTime3, localDateTime4, (double) (-1.0f));
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        booking6.checkIn();
        java.time.LocalDateTime localDateTime8 = null;
        booking6.setEndTime(localDateTime8);
        booking6.complete();
        java.lang.String str11 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        com.yorku.roomscheduler.model.Booking booking51 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime48, localDateTime49, 0.0d);
        java.time.LocalDateTime localDateTime52 = null;
        booking51.setEndTime(localDateTime52);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState54 = booking51.getState();
        java.time.LocalDateTime localDateTime55 = booking51.getEndTime();
        double double56 = booking51.getTotalCost();
        booking51.cancel();
        double double58 = booking51.getTotalCost();
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        com.yorku.roomscheduler.model.Booking booking65 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime62, localDateTime63, 0.0d);
        java.time.LocalDateTime localDateTime66 = null;
        booking65.setEndTime(localDateTime66);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState68 = booking65.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver69 = null;
        booking65.addObserver(bookingObserver69);
        booking65.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        com.yorku.roomscheduler.model.Booking booking79 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime76, localDateTime77, 0.0d);
        java.time.LocalDateTime localDateTime80 = null;
        booking79.setEndTime(localDateTime80);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState82 = booking79.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver83 = null;
        booking79.addObserver(bookingObserver83);
        booking79.setHourlyRate((double) (byte) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState87 = booking79.getState();
        booking65.setState(bookingState87);
        booking51.setState(bookingState87);
        booking6.setState(bookingState87);
        double double91 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertNotNull(bookingState82);
        org.junit.Assert.assertNotNull(bookingState87);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.yorku.roomscheduler.model.Booking booking23 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime20, localDateTime21, 0.0d);
        java.lang.String str24 = booking23.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState25 = booking23.getState();
        booking6.setState(bookingState25);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.removeObserver(bookingObserver16);
        boolean boolean18 = booking6.isCheckedIn();
        double double19 = booking6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.lang.String str9 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState12 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(bookingState12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = booking6.getStartTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus22 = booking6.getStatus();
        boolean boolean23 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime24 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus22.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        booking6.forfeitDeposit();
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        double double19 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.roomscheduler.model.Booking booking26 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime23, localDateTime24, 0.0d);
        java.time.LocalDateTime localDateTime27 = null;
        booking26.setEndTime(localDateTime27);
        double double29 = booking26.getTotalCost();
        booking26.extend(1);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking26.getState();
        booking6.setState(bookingState32);
        java.lang.String str34 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.extend((int) ' ');
        java.lang.String str12 = booking6.getRoomId();
        java.lang.String str13 = booking6.getRoomId();
        booking6.confirmBooking();
        booking6.cancel();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.lang.Class<?> wildcardClass19 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus9 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState10 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus9.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus16 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus16.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.lang.String str31 = booking30.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking30.getState();
        booking6.setState(bookingState32);
        double double34 = booking6.getTotalCost();
        java.lang.String str35 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PENDING" + "'", str35, "PENDING");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.processPayment((double) (-1.0f), "Credit Card");
        boolean boolean10 = creditCardPayment0.refund("Credit Card", (double) 'a');
        boolean boolean13 = creditCardPayment0.processPayment((double) (short) -1, "hi!");
        boolean boolean16 = creditCardPayment0.processPayment((double) (short) 1, "hi!");
        boolean boolean19 = creditCardPayment0.refund("hi!", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        double double41 = booking6.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "PENDING", localDateTime3, localDateTime4, (double) ' ');
        booking6.cancel();
        boolean boolean8 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime9 = booking6.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment(0.0d, "hi!");
        boolean boolean8 = creditCardPayment0.processPayment((double) 0.0f, "");
        boolean boolean11 = creditCardPayment0.refund("hi!", (double) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus11 = booking6.getStatus();
        booking6.setHourlyRate((double) (short) 0);
        booking6.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus11.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        booking6.setHourlyRate((double) (byte) -1);
        booking6.setHourlyRate(10.0d);
        booking6.setHourlyRate(0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        booking6.confirmBooking();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.extend((int) (byte) 0);
        booking6.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) (byte) 1);
        boolean boolean7 = creditCardPayment0.processPayment(0.0d, "Credit Card");
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        boolean boolean11 = creditCardPayment0.refund("CANCELLED", (double) 100.0f);
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        double double9 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
        booking6.extend((int) (short) 1);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        boolean boolean19 = booking6.isCheckedIn();
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
        java.time.LocalDateTime localDateTime18 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.yorku.roomscheduler.model.Booking booking25 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime22, localDateTime23, 0.0d);
        java.lang.String str26 = booking25.getUserId();
        booking25.confirmBooking();
        java.time.LocalDateTime localDateTime28 = booking25.getEndTime();
        booking25.extend((int) (byte) -1);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState31 = booking25.getState();
        booking6.setState(bookingState31);
        java.time.LocalDateTime localDateTime33 = null;
        booking6.setEndTime(localDateTime33);
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
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNotNull(bookingState31);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        booking6.confirmBooking();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        double double16 = booking6.getHourlyRate();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState10 = booking6.getState();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        boolean boolean13 = booking6.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) (-1.0f));
        booking6.confirmBooking();
        booking6.setHourlyRate((double) 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getCurrentStateName();
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.removeObserver(bookingObserver10);
        java.lang.String str12 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.setHourlyRate((double) (-1L));
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState8);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        booking6.checkIn();
        java.lang.String str17 = booking6.getBookingId();
        boolean boolean18 = booking6.isCheckedIn();
        java.lang.String str19 = booking6.getUserId();
        java.time.LocalDateTime localDateTime20 = null;
        booking6.setEndTime(localDateTime20);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.extend(1);
        booking6.checkIn();
        java.time.LocalDateTime localDateTime13 = null;
        booking6.setEndTime(localDateTime13);
        java.lang.String str15 = booking6.getUserId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "Credit Card", "PENDING", localDateTime3, localDateTime4, (double) 10L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.processPayment((double) (short) 100, "PENDING");
        boolean boolean11 = creditCardPayment0.processPayment((double) (short) 10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        double double9 = booking6.getTotalCost();
        double double10 = booking6.getTotalCost();
        boolean boolean11 = booking6.isCheckedIn();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "hi!", localDateTime3, localDateTime4, (double) 0L);
        booking6.forfeitDeposit();
        booking6.setHourlyRate((double) 0L);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        double double9 = booking6.getTotalCost();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.cancel();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        double double18 = booking6.getHourlyRate();
        booking6.forfeitDeposit();
        java.lang.String str20 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        booking6.setHourlyRate((double) (byte) -1);
        java.lang.String str18 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime19 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PENDING" + "'", str18, "PENDING");
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        double double21 = booking6.getTotalCost();
        booking6.forfeitDeposit();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState8 = booking6.getState();
        booking6.checkIn();
        java.lang.String str10 = booking6.getRoomId();
        java.lang.String str11 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.roomscheduler.model.Booking booking15 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime12, localDateTime13, 0.0d);
        java.time.LocalDateTime localDateTime16 = null;
        booking15.setEndTime(localDateTime16);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking15.getState();
        boolean boolean19 = booking15.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState20 = booking15.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking15.removeObserver(bookingObserver21);
        java.time.LocalDateTime localDateTime23 = booking15.getStartTime();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState24 = booking15.getState();
        booking6.setState(bookingState24);
        java.lang.String str26 = booking6.getCurrentStateName();
        booking6.setHourlyRate((double) '4');
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PENDING" + "'", str26, "PENDING");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        boolean boolean3 = creditCardPayment0.refund("Credit Card", (double) (short) 1);
        java.lang.String str4 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver21 = null;
        booking6.addObserver(bookingObserver21);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getUserId();
        java.lang.String str10 = booking6.getCurrentStateName();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        booking6.setHourlyRate((double) (byte) -1);
        booking6.setHourlyRate(10.0d);
        double double20 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        booking6.cancel();
        java.lang.String str10 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CANCELLED" + "'", str10, "CANCELLED");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        java.lang.String str21 = booking6.getRoomId();
        booking6.setHourlyRate((double) 0L);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        java.lang.String str20 = booking6.getCurrentStateName();
        double double21 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("CANCELLED", (double) 100.0f);
        boolean boolean14 = creditCardPayment0.refund("hi!", (double) 1L);
        boolean boolean17 = creditCardPayment0.refund("Credit Card", (double) 1);
        boolean boolean20 = creditCardPayment0.processPayment(1.0d, "PENDING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus7 = booking6.getStatus();
        booking6.confirmBooking();
        booking6.extend(0);
        boolean boolean11 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime14 = null;
        booking6.setEndTime(localDateTime14);
        java.lang.String str16 = booking6.getCurrentStateName();
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus7.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PENDING" + "'", str16, "PENDING");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking6.getState();
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
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "PENDING", "PENDING", localDateTime3, localDateTime4, 100.0d);
        booking6.setHourlyRate(0.0d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        java.lang.String str9 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getCurrentStateName();
        java.time.LocalDateTime localDateTime12 = booking6.getEndTime();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime16, localDateTime17, 0.0d);
        java.time.LocalDateTime localDateTime20 = null;
        booking19.setEndTime(localDateTime20);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        booking19.forfeitDeposit();
        booking19.setHourlyRate((double) '4');
        java.lang.String str26 = booking19.getBookingId();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.yorku.roomscheduler.model.Booking booking33 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime30, localDateTime31, (double) '4');
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        com.yorku.roomscheduler.model.Booking booking40 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime37, localDateTime38, 0.0d);
        booking40.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus42 = booking40.getStatus();
        java.time.LocalDateTime localDateTime43 = null;
        booking40.setEndTime(localDateTime43);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        com.yorku.roomscheduler.model.Booking booking51 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime48, localDateTime49, 0.0d);
        java.time.LocalDateTime localDateTime52 = null;
        booking51.setEndTime(localDateTime52);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState54 = booking51.getState();
        boolean boolean55 = booking51.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState56 = booking51.getState();
        booking40.setState(bookingState56);
        booking33.setState(bookingState56);
        booking19.setState(bookingState56);
        booking6.setState(bookingState56);
        booking6.setHourlyRate((double) (byte) 100);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus42.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookingState56);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        boolean boolean25 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        java.lang.String str11 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PENDING" + "'", str11, "PENDING");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.processPayment((double) 1L, "hi!");
        boolean boolean11 = creditCardPayment0.refund("PENDING", (double) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        booking6.confirmBooking();
        java.lang.String str16 = booking6.getBookingId();
        booking6.cancel();
        java.lang.String str18 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "PENDING", "CANCELLED", localDateTime3, localDateTime4, (double) '#');
        booking6.cancel();
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        booking6.checkIn();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver11 = null;
        booking6.addObserver(bookingObserver11);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState13 = booking6.getState();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment(1.0d, "hi!");
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.removeObserver(bookingObserver14);
        booking6.extend((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "CANCELLED", "", localDateTime3, localDateTime4, (double) (short) -1);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
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
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        booking6.confirmBooking();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState10 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState10);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        booking6.confirmBooking();
        java.lang.String str16 = booking6.getBookingId();
        booking6.cancel();
        java.time.LocalDateTime localDateTime18 = null;
        booking6.setEndTime(localDateTime18);
        double double20 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        booking6.checkIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.extend((int) (byte) -1);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState12 = booking6.getState();
        booking6.extend((int) ' ');
        java.lang.Class<?> wildcardClass15 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        booking6.setHourlyRate((double) 100.0f);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        booking6.complete();
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver18 = null;
        booking6.addObserver(bookingObserver18);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "hi!", "", localDateTime3, localDateTime4, (double) (short) 100);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Credit Card", (double) (short) 0);
        boolean boolean12 = creditCardPayment0.refund("PENDING", 0.0d);
        java.lang.String str13 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("Credit Card", 0.0d);
        boolean boolean15 = creditCardPayment0.processPayment((double) (short) -1, "hi!");
        java.lang.String str16 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str17 = creditCardPayment0.getPaymentMethodName();
        boolean boolean20 = creditCardPayment0.processPayment(0.0d, "hi!");
        boolean boolean23 = creditCardPayment0.refund("PENDING", (double) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) '4');
        booking6.setHourlyRate((double) 0);
        java.lang.String str9 = booking6.getBookingId();
        booking6.cancel();
        booking6.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.lang.String str10 = booking6.getUserId();
        java.lang.String str11 = booking6.getUserId();
        java.lang.String str12 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime13 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "hi!", "hi!", localDateTime3, localDateTime4, (double) 0.0f);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "CANCELLED", "CANCELLED", localDateTime3, localDateTime4, (double) 10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        boolean boolean10 = booking6.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        booking6.setEndTime(localDateTime11);
        double double13 = booking6.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "", localDateTime3, localDateTime4, (double) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState7 = booking6.getState();
        java.lang.String str8 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus9 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING" + "'", str8, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus9.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver33 = null;
        booking29.addObserver(bookingObserver33);
        booking29.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        com.yorku.roomscheduler.model.Booking booking43 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime40, localDateTime41, 0.0d);
        java.time.LocalDateTime localDateTime44 = null;
        booking43.setEndTime(localDateTime44);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState46 = booking43.getState();
        boolean boolean47 = booking43.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState48 = booking43.getState();
        booking29.setState(bookingState48);
        java.lang.String str50 = booking29.getRoomId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState51 = booking29.getState();
        booking6.setState(bookingState51);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNotNull(bookingState46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(bookingState51);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        java.lang.String str8 = booking6.getRoomId();
        java.lang.String str9 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        java.lang.String str11 = booking6.getBookingId();
        java.lang.String str12 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus13 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus13.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "hi!", "hi!", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getUserId();
        booking6.setHourlyRate((double) (byte) 100);
        double double10 = booking6.getHourlyRate();
        double double11 = booking6.getHourlyRate();
        java.lang.String str12 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        booking6.complete();
        java.lang.String str16 = booking6.getBookingId();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.addObserver(bookingObserver17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean8 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean11 = creditCardPayment0.refund("", (double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}

