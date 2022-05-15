package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String args[]) {
		final Scanner scanner = new Scanner(System.in);
        System.out.println("Welcoime to User Registeration");
        System.out.println("Enter 1 : to validate First Name ");
        
        System.out.println("Enter the choice");
        switch (scanner.nextInt())
        {
            case 1:
            	User_validation.validFirstName();
                break;
            
        }
    }

}
	


