package com.xworkz.constructor.things;

public class CandyShop {

	public String name;
	public String typeOfShop;
	public int rent;
	public String metrial;
	public String shopColour;
	
	public CandyShop() {
		
		System.out.println("This is default constructor");
	}
	
	public  CandyShop(String name,String typeOfShop, int rent,String metrial,String shopColour) {
		
		
		
		System.out.println("This is Argument Constructor");
		
		this.name=name;
		this.typeOfShop=typeOfShop;
		this.rent=rent;
		this.metrial=metrial;
		this.shopColour=shopColour;
		
}
	public void dispalyCandyShop() {
		
		System.out.println("Name:"+this.name+"Type of shop:"+this.typeOfShop+"rent:"+this.rent+"Metrial:"+this.metrial+"Shop Colour:"+this.shopColour);
}
	
}