package com.xworkz.Instance.things;

public class RepublicDay extends NewYear{
	protected String festivalName;
	protected int noOfFestival;
	protected int timings;
	protected String lunchName;
	
	public RepublicDay() {
		System.out.println("This is No Arguments constructor");
	}

	public RepublicDay(String festivalName, int noOfFestival, int timings, String lunchName) {
		super();
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
		System.out.println("This is NewYear RepublicDay");
	}


}
