package com.xworkz.Instance.things;

public class Motors {

	String name;
	String shopName;
	int noOfMotors;
	Models models;
	
	public Motors() {
		System.out.println("This is Motors Constructor");
	}

	public Motors(String typesOfName, String shopName) {
		super();
		this.name = name;
		this.shopName = shopName;
	}

	public Motors(String name, String shopName, int noOfMotors, Models models) {
		super();
		this.name = name;
		this.shopName = shopName;
		this.noOfMotors = noOfMotors;
		this.models = models;
	}
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("shopName:"+this.shopName);
		System.out.println("noOfMotors:"+this.noOfMotors);
		System.out.println("models:"+this.models);
	}
	public void setvalue(Models models) {
		this.models=models;
	}
	
}
