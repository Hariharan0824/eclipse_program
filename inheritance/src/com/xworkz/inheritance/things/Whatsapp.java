package com.xworkz.inheritance.things;

public class Whatsapp extends Applications{
	public String user_name;
	public int password;
	public String chats;

	public Whatsapp() {
		System.out.println("WHATSAPP-No arguments constructor");
	}

	public Whatsapp(String user_name, int password, String chats) {
		
		this.user_name = user_name;
		this.password = password;
		this.chats = chats;
		System.out.println("user_name:"+this.user_name);
		System.out.println("password:"+this.password);
		System.out.println("chats:"+this.chats);
		System.out.println("All arguments constructor");
	}
	public void profile() {
		System.out.println("profile method");
	}
	

	
	

}
