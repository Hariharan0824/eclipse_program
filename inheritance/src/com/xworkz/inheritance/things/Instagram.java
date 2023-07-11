package com.xworkz.inheritance.things;

public class Instagram extends Applications{
	public String userName;
	public int password;
	public String chats;

	public Instagram() {
		System.out.println("INSTAGRAM -No argument constructor");
	}
	public Instagram(String userName,int password,String chats) {
		this.userName=userName;
		this.password=password;
		this.chats=chats;
		System.out.println("All argument constructor");
		System.out.println("userName :"+this.userName);
		System.out.println("password :"+this.password);
		System.out.println("chats :"+this.chats);
		
		}
	public void profile() {
		System.out.println("Profile method");
}
}
