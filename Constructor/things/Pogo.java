package com.xworkz.constructor.things;

public class Pogo {
	private String name;
	private int numberOfPersons;
	private String mode;
	private float offers;
	private int numberOfVewing;
	private boolean mode1;
	private int numberOfrevewing1;
	private String channelNames;
	private String animationName;
	private String dubbingvoiceName;
	
	public Pogo(){
		System.out.println("This is No Argument constructor");
	}
	public Pogo(String name,int numberOfPersons,String mode,float offers,int numberOfVewing,boolean mode1,int numberOfrevewing1,String channelNames,String animationName,String dubbingvoiceName) {
	System.out.println("This is Arguments constructor");
	this.name=name;
	this.numberOfPersons=numberOfPersons;
	this.mode=mode;
	this.offers=offers;
	this.numberOfVewing=numberOfVewing;
	this.mode1=mode1;
	this.numberOfrevewing1=numberOfrevewing1;
	this.channelNames=channelNames;
	this.animationName=animationName;
	this.dubbingvoiceName=dubbingvoiceName;
	}
public void setName(String name) {
	this.name=name;
	}
public String getName() {
	return name;
}
public void setNumberOfPersons(int numberOfPersons) {
	this.numberOfPersons=numberOfPersons;
	}
public int getNumberOfPersons() {
	return numberOfPersons;
}
public void setMode(String mode) {
	this.mode=mode;
	}
public String getMode() {
	return mode;
}
public void setOffers(float offers) {
	this.offers=offers;
	}
public float getOffers() {
	return offers;
}
public void setNumberOfVewing(int numberOfVewing) {
	this.numberOfVewing=numberOfVewing;
	}
public int getNumberOfVewing() {
	return numberOfVewing;
}
public void setMode1(boolean mode1) {
	this.mode1=mode1;
	}
public boolean getMode1() {
	return mode1;
}
public void setNumberOfrevewing1(int numberOfrevewing1) {
	this.numberOfrevewing1=numberOfrevewing1;
	}
public int getNumberOfrevewing1() {
	return numberOfrevewing1;
}
public void setChannelNames(String channelNames) {
	this.channelNames=channelNames;
	}
public String getChannelNames() {
	return channelNames;
}
public void setAnimationName(String animationName) {
	this.animationName=animationName;
	}
public String getAnimationName() {
	return animationName;
}
public void setDubbingvoiceName(String dubbingvoiceName) {
	this.dubbingvoiceName=dubbingvoiceName;
	}
public String getDubbingvoiceName() {
	return dubbingvoiceName;
}
}