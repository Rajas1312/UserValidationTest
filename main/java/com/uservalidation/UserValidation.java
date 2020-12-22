package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {

    public static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    public static final String EMAIL_PATTERN="^[a-zA-Z]{5}[0-9a-zA-Z\\.\\_\\-]*\\@[a-z]*\\.(com|co|in)$";
    public static final String MOBILE_PATTERN="^(\\+91)?[6-9]{1}[0-9]{9}$";
    public static final String PASSWORD_PATTERN="^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9\\W]{8,}$";

    public static boolean firstNameValidate(String fName){

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fName).matches();

    }
    public static boolean lastNameValidate(String lName){

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lName).matches();
    }
    public static boolean emailIdValidate(String email){

        Pattern pattern = Pattern.compile((EMAIL_PATTERN));
        return  pattern.matcher(email).matches();
    }
    public static boolean mobileValidate(String mobile){

        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return  pattern.matcher(mobile).matches();
    }
    public static boolean passwordValidate(String password){

        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}
