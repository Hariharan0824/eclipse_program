package com.xworkz.Instance.things;

public class Theatre {

	String movieName;
	String address;
	int noOfPeople;
	Classes classes;
	 
	public Theatre() {
		System.out.println("This is Theatre Constructor");
	}

	public Theatre(String movieName, String address) {
		super();
		this.movieName = movieName;
		this.address = address;
	}

	public Theatre(String movieName, String address, int noOfPeople, Classes classes) {
		super();
		this.movieName = movieName;
		this.address = address;
		this.noOfPeople = noOfPeople;
		this.classes = classes;
	}
	public void display() {
		System.out.println("movieName:"+this.movieName);
		System.out.println("address:"+this.address);
		System.out.println("noOfPeople"+this.noOfPeople);
		System.out.println("classes:"+this.classes);
	}
	public void setvalue(Classes classes) {
		this.classes=classes;
		
	}
}
