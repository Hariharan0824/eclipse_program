package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Telegram;

public class TelegramRunner {
public static void main(String args[]) {
	
	Telegram onlinePlatform=new Telegram();
	onlinePlatform.setUserName("Hari");
	onlinePlatform.setPassword(123456);
	onlinePlatform.setMode("Online");
	onlinePlatform.setNumberOfPersonUsing(90);
	onlinePlatform.setNumberOfVewing(900);
	onlinePlatform.setStatusName("Good");
	onlinePlatform.setFollowers(809);
	onlinePlatform.setFollowing(987);
	onlinePlatform.setCelibrityName("Hari");
	onlinePlatform.setNumberOfLikes(890);
	System.out.println(onlinePlatform.getUserName());
	System.out.println(onlinePlatform.getPassword());
	System.out.println(onlinePlatform.getMode());
	System.out.println(onlinePlatform.getNumberOfPersonUsing());
	System.out.println(onlinePlatform.getNumberOfVewing());
	System.out.println(onlinePlatform.getStatusName());
	System.out.println(onlinePlatform.getFollowers());
	System.out.println(onlinePlatform.getFollowing());
	System.out.println(onlinePlatform.getCelibrityName());
	System.out.println(onlinePlatform.getNumberOfLikes());
	
}
}
