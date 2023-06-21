package com.xworkz.constructor.runner.things;

public class Telegram {
	public String userName;
	public int password;
	public String mode;
	public int numberOfPersonUsing;
	public int numberOfVewing;
	public String statusName;
	public int followers;
	public int following;
	public String celibrityName;
	public int numberOfLikes;
	
	public Telegram(){
		System.out.println("This is No Argument constructor");
	}
	public Telegram(String userName,int password,String mode,int numberOfPersonUsing,int numberOfVewing,String statusName,int numberOfLikes,int followers, int following,String celibrityName) {
	System.out.println("This is Arguments constructor");
	this.userName=userName;
	this.password=password;
	this.mode=mode;
	this.numberOfPersonUsing=numberOfPersonUsing;
	this.numberOfVewing=numberOfVewing;
	this.celibrityName=celibrityName;
	this.statusName=statusName;
	this.numberOfLikes=numberOfLikes;
	this.followers=followers;
	this.following=following;
	}
public void watching() {
	System.out.println("This is watching Method");
}
public void rating() {
	System.out.println("This is drinking Method");
}
public void vewing() {
	System.out.println("This is sleeping Method");
}
public void enjoying() {
	System.out.println("This is enjoying Method");
}
public void understanding() {
	System.out.println("This is understanding Method");
}

}
