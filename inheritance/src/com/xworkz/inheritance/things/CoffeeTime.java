package com.xworkz.inheritance.things;

public class CoffeeTime {
	public String type;
	public int noOFCoffee;
	
	public CoffeeTime() {
		System.out.println("This is Non Static method");
	}

	public CoffeeTime(String type, int noOFCoffee) {
		
		this.type = type;
		this.noOFCoffee = noOFCoffee;
	}
	public void dispaly(String type,int noOFCoffee) {
		this.type=type;
		
		System.out.println("type:"+this.type);
	}
	

}
