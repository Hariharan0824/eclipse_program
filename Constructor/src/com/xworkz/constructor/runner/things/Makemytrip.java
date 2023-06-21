package com.xworkz.constructor.runner.things;

public class Makemytrip {
	public String applicationName;
	public String timing;
	public String date;
	public String lunchType;
	public String address;
	public String famousPlace;
	public int numberOfPerson;
	public int numberOfPlace;
	public int packages;
	public int kilometer;
	
	public Makemytrip(){
		System.out.println("This is No Argument constructor");
	}
	public Makemytrip(String applicationName,String timing,String date,String lunchType,String famousPlace,String address,int numberOfPerson,int numberOfPlace, int packages,int kilometer) {
	System.out.println("This is Arguments constructor");
	this.applicationName=applicationName;
	this.timing=timing;
	this.date=date;
	this.lunchType=lunchType;
	this.famousPlace=famousPlace;
	this.numberOfPerson=numberOfPerson;
	this.numberOfPlace=numberOfPlace;
	this.packages=packages;
	this.address=address;
	this.kilometer=kilometer;
	}
public void watching() {
	System.out.println("This is watching Method");
}
public void rating() {
	System.out.println("This is drinking Method");
}
public void vewing() {
	System.out.println("This is sleeping Method");
}
public void enjoying() {
	System.out.println("This is enjoying Method");
}
public void understanding() {
	System.out.println("This is understanding Method");
}
}
