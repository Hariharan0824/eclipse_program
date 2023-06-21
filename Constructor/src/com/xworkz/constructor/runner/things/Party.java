package com.xworkz.constructor.runner.things;

public class Party {
	public String name;
	public String timing;
	public String date;
	public String lunchType;
	public String celibrityName;
	public String address;
	public int numberOfPerson;
	public int vewing;
	public int price;
	public int kilometer;
	
	public Party(){
		System.out.println("This is No Argument constructor");
	}
	public Party(String name,String timing,String date,String lunchType,String celibrityName,String address,int numberOfPerson,int viewing, int price,int kilometer) {
	System.out.println("This is Arguments constructor");
	this.name=name;
	this.timing=timing;
	this.date=date;
	this.lunchType=lunchType;
	this.celibrityName=celibrityName;
	this.vewing=vewing;
	this.address=address;
	this.numberOfPerson=numberOfPerson;
	this.price=price;
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
