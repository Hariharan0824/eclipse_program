package com.xworkz.Instance.things;

public class Spring extends Weather{
	protected String climateType;
	protected int noOfDays;
	protected int temp;
	protected String bodyCondition;
	
	public Spring() {
		System.out.println("This is No argument constructor");
	}

	public Spring(String climateType, int noOfDays, int temp, String bodyCondition) {
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
		System.out.println("This is Spring method");
	}

}
