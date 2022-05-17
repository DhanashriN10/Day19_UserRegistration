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
       
       public static void validPassword() {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter your Password : ");
           String pwd = scanner.nextLine();
           //String regex3 = "^[A-Z a-z 0-9]{8,}$";
           //String regex3="^[A-Z]{1}+[a-z 0-9]{7,}$";
           //String regex3="^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
           String regex3="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
           Pattern p3 = Pattern.compile(regex3);
           Matcher m3 = p3.matcher(pwd);
           boolean r3 = m3.matches();
           if (r3)
               System.out.println("Password is Valid");
           else
               System.out.println("Password is Invalid");
       }
       
       
       //Junit
       public boolean validateFirstName(String fname) {
           String regex="^[A-Z]{1}[a-z]{2,}$";
           Pattern p=Pattern.compile(regex);
           Matcher m=p.matcher(fname);
           boolean r=m.matches();
           return r;
       }
       
       public boolean validateLastName(String lname) {
           String regex="^[A-Z]{1}[a-z]{2,}$";
           Pattern p=Pattern.compile(regex);
           Matcher m=p.matcher(lname);
           boolean r=m.matches();
           return r;
       }


	public boolean validateEmail(String email) {
		// TODO Auto-generated method stub
		String regex="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(email);
        boolean r=m.matches();
        return r;
	}
	
	public boolean validateMobile(String mob) {
		// TODO Auto-generated method stub
		String regex="(0|91)?[7-9][0-9]{9}";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(mob);
        boolean r=m.matches();
        return r;
	}
	
	public boolean validatePassword1(String pass1) {
		// TODO Auto-generated method stub
		String regex="^[A-Z a-z 0-9]{8,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(pass1);
        boolean r=m.matches();
        return r;
	}
	
	public boolean validatePassword2(String pass2) {
		// TODO Auto-generated method stub
		String regex="^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(pass2);
        boolean r=m.matches();
        return r;
	}
	
	public boolean validatePassword3(String pass3) {
		// TODO Auto-generated method stub
		String regex="^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(pass3);
        boolean r=m.matches();
        return r;
	}
	
	public boolean validatePassword4(String pass4) {
		// TODO Auto-generated method stub
		String regex="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(pass4);
        boolean r=m.matches();
        return r;
	}
	
	//Exception Handling
	
	//Exception handled for first name
	private static final String regex = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName1(String fName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex);
        if (Pattern.matches(regex, fName) == true)
            return Pattern.matches(regex, fName);
        else {
            throw new UserRegistrationException(" First Name Should be proper");
        }
    }
  //Exception handled for Last name
    private static final String regex1 = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateLastName1(String lName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex1, lName) == true)
            return Pattern.matches(regex1, lName);
        else {
            throw new UserRegistrationException("Last Name should be proper");
        }
    }
    
  //Exception handled for email id
    private static final String regex2 = "^[A-Za-z0-9+_.-]+@(.+)$";

    public boolean validateEmail1(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex2, email) == true)
            return Pattern.matches(regex2, email);
        else {
            throw new UserRegistrationException("Email id should be proper");
        }
    }
    //Exception handled for mobile number
    private static final String regex3 = "(0|91)?[7-9][0-9]{9}";

    public boolean validateMobileNumber(String mobileNo) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex3);
        if (Pattern.matches(regex3, mobileNo) == true)
            return Pattern.matches(regex3, mobileNo);
        else {
            throw new UserRegistrationException("Send a proper Mobile Number");
        }
    }
    
  //Exception Handled for Password Rule 1 : throw custom exceptions in case of Invalid User Details

    private static final String regex4 = "^[A-Z a-z 0-9]{8,}$";

    public boolean validatePasswordRule1(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex4);
        if (Pattern.matches(regex4, password) == true)
            return Pattern.matches(regex4, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 1 " + "(Minimum 8 characters)");
        }
    }
    
  //Exception Handled for Password Rule 2 : throw custom exceptions in case of Invalid User Details

    private static final String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";

    public boolean validatePasswordRule2(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex5);
        if (Pattern.matches(regex5, password) == true)
            return Pattern.matches(regex5, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 2 " +
                    "(Password At least Eight Character one Upper case)");
        }
    }

    //Exception Handled for Password Rule 3 : throw custom exceptions in case of Invalid User Details

    private static final String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";

    public boolean validatePasswordRule3(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex6);
        if (Pattern.matches(regex6, password) == true)
            return Pattern.matches(regex6, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 3 " +
                    "(Password At least one Upper case and one numeric)");
        }
    }
  //Exception Handled for Password Rule 4 : throw custom exceptions in case of Invalid User Details

    private static final String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";

    public boolean validatePasswordRule4(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex7);
        if (Pattern.matches(regex7, password) == true)
            return Pattern.matches(regex7, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 4 " +
                    "(Password At least One Upper Case & One Numeric & One Special Character)");
        }
    }


}
