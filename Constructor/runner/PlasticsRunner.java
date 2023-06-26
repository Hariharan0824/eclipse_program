package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Plastics;

public class PlasticsRunner {
public static void main(String args[]) {
		
	Plastics avoidPlastic=new Plastics(); 
	Plastics avoidPlastic1=new Plastics("Jio",50,5000,"Hari","Airtel");
			
			if(avoidPlastic1!=null) {
				avoidPlastic1.displayPlastics();
				System.out.println("This is not equal to null");
			}
		}
}
