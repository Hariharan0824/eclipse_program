package com.xworkz.Instance.things;

public class Dipawali extends Pongal{
	protected String festivalName;
	protected int noOfFestival;
	protected int timings;
	protected String lunchName;
	
	public Dipawali() {
		System.out.println("This is No Arguments constructor");
	}

	public Dipawali(String festivalName, int noOfFestival, int timings, String lunchName) {
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

}
