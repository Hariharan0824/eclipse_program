package com.xworkz.constructor.things;

public class songs {
	public String playListName;
	public int typeOfSongs;
	public int numberOfSongs;
	public String songName;
	public String favouritPlayList;
	
	public songs() {
		
		System.out.println("This is Default Constructor");
	}
	public songs(String playListName,int typeOfSongs,int numberOfSongs,String songName,String favouritPlayList) {
	
	System.out.println("This is Argument Constructor");
	
	this.playListName=playListName;
	this.typeOfSongs=typeOfSongs;
	this.numberOfSongs=numberOfSongs;
	this.songName=songName;
	this.favouritPlayList=favouritPlayList;
	}
public void displaysongs() {
	
	System.out.println("playListName:"+this.playListName+"typeOfSongs:"+this.typeOfSongs+"numberOfSongs:"+this.numberOfSongs+"songName:"+this.songName+"favouritPlayList:"+this.favouritPlayList);
}
}
