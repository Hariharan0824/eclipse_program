package com.xworkz.inheritance.things;

public class TeaTime {
	public String type="Cold";
	public int noOFTea=7;
	
	public TeaTime() {
		System.out.println("This is Non Static method");
	}

	public TeaTime(String type, int noOFCoffee) {
		
		this.type = type;
		this.noOFTea = noOFTea;
	}
	static void dispaly(String type,int noOFTea) {
		System.out.println("This is display method");
	}

}
