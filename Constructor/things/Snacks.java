package com.xworkz.constructor.things;

public class Snacks {
	public String shopName;
	 public String typeOfSnacks;
	 public int price[];
	 public String address[];
	 public String location[];
	 public int noOfItems;
	 
	 public Snacks() {
		 System.out.println("This is No-Argument Constructor");
	}
	 public Snacks(String shopName) {
		 System.out.println("This is 1 Argument Passing");
		 this.shopName=shopName;
		 }
public Snacks(String shopName,String address[]) {
		 System.out.println("This is 1 Argument Passing & 1 Array");
		 this.shopName=shopName;
		 this.address=address;
			for(int i=0;i<address.length;i++) {
				System.out.println(address);
			}
	 }
	 public Snacks(String shopName,String typeOfSnacks) {
		 System.out.println("This is  2 Argument Passing");
		 this.shopName=shopName;
		 this.typeOfSnacks=typeOfSnacks;
		}
public Snacks(String shopName,String typeOfSnacks,int noOfItems) {
	 System.out.println("This is  3 Argument Passing");
	 this.shopName=shopName;
	 this.typeOfSnacks=typeOfSnacks;
	 this.noOfItems=noOfItems;
	}
public Snacks(String shopName,String typeOfSnacks,int noOfItems,String address[]) {
	 System.out.println("This is  3 Argument Passing & 1 Array");
	 this.shopName=shopName;
	 this.typeOfSnacks=typeOfSnacks;
	 this.noOfItems=noOfItems;
	 this.address=address;
		for(int i=0;i<address.length;i++) {
			System.out.println(address[i]);
	}
}
public Snacks(String address[]) {
	System.out.println("Passing 1 array");
	this.address=address;
	for(int i=0;i<address.length;i++) {
		System.out.println(address[i]);
	}
}
public Snacks(String address[],String location[]) {
	System.out.println("Passing 2 array");
	this.address=address;
	this.location=location;
	for(int i=0;i<address.length;i++) {
		System.out.println(address[i]);
	}	
	for(int i=0;i<location.length;i++) {
		System.out.println(location[i]);
	}
}
public Snacks(String address[],String location[],int price[]) {
	System.out.println("Passing 3 array");
 this.address=address;
	this.location=location;
	this.price=price;
	for(int i=0;i<address.length;i++) {
		System.out.println(address[i]);
	}
	for(int i=0;i<location.length;i++) {
		System.out.println(location[i]);
	}
	for(int i=0;i<price.length;i++) {
		System.out.println(price[i]);
	}
}
public Snacks(String shopName,String typeOfSnacks,int price[],String address[],String location[],int noOfItems) {
		 System.out.println("This is Argument consgtructor");
		 this.shopName=shopName;
		 this.typeOfSnacks=typeOfSnacks;
		 this.price=price;
		 this.address=address;
		 this.location=location;
		 this.noOfItems=noOfItems;
		 }
	 public void displaySnacks() {
		 System.out.println("shopName:"+this.shopName+"typeOfSnacks:"+this.typeOfSnacks+"price:"+this.price+"address:"+this.address+"location:"+this.location+"noOfItems:"+this.noOfItems);
	 }
}
