package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {

    public static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";

    public static boolean firstNameValidate(String fName){

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fName).matches();

    }
}
