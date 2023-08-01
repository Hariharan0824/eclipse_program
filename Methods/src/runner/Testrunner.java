package runner;

import things.Test;

public class Testrunner {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.accept("test@gamil.com","test");
		System.out.println("Welcome to Login page");
	}
	

}
