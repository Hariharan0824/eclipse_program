package com.xworkx.exception.runner;

import com.xworkx.exception.things.NameException;


public class ExceptionsRunner {
	public static void main(String[] args) {
		try {
			int[] numbers= {7,3,5,8,6};
			System.out.println("This is Array out of Bounds Exception");
			
			try {
				throw new NameException();
				}catch(NameException name) {
					System.out.println("** Name Custom Exception Occured");
				}
			System.out.println(numbers[6]);
		}catch(ArrayIndexOutOfBoundsException array) {
			System.out.println(array.getCause());
			System.out.println(array.getMessage());
			array.printStackTrace();
		}finally {
			System.out.println("Finally block in try-catch block");
		}
	}

}
