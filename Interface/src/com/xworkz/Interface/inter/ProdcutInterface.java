package com.xworkz.Interface.inter;

public interface ProdcutInterface {
	
	final int products=30;
	final static String productsName="Java";
	
	String getProductDetails();
	
	default int setProducts() {
		return 30;
	}
	
	public static void selling() {
		System.out.println("Static method in Products interface");
	}

}
