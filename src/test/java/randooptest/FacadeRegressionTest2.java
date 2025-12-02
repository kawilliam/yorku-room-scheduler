package randooptest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacadeRegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        boolean boolean8 = creditCardPayment0.refund("", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.forfeitDeposit();
        java.lang.String str10 = booking6.getUserId();
        booking6.extend((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "", "Credit Card", localDateTime3, localDateTime4, (double) 100L);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        booking6.confirmBooking();
        double double10 = booking6.getHourlyRate();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver11 = null;
        booking6.addObserver(bookingObserver11);
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        booking6.checkIn();
        booking6.complete();
        booking6.forfeitDeposit();
        java.lang.String str10 = booking6.getCurrentStateName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.time.LocalDateTime localDateTime23 = null;
        booking6.setEndTime(localDateTime23);
        java.time.LocalDateTime localDateTime25 = null;
        booking6.setEndTime(localDateTime25);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking6.addObserver(bookingObserver19);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PENDING" + "'", str18, "PENDING");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        booking6.forfeitDeposit();
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        booking6.forfeitDeposit();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        booking6.complete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime9 = booking6.getEndTime();
        booking6.cancel();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "CANCELLED", "", localDateTime3, localDateTime4, (double) 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        java.lang.String str19 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.String str38 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus39 = booking6.getStatus();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PENDING" + "'", str38, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus39.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        booking6.forfeitDeposit();
        booking6.confirmBooking();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PENDING" + "'", str13, "PENDING");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "CANCELLED", localDateTime3, localDateTime4, 10.0d);
        java.time.LocalDateTime localDateTime7 = booking6.getEndTime();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        booking6.complete();
        boolean boolean17 = booking6.isCheckedIn();
        java.lang.String str18 = booking6.getRoomId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        boolean boolean8 = creditCardPayment0.refund("hi!", (double) (short) -1);
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        boolean boolean12 = creditCardPayment0.refund("", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        booking6.forfeitDeposit();
        java.lang.String str14 = booking6.getUserId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        // The following exception was thrown during execution in test generation
        try {
            booking6.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) '4');
        booking6.cancel();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        boolean boolean29 = booking6.isCheckedIn();
        // The following exception was thrown during execution in test generation
        try {
            booking6.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        double double14 = booking6.getHourlyRate();
        java.time.LocalDateTime localDateTime15 = booking6.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.extend(1);
        booking6.setHourlyRate((double) (short) 1);
        booking6.cancel();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "PENDING", localDateTime3, localDateTime4, (double) 100.0f);
        booking6.forfeitDeposit();
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "PENDING", "hi!", localDateTime3, localDateTime4, (double) (byte) 100);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus14 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus14.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        booking6.forfeitDeposit();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus17 = booking6.getStatus();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus17.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "", "hi!", localDateTime3, localDateTime4, (double) 10.0f);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setEndTime(localDateTime9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        java.lang.String str21 = booking6.getCurrentStateName();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PENDING" + "'", str21, "PENDING");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, 10.0d);
        booking6.complete();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        booking6.confirmBooking();
        boolean boolean10 = booking6.isCheckedIn();
        booking6.extend((int) (byte) 0);
        booking6.forfeitDeposit();
        double double14 = booking6.getTotalCost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        booking6.setHourlyRate(0.0d);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.roomscheduler.model.Booking booking15 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime12, localDateTime13, 0.0d);
        java.time.LocalDateTime localDateTime16 = null;
        booking15.setEndTime(localDateTime16);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking15.getState();
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
        booking15.setState(bookingState41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        com.yorku.roomscheduler.model.Booking booking50 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime47, localDateTime48, 0.0d);
        java.lang.String str51 = booking50.getUserId();
        booking50.confirmBooking();
        java.time.LocalDateTime localDateTime53 = booking50.getEndTime();
        boolean boolean54 = booking50.isCheckedIn();
        java.time.LocalDateTime localDateTime55 = booking50.getStartTime();
        booking50.checkIn();
        java.lang.String str57 = booking50.getCurrentStateName();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        com.yorku.roomscheduler.model.Booking booking64 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime61, localDateTime62, 0.0d);
        java.lang.String str65 = booking64.getUserId();
        java.lang.String str66 = booking64.getRoomId();
        java.lang.String str67 = booking64.getUserId();
        java.lang.String str68 = booking64.getCurrentStateName();
        double double69 = booking64.getHourlyRate();
        java.lang.String str70 = booking64.getBookingId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState71 = booking64.getState();
        booking50.setState(bookingState71);
        booking15.setState(bookingState71);
        booking6.setState(bookingState71);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus27.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(localDateTime55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PENDING" + "'", str57, "PENDING");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PENDING" + "'", str68, "PENDING");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(bookingState71);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime3, localDateTime4, (double) (byte) 100);
        java.lang.String str7 = booking6.getCurrentStateName();
        java.lang.String str8 = booking6.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        booking6.confirmBooking();
        double double11 = booking6.getTotalCost();
        booking6.extend((int) (short) 100);
        java.time.LocalDateTime localDateTime14 = null;
        booking6.setEndTime(localDateTime14);
        booking6.confirmBooking();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver17 = null;
        booking6.removeObserver(bookingObserver17);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", (double) (byte) 10);
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str7 = creditCardPayment0.getPaymentMethodName();
        boolean boolean10 = creditCardPayment0.processPayment((double) (short) 1, "hi!");
        java.lang.String str11 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        booking6.complete();
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver14 = null;
        booking6.addObserver(bookingObserver14);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver16 = null;
        booking6.addObserver(bookingObserver16);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        boolean boolean8 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        boolean boolean11 = creditCardPayment0.refund("", (-1.0d));
        java.lang.String str12 = creditCardPayment0.getPaymentMethodName();
        boolean boolean15 = creditCardPayment0.refund("hi!", (double) '#');
        boolean boolean18 = creditCardPayment0.processPayment(10.0d, "Credit Card");
        boolean boolean21 = creditCardPayment0.processPayment(0.0d, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("", (double) 10L);
        boolean boolean7 = creditCardPayment0.refund("PENDING", (double) (byte) 0);
        java.lang.String str8 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str9 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str10 = creditCardPayment0.getPaymentMethodName();
        boolean boolean13 = creditCardPayment0.refund("hi!", (double) (byte) 0);
        boolean boolean16 = creditCardPayment0.processPayment((double) (-1), "PENDING");
        java.lang.String str17 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Credit Card" + "'", str17, "Credit Card");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        boolean boolean19 = booking6.isCheckedIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus20 = booking6.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        booking6.setEndTime(localDateTime21);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.yorku.roomscheduler.model.Booking booking31 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime28, localDateTime29, 0.0d);
        java.time.LocalDateTime localDateTime32 = null;
        booking31.setEndTime(localDateTime32);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking31.getState();
        booking31.forfeitDeposit();
        booking31.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus37 = booking31.getStatus();
        booking31.forfeitDeposit();
        booking31.confirmBooking();
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver54 = null;
        booking46.removeObserver(bookingObserver54);
        java.lang.String str56 = booking46.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState57 = booking46.getState();
        booking31.setState(bookingState57);
        booking6.setState(bookingState57);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus37.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(localDateTime50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PENDING" + "'", str56, "PENDING");
        org.junit.Assert.assertNotNull(bookingState57);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        java.time.LocalDateTime localDateTime19 = null;
        booking6.setEndTime(localDateTime19);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.refund("Credit Card", 100.0d);
        boolean boolean8 = creditCardPayment0.processPayment((double) 1L, "");
        boolean boolean11 = creditCardPayment0.refund("Credit Card", 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.lang.String str20 = booking6.getBookingId();
        double double21 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.time.LocalDateTime localDateTime16 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.lang.String str16 = booking6.getBookingId();
        booking6.forfeitDeposit();
        double double18 = booking6.getHourlyRate();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "CANCELLED", localDateTime3, localDateTime4, (double) (-1));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        com.yorku.roomscheduler.model.Booking booking19 = new com.yorku.roomscheduler.model.Booking("", "hi!", "hi!", localDateTime16, localDateTime17, (double) '4');
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus20 = booking19.getStatus();
        java.lang.String str21 = booking19.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState22 = booking19.getState();
        booking6.setState(bookingState22);
        booking6.cancel();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus20.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PENDING" + "'", str21, "PENDING");
        org.junit.Assert.assertNotNull(bookingState22);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        double double39 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime40 = null;
        booking6.setEndTime(localDateTime40);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.lang.String str49 = booking6.getRoomId();
        booking6.forfeitDeposit();
        java.lang.String str51 = booking6.getBookingId();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PENDING" + "'", str47, "PENDING");
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus48.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "hi!", "", localDateTime3, localDateTime4, (double) (short) 10);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.addObserver(bookingObserver7);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        boolean boolean4 = creditCardPayment0.refund("Credit Card", (double) 0.0f);
        java.lang.String str5 = creditCardPayment0.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState17 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.time.LocalDateTime localDateTime19 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus15.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.roomscheduler.model.Booking booking22 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime19, localDateTime20, 0.0d);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.yorku.roomscheduler.model.Booking booking29 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime26, localDateTime27, 0.0d);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setEndTime(localDateTime30);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState32 = booking29.getState();
        boolean boolean33 = booking29.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState34 = booking29.getState();
        booking22.setState(bookingState34);
        java.lang.String str36 = booking22.getCurrentStateName();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState37 = booking22.getState();
        booking22.complete();
        boolean boolean39 = booking22.isCheckedIn();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        com.yorku.roomscheduler.model.Booking booking46 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime43, localDateTime44, 0.0d);
        java.lang.String str47 = booking46.getUserId();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState48 = booking46.getState();
        booking22.setState(bookingState48);
        booking6.setState(bookingState48);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver51 = null;
        booking6.removeObserver(bookingObserver51);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PENDING" + "'", str36, "PENDING");
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(bookingState48);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking6.addObserver(bookingObserver19);
        // The following exception was thrown during execution in test generation
        try {
            booking6.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.lang.String str7 = booking6.getUserId();
        booking6.confirmBooking();
        java.lang.String str9 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime10 = null;
        booking6.setEndTime(localDateTime10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        boolean boolean16 = booking6.isCheckedIn();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "", "hi!", localDateTime3, localDateTime4, (double) 1L);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver7 = null;
        booking6.removeObserver(bookingObserver7);
        java.lang.String str9 = booking6.getCurrentStateName();
        booking6.forfeitDeposit();
        java.time.LocalDateTime localDateTime11 = booking6.getEndTime();
        java.lang.String str12 = booking6.getUserId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.confirmBooking();
        java.time.LocalDateTime localDateTime8 = booking6.getEndTime();
        booking6.cancel();
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver19 = null;
        booking6.addObserver(bookingObserver19);
        java.time.LocalDateTime localDateTime21 = booking6.getEndTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.String str22 = booking6.getRoomId();
        java.lang.Class<?> wildcardClass23 = booking6.getClass();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("Credit Card", "PENDING", "hi!", localDateTime3, localDateTime4, (double) (byte) 0);
        booking6.extend(0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        java.time.LocalDateTime localDateTime10 = null;
        booking6.setEndTime(localDateTime10);
        java.lang.Class<?> wildcardClass12 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        booking6.complete();
        java.time.LocalDateTime localDateTime24 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime25 = booking6.getEndTime();
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PENDING" + "'", str20, "PENDING");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus22.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        double double9 = booking6.getTotalCost();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus10 = booking6.getStatus();
        java.time.LocalDateTime localDateTime11 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime12 = booking6.getStartTime();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus10.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        booking6.complete();
        booking6.cancel();
        java.lang.String str11 = booking6.getRoomId();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.String str14 = booking6.getCurrentStateName();
        booking6.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PENDING" + "'", str14, "PENDING");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        java.lang.Class<?> wildcardClass15 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PENDING" + "'", str10, "PENDING");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver45 = null;
        booking6.removeObserver(bookingObserver45);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("CANCELLED", "Credit Card", "PENDING", localDateTime3, localDateTime4, (double) (-1.0f));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "PENDING", "PENDING", localDateTime3, localDateTime4, (double) (short) 10);
        java.lang.String str7 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking6.getStartTime();
        java.lang.String str9 = booking6.getCurrentStateName();
        double double10 = booking6.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = booking6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PENDING" + "'", str9, "PENDING");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        java.lang.String str22 = booking6.getRoomId();
        java.time.LocalDateTime localDateTime23 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        com.yorku.roomscheduler.patterns.state.BookingState bookingState16 = booking6.getState();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        booking6.extend((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        java.time.LocalDateTime localDateTime10 = booking6.getEndTime();
        double double11 = booking6.getTotalCost();
        double double12 = booking6.getTotalCost();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.yorku.roomscheduler.patterns.strategy.CreditCardPayment creditCardPayment0 = new com.yorku.roomscheduler.patterns.strategy.CreditCardPayment();
        java.lang.String str1 = creditCardPayment0.getPaymentMethodName();
        java.lang.String str2 = creditCardPayment0.getPaymentMethodName();
        boolean boolean5 = creditCardPayment0.processPayment((double) (byte) 100, "Credit Card");
        java.lang.String str6 = creditCardPayment0.getPaymentMethodName();
        boolean boolean9 = creditCardPayment0.refund("Credit Card", (double) (short) 0);
        boolean boolean12 = creditCardPayment0.refund("PENDING", 0.0d);
        boolean boolean15 = creditCardPayment0.refund("CANCELLED", 1.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Credit Card" + "'", str1, "Credit Card");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card" + "'", str2, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        booking6.complete();
        java.lang.String str20 = booking6.getBookingId();
        // The following exception was thrown during execution in test generation
        try {
            booking6.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.patterns.observer.BookingObserver.update(com.yorku.roomscheduler.patterns.observer.BookingEvent)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.String str14 = booking6.getCurrentStateName();
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver15 = null;
        booking6.addObserver(bookingObserver15);
        java.time.LocalDateTime localDateTime17 = booking6.getStartTime();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CANCELLED" + "'", str14, "CANCELLED");
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        booking6.complete();
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        java.time.LocalDateTime localDateTime15 = null;
        booking6.setEndTime(localDateTime15);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("PENDING", "Credit Card", "", localDateTime3, localDateTime4, (double) 100);
        java.lang.String str7 = booking6.getCurrentStateName();
        booking6.setHourlyRate((double) 10.0f);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver10 = null;
        booking6.addObserver(bookingObserver10);
        com.yorku.roomscheduler.patterns.observer.BookingObserver bookingObserver12 = null;
        booking6.addObserver(bookingObserver12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PENDING" + "'", str7, "PENDING");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "Credit Card", "Credit Card", localDateTime3, localDateTime4, (double) (short) -1);
        boolean boolean7 = booking6.isCheckedIn();
        booking6.extend((int) '#');
        java.lang.String str10 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.roomscheduler.model.Booking booking17 = new com.yorku.roomscheduler.model.Booking("", "", "", localDateTime14, localDateTime15, (double) 0);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState18 = booking17.getState();
        booking6.setState(bookingState18);
        java.lang.String str20 = booking6.getUserId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        booking6.checkIn();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus8 = booking6.getStatus();
        booking6.checkIn();
        booking6.setHourlyRate((double) 1L);
        java.time.LocalDateTime localDateTime12 = null;
        booking6.setEndTime(localDateTime12);
        booking6.setHourlyRate((double) (short) 0);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus18 = booking6.getStatus();
        booking6.complete();
        java.lang.String str20 = booking6.getBookingId();
        java.lang.String str21 = booking6.getBookingId();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.yorku.roomscheduler.model.Booking booking28 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime25, localDateTime26, 0.0d);
        booking28.checkIn();
        java.lang.String str30 = booking28.getUserId();
        double double31 = booking28.getHourlyRate();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus32 = booking28.getStatus();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState33 = booking28.getState();
        booking6.setState(bookingState33);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus18.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN + "'", bookingStatus32.equals(com.yorku.roomscheduler.model.enums.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState33);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.roomscheduler.model.Booking booking6 = new com.yorku.roomscheduler.model.Booking("hi!", "hi!", "hi!", localDateTime3, localDateTime4, 0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        booking6.setEndTime(localDateTime7);
        com.yorku.roomscheduler.patterns.state.BookingState bookingState9 = booking6.getState();
        boolean boolean10 = booking6.isCheckedIn();
        com.yorku.roomscheduler.patterns.state.BookingState bookingState11 = booking6.getState();
        com.yorku.roomscheduler.model.enums.BookingStatus bookingStatus12 = booking6.getStatus();
        boolean boolean13 = booking6.isCheckedIn();
        booking6.setHourlyRate((double) (byte) 100);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + com.yorku.roomscheduler.model.enums.BookingStatus.PENDING + "'", bookingStatus12.equals(com.yorku.roomscheduler.model.enums.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

