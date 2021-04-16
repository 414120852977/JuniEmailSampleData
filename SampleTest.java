package com.quickpractice;


import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class SampleTest {
    /**
     *  checking with the help of junit abc@yahoo.com
     *  it is valid then it will pass test cases
     */

    @Test
    public void given_Email_Should_Return_Valid() {
        EmailValidation emailvalidate  = new EmailValidation();
        boolean em = emailvalidate.emailvalid("abc@yahoo.com");
        Assert.assertEquals(true,em);
    }
    /**
     *  checking with the help of junit abc-100@yahoo.com"
     *  it is valid then it will pass test cases
     */
    @Test
    public void givenEmailVlidThenShouldReturnTrue() {
        EmailValidation emailvalidate  = new EmailValidation();
        boolean result = emailvalidate.emailvalid1("abc-100@yahoo.com");
        Assert.assertEquals(true,result);
    }
    /**
     *  checking with the help of junit abc.100@yahoo.com
     *  it is valid then it will pass test cases
     */

    @Test
    public void givenEmailShouldReturnTrue() {
        EmailValidation email = new EmailValidation();
        boolean result2 = email.emailvalid2("abc.100@yahoo.com");
        Assert.assertEquals(true,result2);
    }
    /**
     *  checking with the help of junit abc111@abc.com
     *  it is valid then it will pass test cases
     */

    @Test
    public void giveValidEmailShould_return_true() {
        EmailValidation email3 = new EmailValidation();
       boolean b =  email3.emailvalid3("abc111@abc.com");
       Assert.assertEquals(true,b);
    }
    /**
     * checking with the help of junit abc-100@abc.com.au
     * it is valid then it will pass test cases
     */
    @Test
    public void givenemail() {
        EmailValidation email3 = new EmailValidation();
        boolean bol = email3.emailvalid4("abc-100@abc.com.au");
        Assert.assertEquals(true,bol);
    }
    /**
     *checking with the help of junit  abc@1.com
     * it is valid then it will pass test cases
     */
    @Test
    public void givenEmail6() {
        EmailValidation email6 = new EmailValidation();
        boolean bo = email6.emailvalid6("abc@1.com");
        Assert.assertEquals(true,bo);
    }
    /**
     * checking with the help of junit  abc@gmail.com
     * it is valid then it will pass test cases
     */
    @Test
    public void givenEmailShouldBeReturnTrue() {
        EmailValidation email7 = new EmailValidation();
        boolean email  = email7.emailvalid7("abc@gmail.com");
        Assert.assertEquals(true,email);
    }
    /**
     * checking with the help of junit  abc+100@gmail.com
     * it is valid then it will pass test cases
     */
    @Test
    public void givenMailToCheckValidOrNot() {
        EmailValidation email8 = new EmailValidation();
        boolean results = email8.emailvalid8("abc+100@gmail.com");
        Assert.assertEquals(true,results);
    }
}
