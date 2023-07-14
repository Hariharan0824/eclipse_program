package com.xworkz.Instance.things;

public class Winter extends Weather{
	protected String climateType;
	protected int noOfDays;
	protected int temp;
	protected String bodyCondition;
	
	public Winter() {
		System.out.println("This is No argument constructor");
	}

	public Winter(String climateType, int noOfDays, int temp, String bodyCondition) {
		super(45f,12f,"high",123,"cold","near","mrng","even","good","wea","narrow","abc","rty",45f,false,false,"normal","oiuyt","jhjk",567);
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
		System.out.println("This is Winter method");
	}

}
