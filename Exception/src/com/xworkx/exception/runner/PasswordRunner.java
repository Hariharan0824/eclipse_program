package com.xworkx.exception.runner;

import com.xworkx.exception.things.Password;
import com.xworkx.exception.things.PasswordException;

public class PasswordRunner {
	public static void main(String[] args) throws PasswordException {

		Password password = new Password("H@");
		System.out.println(password.toString());
		//	 if(password.getPassword().length()<8) {
		//		 System.out.println("password="+password.getPassword());
		//		 throw new PasswordException("Password should be More then 8 characters");
		//	 }
		//	 else
		//		 if(password.getPassword().contains("0") || 
		//			 password.getPassword().contains("1")||
		//			 password.getPassword().contains("2")||
		//			 password.getPassword().contains("3")||
		//			 password.getPassword().contains("4")||
		//			 password.getPassword().contains("5")||
		//			 password.getPassword().contains("6")||
		//			 password.getPassword().contains("7")||
		//			 password.getPassword().contains("8")||
		//			 password.getPassword().contains("9") ) {
		//		 System.out.println("password="+password.getPassword());
		//		 throw new PasswordException("Password should be in one number");
		//	 \}

		//	 String firstLet=password.getPassword().substring(0, 1);
		//	 String firstUpper=firstLet.toUpperCase();
		//	 
		//	 if(firstLet.equals(firstUpper)) {
		//		 throw new PasswordException("Password contains upper case as a first let");
		//	 }else {
		//		 System.out.println("it is not equals");
		//	 }	 throw new PasswordException("Password starts with Capital Letter");
		//	 

		if(password.getPassword().contains("H") || 
				password.getPassword().contains("a")||
				password.getPassword().contains("r")||
				password.getPassword().contains("i")||
				password.getPassword().contains("1")||
				password.getPassword().contains("A"))
			//				 password.getPassword().contains("@"))
			//				 password.getPassword().contains("-")||
			//				 password.getPassword().contains("]")||
			//				 password.getPassword().contains("[") ) 
		{
			System.out.println("password="+password.getPassword());
			throw new PasswordException("Password should not be in one Special Character");

		}
	}
}
