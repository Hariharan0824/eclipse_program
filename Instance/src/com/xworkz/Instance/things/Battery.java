package com.xworkz.Instance.things;

public class Battery {
	String name;
	String shopName;
	int noOfShops;
	ModelsType model;
	
	public Battery() {
		System.out.println("This is Battery Constructor");
	}

	public Battery(String name, String shopName) {
		super();
		this.name = name;
		this.shopName = shopName;
	}

	public Battery(String name, String shopName, int noOfShops, ModelsType model) {
		super();
		this.name = name;
		this.shopName = shopName;
		this.noOfShops = noOfShops;
		this.model = model;
	}
public void display() {
	System.out.println("name:"+this.name);
	System.out.println("shopName:"+this.shopName);
	System.out.println("noOfShops:"+this.noOfShops);
	System.out.println("model:"+this.model);
}
public void setValues(ModelsType model) {
	this.model=model;
}
}
