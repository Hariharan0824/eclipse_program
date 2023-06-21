package com.xworkz.constructor.runner.things;

public class Amazon {
	public String userName;
	public int userPassword;
	public String Products;
	public float offers;
	public int numberOfProducts;
	public boolean mode;
	public int quantity;
	public String brands;
	public int highBrand;
	public int lowPrice;
	
	public Amazon(){
		System.out.println("This is No Argument constructor");
	}
	public Amazon(String userName,int userPassword,String Products,float offers,int numberOfProducts,boolean mode,int quantity,String brands,int highBrand,int lowPrice) {
	System.out.println("This is Arguments constructor");
	this.userName=userName;
	this.userPassword=userPassword;
	this.Products=Products;
	this.offers=offers;
	this.numberOfProducts=numberOfProducts;
	this.mode=mode;
	this.quantity=quantity;
	this.brands=brands;
	this.highBrand=highBrand;
	this.lowPrice=lowPrice;
	}
public void selling() {
	System.out.println("This is selling Method");
}
public void buying() {
	System.out.println("This is Buying Method");
}
public void ordring() {
	System.out.println("This is ordring Method");
}
public void vewing() {
	System.out.println("This is vewing Method");
}
public void revewing() {
	System.out.println("This is revewing Method");
}
}
