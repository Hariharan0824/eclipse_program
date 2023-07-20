package com.xworkz.inheritance.things;

public class KFC {
	
	public String address="BTM";
	public String location="Near BTM";
	public int noOfBranch=500;
	public String shopColor="Red";
	public int noOfWorkers=300;
	public String ownerName="Hariharan";
	public String branchesNameInCBE[]= {"PNP","CBE","NSN"};
	public int perKgCost=300;
	public int noOfCustomer=800;
	public int brandType=1;
	
	
	public KFC() {
		System.out.println("This is No Argument Constructor");
	}
	
	public KFC(String address, String location, int noOfBranch, String shopColor, int noOfWorkers, String ownerName,
			String[] branchesNameInCBE, int perKgCost, int noOfCustomer, int brandType) {
		//super();
		this.address = address;
		this.location = location;
		this.noOfBranch = noOfBranch;
		this.shopColor = shopColor;
		this.noOfWorkers = noOfWorkers;
		this.ownerName = ownerName;
		this.branchesNameInCBE = branchesNameInCBE;
		this.perKgCost = perKgCost;
		this.noOfCustomer = noOfCustomer;
		this.brandType = brandType;
	}

	public void cooking() {
		System.out.println("This is KFC Cooking method");
	}
	public void order() {
		System.out.println("This is KFC Order method");
	}
	public void selling() {
		System.out.println("This is KFC selling method");
	}
	public void Checking() {
		System.out.println("This is KFC Checking method");
	}
	public void barrowing() {
		System.out.println("This is KFC Barrowing Method");
	}
	public void eat() {
		System.out.println("This is KFC EAT method");
	}
	public void control() {
		System.out.println("This is KFC control");
	}
	public void customerHandling() {
		System.out.println("This is KFC CustomerHandling");
	}
	public void set() {
		System.out.println("This is KFC Seting Method");
	}
	public void checkout() {
		System.out.println("This is KFC checkout method");
	}
	
	}
