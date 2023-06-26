package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Fastfood;

public class FastfoodRunner {
	
	public static void main(String args[]) {
		
		
		Fastfood snacks=new Fastfood();
		Fastfood snacks1=new Fastfood("FastFood","Hariharan",90,"Kalan",150);
		
		snacks1.displayFastfood();
		if(snacks1 != null) {
			System.out.println("Snacks1 is not equal to Null");
		}
	}

}
