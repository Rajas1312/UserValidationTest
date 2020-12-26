package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    public String emailCheck;
    public boolean expectedResult;

    public ValidEmailTest(String emailCheck,boolean expectedResult){
        this.emailCheck=emailCheck;
        this.expectedResult=expectedResult;

    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object [][]{{"itsemerajas2@gmail.com",true},{"rajas333dongre@gmail.com",true}});

    }

    @Test
    public void givenEmail_WhenProperOrImproper_ShouldReturnTrueOrFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.emailId.setPattern(this.emailCheck);
        Assert.assertEquals(this.expectedResult,result);
    }
}
