package com.xworkz.constructor.things;

public class Sweets {
	public String sweetName;
	public int cost;
	public int noOfSweet;
	public String favSweet;
	public String shopName;
	
	public Sweets() {
		
		System.out.println("This is Default Constructor");
	}
	public Sweets(String sweetName,int cost,int noOfSweet,String favSweet,String shopName) {
	
	System.out.println("This is Argument Constructor");
	
	this.sweetName=sweetName;
	this.cost=cost;
	this.noOfSweet=noOfSweet;
	this.favSweet=favSweet;
	this.shopName=shopName;
	}
public void displaySweets() {
	
	System.out.println("sweetName:"+this.sweetName+"cost:"+this.cost+"noOfSweet:"+this.noOfSweet+"favSweet:"+this.favSweet+"shopName:"+this.shopName);
}
}
