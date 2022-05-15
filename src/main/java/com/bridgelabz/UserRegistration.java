package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String args[]) {
		final Scanner scanner = new Scanner(System.in);
        System.out.println("Welcoime to User Registeration");
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate Email Id  ");
        System.out.println("Enter 4 : to validate Mobile Number  ");
        System.out.println("Enter 5 : to validate Password  ");
        
        System.out.println("Enter the choice");
        switch (scanner.nextInt())
        {
            case 1:
            	User_validation.validFirstName();
                break;
            case 2:
            	User_validation.validLastName();
            	break;
            case 3:
            	User_validation.validEmail();
            	break;
            case 4:
            	User_validation.validMobileNumber();
                break;
            case 5:
            	User_validation.validPassword();
            	break;
            default:
            	System.out.println("Invalid choice");
            
        }
    }

}
	


