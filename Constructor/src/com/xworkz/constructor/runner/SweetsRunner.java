package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Sweets;

public class SweetsRunner {
	public static void main(String args[]) {
		
		Sweets sweet=new Sweets(); 
		Sweets sweet1=new Sweets("Jio",50,5000,"Hari","Airtel");
				
				if(sweet1!=null) {
					sweet1.displaySweets();
					System.out.println("This is not equal to null");
				}
			}
}
