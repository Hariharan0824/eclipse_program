package com.xworkx.exception.runner;

import com.xworkx.exception.things.ExceptionTask;
import com.xworkx.exception.things.UserNameException;

public class ExceptionRunner {

	public static void main(String[] args) throws UserNameException{
	 ExceptionTask exception = new ExceptionTask("Hariharan","hariharan@gmail.com");
	System.out.println(exception.toString());
	
	if(exception.getUserName().equals("Hariharan")) {
		System.out.println("userName="+exception.getUserName());
		throw new UserNameException("This is Username Exception");
	}
	if(exception.getEmailId().equals("hariharan@gamil.com")) {
		System.out.println("userName="+exception.getEmailId());
		throw new UserNameException("This is Username Exception");
	}
	}
}
