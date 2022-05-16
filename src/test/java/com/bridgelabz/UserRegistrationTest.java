package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
	@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
		User_validation userRegistration=new User_validation();
        boolean result= userRegistration.validateFirstName("Dhanashri");
        Assert.assertTrue(result);
    }

}
