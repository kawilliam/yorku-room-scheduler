package randooptest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.yorku.roomscheduler.model.enums.AccountType accountType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.roomscheduler.patterns.factory.UserFactory userFactory1 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.roomscheduler.model.enums.AccountType.ordinal()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass8 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.Class<?> wildcardClass9 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        java.lang.Class<?> wildcardClass9 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        partner5.verify();
        java.lang.Class<?> wildcardClass9 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        double double12 = partner5.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        java.lang.Class<?> wildcardClass10 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        java.lang.String str6 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "", "hi!", "hi!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass9 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        boolean boolean7 = staff5.isVerified();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getPass();
        java.lang.String str13 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        com.yorku.roomscheduler.model.users.Partner partner33 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str34 = partner33.getCompanyName();
        java.lang.String str35 = partner33.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType36 = partner33.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory37 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user44 = userFactory37.createUser("", "", "hi!", strArray43);
        com.yorku.roomscheduler.model.users.User user45 = userFactory24.createUser("hi!", "", "hi!", strArray43);
        com.yorku.roomscheduler.model.users.Partner partner54 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str55 = partner54.getCompanyName();
        java.lang.String str56 = partner54.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType57 = partner54.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory58 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType57);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory59 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType57);
        com.yorku.roomscheduler.model.users.Partner partner68 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str69 = partner68.getCompanyName();
        java.lang.String str70 = partner68.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType71 = partner68.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory72 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user79 = userFactory72.createUser("", "", "hi!", strArray78);
        com.yorku.roomscheduler.model.users.User user80 = userFactory59.createUser("hi!", "", "hi!", strArray78);
        com.yorku.roomscheduler.model.users.User user81 = userFactory24.createUser("hi!", "", "hi!", strArray78);
        com.yorku.roomscheduler.model.users.User user82 = userFactory10.createUser("hi!", "", "", strArray78);
        java.lang.Class<?> wildcardClass83 = strArray78.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + accountType36 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType36.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + accountType57 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType57.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory58);
        org.junit.Assert.assertNotNull(userFactory59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + accountType71 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType71.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(user80);
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass6 = partner5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.Class<?> wildcardClass10 = accountType8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        double double9 = faculty5.getHourlyRate();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        java.lang.Class<?> wildcardClass12 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "hi!", "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        com.yorku.roomscheduler.model.users.Partner partner67 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str68 = partner67.getCompanyName();
        java.lang.String str69 = partner67.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType70 = partner67.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory71 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType70);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory72 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType70);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user80 = userFactory72.createUser("", "", "", strArray79);
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user91 = userFactory72.createUser("", "", "hi!", strArray90);
        com.yorku.roomscheduler.model.users.User user92 = userFactory58.createUser("", "hi!", "", strArray90);
        com.yorku.roomscheduler.model.users.User user93 = userFactory45.createUser("", "hi!", "hi!", strArray90);
        com.yorku.roomscheduler.model.users.User user94 = userFactory10.createUser("", "hi!", "", strArray90);
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + accountType70 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType70.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory71);
        org.junit.Assert.assertNotNull(userFactory72);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user80);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user91);
        org.junit.Assert.assertNotNull(user92);
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertNotNull(user94);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "", "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        com.yorku.roomscheduler.model.users.Partner partner20 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str21 = partner20.getCompanyName();
        java.lang.String str22 = partner20.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType23 = partner20.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory25 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user33 = userFactory25.createUser("", "", "", strArray32);
        com.yorku.roomscheduler.model.users.User user34 = userFactory11.createUser("", "hi!", "", strArray32);
        com.yorku.roomscheduler.model.users.Staff staff43 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double44 = staff43.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType45 = staff43.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory46 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType45);
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
        com.yorku.roomscheduler.model.users.User user82 = userFactory46.createUser("", "hi!", "hi!", strArray79);
        com.yorku.roomscheduler.model.users.User user83 = userFactory11.createUser("", "hi!", "hi!", strArray79);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + accountType23 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType23.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertNotNull(userFactory25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 40.0d + "'", double44 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType45 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType45.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory46);
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
        org.junit.Assert.assertNotNull(user83);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user75 = userFactory10.createUser("hi!", "", "", strArray74);
        com.yorku.roomscheduler.model.users.Partner partner84 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str85 = partner84.getCompanyName();
        java.lang.String str86 = partner84.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType87 = partner84.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory88 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType87);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory89 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType87);
        java.lang.String[] strArray96 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user97 = userFactory89.createUser("", "", "", strArray96);
        com.yorku.roomscheduler.model.users.User user98 = userFactory10.createUser("hi!", "hi!", "", strArray96);
        java.lang.String str99 = user98.getEmail();
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
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + accountType87 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType87.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory88);
        org.junit.Assert.assertNotNull(userFactory89);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user97);
        org.junit.Assert.assertNotNull(user98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hi!" + "'", str99, "hi!");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user18 = userFactory10.createUser("", "", "", strArray17);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user29 = userFactory10.createUser("", "", "hi!", strArray28);
        java.lang.String str30 = user29.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "", "hi!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        double double10 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        partner5.verify();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        boolean boolean11 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        faculty5.verify();
        java.lang.Class<?> wildcardClass10 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.Class<?> wildcardClass14 = userFactory13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertNotNull(userFactory13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user19 = userFactory11.createUser("", "hi!", "", strArray18);
        java.lang.String str20 = user19.getPass();
        java.lang.Class<?> wildcardClass21 = user19.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType11);
        com.yorku.roomscheduler.model.users.Partner partner21 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str22 = partner21.getCompanyName();
        java.lang.String str23 = partner21.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType24 = partner21.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory25 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType24);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory26 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType24);
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
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user60 = userFactory53.createUser("", "", "hi!", strArray59);
        com.yorku.roomscheduler.model.users.User user61 = userFactory40.createUser("hi!", "", "hi!", strArray59);
        com.yorku.roomscheduler.model.users.Partner partner70 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str71 = partner70.getCompanyName();
        java.lang.String str72 = partner70.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType73 = partner70.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory74 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory75 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        com.yorku.roomscheduler.model.users.Partner partner84 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str85 = partner84.getCompanyName();
        java.lang.String str86 = partner84.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType87 = partner84.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory88 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType87);
        java.lang.String[] strArray94 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user95 = userFactory88.createUser("", "", "hi!", strArray94);
        com.yorku.roomscheduler.model.users.User user96 = userFactory75.createUser("hi!", "", "hi!", strArray94);
        com.yorku.roomscheduler.model.users.User user97 = userFactory40.createUser("hi!", "", "hi!", strArray94);
        com.yorku.roomscheduler.model.users.User user98 = userFactory26.createUser("hi!", "", "", strArray94);
        com.yorku.roomscheduler.model.users.User user99 = userFactory12.createUser("", "", "", strArray94);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + accountType24 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType24.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
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
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + accountType73 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType73.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory74);
        org.junit.Assert.assertNotNull(userFactory75);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + accountType87 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType87.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory88);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(user96);
        org.junit.Assert.assertNotNull(user97);
        org.junit.Assert.assertNotNull(user98);
        org.junit.Assert.assertNotNull(user99);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType11);
        java.lang.Class<?> wildcardClass13 = accountType11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user18 = userFactory10.createUser("", "", "", strArray17);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user29 = userFactory10.createUser("", "", "hi!", strArray28);
        java.lang.Class<?> wildcardClass30 = userFactory10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        java.lang.String str10 = partner5.getEmail();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass10 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "", "hi!");
        boolean boolean5 = student4.isVerified();
        java.lang.String str6 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "", "hi!");
        boolean boolean5 = student4.isVerified();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        boolean boolean17 = user16.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getPass();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.Class<?> wildcardClass10 = userFactory9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        student4.verify();
        java.lang.String str13 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getPass();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "", "", "");
        partner5.verify();
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user18 = userFactory10.createUser("", "", "", strArray17);
        com.yorku.roomscheduler.model.users.Partner partner27 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str28 = partner27.getCompanyName();
        java.lang.String str29 = partner27.getEmail();
        boolean boolean30 = partner27.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType31 = partner27.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType32 = partner27.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory33 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType32);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user41 = userFactory33.createUser("", "hi!", "", strArray40);
        com.yorku.roomscheduler.model.users.User user42 = userFactory10.createUser("", "", "", strArray40);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + accountType31 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType31.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType32 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType32.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(user41);
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory7);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        boolean boolean15 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getEmployeeId();
        java.lang.Class<?> wildcardClass10 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getEmail();
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getEmail();
        double double14 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass12 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getOrganizationId();
        java.lang.Class<?> wildcardClass14 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        boolean boolean8 = partner5.isVerified();
        double double9 = partner5.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getStudentNumber();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmployeeId();
        java.lang.String str10 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass14 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getEmail();
        java.lang.String str11 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getPass();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        double double11 = staff5.getHourlyRate();
        java.lang.String str12 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = partner5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        java.lang.String str8 = student4.getPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getOrganizationId();
        double double9 = partner5.getHourlyRate();
        double double10 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user19 = userFactory10.createUser("hi!", "hi!", "", strArray18);
        java.lang.Class<?> wildcardClass20 = userFactory10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getStudentNumber();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType11);
        com.yorku.roomscheduler.model.users.Partner partner21 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str22 = partner21.getCompanyName();
        java.lang.String str23 = partner21.getEmail();
        boolean boolean24 = partner21.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType25 = partner21.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType26 = partner21.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory27 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user35 = userFactory27.createUser("", "hi!", "", strArray34);
        com.yorku.roomscheduler.model.users.User user36 = userFactory12.createUser("hi!", "hi!", "hi!", strArray34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + accountType25 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType25.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType26 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType26.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getEmail();
        java.lang.Class<?> wildcardClass15 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getPass();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.lang.String str68 = user67.getUserId();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        staff5.verify();
        staff5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getEmail();
        java.lang.String str14 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getPass();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "", "hi!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user14 = userFactory9.createUser("hi!", "hi!", "hi!", strArray13);
        com.yorku.roomscheduler.model.users.Partner partner23 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str24 = partner23.getCompanyName();
        java.lang.String str25 = partner23.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType26 = partner23.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory27 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory28 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory29 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory30 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.model.users.Partner partner39 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str40 = partner39.getCompanyName();
        java.lang.String str41 = partner39.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType42 = partner39.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory43 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType42);
        com.yorku.roomscheduler.model.users.Partner partner53 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str54 = partner53.getCompanyName();
        java.lang.String str55 = partner53.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType56 = partner53.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory57 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType56);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory58 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType56);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user66 = userFactory58.createUser("", "", "", strArray65);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user77 = userFactory58.createUser("", "", "hi!", strArray76);
        com.yorku.roomscheduler.model.users.User user78 = userFactory44.createUser("", "hi!", "hi!", strArray76);
        com.yorku.roomscheduler.model.users.User user79 = userFactory30.createUser("hi!", "hi!", "", strArray76);
        com.yorku.roomscheduler.model.users.User user80 = userFactory9.createUser("", "hi!", "hi!", strArray76);
        boolean boolean81 = user80.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + accountType26 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType26.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory27);
        org.junit.Assert.assertNotNull(userFactory28);
        org.junit.Assert.assertNotNull(userFactory29);
        org.junit.Assert.assertNotNull(userFactory30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + accountType42 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType42.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory43);
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + accountType56 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType56.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory57);
        org.junit.Assert.assertNotNull(userFactory58);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(user80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "hi!", "");
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        staff5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        boolean boolean11 = partner5.isVerified();
        java.lang.Class<?> wildcardClass12 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "hi!", "hi!");
        double double6 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        boolean boolean28 = user26.isVerified();
        boolean boolean29 = user26.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getUserId();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getUserId();
        java.lang.String str10 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass11 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        com.yorku.roomscheduler.model.enums.AccountType accountType68 = user67.getAccountType();
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
        org.junit.Assert.assertTrue("'" + accountType68 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType68.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getUserId();
        java.lang.String str11 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        com.yorku.roomscheduler.model.enums.AccountType accountType29 = user26.getAccountType();
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
        org.junit.Assert.assertTrue("'" + accountType29 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType29.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        boolean boolean12 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner18 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str19 = partner18.getCompanyName();
        java.lang.String str20 = partner18.getCompanyName();
        java.lang.String str21 = partner18.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner18.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.model.users.Partner partner32 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str33 = partner32.getCompanyName();
        java.lang.String str34 = partner32.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType35 = partner32.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory36 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType35);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory37 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType35);
        com.yorku.roomscheduler.model.users.Partner partner46 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str47 = partner46.getCompanyName();
        java.lang.String str48 = partner46.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType49 = partner46.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory50 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType49);
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
        com.yorku.roomscheduler.model.users.User user84 = userFactory50.createUser("", "hi!", "", strArray82);
        com.yorku.roomscheduler.model.users.User user85 = userFactory37.createUser("", "hi!", "hi!", strArray82);
        com.yorku.roomscheduler.model.users.User user86 = userFactory23.createUser("hi!", "hi!", "", strArray82);
        com.yorku.roomscheduler.model.users.User user87 = userFactory9.createUser("hi!", "hi!", "hi!", strArray82);
        java.lang.String str88 = user87.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + accountType35 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType35.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory36);
        org.junit.Assert.assertNotNull(userFactory37);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + accountType49 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType49.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory50);
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
        org.junit.Assert.assertNotNull(user86);
        org.junit.Assert.assertNotNull(user87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        java.lang.String str94 = user93.getUserId();
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
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getPass();
        java.lang.String str7 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        java.lang.String str11 = partner5.getEmail();
        boolean boolean12 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getOrganizationId();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.lang.String str69 = user67.getEmail();
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass14 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        java.lang.String str11 = partner5.getEmail();
        java.lang.Class<?> wildcardClass12 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        com.yorku.roomscheduler.model.users.Partner partner35 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str36 = partner35.getCompanyName();
        java.lang.String str37 = partner35.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType38 = partner35.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory39 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory40 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user48 = userFactory40.createUser("", "", "", strArray47);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user59 = userFactory40.createUser("", "", "hi!", strArray58);
        com.yorku.roomscheduler.model.users.User user60 = userFactory26.createUser("", "hi!", "hi!", strArray58);
        com.yorku.roomscheduler.model.users.User user61 = userFactory12.createUser("hi!", "hi!", "", strArray58);
        java.lang.String[] strArray65 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.roomscheduler.model.users.User user66 = userFactory12.createUser("hi!", "", "", strArray65);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + accountType24 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType24.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory25);
        org.junit.Assert.assertNotNull(userFactory26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + accountType38 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType38.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory39);
        org.junit.Assert.assertNotNull(userFactory40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user48);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(user61);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getPass();
        java.lang.String str11 = student4.getStudentNumber();
        java.lang.String str12 = student4.getStudentNumber();
        java.lang.String str13 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        double double6 = partner5.getHourlyRate();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.Class<?> wildcardClass9 = partner5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        java.lang.Class<?> wildcardClass11 = accountType9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getOrganizationId();
        java.lang.String str14 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getUserId();
        double double12 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getUserId();
        java.lang.String str8 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        java.lang.String str10 = partner5.getOrganizationId();
        double double11 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmployeeId();
        double double10 = staff5.getHourlyRate();
        boolean boolean11 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "hi!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        double double8 = faculty5.getHourlyRate();
        faculty5.verify();
        double double10 = faculty5.getHourlyRate();
        java.lang.String str11 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        double double6 = partner5.getHourlyRate();
        double double7 = partner5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        java.lang.String str8 = partner5.getUserId();
        boolean boolean9 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        com.yorku.roomscheduler.model.users.Partner partner20 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str21 = partner20.getCompanyName();
        java.lang.String str22 = partner20.getEmail();
        boolean boolean23 = partner20.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType24 = partner20.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType25 = partner20.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory26 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user34 = userFactory26.createUser("", "hi!", "", strArray33);
        com.yorku.roomscheduler.model.users.User user35 = userFactory11.createUser("hi!", "", "", strArray33);
        java.lang.String[] strArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.roomscheduler.model.users.User user40 = userFactory11.createUser("hi!", "", "", strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"extraParams\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + accountType24 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType24.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType25 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType25.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(user35);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getPass();
        boolean boolean10 = faculty5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        double double6 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        double double5 = student4.getHourlyRate();
        student4.verify();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        double double11 = faculty5.getHourlyRate();
        java.lang.String str12 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        com.yorku.roomscheduler.model.users.User user85 = userFactory12.createUser("", "", "", strArray82);
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        com.yorku.roomscheduler.model.enums.AccountType accountType15 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + accountType15 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType15.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getOrganizationId();
        java.lang.String str14 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        double double11 = staff5.getHourlyRate();
        double double12 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        java.lang.String str12 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getUserId();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "", "hi!");
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "hi!", "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        java.lang.String str11 = partner5.getUserId();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        boolean boolean9 = faculty5.isVerified();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        java.lang.String str16 = partner5.getOrganizationId();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        java.lang.String str11 = staff5.getDepartment();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getEmail();
        java.lang.String str14 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str16 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        java.lang.String str6 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "", "");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        java.lang.Class<?> wildcardClass9 = userFactory8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getOrganizationId();
        java.lang.String str14 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getCompanyName();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str8 = faculty5.getUserId();
        boolean boolean9 = faculty5.isVerified();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        faculty5.verify();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getUserId();
        java.lang.String str12 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "hi!", "hi!");
        student4.verify();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "", "");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "hi!", "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        java.lang.String str11 = faculty5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getOrganizationId();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getOrganizationId();
        double double10 = partner5.getHourlyRate();
        double double11 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType14 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        java.lang.Class<?> wildcardClass8 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        staff5.verify();
        java.lang.Class<?> wildcardClass11 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user18 = userFactory10.createUser("", "", "", strArray17);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user29 = userFactory10.createUser("", "", "hi!", strArray28);
        com.yorku.roomscheduler.model.users.Partner partner38 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str39 = partner38.getCompanyName();
        java.lang.String str40 = partner38.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType41 = partner38.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory42 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user49 = userFactory42.createUser("", "", "hi!", strArray48);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user59 = userFactory42.createUser("", "hi!", "hi!", strArray58);
        com.yorku.roomscheduler.model.users.User user60 = userFactory10.createUser("", "", "", strArray58);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + accountType41 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType41.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(user60);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory14 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner23 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str24 = partner23.getCompanyName();
        java.lang.String str25 = partner23.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType26 = partner23.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory27 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory28 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType26);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user36 = userFactory28.createUser("", "", "", strArray35);
        com.yorku.roomscheduler.model.users.User user37 = userFactory14.createUser("", "hi!", "", strArray35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertNotNull(userFactory13);
        org.junit.Assert.assertNotNull(userFactory14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + accountType26 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType26.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory27);
        org.junit.Assert.assertNotNull(userFactory28);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(user37);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getEmployeeId();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        java.lang.String str7 = partner5.getOrganizationId();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        double double11 = faculty5.getHourlyRate();
        java.lang.String str12 = faculty5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        faculty5.verify();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user18 = userFactory10.createUser("", "", "", strArray17);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user29 = userFactory10.createUser("", "", "hi!", strArray28);
        com.yorku.roomscheduler.model.users.Partner partner38 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str39 = partner38.getCompanyName();
        java.lang.String str40 = partner38.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType41 = partner38.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory42 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType41);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory43 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType41);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory44 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType41);
        com.yorku.roomscheduler.model.users.Partner partner53 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str54 = partner53.getCompanyName();
        java.lang.String str55 = partner53.getEmail();
        boolean boolean56 = partner53.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType57 = partner53.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType58 = partner53.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory59 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType58);
        com.yorku.roomscheduler.model.users.Partner partner68 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str69 = partner68.getCompanyName();
        java.lang.String str70 = partner68.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType71 = partner68.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory72 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory73 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user81 = userFactory73.createUser("", "", "", strArray80);
        com.yorku.roomscheduler.model.users.User user82 = userFactory59.createUser("", "hi!", "", strArray80);
        com.yorku.roomscheduler.model.users.User user83 = userFactory44.createUser("hi!", "hi!", "hi!", strArray80);
        com.yorku.roomscheduler.model.users.User user84 = userFactory10.createUser("", "hi!", "hi!", strArray80);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + accountType41 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType41.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory42);
        org.junit.Assert.assertNotNull(userFactory43);
        org.junit.Assert.assertNotNull(userFactory44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + accountType57 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType57.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType58 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType58.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + accountType71 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType71.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory72);
        org.junit.Assert.assertNotNull(userFactory73);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(user84);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getUserId();
        java.lang.String str11 = student4.getUserId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getUserId();
        java.lang.String str14 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user75 = userFactory10.createUser("hi!", "", "", strArray74);
        java.lang.String str76 = user75.getEmail();
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
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        java.lang.Class<?> wildcardClass9 = accountType7.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.lang.String str16 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        partner5.verify();
        java.lang.String str7 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "hi!");
        faculty5.verify();
        java.lang.String str7 = faculty5.getPass();
        java.lang.String str8 = faculty5.getPass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getEmail();
        java.lang.String str15 = partner5.getCompanyName();
        double double16 = partner5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.String str14 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        java.lang.Class<?> wildcardClass9 = accountType7.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass6 = partner5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        boolean boolean6 = faculty5.isVerified();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        double double11 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        double double9 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        partner5.verify();
        partner5.verify();
        java.lang.String str10 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getEmail();
        java.lang.String str14 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        boolean boolean9 = staff5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user18 = userFactory10.createUser("", "", "", strArray17);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user29 = userFactory10.createUser("", "", "hi!", strArray28);
        com.yorku.roomscheduler.model.users.Staff staff38 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType39 = staff38.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory40 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType39);
        com.yorku.roomscheduler.model.users.Partner partner49 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str50 = partner49.getCompanyName();
        java.lang.String str51 = partner49.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType52 = partner49.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory53 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType52);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user58 = userFactory53.createUser("hi!", "hi!", "hi!", strArray57);
        com.yorku.roomscheduler.model.users.User user59 = userFactory40.createUser("", "hi!", "", strArray57);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user67 = userFactory40.createUser("hi!", "hi!", "", strArray66);
        com.yorku.roomscheduler.model.users.User user68 = userFactory10.createUser("", "hi!", "", strArray66);
        com.yorku.roomscheduler.model.users.Partner partner77 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str78 = partner77.getCompanyName();
        java.lang.String str79 = partner77.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType80 = partner77.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory81 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType80);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory82 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType80);
        java.lang.String[] strArray89 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user90 = userFactory82.createUser("", "", "", strArray89);
        com.yorku.roomscheduler.model.users.User user91 = userFactory10.createUser("", "", "", strArray89);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertTrue("'" + accountType39 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType39.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory40);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + accountType52 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType52.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory53);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNotNull(user68);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + accountType80 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType80.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory81);
        org.junit.Assert.assertNotNull(userFactory82);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user90);
        org.junit.Assert.assertNotNull(user91);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getOrganizationId();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getUserId();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user19 = userFactory10.createUser("hi!", "hi!", "", strArray18);
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = user19.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        double double6 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = partner5.getAccountType();
        java.lang.String str8 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        boolean boolean10 = staff5.isVerified();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.lang.String str17 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        partner5.verify();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        boolean boolean6 = faculty5.isVerified();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        java.lang.String[] strArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.roomscheduler.model.users.User user15 = userFactory10.createUser("", "", "", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"extraParams\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        staff5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        java.lang.String str7 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "", "");
        java.lang.String str6 = partner5.getCompanyName();
        double double7 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user32 = userFactory24.createUser("", "", "", strArray31);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user43 = userFactory24.createUser("", "", "hi!", strArray42);
        com.yorku.roomscheduler.model.users.User user44 = userFactory10.createUser("hi!", "", "", strArray42);
        com.yorku.roomscheduler.model.users.Partner partner53 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str54 = partner53.getCompanyName();
        java.lang.String str55 = partner53.getEmail();
        boolean boolean56 = partner53.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType57 = partner53.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType58 = partner53.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory59 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType58);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user67 = userFactory59.createUser("", "hi!", "", strArray66);
        com.yorku.roomscheduler.model.users.Partner partner76 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str77 = partner76.getCompanyName();
        java.lang.String str78 = partner76.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType79 = partner76.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory80 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType79);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user87 = userFactory80.createUser("", "", "hi!", strArray86);
        java.lang.String[] strArray96 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user97 = userFactory80.createUser("", "hi!", "hi!", strArray96);
        com.yorku.roomscheduler.model.users.User user98 = userFactory59.createUser("hi!", "", "hi!", strArray96);
        com.yorku.roomscheduler.model.users.User user99 = userFactory10.createUser("", "hi!", "hi!", strArray96);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + accountType57 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType57.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType58 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType58.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory59);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + accountType79 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType79.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user87);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(user97);
        org.junit.Assert.assertNotNull(user98);
        org.junit.Assert.assertNotNull(user99);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        java.lang.String str17 = user16.getPass();
        user16.verify();
        java.lang.String str19 = user16.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getPass();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        double double8 = faculty5.getHourlyRate();
        faculty5.verify();
        double double10 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.lang.String str15 = partner5.getUserId();
        java.lang.String str16 = partner5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "hi!", "hi!", "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        java.lang.String str7 = student4.getUserId();
        double double8 = student4.getHourlyRate();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        com.yorku.roomscheduler.model.users.Partner partner20 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str21 = partner20.getCompanyName();
        java.lang.String str22 = partner20.getEmail();
        boolean boolean23 = partner20.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType24 = partner20.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType25 = partner20.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory26 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType25);
        com.yorku.roomscheduler.model.users.Partner partner35 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str36 = partner35.getCompanyName();
        java.lang.String str37 = partner35.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType38 = partner35.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory39 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory40 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType38);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user48 = userFactory40.createUser("", "", "", strArray47);
        com.yorku.roomscheduler.model.users.User user49 = userFactory26.createUser("", "hi!", "", strArray47);
        com.yorku.roomscheduler.model.users.Partner partner58 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str59 = partner58.getCompanyName();
        java.lang.String str60 = partner58.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType61 = partner58.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory62 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType61);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory63 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType61);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user71 = userFactory63.createUser("", "", "", strArray70);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user82 = userFactory63.createUser("", "", "hi!", strArray81);
        com.yorku.roomscheduler.model.users.User user83 = userFactory26.createUser("", "", "", strArray81);
        com.yorku.roomscheduler.model.users.User user84 = userFactory11.createUser("", "", "hi!", strArray81);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + accountType24 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType24.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType25 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType25.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + accountType38 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType38.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory39);
        org.junit.Assert.assertNotNull(userFactory40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user48);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + accountType61 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType61.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory62);
        org.junit.Assert.assertNotNull(userFactory63);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(user84);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmployeeId();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getUserId();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getEmployeeId();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "hi!");
        faculty5.verify();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        boolean boolean10 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "", "hi!");
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        boolean boolean9 = student4.isVerified();
        double double10 = student4.getHourlyRate();
        student4.verify();
        java.lang.String str12 = student4.getEmail();
        java.lang.String str13 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.String str15 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        java.lang.Class<?> wildcardClass11 = accountType9.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getPass();
        boolean boolean9 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.Class<?> wildcardClass12 = userFactory11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getEmail();
        java.lang.String str15 = partner5.getOrganizationId();
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "");
        java.lang.String str6 = partner5.getEmail();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        double double6 = partner5.getHourlyRate();
        partner5.verify();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getOrganizationId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        java.lang.String str17 = user16.getUserId();
        java.lang.String str18 = user16.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        com.yorku.roomscheduler.model.users.Partner partner45 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str46 = partner45.getCompanyName();
        java.lang.String str47 = partner45.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType48 = partner45.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory49 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType48);
        com.yorku.roomscheduler.model.users.Partner partner58 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str59 = partner58.getCompanyName();
        java.lang.String str60 = partner58.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType61 = partner58.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory62 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType61);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory63 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType61);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user71 = userFactory63.createUser("", "", "", strArray70);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user82 = userFactory63.createUser("", "", "hi!", strArray81);
        com.yorku.roomscheduler.model.users.User user83 = userFactory49.createUser("", "hi!", "", strArray81);
        com.yorku.roomscheduler.model.users.User user84 = userFactory12.createUser("", "", "hi!", strArray81);
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + accountType48 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType48.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory49);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + accountType61 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType61.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory62);
        org.junit.Assert.assertNotNull(userFactory63);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(user84);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getEmployeeId();
        double double9 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        boolean boolean6 = faculty5.isVerified();
        java.lang.String str7 = faculty5.getEmployeeId();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "", "");
        boolean boolean6 = partner5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getUserId();
        java.lang.String str8 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmployeeId();
        boolean boolean9 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getOrganizationId();
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.String str15 = partner5.getEmail();
        java.lang.String str16 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getUserId();
        java.lang.String str10 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user16 = userFactory9.createUser("", "", "hi!", strArray15);
        java.lang.String str17 = user16.getPass();
        java.lang.String str18 = user16.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmail();
        staff5.verify();
        double double12 = staff5.getHourlyRate();
        double double13 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str10 = staff5.getEmail();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getEmail();
        java.lang.String str11 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmail();
        staff5.verify();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getDepartment();
        double double14 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        boolean boolean9 = faculty5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getEmployeeId();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.Class<?> wildcardClass11 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "", "");
        java.lang.String str5 = student4.getPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str7 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        com.yorku.roomscheduler.model.users.Partner partner17 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str18 = partner17.getCompanyName();
        java.lang.String str19 = partner17.getEmail();
        boolean boolean20 = partner17.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType21 = partner17.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType22 = partner17.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType22);
        com.yorku.roomscheduler.model.users.Partner partner32 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str33 = partner32.getCompanyName();
        java.lang.String str34 = partner32.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType35 = partner32.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory36 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType35);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory37 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType35);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user45 = userFactory37.createUser("", "", "", strArray44);
        com.yorku.roomscheduler.model.users.User user46 = userFactory23.createUser("", "hi!", "", strArray44);
        com.yorku.roomscheduler.model.users.User user47 = userFactory8.createUser("", "", "", strArray44);
        com.yorku.roomscheduler.model.users.Partner partner56 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str57 = partner56.getCompanyName();
        java.lang.String str58 = partner56.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType59 = partner56.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory60 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType59);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory61 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType59);
        com.yorku.roomscheduler.model.users.Partner partner70 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str71 = partner70.getCompanyName();
        java.lang.String str72 = partner70.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType73 = partner70.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory74 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType73);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user81 = userFactory74.createUser("", "", "hi!", strArray80);
        com.yorku.roomscheduler.model.users.User user82 = userFactory61.createUser("hi!", "", "hi!", strArray80);
        com.yorku.roomscheduler.model.users.User user83 = userFactory8.createUser("", "hi!", "hi!", strArray80);
        user83.verify();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + accountType21 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType21.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType22 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType22.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + accountType35 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType35.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory36);
        org.junit.Assert.assertNotNull(userFactory37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + accountType59 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType59.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory60);
        org.junit.Assert.assertNotNull(userFactory61);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + accountType73 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType73.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory74);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertNotNull(user83);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getPass();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getPass();
        partner5.verify();
        java.lang.Class<?> wildcardClass12 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "hi!", "hi!");
        faculty5.verify();
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory14 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory15 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory16 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertNotNull(userFactory13);
        org.junit.Assert.assertNotNull(userFactory14);
        org.junit.Assert.assertNotNull(userFactory15);
        org.junit.Assert.assertNotNull(userFactory16);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.String str42 = partner40.getEmail();
        boolean boolean43 = partner40.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType44 = partner40.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType45 = partner40.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory46 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType45);
        com.yorku.roomscheduler.model.users.Partner partner55 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str56 = partner55.getCompanyName();
        java.lang.String str57 = partner55.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType58 = partner55.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory59 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType58);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory60 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType58);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user68 = userFactory60.createUser("", "", "", strArray67);
        com.yorku.roomscheduler.model.users.User user69 = userFactory46.createUser("", "hi!", "", strArray67);
        com.yorku.roomscheduler.model.users.User user70 = userFactory10.createUser("hi!", "hi!", "hi!", strArray67);
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        com.yorku.roomscheduler.model.users.User user76 = userFactory10.createUser("", "", "", strArray75);
        java.lang.Class<?> wildcardClass77 = strArray75.getClass();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + accountType44 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType44.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType45 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType45.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory46);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + accountType58 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType58.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory59);
        org.junit.Assert.assertNotNull(userFactory60);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user68);
        org.junit.Assert.assertNotNull(user69);
        org.junit.Assert.assertNotNull(user70);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(user76);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getEmployeeId();
        java.lang.String str11 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user34 = userFactory7.createUser("hi!", "hi!", "", strArray33);
        com.yorku.roomscheduler.model.users.Student student42 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str43 = student42.getPass();
        java.lang.String str44 = student42.getPass();
        double double45 = student42.getHourlyRate();
        java.lang.String str46 = student42.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType47 = student42.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory48 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType47);
        com.yorku.roomscheduler.model.users.Partner partner57 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str58 = partner57.getCompanyName();
        java.lang.String str59 = partner57.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType60 = partner57.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory61 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType60);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory62 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType60);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user70 = userFactory62.createUser("", "", "", strArray69);
        com.yorku.roomscheduler.model.users.User user71 = userFactory48.createUser("", "hi!", "hi!", strArray69);
        com.yorku.roomscheduler.model.users.User user72 = userFactory7.createUser("", "", "hi!", strArray69);
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 20.0d + "'", double45 == 20.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + accountType47 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType47.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory48);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + accountType60 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType60.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory61);
        org.junit.Assert.assertNotNull(userFactory62);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user70);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(user72);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getEmail();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getPass();
        staff5.verify();
        boolean boolean9 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = staff5.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        double double8 = faculty5.getHourlyRate();
        faculty5.verify();
        java.lang.String str10 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = faculty5.getAccountType();
        java.lang.String str12 = faculty5.getDepartment();
        java.lang.String str13 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getEmail();
        java.lang.String str15 = partner5.getCompanyName();
        java.lang.String str16 = partner5.getCompanyName();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user18 = userFactory10.createUser("", "", "", strArray17);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user29 = userFactory10.createUser("", "", "hi!", strArray28);
        com.yorku.roomscheduler.model.users.Partner partner38 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str39 = partner38.getCompanyName();
        java.lang.String str40 = partner38.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType41 = partner38.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory42 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType41);
        com.yorku.roomscheduler.model.users.Partner partner51 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str52 = partner51.getCompanyName();
        java.lang.String str53 = partner51.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType54 = partner51.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory55 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType54);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory56 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType54);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user64 = userFactory56.createUser("", "", "", strArray63);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user75 = userFactory56.createUser("", "", "hi!", strArray74);
        com.yorku.roomscheduler.model.users.User user76 = userFactory42.createUser("", "hi!", "", strArray74);
        com.yorku.roomscheduler.model.users.User user77 = userFactory10.createUser("", "hi!", "hi!", strArray74);
        java.lang.String str78 = user77.getPass();
        java.lang.String str79 = user77.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + accountType41 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType41.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory42);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + accountType54 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType54.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory55);
        org.junit.Assert.assertNotNull(userFactory56);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertNotNull(user76);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserId();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getEmployeeId();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.lang.String str15 = partner5.getCompanyName();
        java.lang.String str16 = partner5.getOrganizationId();
        boolean boolean17 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType14 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType14.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getCompanyName();
        double double13 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "");
        java.lang.String str6 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getPass();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "", "");
        java.lang.String str6 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        com.yorku.roomscheduler.model.users.Partner partner18 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str19 = partner18.getCompanyName();
        java.lang.String str20 = partner18.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType21 = partner18.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory22 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType21);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType21);
        com.yorku.roomscheduler.model.users.Partner partner32 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str33 = partner32.getCompanyName();
        java.lang.String str34 = partner32.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType35 = partner32.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory36 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user43 = userFactory36.createUser("", "", "hi!", strArray42);
        com.yorku.roomscheduler.model.users.User user44 = userFactory23.createUser("hi!", "", "hi!", strArray42);
        com.yorku.roomscheduler.model.users.Partner partner53 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str54 = partner53.getCompanyName();
        java.lang.String str55 = partner53.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType56 = partner53.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory57 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType56);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory58 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType56);
        com.yorku.roomscheduler.model.users.Partner partner67 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str68 = partner67.getCompanyName();
        java.lang.String str69 = partner67.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType70 = partner67.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory71 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType70);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user78 = userFactory71.createUser("", "", "hi!", strArray77);
        com.yorku.roomscheduler.model.users.User user79 = userFactory58.createUser("hi!", "", "hi!", strArray77);
        com.yorku.roomscheduler.model.users.User user80 = userFactory23.createUser("hi!", "", "hi!", strArray77);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user88 = userFactory23.createUser("hi!", "", "", strArray87);
        com.yorku.roomscheduler.model.users.User user89 = userFactory9.createUser("", "hi!", "", strArray87);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory7);
        org.junit.Assert.assertNotNull(userFactory8);
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + accountType21 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType21.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory22);
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + accountType35 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType35.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + accountType56 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType56.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory57);
        org.junit.Assert.assertNotNull(userFactory58);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + accountType70 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType70.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory71);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(user80);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(user89);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        boolean boolean7 = staff5.isVerified();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getPass();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getEmployeeId();
        double double10 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        double double10 = staff5.getHourlyRate();
        java.lang.String str11 = staff5.getDepartment();
        java.lang.String str12 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getUserId();
        java.lang.String str10 = faculty5.getEmployeeId();
        double double11 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getOrganizationId();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        com.yorku.roomscheduler.model.users.Partner partner20 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str21 = partner20.getCompanyName();
        java.lang.String str22 = partner20.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType23 = partner20.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory24 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory25 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType23);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user33 = userFactory25.createUser("", "", "", strArray32);
        com.yorku.roomscheduler.model.users.User user34 = userFactory11.createUser("", "hi!", "", strArray32);
        java.lang.Class<?> wildcardClass35 = strArray32.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + accountType23 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType23.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory24);
        org.junit.Assert.assertNotNull(userFactory25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user32 = userFactory24.createUser("", "", "", strArray31);
        com.yorku.roomscheduler.model.users.User user33 = userFactory10.createUser("", "hi!", "hi!", strArray31);
        com.yorku.roomscheduler.model.enums.AccountType accountType34 = user33.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory35 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType34);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertTrue("'" + accountType34 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType34.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(userFactory35);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        boolean boolean8 = staff5.isVerified();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "", "hi!");
        boolean boolean5 = student4.isVerified();
        java.lang.String str6 = student4.getPass();
        student4.verify();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        boolean boolean8 = partner5.isVerified();
        double double9 = partner5.getHourlyRate();
        double double10 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "", "hi!", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getEmail();
        java.lang.String str12 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.String str17 = partner5.getUserId();
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
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        com.yorku.roomscheduler.model.users.Partner partner33 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str34 = partner33.getCompanyName();
        java.lang.String str35 = partner33.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType36 = partner33.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory37 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user44 = userFactory37.createUser("", "", "hi!", strArray43);
        com.yorku.roomscheduler.model.users.User user45 = userFactory24.createUser("hi!", "", "hi!", strArray43);
        com.yorku.roomscheduler.model.users.Partner partner54 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str55 = partner54.getCompanyName();
        java.lang.String str56 = partner54.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType57 = partner54.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory58 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType57);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory59 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType57);
        com.yorku.roomscheduler.model.users.Partner partner68 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str69 = partner68.getCompanyName();
        java.lang.String str70 = partner68.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType71 = partner68.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory72 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType71);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user79 = userFactory72.createUser("", "", "hi!", strArray78);
        com.yorku.roomscheduler.model.users.User user80 = userFactory59.createUser("hi!", "", "hi!", strArray78);
        com.yorku.roomscheduler.model.users.User user81 = userFactory24.createUser("hi!", "", "hi!", strArray78);
        com.yorku.roomscheduler.model.users.User user82 = userFactory10.createUser("hi!", "", "", strArray78);
        java.lang.String str83 = user82.getUserId();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + accountType36 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType36.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + accountType57 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType57.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory58);
        org.junit.Assert.assertNotNull(userFactory59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + accountType71 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType71.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(user80);
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(user82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.String str15 = partner5.getOrganizationId();
        java.lang.String str16 = partner5.getCompanyName();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = staff5.getAccountType();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        double double10 = staff5.getHourlyRate();
        boolean boolean11 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        boolean boolean8 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getEmail();
        student4.verify();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "");
        boolean boolean6 = faculty5.isVerified();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getPass();
        boolean boolean11 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user19 = userFactory11.createUser("", "hi!", "", strArray18);
        com.yorku.roomscheduler.model.users.Partner partner28 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str29 = partner28.getCompanyName();
        java.lang.String str30 = partner28.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType31 = partner28.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory32 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType31);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user39 = userFactory32.createUser("", "", "hi!", strArray38);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user49 = userFactory32.createUser("", "hi!", "hi!", strArray48);
        com.yorku.roomscheduler.model.users.User user50 = userFactory11.createUser("hi!", "", "hi!", strArray48);
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
        com.yorku.roomscheduler.model.users.User user84 = userFactory11.createUser("", "", "", strArray82);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + accountType31 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType31.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "", "", "hi!", "" });
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
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.String str15 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        double double10 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        java.lang.String str12 = staff5.getEmployeeId();
        java.lang.String str13 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        boolean boolean16 = partner5.isVerified();
        java.lang.String str17 = partner5.getOrganizationId();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        boolean boolean5 = student4.isVerified();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        partner5.verify();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getUserId();
        boolean boolean11 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "", "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "hi!", "", "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        faculty5.verify();
        java.lang.String str7 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        double double11 = partner5.getHourlyRate();
        boolean boolean12 = partner5.isVerified();
        double double13 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "", "hi!", "hi!");
        faculty5.verify();
        boolean boolean7 = faculty5.isVerified();
        java.lang.String str8 = faculty5.getPass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getUserId();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getPass();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str10 = staff5.getEmail();
        java.lang.Class<?> wildcardClass11 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getEmployeeId();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        java.lang.String str10 = student4.getStudentNumber();
        java.lang.String str11 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        double double8 = faculty5.getHourlyRate();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        boolean boolean8 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        faculty5.verify();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getDepartment();
        java.lang.String str10 = faculty5.getDepartment();
        double double11 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "hi!");
        boolean boolean5 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Partner partner18 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str19 = partner18.getCompanyName();
        java.lang.String str20 = partner18.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType21 = partner18.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory22 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType21);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory23 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType21);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user31 = userFactory23.createUser("", "", "", strArray30);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user42 = userFactory23.createUser("", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.users.User user43 = userFactory9.createUser("hi!", "", "hi!", strArray41);
        com.yorku.roomscheduler.model.enums.AccountType accountType44 = user43.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + accountType21 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType21.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory22);
        org.junit.Assert.assertNotNull(userFactory23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertTrue("'" + accountType44 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType44.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        faculty5.verify();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str11 = faculty5.getEmployeeId();
        java.lang.String str12 = faculty5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = faculty5.getAccountType();
        java.lang.String str14 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory7 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType6);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        boolean boolean11 = partner5.isVerified();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user34 = userFactory7.createUser("hi!", "hi!", "", strArray33);
        java.lang.Class<?> wildcardClass35 = user34.getClass();
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getEmployeeId();
        java.lang.String str12 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "hi!", "");
        java.lang.String str6 = faculty5.getUserId();
        boolean boolean7 = faculty5.isVerified();
        java.lang.String str8 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getPass();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.Class<?> wildcardClass9 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getUserId();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "hi!", "");
        double double6 = partner5.getHourlyRate();
        double double7 = partner5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "", "hi!");
        boolean boolean6 = staff5.isVerified();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

