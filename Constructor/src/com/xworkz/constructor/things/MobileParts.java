package com.xworkz.constructor.things;

public class MobileParts {
	public String mobilePartsName;
	 public String typeOfParts;
	 public int price[];
	 public String shopLocation[];
	 public String colour[];
	 public int noOfCustomer;
	 
	 public MobileParts() {
		 System.out.println("This is No-Argument Constructor");
	}
	 public MobileParts(String mobilePartsName) {
		 System.out.println("This is 1 Argument Passing");
		 this.mobilePartsName=mobilePartsName;
		 }
public MobileParts(String mobilePartsName,String colour[]) {
		 System.out.println("This is 1 Argument Passing & 1 Array");
		 this.mobilePartsName=mobilePartsName;
		 this.colour=colour;
			for(int i=0;i<colour.length;i++) {
				System.out.println(colour[i]);
			}
	 }
	 public MobileParts(String mobilePartsName,String typeOfParts) {
		 System.out.println("This is  2 Argument Passing");
		 this.mobilePartsName=mobilePartsName;
		 this.typeOfParts=typeOfParts;
		}
public MobileParts(String mobilePartsName,String typeOfParts,int noOfCustomer) {
	 System.out.println("This is  3 Argument Passing");
	 this.mobilePartsName=mobilePartsName;
	 this.typeOfParts=typeOfParts;
	 this.noOfCustomer=noOfCustomer;
	}
public MobileParts(String mobilePartsName,String typeOfParts,int noOfCustomer,String colour[]) {
	 System.out.println("This is  3 Argument Passing & 1 Array");
	 this.mobilePartsName=mobilePartsName;
	 this.typeOfParts=typeOfParts;
	 this.noOfCustomer=noOfCustomer;
	 this.colour=colour;
		for(int i=0;i<colour.length;i++) {
			System.out.println(colour[i]);
	}
}
public MobileParts(String colour[]) {
	System.out.println("Passing 1 array");
	this.colour=colour;
	for(int i=0;i<colour.length;i++) {
		System.out.println(colour[i]);
	}
}
public MobileParts(String colour[],String shopLocation[]) {
	System.out.println("Passing 2 array");
	this.colour=colour;
	this.shopLocation=shopLocation;
	for(int i=0;i<colour.length;i++) {
		System.out.println(colour[i]);
	}	
	for(int i=0;i<shopLocation.length;i++) {
		System.out.println(shopLocation[i]);
	}
}
public MobileParts(String colour[],String shopLocation[],int price[]) {
	System.out.println("Passing 3 array");
  this.colour=colour;
	this.shopLocation=shopLocation;
	this.price=price;
	for(int i=0;i<colour.length;i++) {
		System.out.println(colour[i]);
	}
	for(int i=0;i<shopLocation.length;i++) {
		System.out.println(shopLocation[i]);
	}
	for(int i=0;i<price.length;i++) {
		System.out.println(price[i]);
	}
}
public MobileParts(String mobilePartsName,String typeOfParts,int price[],String shopLocation[],String colour[],int noOfCustomer) {
		 System.out.println("This is Argument consgtructor");
		 this.mobilePartsName=mobilePartsName;
		 this.typeOfParts=typeOfParts;
		 this.price=price;
		 this.shopLocation=shopLocation;
		 this.colour=colour;
		 this.noOfCustomer=noOfCustomer;
		 }
	 public void displayMobileParts() {
		 System.out.println("mobilePartsName:"+this.mobilePartsName+"typeOfParts:"+this.typeOfParts+"price:"+this.price+"shopLocation:"+this.shopLocation+"colour:"+this.colour+"noOfCustomer:"+this.noOfCustomer);
	 }
}
