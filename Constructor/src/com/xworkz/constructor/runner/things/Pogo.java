package com.xworkz.constructor.runner.things;

public class Pogo {
	public String name;
	public int numberOfPersons;
	public String mode;
	public float offers;
	public int numberOfVewing;
	public boolean mode1;
	public int numberOfrevewing;
	public String channelNames;
	public String animationName;
	public String dubbingvoiceName;
	
	public Pogo(){
		System.out.println("This is No Argument constructor");
	}
	public Pogo(String name,int numberOfPersons,String mode,float offers,int numberOfVewing,boolean mode1,int numberOfrevewing,String channelNames,String animationName,String dubbingvoiceName) {
	System.out.println("This is Arguments constructor");
	this.name=name;
	this.numberOfPersons=numberOfPersons;
	this.mode=mode;
	this.offers=offers;
	this.numberOfVewing=numberOfVewing;
	this.mode1=mode1;
	this.numberOfrevewing=numberOfrevewing;
	this.channelNames=channelNames;
	this.animationName=animationName;
	this.dubbingvoiceName=dubbingvoiceName;
	}
public void watching() {
	System.out.println("This is watching Method");
}
public void drinking() {
	System.out.println("This is drinking Method");
}
public void sleeping() {
	System.out.println("This is sleeping Method");
}
public void enjoying() {
	System.out.println("This is enjoying Method");
}
public void understanding() {
	System.out.println("This is understanding Method");
}
}
