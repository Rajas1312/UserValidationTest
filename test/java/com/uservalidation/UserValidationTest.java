package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean firstName = userValidation.firstNameValidate("Rajas");
        Assert.assertEquals(true,firstName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean firstName = userValidation.firstNameValidate("Ra");
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean lastName=userValidation.lastNameValidate("Dongre");
        Assert.assertEquals(true,lastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean lastName=userValidation.lastNameValidate("Dongre@");
        Assert.assertEquals(false,lastName);
    }
}
