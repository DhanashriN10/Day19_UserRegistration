package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_validation 
{
	public static final Scanner scanner = new Scanner(System.in);

       public static boolean validFirstName()
       {
		    System.out.print("Enter the First Name : ");
		    String name = scanner.next();
		    String regex = "^[A-Z]{1}[a-z]{2,}$";
		    Pattern p = Pattern.compile(regex);
		    Matcher m = p.matcher(name);
		    boolean r = m.matches();

		    if (r)
			     System.out.println("First name is valid");
		    else
			     System.out.println("First name is !Invalid");
		   return r;
	}
       
       
       public static boolean validLastName()
       {
		    System.out.print("Enter the Last Name : ");
		    String name = scanner.next();
		    String regex = "^[A-Z]{1}[a-z]{2,}$";
		    Pattern p = Pattern.compile(regex);
		    Matcher m = p.matcher(name);
		    boolean r = m.matches();

		    if (r)
			     System.out.println("Last name is valid");
		    else
			     System.out.println("Last name is !Invalid");
		   return r;
	}
       
       public static boolean validEmail()
       {
		    System.out.print("Enter the Email id : ");
		    String email = scanner.next();
		    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		    Pattern p = Pattern.compile(regex);
		    Matcher m = p.matcher(email);
		    boolean r = m.matches();

		    if (r)
			     System.out.println("Email Id is valid");
		    else
			     System.out.println("Email Id is !Invalid");
		   return r;
	}


       public static void validMobileNumber() {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter your mobile number : ");
           String phoneNo = scanner.nextLine();
           String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
           Pattern p3 = Pattern.compile(regex3);
           Matcher m3 = p3.matcher(phoneNo);
           boolean r3 = m3.matches();
           if (r3)
               System.out.println("Phone number is Valid");
           else
               System.out.println("Phone number is Invalid");
       }
}
