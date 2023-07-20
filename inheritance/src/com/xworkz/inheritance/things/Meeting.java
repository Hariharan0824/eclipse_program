package com.xworkz.inheritance.things;

public class Meeting extends Google{
	public String hostName;
	public String time;
	public Meeting() {
		System.out.println("This is Meeting");
	}
	public Meeting(String hostName, String time) {
		
		this.hostName = hostName;
		this.time = time;
	}
	public void meet() {
		System.out.println("thsi is meet method");

	
	}
}
