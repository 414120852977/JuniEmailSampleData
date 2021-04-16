package com.quickpractice;

import java.util.regex.Pattern;

public class EmailValidation {
    public static final String EMAIL_PATTERN = "[a-z]{3}@[a-z]{5}.[a-z]{3}";
    public static final String EMAIL_PATTERN1 = "[a-z]{3}-[0-9]{3}@[a-z]{5}.[a-z]{3}";
    public static final String EMAIL_PATTERN2 = "[a-z]{3}.[0-9]{3}@[a-z]{5}.[a-z]{3}";
    public static final String EMAIL_PATTERN3 = "[a-z]{3}[0-9]{3}@[a-z].[a-z]{3}";
    public static final String EMAIL_PATTERN4 = "[a-z]{3}-[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2}";
    public static final String EMAIL_PATTERN5 = "[a-z]{3}@[0-9]{1}.[a-z]{3}";
    public static final String EMAIL_PATTERN7 = "[a-z]{3}@[a-z]{5}.[a-z]{3}";
    public static final String EMAIL_PATTERN8 = "[a-z]{3}+[0-9]{3}@[a-z]{5}.[a-z]{3}";

    public boolean emailvalid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean emailvalid1(String email1) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN1);
        return pattern.matcher(email1).matches();
    }
    public boolean emailvalid2(String email2) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN2);
        return pattern.matcher(email2).matches();
    }
    public boolean emailvalid3(String email3) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN3);
        return pattern.matcher(email3).matches();
    }
    public boolean emailvalid4(String email4) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN4);
        return pattern.matcher(email4).matches();
    }
    public boolean emailvalid6(String email5) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN5);
        return pattern.matcher(email5).matches();
    }
    public  boolean emailvalid7(String email7) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN7);
        return pattern.matcher(email7).matches();
    }
    public boolean emailvalid8( String email8) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN8);
        return pattern.matcher(email8).matches();
    }
}
