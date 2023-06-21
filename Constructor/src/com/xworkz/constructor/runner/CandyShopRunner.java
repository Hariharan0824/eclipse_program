package com.xworkz.constructor.runner;

import com.xworkz.constructor.runner.things.CandyShop;

public class CandyShopRunner {
	public static void main(String args[]) {
		
		
		CandyShop sweet = new CandyShop();
		CandyShop sweets = new CandyShop("Krishna","Sweet",5000,"Steels","blue");
		
		sweets.dispalyCandyShop();
		if(sweets !=null) {
			
			System.out.println("This is not equal to Null");
			sweets.dispalyCandyShop();
		}
		
	}

}
