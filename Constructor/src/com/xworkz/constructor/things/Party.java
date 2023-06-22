package com.xworkz.constructor.things;

public class Party {
	private String name;
	private String timing;
	private String date;
	private String lunchType;
	private String celibrityName;
	private String address;
	private int numberOfPerson;
	private int vewing;
	private int price;
	private int kilometer;
	
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
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setTiming(String timing) {
	this.timing=timing;
}
public String getTiming() {
	return timing;
}
public void setDate(String date) {
	this.date=date;
}
public String getDate() {
	return date;
}
public void setLunchType(String lunchType) {
	this.lunchType=lunchType;
}
public String getLunchType() {
	return lunchType;
}
public void setCelibrityName(String celibrityName) {
	this.celibrityName=celibrityName;
}
public String getCelibrityName() {
	return celibrityName;
}
public void setAddress(String address) {
	this.address=address;
}
public String getAddress() {
	return address;
}
public void setNumberOfPerson(int numberOfPerson) {
	this.numberOfPerson=numberOfPerson;
}
public int getNumberOfPerson() {
	return numberOfPerson;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public void setKilometer(int kilometer) {
	this.kilometer=kilometer;
}
public int getKilometer() {
	return kilometer;
}
public void setVewing(int vewing) {
	this.vewing=vewing;
}
public int getVewing() {
	return vewing;
}
}
