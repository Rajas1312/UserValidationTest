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
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        UserValidation userValidation=new UserValidation();
        Boolean email=userValidation.emailIdValidate("rajas333dongre@live.com");
        Assert.assertEquals(true,email);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean email=userValidation.emailIdValidate("Rajas@#333dongre@live.com");
        Assert.assertEquals(false,email);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean mobile=userValidation.mobileValidate("+918286054654");
        Assert.assertEquals(true,mobile);
    }

    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean mobile=userValidation.mobileValidate("+9182860546543");
        Assert.assertEquals(false,mobile);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean password=userValidation.passwordValidate("Rajas@1234");
        Assert.assertEquals(true,password);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean password=userValidation.passwordValidate("Rajas@Dongre");
        Assert.assertEquals(false,password);
    }

    @Test
    public void givenFirstName_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean firstName = userValidation.firstNameValidate(null);
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void givenLastName_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean lastName= userValidation.lastNameValidate(null);
        Assert.assertEquals(false,lastName);
    }

    @Test
    public void givenMobileNumber_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean mobile= userValidation.mobileValidate(null);
        Assert.assertEquals(false,mobile);
    }

    @Test
    public void givenEmailId_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean email= userValidation.emailIdValidate(null);
        Assert.assertEquals(false,email);
    }

    @Test
    public void givenPassword_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean password= userValidation.passwordValidate(null);
        Assert.assertEquals(false,password);
    }
}
