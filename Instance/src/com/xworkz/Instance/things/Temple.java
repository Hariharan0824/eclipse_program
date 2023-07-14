package com.xworkz.Instance.things;

public class Temple {

	String name;
	String address;
	int noOfTemple;
	Dharisanam dharisanamType;
	
	public Temple() {
		System.out.println("This is Temple No argument Constructor");
	}

	public Temple(String name, String address) {
		//super();
		this.name = name;
		this.address = address;
	}

	public Temple(String name, String address, int noOfTemple, Dharisanam dharisanamType) {
		//super();
		this.name = name;
		this.address = address;
		this.noOfTemple = noOfTemple;
		this.dharisanamType = dharisanamType;
	}
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("address:"+this.address);
		System.out.println("noOfTemple:"+this.noOfTemple);
		System.out.println("dharisanamType:"+this.dharisanamType);
	}
	public void setvalue(Dharisanam dharisanamType) {
		this.dharisanamType=dharisanamType;
	}
	
}
