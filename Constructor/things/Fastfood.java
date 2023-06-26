package com.xworkz.constructor.things;

public class Fastfood {
	
	public String name;
	public String owner;
	public int noOfItems;
	public String specialItem;
	public int price;
	
	
	public Fastfood() {
		
		System.out.println("This is Default constructor");
	}
	public Fastfood(String name,String owner,int noOfItems,String specialItem,int price) {
		
		System.out.println("This is Arguments Constructor");
		this.name=name;
		this.owner=owner;
		this.noOfItems=noOfItems;
		this.specialItem=specialItem;
		this.price=price;
		
		
	}
	public void displayFastfood() {
		
		System.out.println("Name:"+this.name+"Owner:"+this.owner+"No of Itemds:"+this.noOfItems+"Special Item:"+this.specialItem+"Price:"+this.price);
	}

}
