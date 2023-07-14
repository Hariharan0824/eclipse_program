package com.xworkz.Instance.things;

public class VinayagarBirthday extends RepublicDay{
	protected String festivalName;
	protected int noOfFestival;
	protected int timings;
	protected String lunchName;
	
	public VinayagarBirthday() {
		System.out.println("This is No Arguments constructor");
	}

	public VinayagarBirthday(String festivalName, int noOfFestival, int timings, String lunchName) {
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
		System.out.println("This is NewYear VinayagarBirthday");
	}

}
