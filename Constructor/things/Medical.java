package com.xworkz.constructor.things;

public class Medical {
	public String shopName;
	 public String typeOfShop;
	 public int price[];
	 public String location[];
	 public String colour[];
	 public int customer;
	 
	 public Medical() {
		 System.out.println("This is No-Argument Constructor");
	}
	 public Medical(String shopName) {
		 System.out.println("This is 1 Argument Passing");
		 this.shopName=shopName;
		 }
public Medical(String shopName,String colour[]) {
		 System.out.println("This is 1 Argument Passing & 1 Array");
		 this.shopName=shopName;
		 this.colour=colour;
			for(int i=0;i<colour.length;i++) {
				System.out.println(colour[i]);
			}
	 }
	 public Medical(String shopName,String typeOfShop) {
		 System.out.println("This is  2 Argument Passing");
		 this.shopName=shopName;
		 this.typeOfShop=typeOfShop;
		}
public Medical(String shopName,String typeOfShop,int customer) {
	 System.out.println("This is  3 Argument Passing");
	 this.shopName=shopName;
	 this.typeOfShop=typeOfShop;
	 this.customer=customer;
	}
public Medical(String shopName,String typeOfShop,int customer,String colour[]) {
	 System.out.println("This is  3 Argument Passing & 1 Array");
	 this.shopName=shopName;
	 this.typeOfShop=typeOfShop;
	 this.customer=customer;
	 this.colour=colour;
		for(int i=0;i<colour.length;i++) {
			System.out.println(colour[i]);
	}
}
public Medical(String colour[]) {
	System.out.println("Passing 1 array");
	this.colour=colour;
	for(int i=0;i<colour.length;i++) {
		System.out.println(colour[i]);
	}
}
public Medical(String colour[],String location[]) {
	System.out.println("Passing 2 array");
	this.colour=colour;
	this.location=location;
	for(int i=0;i<colour.length;i++) {
		System.out.println(colour[i]);
	}	
	for(int i=0;i<location.length;i++) {
		System.out.println(location[i]);
	}
}
public Medical(String colour[],String location[],int price[]) {
	System.out.println("Passing 3 array");
   this.colour=colour;
	this.location=location;
	this.price=price;
	for(int i=0;i<colour.length;i++) {
		System.out.println(colour[i]);
	}
	for(int i=0;i<location.length;i++) {
		System.out.println(location[i]);
	}
	for(int i=0;i<price.length;i++) {
		System.out.println(price[i]);
	}
}
public Medical(String shopName,String typeOfShop,int price[],String location[],String colour[],int customer) {
		 System.out.println("This is Argument consgtructor");
		 this.shopName=shopName;
		 this.typeOfShop=typeOfShop;
		 this.price=price;
		 this.location=location;
		 this.colour=colour;
		 this.customer=customer;
		 }
	 public void displayTeaShop() {
		 System.out.println("ShopName:"+this.shopName+"typeOfShop:"+this.typeOfShop+"price:"+this.price+"location:"+this.location+"colour:"+this.colour+"customer:"+this.customer);
	 }
}
