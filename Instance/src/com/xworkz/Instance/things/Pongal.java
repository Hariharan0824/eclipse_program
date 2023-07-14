package com.xworkz.Instance.things;

public class Pongal extends Festival{
	
	protected String festivalName;
	protected int noOfFestival;
	protected int timings;
	protected String lunchName;
	
	public Pongal() {
		System.out.println("This is No Arguments constructor");
	}

	public Pongal(String festivalName, int noOfFestival, int timings, String lunchName) {
		super("Birthday","Super",5,"Veg","Meals","Pongal","Diwali",5,"Pant",50,100,"Drinks",5,10,"Good",10,"Hari","Hariharan","Siva",10);
		this.festivalName = festivalName;
		this.noOfFestival = noOfFestival;
		this.timings = timings;
		this.lunchName = lunchName;
		System.out.println("festivalName:"+this.festivalName);
		System.out.println("noOfFestival:"+this.noOfFestival);
		System.out.println("timings:"+this.timings);
		System.out.println("lunchName:"+this.lunchName);
	}
	public void display() {
		System.out.println("This is Pongal Method");
	}

}
