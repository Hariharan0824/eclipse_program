package com.xworkz.inheritance.things;

public class Snapchat extends Applications{

	public String user_name;
	public int password;
	public String chats;
	
	public Snapchat() {
		System.out.println("SNAPCHAT-No argument constructors");
	}

	public Snapchat(String user_name, int password, String chats) {
		
		this.user_name = user_name;
		this.password = password;
		this.chats = chats;
		System.out.println("user_name :"+this.user_name);
		System.out.println("password :"+this.password);
		System.out.println("chats :"+this.chats);
		System.out.println("This is all arguments constructor");
	}
	public void profile() {
		System.out.println("this is Profile method");
	}
	
}
