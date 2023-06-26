package com.xworkz.constructor.things;

public class HomeTown {
	public String homeTownName;
	public int price;
	public int kilometer;
	public String festivelName;
	public String lunchType;
	
	public HomeTown() {
		
		System.out.println("This is Default Constructor");
	}
	public HomeTown(String homeTownName,int price,int kilometer,String festivelName,String lunchType) {
	
	System.out.println("This is Argument Constructor");
	
	this.homeTownName=homeTownName;
	this.price=price;
	this.kilometer=kilometer;
	this.festivelName=festivelName;
	this.lunchType=lunchType;
	}
public void displayHomeTown() {
	
	System.out.println("homeTownName:"+this.homeTownName+"price:"+this.price+"kilometer:"+this.kilometer+"festivelName:"+this.festivelName+"lunchType:"+this.lunchType);
}
}
