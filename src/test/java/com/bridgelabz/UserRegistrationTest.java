package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
	@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		User_validation userRegistration=new User_validation();
        boolean result= userRegistration.validateFirstName("Dhanashri");
        Assert.assertTrue(result);
    }

	@Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException{
		User_validation userRegistration=new User_validation();
        boolean result= userRegistration.validateLastName("Nerkar");
        Assert.assertTrue(result);
    }
	
	@Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		User_validation userRegistration=new User_validation();
        boolean result= userRegistration.validateEmail("dhanashri@gmail.com");
        Assert.assertTrue(result);
    }
	
	@Test
    public void givenMobile_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		User_validation userRegistration=new User_validation();
        boolean result= userRegistration.validateMobile("9145288018");
        Assert.assertTrue(result);
    }
	
	@Test
	public void givenPassword1_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		User_validation userRegistration=new User_validation();
		boolean result=userRegistration.validatePassword1("dhanashr");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword2_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		User_validation userRegistration=new User_validation();
		boolean result=userRegistration.validatePassword2("Dhanashr");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword3_WhenProper_ShouldReturnTrue() throws UserRegistrationException{
		User_validation userRegistration=new User_validation();
		boolean result=userRegistration.validatePassword3("Dhanash1");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword4_WhenProper_ShouldReturnTrue() {
		User_validation userRegistration=new User_validation();
		boolean result=userRegistration.validatePassword4("Dhanashr$1");
		Assert.assertTrue(result);
	}
	

}
