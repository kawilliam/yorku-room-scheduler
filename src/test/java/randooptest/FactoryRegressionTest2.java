package randooptest;

import org.junit.FixMethodOrder;

import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FactoryRegressionTest2 {

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
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "", "");
        java.lang.String str6 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        boolean boolean8 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getUserId();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getEmail();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getPass();
        double double11 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = student4.getAccountType();
        java.lang.String str13 = student4.getStudentNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "hi!", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getEmail();
        boolean boolean10 = partner5.isVerified();
        java.lang.Class<?> wildcardClass11 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "hi!", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getPass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "");
        java.lang.String str6 = partner5.getEmail();
        double double7 = partner5.getHourlyRate();
        java.lang.String str8 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str6 = staff5.getUserId();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory8);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        double double6 = partner5.getHourlyRate();
        java.lang.String str7 = partner5.getOrganizationId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        double double13 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getEmail();
        java.lang.String str10 = partner5.getOrganizationId();
        double double11 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.String str7 = student4.getStudentNumber();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getUserId();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user19 = userFactory10.createUser("hi!", "hi!", "", strArray18);
        com.yorku.roomscheduler.model.users.Partner partner28 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str29 = partner28.getCompanyName();
        java.lang.String str30 = partner28.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType31 = partner28.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory32 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType31);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory33 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType31);
        com.yorku.roomscheduler.model.users.Partner partner42 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str43 = partner42.getCompanyName();
        java.lang.String str44 = partner42.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType45 = partner42.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory46 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType45);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user53 = userFactory46.createUser("", "", "hi!", strArray52);
        com.yorku.roomscheduler.model.users.User user54 = userFactory33.createUser("hi!", "", "hi!", strArray52);
        com.yorku.roomscheduler.model.users.Partner partner63 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str64 = partner63.getCompanyName();
        java.lang.String str65 = partner63.getEmail();
        boolean boolean66 = partner63.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType67 = partner63.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType68 = partner63.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory69 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType68);
        com.yorku.roomscheduler.model.users.Partner partner78 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str79 = partner78.getCompanyName();
        java.lang.String str80 = partner78.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType81 = partner78.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory82 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType81);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory83 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType81);
        java.lang.String[] strArray90 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user91 = userFactory83.createUser("", "", "", strArray90);
        com.yorku.roomscheduler.model.users.User user92 = userFactory69.createUser("", "hi!", "", strArray90);
        com.yorku.roomscheduler.model.users.User user93 = userFactory33.createUser("hi!", "hi!", "hi!", strArray90);
        com.yorku.roomscheduler.model.users.User user94 = userFactory10.createUser("", "", "", strArray90);
        user94.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + accountType31 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType31.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory32);
        org.junit.Assert.assertNotNull(userFactory33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + accountType45 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType45.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + accountType67 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType67.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType68 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType68.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory69);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + accountType81 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType81.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory82);
        org.junit.Assert.assertNotNull(userFactory83);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user91);
        org.junit.Assert.assertNotNull(user92);
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertNotNull(user94);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getEmail();
        double double9 = partner5.getHourlyRate();
        partner5.verify();
        java.lang.String str11 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = student4.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        student4.verify();
        java.lang.String str13 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getOrganizationId();
        double double11 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        double double9 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getOrganizationId();
        double double14 = partner5.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getPass();
        java.lang.String str11 = staff5.getEmployeeId();
        java.lang.String str12 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getPass();
        student4.verify();
        java.lang.String str11 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getUserId();
        java.lang.String str8 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        boolean boolean16 = partner5.isVerified();
        java.lang.String str17 = partner5.getCompanyName();
        java.lang.String str18 = partner5.getPass();
        java.lang.Class<?> wildcardClass19 = partner5.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getUserId();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getDepartment();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        boolean boolean8 = faculty5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        double double6 = partner5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = partner5.getAccountType();
        java.lang.String str8 = partner5.getEmail();
        double double9 = partner5.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = partner5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        java.lang.String str10 = partner5.getCompanyName();
        double double11 = partner5.getHourlyRate();
        partner5.verify();
        boolean boolean13 = partner5.isVerified();
        java.lang.String str14 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        double double7 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        partner5.verify();
        double double16 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user19 = userFactory10.createUser("hi!", "hi!", "", strArray18);
        com.yorku.roomscheduler.model.users.Partner partner28 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str29 = partner28.getCompanyName();
        java.lang.String str30 = partner28.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType31 = partner28.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory32 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType31);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory33 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType31);
        com.yorku.roomscheduler.model.users.Partner partner42 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str43 = partner42.getCompanyName();
        java.lang.String str44 = partner42.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType45 = partner42.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory46 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType45);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "" };
        com.yorku.roomscheduler.model.users.User user53 = userFactory46.createUser("", "", "hi!", strArray52);
        com.yorku.roomscheduler.model.users.User user54 = userFactory33.createUser("hi!", "", "hi!", strArray52);
        com.yorku.roomscheduler.model.users.Partner partner63 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str64 = partner63.getCompanyName();
        java.lang.String str65 = partner63.getEmail();
        boolean boolean66 = partner63.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType67 = partner63.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType68 = partner63.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory69 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType68);
        com.yorku.roomscheduler.model.users.Partner partner78 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str79 = partner78.getCompanyName();
        java.lang.String str80 = partner78.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType81 = partner78.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory82 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType81);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory83 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType81);
        java.lang.String[] strArray90 = new java.lang.String[] { "", "hi!", "" };
        com.yorku.roomscheduler.model.users.User user91 = userFactory83.createUser("", "", "", strArray90);
        com.yorku.roomscheduler.model.users.User user92 = userFactory69.createUser("", "hi!", "", strArray90);
        com.yorku.roomscheduler.model.users.User user93 = userFactory33.createUser("hi!", "hi!", "hi!", strArray90);
        com.yorku.roomscheduler.model.users.User user94 = userFactory10.createUser("", "", "", strArray90);
        java.lang.String str95 = user94.getPass();
        java.lang.Class<?> wildcardClass96 = user94.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + accountType31 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType31.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory32);
        org.junit.Assert.assertNotNull(userFactory33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + accountType45 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType45.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + accountType67 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType67.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType68 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType68.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory69);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + accountType81 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType81.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory82);
        org.junit.Assert.assertNotNull(userFactory83);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(user91);
        org.junit.Assert.assertNotNull(user92);
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertNotNull(user94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType5 = student4.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = student4.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType5 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType5.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getPass();
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getDepartment();
        java.lang.String str11 = faculty5.getDepartment();
        java.lang.Class<?> wildcardClass12 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory11 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory12 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertNotNull(userFactory11);
        org.junit.Assert.assertNotNull(userFactory12);
        org.junit.Assert.assertNotNull(userFactory13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = partner5.getAccountType();
        double double7 = partner5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        student4.verify();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getPass();
        java.lang.String str9 = student4.getStudentNumber();
        student4.verify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = partner5.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        java.lang.String str13 = partner5.getOrganizationId();
        java.lang.String str14 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        java.lang.String str7 = student4.getUserId();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getDepartment();
        java.lang.String str11 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str13 = staff5.getEmployeeId();
        java.lang.String str14 = staff5.getEmployeeId();
        java.lang.String str15 = staff5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        java.lang.String str9 = partner5.getEmail();
        partner5.verify();
        double double11 = partner5.getHourlyRate();
        double double12 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = partner5.getAccountType();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getCompanyName();
        double double14 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getEmail();
        partner5.verify();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getPass();
        java.lang.String str9 = partner5.getCompanyName();
        java.lang.String str10 = partner5.getOrganizationId();
        java.lang.String str11 = partner5.getCompanyName();
        double double12 = partner5.getHourlyRate();
        java.lang.String str13 = partner5.getCompanyName();
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "hi!", "hi!");
        boolean boolean6 = partner5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getPass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.lang.String str15 = partner5.getOrganizationId();
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
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getPass();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getUserId();
        faculty5.verify();
        java.lang.String str11 = faculty5.getUserId();
        java.lang.String str12 = faculty5.getEmployeeId();
        java.lang.String str13 = faculty5.getDepartment();
        java.lang.String str14 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getDepartment();
        faculty5.verify();
        double double11 = faculty5.getHourlyRate();
        java.lang.String str12 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        double double8 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        staff5.verify();
        java.lang.String str11 = staff5.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "", "hi!");
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        partner5.verify();
        java.lang.String str8 = partner5.getOrganizationId();
        java.lang.String str9 = partner5.getCompanyName();
        partner5.verify();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        faculty5.verify();
        java.lang.String str8 = faculty5.getUserId();
        boolean boolean9 = faculty5.isVerified();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.String str16 = partner5.getPass();
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = staff5.getAccountType();
        java.lang.String str10 = staff5.getEmployeeId();
        boolean boolean11 = staff5.isVerified();
        boolean boolean12 = staff5.isVerified();
        java.lang.String str13 = staff5.getUserId();
        java.lang.String str14 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getPass();
        double double10 = staff5.getHourlyRate();
        java.lang.String str11 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "hi!", "");
        double double6 = partner5.getHourlyRate();
        java.lang.String str7 = partner5.getCompanyName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        double double9 = partner5.getHourlyRate();
        java.lang.String str10 = partner5.getUserId();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "hi!", "", "");
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getUserId();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        boolean boolean13 = partner5.isVerified();
        partner5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "hi!", "", "hi!");
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        boolean boolean9 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        java.lang.String str11 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType12 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory13 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType12);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory14 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType12.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory13);
        org.junit.Assert.assertNotNull(userFactory14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        staff5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getUserId();
        java.lang.String str11 = partner5.getOrganizationId();
        double double12 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        staff5.verify();
        java.lang.String str11 = staff5.getEmployeeId();
        java.lang.String str12 = staff5.getEmployeeId();
        java.lang.String str13 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        java.lang.String str7 = faculty5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = student4.getAccountType();
        java.lang.String str11 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        java.lang.String str11 = partner5.getPass();
        java.lang.String str12 = partner5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.String str17 = partner5.getUserId();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.Class<?> wildcardClass14 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        java.lang.String str11 = faculty5.getEmail();
        double double12 = faculty5.getHourlyRate();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        java.lang.String str11 = student4.getEmail();
        boolean boolean12 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        staff5.verify();
        java.lang.String str8 = staff5.getUserId();
        double double9 = staff5.getHourlyRate();
        staff5.verify();
        java.lang.String str11 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getUserId();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getCompanyName();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserId();
        java.lang.String str9 = faculty5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType6 = faculty5.getAccountType();
        java.lang.String str7 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType6.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getPass();
        student4.verify();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        java.lang.String str7 = partner5.getPass();
        double double8 = partner5.getHourlyRate();
        java.lang.String str9 = partner5.getOrganizationId();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getEmail();
        java.lang.String str12 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        java.lang.String str9 = faculty5.getEmployeeId();
        double double10 = faculty5.getHourlyRate();
        double double11 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmployeeId();
        staff5.verify();
        double double12 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        java.lang.String str7 = staff5.getDepartment();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getOrganizationId();
        partner5.verify();
        java.lang.String str8 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmail();
        faculty5.verify();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        staff5.verify();
        double double11 = staff5.getHourlyRate();
        java.lang.String str12 = staff5.getEmployeeId();
        java.lang.String str13 = staff5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "");
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "", "hi!");
        java.lang.String str6 = partner5.getOrganizationId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = partner5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory8 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType7);
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.roomscheduler.model.users.User user13 = userFactory8.createUser("hi!", "hi!", "hi!", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"extraParams\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        double double9 = faculty5.getHourlyRate();
        faculty5.verify();
        java.lang.String str11 = faculty5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getStudentNumber();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "", "", "");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getPass();
        double double9 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getUserId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
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
        com.yorku.roomscheduler.model.users.User user43 = userFactory9.createUser("", "hi!", "", strArray41);
        com.yorku.roomscheduler.model.users.Partner partner52 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str53 = partner52.getCompanyName();
        java.lang.String str54 = partner52.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType55 = partner52.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory56 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType55);
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
        com.yorku.roomscheduler.model.users.User user90 = userFactory56.createUser("hi!", "", "hi!", strArray88);
        com.yorku.roomscheduler.model.users.User user91 = userFactory9.createUser("", "hi!", "", strArray88);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + accountType55 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType55.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
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
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getEmail();
        staff5.verify();
        double double12 = staff5.getHourlyRate();
        java.lang.String str13 = staff5.getEmployeeId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.String str7 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getDepartment();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getUserId();
        java.lang.String str10 = staff5.getUserId();
        java.lang.String str11 = staff5.getEmployeeId();
        java.lang.String str12 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
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
        com.yorku.roomscheduler.model.users.User user83 = userFactory11.createUser("", "", "hi!", strArray79);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "", "hi!", "");
        double double5 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        java.lang.String str7 = student4.getStudentNumber();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getUserId();
        java.lang.String str10 = student4.getStudentNumber();
        boolean boolean11 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "hi!", "hi!", "");
        partner5.verify();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = partner5.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getEmployeeId();
        java.lang.String str10 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getUserId();
        java.lang.String str8 = student4.getStudentNumber();
        double double9 = student4.getHourlyRate();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getCompanyName();
        java.lang.String str13 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        java.lang.String str7 = staff5.getDepartment();
        java.lang.String str8 = staff5.getDepartment();
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        double double8 = faculty5.getHourlyRate();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        java.lang.String str10 = faculty5.getDepartment();
        java.lang.String str11 = faculty5.getDepartment();
        java.lang.String str12 = faculty5.getDepartment();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "hi!", "hi!", "", "hi!");
        java.lang.String str6 = faculty5.getDepartment();
        java.lang.String str7 = faculty5.getUserId();
        faculty5.verify();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory10);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getUserId();
        java.lang.String str9 = staff5.getDepartment();
        java.lang.String str10 = staff5.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType11 = staff5.getAccountType();
        java.lang.String str12 = staff5.getPass();
        com.yorku.roomscheduler.model.enums.AccountType accountType13 = staff5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType11.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + accountType13 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType13.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "hi!", "", "hi!", "");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getUserId();
        java.lang.String str8 = partner5.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        com.yorku.roomscheduler.model.enums.AccountType accountType5 = student4.getAccountType();
        student4.verify();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + accountType5 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType5.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "", "", "hi!");
        java.lang.String str6 = faculty5.getUserId();
        double double7 = faculty5.getHourlyRate();
        java.lang.String str8 = faculty5.getDepartment();
        java.lang.String str9 = faculty5.getDepartment();
        double double10 = faculty5.getHourlyRate();
        java.lang.String str11 = faculty5.getPass();
        java.lang.String str12 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        faculty5.verify();
        java.lang.String str7 = faculty5.getEmployeeId();
        java.lang.String str8 = faculty5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "hi!", "hi!");
        double double6 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "hi!", "hi!", "hi!", "");
        java.lang.String str6 = faculty5.getDepartment();
        double double7 = faculty5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "hi!", "", "", "");
        java.lang.String str6 = partner5.getCompanyName();
        boolean boolean7 = partner5.isVerified();
        java.lang.String str8 = partner5.getCompanyName();
        java.lang.String str9 = partner5.getCompanyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        partner5.verify();
        boolean boolean17 = partner5.isVerified();
        java.lang.String str18 = partner5.getCompanyName();
        java.lang.String str19 = partner5.getCompanyName();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("hi!", "", "", "", "");
        java.lang.String str6 = partner5.getUserId();
        java.lang.String str7 = partner5.getEmail();
        java.lang.String str8 = partner5.getUserId();
        double double9 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        java.lang.String str8 = partner5.getEmail();
        java.lang.String str9 = partner5.getUserId();
        partner5.verify();
        double double11 = partner5.getHourlyRate();
        java.lang.String str12 = partner5.getEmail();
        java.lang.String str13 = partner5.getCompanyName();
        double double14 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = student4.getAccountType();
        java.lang.String str8 = student4.getStudentNumber();
        java.lang.String str9 = student4.getStudentNumber();
        double double10 = student4.getHourlyRate();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getDepartment();
        boolean boolean8 = faculty5.isVerified();
        java.lang.String str9 = faculty5.getUserId();
        boolean boolean10 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        double double10 = partner5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = staff5.getPass();
        java.lang.String str7 = staff5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        partner5.verify();
        partner5.verify();
        com.yorku.roomscheduler.model.enums.AccountType accountType10 = partner5.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + accountType10 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType10.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("", "", "", "", "hi!");
        java.lang.String str6 = staff5.getEmployeeId();
        com.yorku.roomscheduler.model.enums.AccountType accountType7 = staff5.getAccountType();
        java.lang.String str8 = staff5.getEmployeeId();
        java.lang.String str9 = staff5.getPass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType7.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        student4.verify();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getStudentNumber();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("", "hi!", "hi!", "");
        java.lang.String str5 = student4.getStudentNumber();
        java.lang.String str6 = student4.getUserId();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getPass();
        java.lang.String str9 = student4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "");
        boolean boolean6 = faculty5.isVerified();
        java.lang.String str7 = faculty5.getDepartment();
        java.lang.String str8 = faculty5.getEmail();
        double double9 = faculty5.getHourlyRate();
        boolean boolean10 = faculty5.isVerified();
        java.lang.String str11 = faculty5.getPass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        double double17 = partner5.getHourlyRate();
        java.lang.String str18 = partner5.getPass();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "hi!", "", "");
        java.lang.String str6 = staff5.getEmployeeId();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmail();
        java.lang.String str10 = staff5.getUserId();
        java.lang.String str11 = staff5.getDepartment();
        java.lang.String str12 = staff5.getEmployeeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "hi!");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getStudentNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getEmail();
        boolean boolean8 = partner5.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = partner5.getAccountType();
        java.lang.String str10 = partner5.getCompanyName();
        java.lang.String str11 = partner5.getOrganizationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        com.yorku.roomscheduler.model.enums.AccountType accountType9 = student4.getAccountType();
        boolean boolean10 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STUDENT + "'", accountType9.equals(com.yorku.roomscheduler.model.enums.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("hi!", "", "hi!", "", "");
        java.lang.String str6 = faculty5.getEmployeeId();
        double double7 = faculty5.getHourlyRate();
        double double8 = faculty5.getHourlyRate();
        java.lang.String str9 = faculty5.getUserId();
        java.lang.String str10 = faculty5.getDepartment();
        boolean boolean11 = faculty5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.yorku.roomscheduler.model.users.Staff staff5 = new com.yorku.roomscheduler.model.users.Staff("hi!", "", "", "", "hi!");
        java.lang.String str6 = staff5.getPass();
        boolean boolean7 = staff5.isVerified();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        double double18 = partner5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.yorku.roomscheduler.model.users.Student student4 = new com.yorku.roomscheduler.model.users.Student("hi!", "hi!", "hi!", "");
        java.lang.String str5 = student4.getPass();
        java.lang.String str6 = student4.getPass();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getUserId();
        java.lang.String str9 = student4.getStudentNumber();
        java.lang.String str10 = student4.getStudentNumber();
        double double11 = student4.getHourlyRate();
        boolean boolean12 = student4.isVerified();
        java.lang.String str13 = student4.getEmail();
        double double14 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.yorku.roomscheduler.model.users.Partner partner5 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str6 = partner5.getCompanyName();
        java.lang.String str7 = partner5.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = partner5.getAccountType();
        boolean boolean9 = partner5.isVerified();
        double double10 = partner5.getHourlyRate();
        java.lang.String str11 = partner5.getUserId();
        java.lang.String str12 = partner5.getOrganizationId();
        boolean boolean13 = partner5.isVerified();
        boolean boolean14 = partner5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.yorku.roomscheduler.model.users.Faculty faculty5 = new com.yorku.roomscheduler.model.users.Faculty("", "", "hi!", "", "hi!");
        double double6 = faculty5.getHourlyRate();
        java.lang.String str7 = faculty5.getEmail();
        com.yorku.roomscheduler.model.enums.AccountType accountType8 = faculty5.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory9 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory10 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType8);
        com.yorku.roomscheduler.model.users.Staff staff19 = new com.yorku.roomscheduler.model.users.Staff("hi!", "hi!", "", "hi!", "hi!");
        com.yorku.roomscheduler.model.enums.AccountType accountType20 = staff19.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory21 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType20);
        com.yorku.roomscheduler.model.users.Partner partner30 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str31 = partner30.getCompanyName();
        java.lang.String str32 = partner30.getCompanyName();
        com.yorku.roomscheduler.model.enums.AccountType accountType33 = partner30.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory34 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType33);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        com.yorku.roomscheduler.model.users.User user39 = userFactory34.createUser("hi!", "hi!", "hi!", strArray38);
        com.yorku.roomscheduler.model.users.User user40 = userFactory21.createUser("", "hi!", "", strArray38);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!" };
        com.yorku.roomscheduler.model.users.User user48 = userFactory21.createUser("hi!", "hi!", "", strArray47);
        com.yorku.roomscheduler.model.users.Partner partner57 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str58 = partner57.getCompanyName();
        java.lang.String str59 = partner57.getEmail();
        boolean boolean60 = partner57.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType61 = partner57.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType62 = partner57.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory63 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType62);
        com.yorku.roomscheduler.model.users.Partner partner72 = new com.yorku.roomscheduler.model.users.Partner("", "", "hi!", "hi!", "hi!");
        java.lang.String str73 = partner72.getCompanyName();
        java.lang.String str74 = partner72.getEmail();
        boolean boolean75 = partner72.isVerified();
        com.yorku.roomscheduler.model.enums.AccountType accountType76 = partner72.getAccountType();
        com.yorku.roomscheduler.model.enums.AccountType accountType77 = partner72.getAccountType();
        com.yorku.roomscheduler.patterns.factory.UserFactory userFactory78 = com.yorku.roomscheduler.patterns.factory.UserFactory.getFactory(accountType77);
        java.lang.String[] strArray85 = new java.lang.String[] { "", "", "hi!" };
        com.yorku.roomscheduler.model.users.User user86 = userFactory78.createUser("", "hi!", "", strArray85);
        com.yorku.roomscheduler.model.users.User user87 = userFactory63.createUser("hi!", "", "", strArray85);
        com.yorku.roomscheduler.model.users.User user88 = userFactory21.createUser("hi!", "", "hi!", strArray85);
        com.yorku.roomscheduler.model.users.User user89 = userFactory10.createUser("hi!", "hi!", "", strArray85);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.FACULTY + "'", accountType8.equals(com.yorku.roomscheduler.model.enums.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(userFactory9);
        org.junit.Assert.assertNotNull(userFactory10);
        org.junit.Assert.assertTrue("'" + accountType20 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.STAFF + "'", accountType20.equals(com.yorku.roomscheduler.model.enums.AccountType.STAFF));
        org.junit.Assert.assertNotNull(userFactory21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + accountType33 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType33.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(user48);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + accountType61 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType61.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType62 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType62.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory63);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + accountType76 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType76.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertTrue("'" + accountType77 + "' != '" + com.yorku.roomscheduler.model.enums.AccountType.PARTNER + "'", accountType77.equals(com.yorku.roomscheduler.model.enums.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(userFactory78);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(user86);
        org.junit.Assert.assertNotNull(user87);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(user89);
    }
}

