package com.xworkz.Instance.things;

public class Rainy extends Weather{
	protected String climateType;
	protected int noOfDays;
	protected int temp;
	protected String bodyCondition;
	
	public Rainy() {
		System.out.println("This is No argument constructor");
	}

	public Rainy(String climateType, int noOfDays, int temp, String bodyCondition) {
		super();
		this.climateType = climateType;
		this.noOfDays = noOfDays;
		this.temp = temp;
		this.bodyCondition = bodyCondition;
		System.out.println("climateType:"+this.climateType);
		System.out.println("noOfDays:"+this.noOfDays);
		System.out.println("temp:"+this.temp);
		System.out.println("bodyCondition:"+this.bodyCondition);
	}
	public void display() {
		System.out.println("This is Rainy method");
	}

}
