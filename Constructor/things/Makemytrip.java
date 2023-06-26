package com.xworkz.constructor.things;

public class Makemytrip {
	private String applicationName;
	private String timing;
	private String date;
	private String lunchType;
	private String address;
	private String famousPlace;
	private int numberOfPerson;
	private int numberOfPlace;
	private int packages;
	private int kilometer;
	
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
public void setApplicationName(String applicationName) {
	this.applicationName=applicationName;
}
public String getApplicationName() {
	return applicationName;
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
public void setAddress(String address) {
	this.address=address;
}
public String getAddress() {
	return address;
}
public void setFamousPlace(String famousPlace) {
	this.famousPlace=famousPlace;
}
public String getFamousPlace() {
	return famousPlace;
}
public void setNumberOfPerson(int numberOfPerson) {
	this.numberOfPerson=numberOfPerson;
}
public int getNumberOfPerson() {
	return numberOfPerson;
}
public void setNumberOfPlace(int numberOfPlace) {
	this.numberOfPlace=numberOfPlace;
}
public int getNumberOfPlace() {
	return numberOfPlace;
}
public void setPackages(int packages) {
	this.packages=packages;
}
public int getPackages() {
	return packages;
}
public void setKilometer(int kilometer) {
	this.kilometer=kilometer;
}
public int getKilometer() {
	return kilometer;
}

}
