package com.xworkz.inheritance.things;

public class Telegram extends Applications{
	public String user_name;
	public int password;
	public String chats;
	
	public Telegram() {
		System.out.println("TELEGRAM-No arguments contructors");
	}

	public Telegram(String user_name, int password, String chats) {
		
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
