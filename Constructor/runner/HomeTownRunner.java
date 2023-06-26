package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.HomeTown;

public class HomeTownRunner {
	public static void main(String args[]) {
		
		HomeTown weekend=new HomeTown(); 
		HomeTown weekend1=new HomeTown("Jio",50,5000,"Hari","Airtel");
			
			if(weekend1!=null) {
				weekend1.displayHomeTown();
				System.out.println("This is not equal to null");
			}
		}
}
