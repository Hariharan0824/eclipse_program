package com.xworkz.inheritance.things;

public class Youtub extends Google{
	public String youtubeOwnerName;
	public int noOfUsers;
	public int noOfViewrs;
	public int noOfChannels;
	public String popularChannelsNames;
	
	public Youtub() {
		System.out.println("This is Youtube No Argument Cointructor");
	}

	public Youtub(String youtubeOwnerName, int noOfUsers, int noOfViewrs, int noOfChannels,
			String popularChannelsNames) {
		
		this.youtubeOwnerName = youtubeOwnerName;
		this.noOfUsers = noOfUsers;
		this.noOfViewrs = noOfViewrs;
		this.noOfChannels = noOfChannels;
		this.popularChannelsNames = popularChannelsNames;
	}
	
	
public void playVideo() {
	System.out.println("play video method in youtube");
}
}
