package com.xworkz.constructor.runner.things;

public class PlayList {
	
	public String playListName;
	public int typeOfPlayList;
	public int numberOfSongs;
	public String name;
	public String favouritPlayList;
	
	public PlayList() {
		
		System.out.println("This is Default Constructor");
	}
public PlayList(String playListName,int typeOfPlayList,int numberOfSongs,String name,String favouritPlayList) {
	
	System.out.println("This is Argument Constructor");
	
	this.playListName=playListName;
	this.typeOfPlayList=typeOfPlayList;
	this.numberOfSongs=numberOfSongs;
	this.name=name;
	this.favouritPlayList=favouritPlayList;
	}
public void displayPlayList() {
	
	System.out.println("playListName:"+this.playListName+"typeOfPlayList:"+this.typeOfPlayList+"numberOfSongs:"+this.numberOfSongs+"name:"+this.name+"favouritPlayList:"+this.favouritPlayList);
}
}
