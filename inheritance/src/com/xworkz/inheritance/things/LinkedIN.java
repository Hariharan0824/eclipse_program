package com.xworkz.inheritance.things;

public class LinkedIN extends Applications{
	public String user_name;
	public int password;
	public String chats;
	
	public LinkedIN() {
		System.out.println("LINKEDIN-No argument constructors");
	}

	public LinkedIN(String user_name, int password, String chats) {
		
		this.user_name = user_name;
		this.password = password;
		this.chats = chats;
		System.out.println("user_name :"+this.user_name);
		System.out.println("password :"+this.password);
		System.out.println("chats :"+this.chats);
		System.out.println("All arguments constructors");
	}
	public void profile() {
		System.out.println("This is profile method");
		
	}
	

}
