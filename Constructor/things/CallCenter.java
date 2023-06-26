package com.xworkz.constructor.things;

public class CallCenter {
	
	public String name;
	public int typeOfCenter;
	public int numberOfEmployees;
	public String location;
	public String typeOfWork;
	
	public CallCenter() {
		
		System.out.println("This is Default Constructor");
	}
	
	public CallCenter(String name,int typeOfCenter,int numberOfEmployees,String location,String typeOfWork) {
		
		System.out.println("This is Argument Constructor");
		
	this.name=name;
	this.typeOfCenter=typeOfCenter;
	this.numberOfEmployees=numberOfEmployees;
	this.location=location;
	this.typeOfWork=typeOfWork;
	
}
	public void displayCallCenter() {
		
		System.out.println("Name:"+this.name+"TypeOf Center:"+this.typeOfCenter+"Number of employees:"+this.numberOfEmployees+"Location:"+this.location+"Type Of Work:"+this.typeOfWork);
	}
	

}
