package randooptest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FactoryRegressionTest1 {

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
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = student4.getAccountType();
        java.lang.String str7 = student4.getStudentNumber();
        java.lang.String str8 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        boolean boolean9 = student4.isVerified();
        double double10 = student4.getHourlyRate();
        student4.verify();
        java.lang.String str12 = student4.getEmail();
        java.lang.String str13 = student4.getPass();
        double double14 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getUserId();
        boolean boolean14 = partner5.isVerified();
        double double15 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getPass();
        double double11 = student4.getHourlyRate();
        double double12 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        boolean boolean9 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        double double9 = staff5.getHourlyRate();
        staff5.verify();
        java.lang.String str11 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getPass();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        student4.verify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        com.yorku.roomscheduler.model.users.Partner partner16 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str17 = partner16.getCompanyName();
        java.lang.String str18 = partner16.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType19 = partner16.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory20 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType19);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user25 = userFactory20.createUser("hi!", "hi!", "hi!", strArray24);
        com.yorku.roomscheduler.model.users.User user26 = userFactory7.createUser("", "hi!", "", strArray24);
        com.yorku.roomscheduler.model.enums.AccountType accountType27 = user26.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + accountType19 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType19.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertTrue("'" + accountType27 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType27.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getUserId();
        java.lang.String str8 = faculty5.getUserId();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user30 = userFactory23.createUser("", "", "hi!", strArray29);
        com.yorku.roomscheduler.model.users.User user31 = userFactory10.createUser("hi!", "", "hi!", strArray29);
        com.yorku.roomscheduler.model.users.Partner partner40 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str41 = partner40.getCompanyName();
        java.lang.String str42 = partner40.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType43 = partner40.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType43);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory45 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType43);
        com.yorku.roomscheduler.model.users.Partner partner54 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str55 = partner54.getCompanyName();
        java.lang.String str56 = partner54.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType57 = partner54.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory58 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType57);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user65 = userFactory58.createUser("", "", "hi!", strArray64);
        com.yorku.roomscheduler.model.users.User user66 = userFactory45.createUser("hi!", "", "hi!", strArray64);
        com.yorku.roomscheduler.model.users.User user67 = userFactory10.createUser("hi!", "", "hi!", strArray64);
        java.lang.String str68 = user67.getEmail();
        java.lang.String str69 = user67.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + accountType43 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType43.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertNotNull(userFactory45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + accountType57 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType57.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getUserId();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getEmployeeId();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getDepartment();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        java.lang.String str11 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getPass();
        java.lang.String str8 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        double double11 = staff5.getHourlyRate();
        java.lang.String str12 = staff5.getDepartment();
        staff5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getUserId();
        java.lang.String str8 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "hi!");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getStudentNumber();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "", "");
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getUserId();
        staff5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory15 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType14);
        java.lang.Class<?> wildcardClass16 = userFactory15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory25 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory26 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.model.users.Partner partner35 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str36 = partner35.getCompanyName();
        java.lang.String str37 = partner35.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType38 = partner35.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory39 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory40 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.model.users.Partner partner49 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str50 = partner49.getCompanyName();
        java.lang.String str51 = partner49.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType52 = partner49.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory53 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType52);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory54 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType52);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user62 = userFactory54.createUser("", "", "", strArray61);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user73 = userFactory54.createUser("", "", "hi!", strArray72);
        com.yorku.roomscheduler.model.users.User user74 = userFactory40.createUser("", "hi!", "hi!", strArray72);
        com.yorku.roomscheduler.model.users.User user75 = userFactory26.createUser("hi!", "hi!", "", strArray72);
        com.yorku.roomscheduler.model.users.User user76 = userFactory10.createUser("hi!", "hi!", "hi!", strArray72);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertNotNull(userFactory25);
        org.junit.Assert.assertNotNull(userFactory26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + accountType38 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType38.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory39);
        org.junit.Assert.assertNotNull(userFactory40);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + accountType52 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType52.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory53);
        org.junit.Assert.assertNotNull(userFactory54);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(user74);
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertNotNull(user76);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getEmail();
        double double8 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getDepartment();
        staff5.verify();
        boolean boolean12 = staff5.isVerified();
        java.lang.String str13 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getCompanyName();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        double double7 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user26 = userFactory9.createUser("", "hi!", "hi!", strArray25);
        java.lang.String str27 = user26.getUserId();
        user26.verify();
        java.lang.String str29 = user26.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType15 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType15 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType15.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getUserId();
        java.lang.String str15 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getEmployeeId();
        java.lang.String str12 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        student4.verify();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        java.lang.String str15 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str12 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        double double10 = staff5.getHourlyRate();
        double double11 = staff5.getHourlyRate();
        java.lang.String str12 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getUserId();
        java.lang.String str14 = partner5.getCompanyName();
        java.lang.String str15 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "hi!");
        java.lang.String str6 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getOrganizationId();
        java.lang.String str14 = partner5.getUserId();
        double double15 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass12 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getPass();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getPass();
        java.lang.String str9 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "", "", "");
        double double6 = partner5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        boolean boolean9 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        java.lang.Class<?> wildcardClass8 = accountType7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getOrganizationId();
        java.lang.String str14 = partner5.getUserId();
        java.lang.String str15 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getUserId();
        java.lang.String str11 = staff5.getEmployeeId();
        boolean boolean12 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getPass();
        java.lang.String str7 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.String str14 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getUserId();
        boolean boolean11 = student4.isVerified();
        java.lang.String str12 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        double double12 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "hi!", "", "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        double double8 = student4.getHourlyRate();
        boolean boolean9 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getUserId();
        boolean boolean12 = partner5.isVerified();
        double double13 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        com.yorku.roomscheduler.model.users.Partner partner25 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str26 = partner25.getCompanyName();
        java.lang.String str27 = partner25.getCompanyName();
        java.lang.String str28 = partner25.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType29 = partner25.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory30 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType29);
        com.yorku.roomscheduler.model.users.Partner partner39 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str40 = partner39.getCompanyName();
        java.lang.String str41 = partner39.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType42 = partner39.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory43 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user52 = userFactory44.createUser("", "", "", strArray51);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user63 = userFactory44.createUser("", "", "hi!", strArray62);
        com.yorku.roomscheduler.model.users.User user64 = userFactory30.createUser("hi!", "", "", strArray62);
        com.yorku.roomscheduler.model.users.User user65 = userFactory9.createUser("", "hi!", "hi!", strArray62);
        user65.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + accountType29 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType29.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + accountType42 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType42.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory43);
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(user65);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getUserId();
        java.lang.String str11 = faculty5.getEmployeeId();
        java.lang.String str12 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getDepartment();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "hi!", "hi!");
        faculty5.verify();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getDepartment();
        staff5.verify();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory10);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        double double9 = faculty5.getHourlyRate();
        java.lang.String str10 = faculty5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "hi!", "hi!");
        faculty5.verify();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        double double9 = faculty5.getHourlyRate();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "hi!");
        java.lang.String str6 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getUserId();
        java.lang.String str12 = student4.getStudentNumber();
        java.lang.String str13 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getEmployeeId();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        faculty5.verify();
        java.lang.String str10 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getOrganizationId();
        double double14 = partner5.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.String str14 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.roomscheduler.model.users.User user18 = userFactory13.createUser("hi!", "hi!", "hi!", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"extraParams\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertNotNull(userFactory13);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        student4.verify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        boolean boolean10 = faculty5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory12);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user32 = userFactory24.createUser("", "", "", strArray31);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user43 = userFactory24.createUser("", "", "hi!", strArray42);
        com.yorku.roomscheduler.model.users.User user44 = userFactory10.createUser("", "hi!", "hi!", strArray42);
        com.yorku.roomscheduler.model.enums.AccountType accountType45 = user44.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertTrue("'" + accountType45 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType45.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "");
        java.lang.String str6 = partner5.getEmail();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory8);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        partner5.verify();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "");
        staff5.verify();
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.Class<?> wildcardClass7 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        partner5.verify();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getUserId();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "hi!", "hi!");
        boolean boolean6 = faculty5.isVerified();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmployeeId();
        faculty5.verify();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmail();
        java.lang.String str11 = staff5.getDepartment();
        java.lang.String str12 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        boolean boolean9 = student4.isVerified();
        java.lang.String str10 = student4.getUserId();
        boolean boolean11 = student4.isVerified();
        java.lang.String str12 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "", "hi!", "");
        java.lang.String str6 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner21 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str22 = partner21.getCompanyName();
        java.lang.String str23 = partner21.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType24 = partner21.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory25 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType24);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory26 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType24);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user35 = userFactory26.createUser("hi!", "hi!", "", strArray34);
        com.yorku.roomscheduler.model.users.User user36 = userFactory12.createUser("", "", "hi!", strArray34);
        com.yorku.roomscheduler.model.users.Staff staff45 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double46 = staff45.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType47 = staff45.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory48 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType47);
        com.yorku.roomscheduler.model.users.Partner partner57 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str58 = partner57.getCompanyName();
        java.lang.String str59 = partner57.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType60 = partner57.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory61 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType60);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory62 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType60);
        com.yorku.roomscheduler.model.users.Partner partner71 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str72 = partner71.getCompanyName();
        java.lang.String str73 = partner71.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType74 = partner71.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory75 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType74);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user82 = userFactory75.createUser("", "", "hi!", strArray81);
        com.yorku.roomscheduler.model.users.User user83 = userFactory62.createUser("hi!", "", "hi!", strArray81);
        com.yorku.roomscheduler.model.users.User user84 = userFactory48.createUser("", "hi!", "hi!", strArray81);
        com.yorku.roomscheduler.model.users.User user85 = userFactory12.createUser("hi!", "hi!", "hi!", strArray81);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + accountType24 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType24.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory25);
        org.junit.Assert.assertNotNull(userFactory26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 40.0d + "'", double46 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType47 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType47.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory48);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + accountType60 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType60.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory61);
        org.junit.Assert.assertNotNull(userFactory62);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + accountType74 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType74.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory75);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(user85);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        double double12 = partner5.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        double double6 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = partner5.getAccountType();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getOrganizationId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner21 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str22 = partner21.getCompanyName();
        java.lang.String str23 = partner21.getEmail();
        boolean boolean24 = partner21.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType25 = partner21.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType26 = partner21.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory27 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.model.users.Partner partner36 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str37 = partner36.getCompanyName();
        java.lang.String str38 = partner36.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType39 = partner36.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory40 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType39);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory41 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType39);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user49 = userFactory41.createUser("", "", "", strArray48);
        com.yorku.roomscheduler.model.users.User user50 = userFactory27.createUser("", "hi!", "", strArray48);
        com.yorku.roomscheduler.model.users.Partner partner59 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str60 = partner59.getCompanyName();
        java.lang.String str61 = partner59.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType62 = partner59.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory63 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType62);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory64 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType62);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user72 = userFactory64.createUser("", "", "", strArray71);
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user83 = userFactory64.createUser("", "", "hi!", strArray82);
        com.yorku.roomscheduler.model.users.User user84 = userFactory27.createUser("", "", "", strArray82);
        com.yorku.roomscheduler.model.users.User user85 = userFactory12.createUser("", "", "hi!", strArray82);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + accountType25 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType25.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType26 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType26.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory27);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + accountType39 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType39.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory40);
        org.junit.Assert.assertNotNull(userFactory41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + accountType62 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType62.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory63);
        org.junit.Assert.assertNotNull(userFactory64);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(user85);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "hi!");
        boolean boolean5 = student4.isVerified();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getPass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "hi!", "");
        faculty5.verify();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getPass();
        java.lang.String str7 = staff5.getUserId();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        boolean boolean6 = faculty5.isVerified();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        boolean boolean6 = faculty5.isVerified();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory22 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        com.yorku.roomscheduler.model.users.Partner partner31 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str32 = partner31.getCompanyName();
        java.lang.String str33 = partner31.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType34 = partner31.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory35 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType34);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user42 = userFactory35.createUser("", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.User user43 = userFactory22.createUser("hi!", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.User user44 = userFactory8.createUser("", "hi!", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.Partner partner53 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str54 = partner53.getCompanyName();
        java.lang.String str55 = partner53.getEmail();
        boolean boolean56 = partner53.isVerified();
        java.lang.String str57 = partner53.getEmail();
        partner53.verify();
        java.lang.String str59 = partner53.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType60 = partner53.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory61 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType60);
        com.yorku.roomscheduler.model.users.Partner partner70 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str71 = partner70.getCompanyName();
        java.lang.String str72 = partner70.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType73 = partner70.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory74 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory75 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory76 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory77 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory78 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory79 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory80 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        java.lang.String[] strArray86 = new java.lang.String[] { "", "" };
        com.yorku.roomscheduler.model.users.User user87 = userFactory80.createUser("", "hi!", "hi!", strArray86);
        com.yorku.roomscheduler.model.users.User user88 = userFactory61.createUser("hi!", "hi!", "hi!", strArray86);
        com.yorku.roomscheduler.model.users.User user89 = userFactory8.createUser("", "", "", strArray86);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertNotNull(userFactory22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + accountType34 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType34.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + accountType60 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType60.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory61);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + accountType73 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType73.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory74);
        org.junit.Assert.assertNotNull(userFactory75);
        org.junit.Assert.assertNotNull(userFactory76);
        org.junit.Assert.assertNotNull(userFactory77);
        org.junit.Assert.assertNotNull(userFactory78);
        org.junit.Assert.assertNotNull(userFactory79);
        org.junit.Assert.assertNotNull(userFactory80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(user87);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(user89);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getUserId();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getOrganizationId();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        staff5.verify();
        java.lang.String str11 = staff5.getPass();
        java.lang.String str12 = staff5.getDepartment();
        java.lang.String str13 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getEmployeeId();
        double double10 = faculty5.getHourlyRate();
        boolean boolean11 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getStudentNumber();
        student4.verify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        partner5.verify();
        java.lang.Class<?> wildcardClass8 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        double double12 = staff5.getHourlyRate();
        double double13 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        double double10 = faculty5.getHourlyRate();
        double double11 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        com.yorku.roomscheduler.model.users.Partner partner25 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str26 = partner25.getCompanyName();
        java.lang.String str27 = partner25.getCompanyName();
        java.lang.String str28 = partner25.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType29 = partner25.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory30 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType29);
        com.yorku.roomscheduler.model.users.Partner partner39 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str40 = partner39.getCompanyName();
        java.lang.String str41 = partner39.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType42 = partner39.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory43 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user52 = userFactory44.createUser("", "", "", strArray51);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user63 = userFactory44.createUser("", "", "hi!", strArray62);
        com.yorku.roomscheduler.model.users.User user64 = userFactory30.createUser("hi!", "", "", strArray62);
        com.yorku.roomscheduler.model.users.User user65 = userFactory9.createUser("", "hi!", "hi!", strArray62);
        com.yorku.roomscheduler.model.enums.AccountType accountType66 = user65.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory67 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType66);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + accountType29 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType29.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + accountType42 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType42.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory43);
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertTrue("'" + accountType66 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType66.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory67);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        boolean boolean9 = student4.isVerified();
        double double10 = student4.getHourlyRate();
        student4.verify();
        java.lang.String str12 = student4.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = student4.getAccountType();
        double double14 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getOrganizationId();
        partner5.verify();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.model.users.Partner partner20 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str21 = partner20.getCompanyName();
        java.lang.String str22 = partner20.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType23 = partner20.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory25 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        com.yorku.roomscheduler.model.users.Partner partner34 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str35 = partner34.getCompanyName();
        java.lang.String str36 = partner34.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType37 = partner34.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory38 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user45 = userFactory38.createUser("", "", "hi!", strArray44);
        com.yorku.roomscheduler.model.users.User user46 = userFactory25.createUser("hi!", "", "hi!", strArray44);
        com.yorku.roomscheduler.model.users.Partner partner55 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str56 = partner55.getCompanyName();
        java.lang.String str57 = partner55.getCompanyName();
        java.lang.String str58 = partner55.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType59 = partner55.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory60 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType59);
        com.yorku.roomscheduler.model.users.Partner partner69 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str70 = partner69.getCompanyName();
        java.lang.String str71 = partner69.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType72 = partner69.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory73 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType72);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory74 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType72);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user82 = userFactory74.createUser("", "", "", strArray81);
        java.lang.String[] strArray92 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user93 = userFactory74.createUser("", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user94 = userFactory60.createUser("hi!", "", "", strArray92);
        com.yorku.roomscheduler.model.users.User user95 = userFactory25.createUser("hi!", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user96 = userFactory11.createUser("", "hi!", "hi!", strArray92);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + accountType23 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType23.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertNotNull(userFactory25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + accountType37 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType37.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + accountType59 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType59.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory60);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + accountType72 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType72.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory73);
        org.junit.Assert.assertNotNull(userFactory74);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertNotNull(user94);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(user96);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getEmployeeId();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass13 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        double double8 = partner5.getHourlyRate();
        java.lang.String str9 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "", "", "hi!");
        java.lang.String str6 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str11 = faculty5.getEmployeeId();
        java.lang.String str12 = faculty5.getEmployeeId();
        java.lang.String str13 = faculty5.getPass();
        java.lang.String str14 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        boolean boolean9 = student4.isVerified();
        java.lang.String str10 = student4.getUserId();
        boolean boolean11 = student4.isVerified();
        student4.verify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "hi!", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        student4.verify();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        partner5.verify();
        boolean boolean9 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str11 = staff5.getDepartment();
        java.lang.String str12 = staff5.getUserId();
        double double13 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        faculty5.verify();
        boolean boolean8 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getDepartment();
        java.lang.String str10 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        double double10 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getDepartment();
        java.lang.String str14 = staff5.getEmployeeId();
        java.lang.String str15 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getUserId();
        java.lang.String str14 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getEmail();
        java.lang.String str9 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getPass();
        double double10 = staff5.getHourlyRate();
        staff5.verify();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        partner5.verify();
        double double7 = partner5.getHourlyRate();
        double double8 = partner5.getHourlyRate();
        java.lang.String str9 = partner5.getEmail();
        double double10 = partner5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getEmployeeId();
        double double10 = faculty5.getHourlyRate();
        double double11 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        double double6 = partner5.getHourlyRate();
        partner5.verify();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getUserId();
        boolean boolean10 = partner5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType15 = partner5.getAccountType();
        boolean boolean16 = partner5.isVerified();
        java.lang.String str17 = partner5.getUserId();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + accountType15 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType15.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        java.lang.String str11 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType12);
        com.yorku.roomscheduler.model.users.Partner partner22 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str23 = partner22.getCompanyName();
        java.lang.String str24 = partner22.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType25 = partner22.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory26 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory27 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory28 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory29 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory30 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory31 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory32 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        com.yorku.roomscheduler.model.users.User user39 = userFactory32.createUser("", "hi!", "hi!", strArray38);
        com.yorku.roomscheduler.model.users.User user40 = userFactory13.createUser("hi!", "hi!", "hi!", strArray38);
        java.lang.Class<?> wildcardClass41 = strArray38.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + accountType25 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType25.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory26);
        org.junit.Assert.assertNotNull(userFactory27);
        org.junit.Assert.assertNotNull(userFactory28);
        org.junit.Assert.assertNotNull(userFactory29);
        org.junit.Assert.assertNotNull(userFactory30);
        org.junit.Assert.assertNotNull(userFactory31);
        org.junit.Assert.assertNotNull(userFactory32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getStudentNumber();
        java.lang.String str12 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        double double8 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getUserId();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getUserId();
        double double10 = partner5.getHourlyRate();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.model.users.Partner partner33 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str34 = partner33.getCompanyName();
        java.lang.String str35 = partner33.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType36 = partner33.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory37 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType36);
        com.yorku.roomscheduler.model.users.Partner partner46 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str47 = partner46.getCompanyName();
        java.lang.String str48 = partner46.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType49 = partner46.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory50 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType49);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory51 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType49);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user59 = userFactory51.createUser("", "", "", strArray58);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user70 = userFactory51.createUser("", "", "hi!", strArray69);
        com.yorku.roomscheduler.model.users.User user71 = userFactory37.createUser("", "hi!", "", strArray69);
        com.yorku.roomscheduler.model.users.User user72 = userFactory24.createUser("", "hi!", "hi!", strArray69);
        com.yorku.roomscheduler.model.users.User user73 = userFactory10.createUser("hi!", "hi!", "", strArray69);
        com.yorku.roomscheduler.model.enums.AccountType accountType74 = user73.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + accountType36 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType36.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory37);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + accountType49 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType49.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory50);
        org.junit.Assert.assertNotNull(userFactory51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user70);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertTrue("'" + accountType74 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType74.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getDepartment();
        java.lang.String str10 = faculty5.getDepartment();
        double double11 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getEmployeeId();
        java.lang.String str10 = staff5.getDepartment();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.String str14 = partner5.getEmail();
        java.lang.String str15 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "hi!", "");
        java.lang.String str6 = faculty5.getUserId();
        boolean boolean7 = faculty5.isVerified();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getPass();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str10 = staff5.getEmail();
        staff5.verify();
        java.lang.Class<?> wildcardClass12 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getUserId();
        double double14 = partner5.getHourlyRate();
        java.lang.String str15 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "");
        java.lang.String str6 = partner5.getEmail();
        java.lang.String str7 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = staff5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        boolean boolean9 = faculty5.isVerified();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        boolean boolean6 = faculty5.isVerified();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        boolean boolean9 = faculty5.isVerified();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        boolean boolean15 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        double double9 = faculty5.getHourlyRate();
        double double10 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        java.lang.String str7 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getEmail();
        java.lang.String str12 = student4.getPass();
        java.lang.String str13 = student4.getUserId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.model.users.Staff staff20 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double21 = staff20.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = staff20.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.model.users.Partner partner32 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str33 = partner32.getCompanyName();
        java.lang.String str34 = partner32.getEmail();
        boolean boolean35 = partner32.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType36 = partner32.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType37 = partner32.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory38 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType37);
        com.yorku.roomscheduler.model.users.Partner partner47 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str48 = partner47.getCompanyName();
        java.lang.String str49 = partner47.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType50 = partner47.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory51 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType50);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory52 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType50);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user60 = userFactory52.createUser("", "", "", strArray59);
        com.yorku.roomscheduler.model.users.User user61 = userFactory38.createUser("", "hi!", "", strArray59);
        com.yorku.roomscheduler.model.users.User user62 = userFactory23.createUser("", "", "", strArray59);
        com.yorku.roomscheduler.model.users.Partner partner71 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str72 = partner71.getCompanyName();
        java.lang.String str73 = partner71.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType74 = partner71.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory75 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType74);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory76 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType74);
        com.yorku.roomscheduler.model.users.Partner partner85 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str86 = partner85.getCompanyName();
        java.lang.String str87 = partner85.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType88 = partner85.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory89 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType88);
        java.lang.String[] strArray95 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user96 = userFactory89.createUser("", "", "hi!", strArray95);
        com.yorku.roomscheduler.model.users.User user97 = userFactory76.createUser("hi!", "", "hi!", strArray95);
        com.yorku.roomscheduler.model.users.User user98 = userFactory23.createUser("", "hi!", "hi!", strArray95);
        com.yorku.roomscheduler.model.users.User user99 = userFactory11.createUser("", "hi!", "", strArray95);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + accountType36 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType36.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType37 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType37.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + accountType50 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType50.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory51);
        org.junit.Assert.assertNotNull(userFactory52);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + accountType74 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType74.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory75);
        org.junit.Assert.assertNotNull(userFactory76);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + accountType88 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType88.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory89);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user96);
        org.junit.Assert.assertNotNull(user97);
        org.junit.Assert.assertNotNull(user98);
        org.junit.Assert.assertNotNull(user99);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        boolean boolean8 = staff5.isVerified();
        double double9 = staff5.getHourlyRate();
        staff5.verify();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory7);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        boolean boolean9 = faculty5.isVerified();
        java.lang.Class<?> wildcardClass10 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getEmail();
        java.lang.String str11 = faculty5.getEmployeeId();
        faculty5.verify();
        double double13 = faculty5.getHourlyRate();
        java.lang.String str14 = faculty5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        com.yorku.roomscheduler.model.users.Partner partner25 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str26 = partner25.getCompanyName();
        java.lang.String str27 = partner25.getCompanyName();
        java.lang.String str28 = partner25.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType29 = partner25.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory30 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType29);
        com.yorku.roomscheduler.model.users.Partner partner39 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str40 = partner39.getCompanyName();
        java.lang.String str41 = partner39.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType42 = partner39.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory43 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user52 = userFactory44.createUser("", "", "", strArray51);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user63 = userFactory44.createUser("", "", "hi!", strArray62);
        com.yorku.roomscheduler.model.users.User user64 = userFactory30.createUser("hi!", "", "", strArray62);
        com.yorku.roomscheduler.model.users.User user65 = userFactory9.createUser("", "hi!", "hi!", strArray62);
        boolean boolean66 = user65.isVerified();
        java.lang.String str67 = user65.getUserId();
        java.lang.String str68 = user65.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + accountType29 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType29.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + accountType42 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType42.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory43);
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getPass();
        java.lang.String str11 = student4.getStudentNumber();
        java.lang.String str12 = student4.getStudentNumber();
        double double13 = student4.getHourlyRate();
        java.lang.String str14 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getEmail();
        double double14 = staff5.getHourlyRate();
        java.lang.String str15 = staff5.getDepartment();
        java.lang.String str16 = staff5.getDepartment();
        java.lang.String str17 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "hi!");
        double double6 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "hi!", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = staff5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getCompanyName();
        double double8 = partner5.getHourlyRate();
        double double9 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmployeeId();
        double double10 = staff5.getHourlyRate();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass9 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory15 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType14);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory16 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory15);
        org.junit.Assert.assertNotNull(userFactory16);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "", "");
        java.lang.String str6 = partner5.getCompanyName();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getPass();
        java.lang.String str13 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getPass();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getEmail();
        java.lang.Class<?> wildcardClass11 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        java.lang.String str7 = student4.getUserId();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.Class<?> wildcardClass10 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        partner5.verify();
        java.lang.String str15 = partner5.getEmail();
        double double16 = partner5.getHourlyRate();
        java.lang.String str17 = partner5.getEmail();
        java.lang.Class<?> wildcardClass18 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        double double10 = faculty5.getHourlyRate();
        boolean boolean11 = faculty5.isVerified();
        double double12 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getEmail();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory22 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        com.yorku.roomscheduler.model.users.Partner partner31 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str32 = partner31.getCompanyName();
        java.lang.String str33 = partner31.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType34 = partner31.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory35 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType34);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user42 = userFactory35.createUser("", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.User user43 = userFactory22.createUser("hi!", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.User user44 = userFactory8.createUser("", "hi!", "hi!", strArray41);
        java.lang.String str45 = user44.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertNotNull(userFactory22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + accountType34 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType34.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        double double9 = staff5.getHourlyRate();
        staff5.verify();
        java.lang.String str11 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        double double10 = faculty5.getHourlyRate();
        double double11 = faculty5.getHourlyRate();
        java.lang.String str12 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        double double8 = faculty5.getHourlyRate();
        faculty5.verify();
        java.lang.String str10 = faculty5.getEmployeeId();
        java.lang.String str11 = faculty5.getEmail();
        java.lang.String str12 = faculty5.getEmployeeId();
        double double13 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.String str14 = partner5.getOrganizationId();
        java.lang.String str15 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        faculty5.verify();
        java.lang.String str8 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getEmployeeId();
        double double11 = faculty5.getHourlyRate();
        java.lang.String str12 = faculty5.getDepartment();
        boolean boolean13 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getPass();
        staff5.verify();
        java.lang.String str9 = staff5.getEmployeeId();
        double double10 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        faculty5.verify();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        staff5.verify();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        com.yorku.roomscheduler.model.users.Partner partner20 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str21 = partner20.getCompanyName();
        java.lang.String str22 = partner20.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType23 = partner20.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory25 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        com.yorku.roomscheduler.model.users.Partner partner34 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str35 = partner34.getCompanyName();
        java.lang.String str36 = partner34.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType37 = partner34.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory38 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user45 = userFactory38.createUser("", "", "hi!", strArray44);
        com.yorku.roomscheduler.model.users.User user46 = userFactory25.createUser("hi!", "", "hi!", strArray44);
        com.yorku.roomscheduler.model.users.Partner partner55 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str56 = partner55.getCompanyName();
        java.lang.String str57 = partner55.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType58 = partner55.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory59 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType58);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory60 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType58);
        com.yorku.roomscheduler.model.users.Partner partner69 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str70 = partner69.getCompanyName();
        java.lang.String str71 = partner69.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType72 = partner69.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory73 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType72);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user80 = userFactory73.createUser("", "", "hi!", strArray79);
        com.yorku.roomscheduler.model.users.User user81 = userFactory60.createUser("hi!", "", "hi!", strArray79);
        com.yorku.roomscheduler.model.users.User user82 = userFactory25.createUser("hi!", "", "hi!", strArray79);
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user90 = userFactory25.createUser("hi!", "", "", strArray89);
        com.yorku.roomscheduler.model.users.User user91 = userFactory11.createUser("hi!", "hi!", "", strArray89);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + accountType23 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType23.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertNotNull(userFactory25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + accountType37 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType37.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + accountType58 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType58.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory59);
        org.junit.Assert.assertNotNull(userFactory60);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + accountType72 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType72.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user80);
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(user90);
        org.junit.Assert.assertNotNull(user91);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        java.lang.String str7 = partner5.getOrganizationId();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getPass();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str11 = staff5.getEmployeeId();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getEmployeeId();
        java.lang.String str14 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getUserId();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getDepartment();
        java.lang.String str11 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getUserId();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.String str14 = partner5.getCompanyName();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getEmployeeId();
        java.lang.String str11 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        double double5 = student4.getHourlyRate();
        student4.verify();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "");
        java.lang.String str6 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory15 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getUserId();
        java.lang.String str11 = staff5.getDepartment();
        java.lang.String str12 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getEmail();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory22 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        com.yorku.roomscheduler.model.users.Partner partner31 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str32 = partner31.getCompanyName();
        java.lang.String str33 = partner31.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType34 = partner31.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory35 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType34);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user42 = userFactory35.createUser("", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.User user43 = userFactory22.createUser("hi!", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.User user44 = userFactory8.createUser("", "hi!", "hi!", strArray41);
        java.lang.String str45 = user44.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertNotNull(userFactory22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + accountType34 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType34.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getStudentNumber();
        double double12 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass12 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "", "");
        double double6 = partner5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user30 = userFactory23.createUser("", "", "hi!", strArray29);
        com.yorku.roomscheduler.model.users.User user31 = userFactory10.createUser("hi!", "", "hi!", strArray29);
        com.yorku.roomscheduler.model.users.Partner partner40 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str41 = partner40.getCompanyName();
        java.lang.String str42 = partner40.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType43 = partner40.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType43);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory45 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType43);
        com.yorku.roomscheduler.model.users.Partner partner54 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str55 = partner54.getCompanyName();
        java.lang.String str56 = partner54.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType57 = partner54.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory58 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType57);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user65 = userFactory58.createUser("", "", "hi!", strArray64);
        com.yorku.roomscheduler.model.users.User user66 = userFactory45.createUser("hi!", "", "hi!", strArray64);
        com.yorku.roomscheduler.model.users.User user67 = userFactory10.createUser("hi!", "", "hi!", strArray64);
        java.lang.String str68 = user67.getEmail();
        user67.verify();
        boolean boolean70 = user67.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + accountType43 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType43.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertNotNull(userFactory45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + accountType57 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType57.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getUserId();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getUserId();
        java.lang.String str10 = faculty5.getEmployeeId();
        java.lang.String str11 = faculty5.getPass();
        java.lang.String str12 = faculty5.getEmployeeId();
        double double13 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        double double10 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getEmployeeId();
        java.lang.String str14 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "");
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getUserId();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getCompanyName();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getCompanyName();
        java.lang.String str15 = partner5.getCompanyName();
        partner5.verify();
        java.lang.String str17 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        java.lang.String str6 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        double double5 = student4.getHourlyRate();
        student4.verify();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        boolean boolean12 = partner5.isVerified();
        java.lang.String str13 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getPass();
        java.lang.String str11 = staff5.getEmployeeId();
        double double12 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getEmail();
        java.lang.String str11 = faculty5.getEmployeeId();
        java.lang.String str12 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getPass();
        boolean boolean7 = staff5.isVerified();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        partner5.verify();
        double double7 = partner5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        boolean boolean10 = faculty5.isVerified();
        java.lang.String str11 = faculty5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getPass();
        java.lang.String str10 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        partner5.verify();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "", "", "");
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        staff5.verify();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getEmployeeId();
        java.lang.String str12 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType15 = partner5.getAccountType();
        boolean boolean16 = partner5.isVerified();
        java.lang.String str17 = partner5.getUserId();
        java.lang.String str18 = partner5.getUserId();
        double double19 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + accountType15 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType15.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getOrganizationId();
        double double14 = partner5.getHourlyRate();
        java.lang.String str15 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = student4.getAccountType();
        java.lang.Class<?> wildcardClass12 = accountType11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getUserId();
        double double10 = partner5.getHourlyRate();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        boolean boolean9 = faculty5.isVerified();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        faculty5.verify();
        boolean boolean7 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getPass();
        double double11 = student4.getHourlyRate();
        java.lang.String str12 = student4.getUserId();
        java.lang.String str13 = student4.getPass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.model.users.Partner partner33 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str34 = partner33.getCompanyName();
        java.lang.String str35 = partner33.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType36 = partner33.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory37 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType36);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory38 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType36);
        com.yorku.roomscheduler.model.users.Partner partner47 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str48 = partner47.getCompanyName();
        java.lang.String str49 = partner47.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType50 = partner47.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory51 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType50);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user58 = userFactory51.createUser("", "", "hi!", strArray57);
        com.yorku.roomscheduler.model.users.User user59 = userFactory38.createUser("hi!", "", "hi!", strArray57);
        com.yorku.roomscheduler.model.users.Partner partner68 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str69 = partner68.getCompanyName();
        java.lang.String str70 = partner68.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType71 = partner68.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory72 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory73 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        com.yorku.roomscheduler.model.users.Partner partner82 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str83 = partner82.getCompanyName();
        java.lang.String str84 = partner82.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType85 = partner82.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory86 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType85);
        java.lang.String[] strArray92 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user93 = userFactory86.createUser("", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user94 = userFactory73.createUser("hi!", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user95 = userFactory38.createUser("hi!", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user96 = userFactory24.createUser("hi!", "", "", strArray92);
        com.yorku.roomscheduler.model.users.User user97 = userFactory10.createUser("", "hi!", "hi!", strArray92);
        java.lang.Class<?> wildcardClass98 = userFactory10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + accountType36 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType36.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory37);
        org.junit.Assert.assertNotNull(userFactory38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + accountType50 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType50.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + accountType71 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType71.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory72);
        org.junit.Assert.assertNotNull(userFactory73);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + accountType85 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType85.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory86);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertNotNull(user94);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(user96);
        org.junit.Assert.assertNotNull(user97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getPass();
        double double11 = staff5.getHourlyRate();
        double double12 = staff5.getHourlyRate();
        boolean boolean13 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        com.yorku.roomscheduler.model.users.Staff staff16 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType17 = staff16.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory18 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType17);
        com.yorku.roomscheduler.model.users.Partner partner27 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str28 = partner27.getCompanyName();
        java.lang.String str29 = partner27.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType30 = partner27.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory31 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType30);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user36 = userFactory31.createUser("hi!", "hi!", "hi!", strArray35);
        com.yorku.roomscheduler.model.users.User user37 = userFactory18.createUser("", "hi!", "", strArray35);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user45 = userFactory18.createUser("hi!", "hi!", "", strArray44);
        com.yorku.roomscheduler.model.users.User user46 = userFactory7.createUser("", "", "hi!", strArray44);
        user46.verify();
        com.yorku.roomscheduler.model.enums.AccountType accountType48 = user46.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory7);
        org.junit.Assert.assertTrue("'" + accountType17 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType17.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + accountType30 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType30.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertTrue("'" + accountType48 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType48.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        boolean boolean9 = faculty5.isVerified();
        boolean boolean10 = faculty5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getUserId();
        double double10 = partner5.getHourlyRate();
        partner5.verify();
        double double12 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        boolean boolean13 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory15 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory15);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        double double10 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        java.lang.String str12 = staff5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = staff5.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str11 = faculty5.getEmployeeId();
        java.lang.String str12 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory14 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType13);
        com.yorku.roomscheduler.model.users.Partner partner23 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str24 = partner23.getCompanyName();
        java.lang.String str25 = partner23.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType26 = partner23.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory27 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory28 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.model.users.Partner partner37 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str38 = partner37.getCompanyName();
        java.lang.String str39 = partner37.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType40 = partner37.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory41 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType40);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory42 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType40);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user50 = userFactory42.createUser("", "", "", strArray49);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user61 = userFactory42.createUser("", "", "hi!", strArray60);
        com.yorku.roomscheduler.model.users.User user62 = userFactory28.createUser("", "hi!", "hi!", strArray60);
        com.yorku.roomscheduler.model.users.Partner partner71 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str72 = partner71.getCompanyName();
        java.lang.String str73 = partner71.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType74 = partner71.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory75 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType74);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory76 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType74);
        java.lang.String[] strArray83 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user84 = userFactory76.createUser("", "", "", strArray83);
        com.yorku.roomscheduler.model.users.User user85 = userFactory28.createUser("hi!", "", "", strArray83);
        com.yorku.roomscheduler.model.users.User user86 = userFactory14.createUser("", "", "", strArray83);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + accountType26 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType26.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory27);
        org.junit.Assert.assertNotNull(userFactory28);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + accountType40 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType40.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory41);
        org.junit.Assert.assertNotNull(userFactory42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + accountType74 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType74.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory75);
        org.junit.Assert.assertNotNull(userFactory76);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(user85);
        org.junit.Assert.assertNotNull(user86);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getPass();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getCompanyName();
        double double14 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        double double8 = partner5.getHourlyRate();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.Class<?> wildcardClass10 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory11);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getCompanyName();
        double double9 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getStudentNumber();
        double double12 = student4.getHourlyRate();
        double double13 = student4.getHourlyRate();
        boolean boolean14 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getEmail();
        double double14 = staff5.getHourlyRate();
        java.lang.String str15 = staff5.getDepartment();
        java.lang.String str16 = staff5.getDepartment();
        java.lang.String str17 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getDepartment();
        faculty5.verify();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory14 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory14);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getEmployeeId();
        boolean boolean11 = staff5.isVerified();
        boolean boolean12 = staff5.isVerified();
        double double13 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getPass();
        java.lang.String str9 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getDepartment();
        java.lang.String str12 = staff5.getEmployeeId();
        java.lang.String str13 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "", "hi!");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        double double9 = faculty5.getHourlyRate();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = student4.getAccountType();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        partner5.verify();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = partner5.getAccountType();
        java.lang.String str13 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        boolean boolean7 = staff5.isVerified();
        staff5.verify();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getPass();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getEmail();
        java.lang.String str13 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getUserId();
        java.lang.String str12 = student4.getStudentNumber();
        double double13 = student4.getHourlyRate();
        java.lang.String str14 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        double double12 = student4.getHourlyRate();
        boolean boolean13 = student4.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        java.lang.String str10 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = staff5.getAccountType();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner21 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str22 = partner21.getCompanyName();
        java.lang.String str23 = partner21.getCompanyName();
        java.lang.String str24 = partner21.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType25 = partner21.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory26 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.model.users.Partner partner35 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str36 = partner35.getCompanyName();
        java.lang.String str37 = partner35.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType38 = partner35.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory39 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory40 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.model.users.Partner partner49 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str50 = partner49.getCompanyName();
        java.lang.String str51 = partner49.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType52 = partner49.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory53 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType52);
        com.yorku.roomscheduler.model.users.Partner partner62 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str63 = partner62.getCompanyName();
        java.lang.String str64 = partner62.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType65 = partner62.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory66 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType65);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory67 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType65);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user75 = userFactory67.createUser("", "", "", strArray74);
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user86 = userFactory67.createUser("", "", "hi!", strArray85);
        com.yorku.roomscheduler.model.users.User user87 = userFactory53.createUser("", "hi!", "", strArray85);
        com.yorku.roomscheduler.model.users.User user88 = userFactory40.createUser("", "hi!", "hi!", strArray85);
        com.yorku.roomscheduler.model.users.User user89 = userFactory26.createUser("hi!", "hi!", "", strArray85);
        com.yorku.roomscheduler.model.users.User user90 = userFactory12.createUser("", "", "", strArray85);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + accountType25 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType25.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + accountType38 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType38.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory39);
        org.junit.Assert.assertNotNull(userFactory40);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + accountType52 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType52.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory53);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + accountType65 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType65.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory66);
        org.junit.Assert.assertNotNull(userFactory67);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user86);
        org.junit.Assert.assertNotNull(user87);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(user89);
        org.junit.Assert.assertNotNull(user90);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str11 = faculty5.getEmployeeId();
        java.lang.String str12 = faculty5.getDepartment();
        java.lang.String str13 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        double double15 = partner5.getHourlyRate();
        java.lang.String str16 = partner5.getOrganizationId();
        java.lang.Class<?> wildcardClass17 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user26 = userFactory21.createUser("hi!", "hi!", "hi!", strArray25);
        com.yorku.roomscheduler.model.users.Partner partner35 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str36 = partner35.getCompanyName();
        java.lang.String str37 = partner35.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType38 = partner35.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory39 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory40 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory41 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory42 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.model.users.Partner partner51 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str52 = partner51.getCompanyName();
        java.lang.String str53 = partner51.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType54 = partner51.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory55 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType54);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory56 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType54);
        com.yorku.roomscheduler.model.users.Partner partner65 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str66 = partner65.getCompanyName();
        java.lang.String str67 = partner65.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType68 = partner65.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory69 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType68);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory70 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType68);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user78 = userFactory70.createUser("", "", "", strArray77);
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user89 = userFactory70.createUser("", "", "hi!", strArray88);
        com.yorku.roomscheduler.model.users.User user90 = userFactory56.createUser("", "hi!", "hi!", strArray88);
        com.yorku.roomscheduler.model.users.User user91 = userFactory42.createUser("hi!", "hi!", "", strArray88);
        com.yorku.roomscheduler.model.users.User user92 = userFactory21.createUser("", "hi!", "hi!", strArray88);
        com.yorku.roomscheduler.model.users.User user93 = userFactory8.createUser("", "", "hi!", strArray88);
        com.yorku.roomscheduler.model.enums.AccountType accountType94 = user93.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory95 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType94);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory96 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType94);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + accountType38 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType38.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory39);
        org.junit.Assert.assertNotNull(userFactory40);
        org.junit.Assert.assertNotNull(userFactory41);
        org.junit.Assert.assertNotNull(userFactory42);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + accountType54 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType54.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory55);
        org.junit.Assert.assertNotNull(userFactory56);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + accountType68 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType68.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory69);
        org.junit.Assert.assertNotNull(userFactory70);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user89);
        org.junit.Assert.assertNotNull(user90);
        org.junit.Assert.assertNotNull(user91);
        org.junit.Assert.assertNotNull(user92);
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertTrue("'" + accountType94 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType94.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory95);
        org.junit.Assert.assertNotNull(userFactory96);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        partner5.verify();
        double double9 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        staff5.verify();
        staff5.verify();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        com.yorku.roomscheduler.model.users.Staff staff16 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType17 = staff16.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory18 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType17);
        com.yorku.roomscheduler.model.users.Partner partner27 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str28 = partner27.getCompanyName();
        java.lang.String str29 = partner27.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType30 = partner27.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory31 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType30);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user36 = userFactory31.createUser("hi!", "hi!", "hi!", strArray35);
        com.yorku.roomscheduler.model.users.User user37 = userFactory18.createUser("", "hi!", "", strArray35);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user45 = userFactory18.createUser("hi!", "hi!", "", strArray44);
        com.yorku.roomscheduler.model.users.User user46 = userFactory7.createUser("", "", "hi!", strArray44);
        user46.verify();
        java.lang.String str48 = user46.getEmail();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory7);
        org.junit.Assert.assertTrue("'" + accountType17 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType17.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + accountType30 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType30.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getDepartment();
        faculty5.verify();
        faculty5.verify();
        java.lang.String str10 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "hi!", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "");
        double double6 = faculty5.getHourlyRate();
        boolean boolean7 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getEmployeeId();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getOrganizationId();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getEmployeeId();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getEmployeeId();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        boolean boolean7 = student4.isVerified();
        double double8 = student4.getHourlyRate();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        double double9 = student4.getHourlyRate();
        double double10 = student4.getHourlyRate();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getDepartment();
        staff5.verify();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        faculty5.verify();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.String str14 = partner5.getEmail();
        java.lang.String str15 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getPass();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        java.lang.String str12 = staff5.getPass();
        boolean boolean13 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getEmail();
        java.lang.String str11 = partner5.getUserId();
        double double12 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str13 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.model.users.Partner partner33 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str34 = partner33.getCompanyName();
        java.lang.String str35 = partner33.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType36 = partner33.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory37 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType36);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory38 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType36);
        com.yorku.roomscheduler.model.users.Partner partner47 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str48 = partner47.getCompanyName();
        java.lang.String str49 = partner47.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType50 = partner47.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory51 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType50);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user58 = userFactory51.createUser("", "", "hi!", strArray57);
        com.yorku.roomscheduler.model.users.User user59 = userFactory38.createUser("hi!", "", "hi!", strArray57);
        com.yorku.roomscheduler.model.users.Partner partner68 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str69 = partner68.getCompanyName();
        java.lang.String str70 = partner68.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType71 = partner68.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory72 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory73 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        com.yorku.roomscheduler.model.users.Partner partner82 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str83 = partner82.getCompanyName();
        java.lang.String str84 = partner82.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType85 = partner82.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory86 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType85);
        java.lang.String[] strArray92 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user93 = userFactory86.createUser("", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user94 = userFactory73.createUser("hi!", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user95 = userFactory38.createUser("hi!", "", "hi!", strArray92);
        com.yorku.roomscheduler.model.users.User user96 = userFactory24.createUser("hi!", "", "", strArray92);
        com.yorku.roomscheduler.model.users.User user97 = userFactory10.createUser("", "hi!", "hi!", strArray92);
        java.lang.String str98 = user97.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + accountType36 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType36.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory37);
        org.junit.Assert.assertNotNull(userFactory38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + accountType50 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType50.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + accountType71 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType71.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory72);
        org.junit.Assert.assertNotNull(userFactory73);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + accountType85 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType85.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory86);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertNotNull(user94);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(user96);
        org.junit.Assert.assertNotNull(user97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi!" + "'", str98, "hi!");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory12);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getEmployeeId();
        java.lang.String str10 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getUserId();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmployeeId();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getUserId();
        double double10 = partner5.getHourlyRate();
        partner5.verify();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.String str7 = student4.getStudentNumber();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getStudentNumber();
        boolean boolean11 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = student4.getAccountType();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        boolean boolean5 = student4.isVerified();
        student4.verify();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getEmployeeId();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user26 = userFactory21.createUser("hi!", "hi!", "hi!", strArray25);
        com.yorku.roomscheduler.model.users.User user27 = userFactory8.createUser("hi!", "", "hi!", strArray25);
        boolean boolean28 = user27.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        boolean boolean6 = staff5.isVerified();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getUserId();
        java.lang.String str14 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user30 = userFactory23.createUser("", "", "hi!", strArray29);
        com.yorku.roomscheduler.model.users.User user31 = userFactory10.createUser("hi!", "", "hi!", strArray29);
        com.yorku.roomscheduler.model.users.Partner partner40 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str41 = partner40.getCompanyName();
        java.lang.String str42 = partner40.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType43 = partner40.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType43);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory45 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType43);
        com.yorku.roomscheduler.model.users.Partner partner54 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str55 = partner54.getCompanyName();
        java.lang.String str56 = partner54.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType57 = partner54.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory58 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType57);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user65 = userFactory58.createUser("", "", "hi!", strArray64);
        com.yorku.roomscheduler.model.users.User user66 = userFactory45.createUser("hi!", "", "hi!", strArray64);
        com.yorku.roomscheduler.model.users.User user67 = userFactory10.createUser("hi!", "", "hi!", strArray64);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        com.yorku.roomscheduler.model.users.User user73 = userFactory10.createUser("hi!", "hi!", "", strArray72);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + accountType43 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType43.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertNotNull(userFactory45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + accountType57 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType57.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(user73);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getOrganizationId();
        double double14 = partner5.getHourlyRate();
        java.lang.String str15 = partner5.getEmail();
        double double16 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getUserId();
        double double8 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        java.lang.String str12 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "hi!", "");
        double double6 = partner5.getHourlyRate();
        java.lang.String str7 = partner5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getEmployeeId();
        boolean boolean11 = staff5.isVerified();
        java.lang.String str12 = staff5.getEmployeeId();
        java.lang.String str13 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getPass();
        double double10 = staff5.getHourlyRate();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "");
        java.lang.String str6 = faculty5.getDepartment();
        boolean boolean7 = faculty5.isVerified();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.String str7 = student4.getStudentNumber();
        java.lang.String str8 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        double double8 = partner5.getHourlyRate();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = student4.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getEmail();
        java.lang.String str11 = faculty5.getEmployeeId();
        faculty5.verify();
        double double13 = faculty5.getHourlyRate();
        java.lang.String str14 = faculty5.getEmployeeId();
        java.lang.String str15 = faculty5.getPass();
        java.lang.String str16 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "", "", "");
        java.lang.String str6 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getEmployeeId();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        partner5.verify();
        java.lang.String str7 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getDepartment();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user26 = userFactory21.createUser("hi!", "hi!", "hi!", strArray25);
        com.yorku.roomscheduler.model.users.User user27 = userFactory8.createUser("hi!", "", "hi!", strArray25);
        user27.verify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(user27);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        java.lang.String str12 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getEmployeeId();
        double double10 = faculty5.getHourlyRate();
        java.lang.String str11 = faculty5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getStudentNumber();
        double double12 = student4.getHourlyRate();
        java.lang.String str13 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        double double9 = student4.getHourlyRate();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getStudentNumber();
        double double12 = student4.getHourlyRate();
        double double13 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getPass();
        double double7 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = staff5.getAccountType();
        java.lang.String str9 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        faculty5.verify();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        boolean boolean7 = faculty5.isVerified();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getPass();
        java.lang.String str9 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        java.lang.String str7 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str9 = staff5.getEmployeeId();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "hi!", "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.String str9 = faculty5.getUserId();
        java.lang.String str10 = faculty5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getUserId();
        double double10 = faculty5.getHourlyRate();
        faculty5.verify();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        staff5.verify();
        java.lang.String str11 = staff5.getPass();
        java.lang.String str12 = staff5.getDepartment();
        staff5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        boolean boolean8 = staff5.isVerified();
        double double9 = staff5.getHourlyRate();
        double double10 = staff5.getHourlyRate();
        double double11 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "", "");
        partner5.verify();
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "", "hi!", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "hi!");
        faculty5.verify();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        boolean boolean8 = faculty5.isVerified();
        double double9 = faculty5.getHourlyRate();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "");
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = student4.getAccountType();
        java.lang.String str9 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getEmployeeId();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        staff5.verify();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getEmployeeId();
        double double12 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        partner5.verify();
        double double11 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.model.users.Partner partner19 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str20 = partner19.getCompanyName();
        java.lang.String str21 = partner19.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user33 = userFactory24.createUser("hi!", "hi!", "", strArray32);
        com.yorku.roomscheduler.model.users.User user34 = userFactory10.createUser("", "hi!", "", strArray32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.String str7 = student4.getStudentNumber();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getDepartment();
        double double10 = faculty5.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        java.lang.String str15 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getUserId();
        java.lang.String str14 = partner5.getCompanyName();
        java.lang.String str15 = partner5.getCompanyName();
        java.lang.String str16 = partner5.getCompanyName();
        java.lang.String str17 = partner5.getUserId();
        java.lang.String str18 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        staff5.verify();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        student4.verify();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        java.lang.String str12 = partner5.getOrganizationId();
        double double13 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory9);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getUserId();
        double double11 = staff5.getHourlyRate();
        java.lang.String str12 = staff5.getEmployeeId();
        java.lang.String str13 = staff5.getEmployeeId();
        java.lang.String str14 = staff5.getEmployeeId();
        java.lang.String str15 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getUserId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getOrganizationId();
        double double10 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getUserId();
        double double9 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user28 = userFactory21.createUser("", "", "hi!", strArray27);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user38 = userFactory21.createUser("", "hi!", "hi!", strArray37);
        com.yorku.roomscheduler.model.users.User user39 = userFactory8.createUser("hi!", "", "hi!", strArray37);
        java.lang.String str40 = user39.getPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getPass();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getPass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getUserId();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getPass();
        double double10 = staff5.getHourlyRate();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        boolean boolean6 = staff5.isVerified();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getDepartment();
        java.lang.String str11 = faculty5.getDepartment();
        java.lang.String str12 = faculty5.getPass();
        double double13 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory11);
    }
}

