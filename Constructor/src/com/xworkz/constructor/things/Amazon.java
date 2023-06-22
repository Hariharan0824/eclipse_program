package com.xworkz.constructor.things;

public class Amazon {
	private String userName;
	private int userPassword;
	private String products;
	private float offers;
	private int numberOfProducts;
	private boolean mode;
	private int quantity;
	private String brands;
	private int highBrand;
	private int lowPrice;
	
	public Amazon(){
		System.out.println("This is No Argument constructor");
	}
	public Amazon(String userName,int userPassword,String products,float offers,int numberOfProducts,boolean mode,int quantity,String brands,int highBrand,int lowPrice) {
	System.out.println("This is Arguments constructor");
	//this.userName=userName;
	this.userPassword=userPassword;
	this.products=products;
	this.offers=offers;
	this.numberOfProducts=numberOfProducts;
	this.mode=mode;
	this.quantity=quantity;
	this.brands=brands;
	this.highBrand=highBrand;
	this.lowPrice=lowPrice;
	}
public void setUserName(String userName) {
	
	this.userName=userName;
	}
public String getUserName() {
	return userName;
}
public void setUserPassword(int userPassword) {
	this.userPassword=userPassword;
	}
public int getUserPassword() {
	return userPassword;
}
public void setProducts(String products) {
	this.products=products;
	}
public String getProducts() {
	return products;
}
public void setOffers(float offers) {
	this.offers=offers;
	}
public float getOffers() {
	return offers;
}
public void setNumberOfProducts(int numberOfProducts) {
	this.numberOfProducts=numberOfProducts;
	}
public int getNumberOfProducts() {
	return numberOfProducts;
}
public void setMode(boolean mode) {
	this.mode=mode;
	}
public boolean getMode() {
	return mode;
}
public void setQuantity(int quantity) {
	this.quantity=quantity;
	}
public int getQuantity() {
	return quantity;
}
public void setBrands(String brands) {
	this.brands=brands;
	}
public String getBrands() {
	return brands;
}
public void setHighBrand(int highBrand) {
	this.highBrand=highBrand;
	}
public int getHighBrand() {
	return highBrand;
}
public void setLowPrice(int lowPrice) {
	this.lowPrice=lowPrice;
	}
public int getLowPrice() {
	return lowPrice;
}
}
