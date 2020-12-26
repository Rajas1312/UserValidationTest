package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean firstName = userValidation.firstName.setPattern("Rajas");
        Assert.assertEquals(true,firstName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean firstName = userValidation.firstName.setPattern("Ra");
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean lastName=userValidation.lastName.setPattern("Dongre");
        Assert.assertEquals(true,lastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean lastName=userValidation.lastName.setPattern("Dongre@");
        Assert.assertEquals(false,lastName);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        UserValidation userValidation=new UserValidation();
        Boolean email=userValidation.emailId.setPattern("rajas333dongre@live.com");
        Assert.assertEquals(true,email);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean email=userValidation.emailId.setPattern("Rajas@#333dongre@live.com");
        Assert.assertEquals(false,email);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean mobile=userValidation.mobileNo.setPattern("+918286054654");
        Assert.assertEquals(true,mobile);
    }

    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean mobile=userValidation.mobileNo.setPattern("+9182860546543");
        Assert.assertEquals(false,mobile);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        Boolean password=userValidation.password.setPattern("Rajas@1234");
        Assert.assertEquals(true,password);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean password=userValidation.password.setPattern("Rajas@Dongre");
        Assert.assertEquals(false,password);
    }

    @Test
    public void givenFirstName_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean firstName = userValidation.firstName.setPattern(null);
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void givenLastName_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean lastName= userValidation.lastName.setPattern(null);
        Assert.assertEquals(false,lastName);
    }

    @Test
    public void givenMobileNumber_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean mobile= userValidation.mobileNo.setPattern(null);
        Assert.assertEquals(false,mobile);
    }

    @Test
    public void givenEmailId_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean email= userValidation.emailId.setPattern(null);
        Assert.assertEquals(false,email);
    }

    @Test
    public void givenPassword_WhenNull_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        Boolean password= userValidation.password.setPattern(null);
        Assert.assertEquals(false,password);
    }
}
