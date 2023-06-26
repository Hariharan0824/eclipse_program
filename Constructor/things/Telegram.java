package com.xworkz.constructor.things;

public class Telegram {
	private String userName;
	private int password;
	private String mode;
	private int numberOfPersonUsing;
	private int numberOfVewing;
	private String statusName;
	private int followers;
	private int following;
	private String celibrityName;
	private int numberOfLikes;
	
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
public void setUserName(String userName) {
	this.userName=userName;
}
public String getUserName() {
	return userName;
}
public void setPassword(int password) {
	this.password=password;
}
public int getPassword() {
	return password;
}
public void setMode(String mode) {
	this.mode=mode;
}
public String getMode() {
	return mode;
}
public void setNumberOfPersonUsing(int numberOfPersonUsing) {
	this.numberOfPersonUsing=numberOfPersonUsing;
}
public int getNumberOfPersonUsing() {
	return numberOfPersonUsing;
}
public void setNumberOfVewing(int numberOfVewing) {
	this.numberOfVewing=numberOfVewing;
}
public int getNumberOfVewing() {
	return numberOfVewing;
}
public void setStatusName(String statusName) {
	this.statusName=statusName;
}
public String getStatusName() {
	return statusName;
}
public void setFollowers(int followers) {
	this.followers=followers;
}
public int getFollowers() {
	return followers;
}
public void setFollowing(int following) {
	this.following=following;
}
public int getFollowing() {
	return following;
}
public void setNumberOfLikes(int numberOfLikes) {
	this.numberOfLikes=numberOfLikes;
}
public int getNumberOfLikes() {
	return numberOfLikes;
}
public void setCelibrityName(String celibrityName) {
	this.celibrityName=celibrityName;
}
public String getCelibrityName() {
	return celibrityName;
}
}
