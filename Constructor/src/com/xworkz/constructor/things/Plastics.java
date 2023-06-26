package com.xworkz.constructor.things;

public class Plastics {
	public String plasticsName;
	public int noOfPlastic;
	public int plasticUser;
	public String brand;
	public String companyName;
	
	public Plastics() {
		
		System.out.println("This is Default Constructor");
	}
	public Plastics(String plasticsName,int noOfPlastic,int plasticUser,String brand,String companyName) {
	
	System.out.println("This is Argument Constructor");
	
	this.plasticsName=plasticsName;
	this.noOfPlastic=noOfPlastic;
	this.plasticUser=plasticUser;
	this.brand=brand;
	this.companyName=companyName;
	}
public void displayPlastics() {
	
	System.out.println("plasticsName:"+this.plasticsName+"noOfPlastic:"+this.noOfPlastic+"plasticUser:"+this.plasticUser+"brand:"+this.brand+"companyName:"+this.companyName);
}

}
