package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Amazon;

public class AmazonRunner {
public static void main(String args[]) {
	
	Amazon amazon=new Amazon();
	amazon.setUserName("Hari");
	amazon.setProducts("Hari");
	amazon.setOffers(2.5f);
	amazon.setMode(false);
	amazon.setNumberOfProducts(500);
	amazon.setQuantity(500);
	amazon.setBrands("Hari");
	amazon.setHighBrand(50);
	amazon.setLowPrice(5);
	amazon.setUserPassword(123456);
	System.out.println(amazon.getUserName());
	System.out.println(amazon.getProducts());
	System.out.println(amazon.getOffers());
	System.out.println(amazon.getMode());
	System.out.println(amazon.getNumberOfProducts());
	System.out.println(amazon.getQuantity());
	System.out.println(amazon.getBrands());
	System.out.println(amazon.getHighBrand());
	System.out.println(amazon.getLowPrice());
	System.out.println(amazon.getUserPassword());
}
}
