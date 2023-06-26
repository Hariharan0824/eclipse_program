package com.xworkz.constructor.things;

public class OnlineGames {
	public String gamesName;
	 public String typeOfGames;
	 public int points[];
	 public String favGames[];
	 public String gamerNames[];
	 public int noOfTeams;
	 
	 public OnlineGames() {
		 System.out.println("This is No-Argument Constructor");
	}
	 public OnlineGames(String gamesName) {
		 System.out.println("This is 1 Argument Passing");
		 this.gamesName=gamesName;
		 }
public OnlineGames(String gamesName,String favGames[]) {
		 System.out.println("This is 1 Argument Passing & 1 Array");
		 this.gamesName=gamesName;
		 this.favGames=favGames;
			for(int i=0;i<favGames.length;i++) {
				System.out.println(favGames);
			}
	 }
	 public OnlineGames(String gamesName,String typeOfGames) {
		 System.out.println("This is  2 Argument Passing");
		 this.gamesName=gamesName;
		 this.typeOfGames=typeOfGames;
		}
public OnlineGames(String gamesName,String typeOfGames,int noOfTeams) {
	 System.out.println("This is  3 Argument Passing");
	 this.gamesName=gamesName;
	 this.typeOfGames=typeOfGames;
	 this.noOfTeams=noOfTeams;
	}
public OnlineGames(String gamesName,String typeOfGames,int noOfTeams,String favGames[]) {
	 System.out.println("This is  3 Argument Passing & 1 Array");
	 this.gamesName=gamesName;
	 this.typeOfGames=typeOfGames;
	 this.noOfTeams=noOfTeams;
	 this.favGames=favGames;
		for(int i=0;i<favGames.length;i++) {
			System.out.println(favGames[i]);
	}
}
public OnlineGames(String favGames[]) {
	System.out.println("Passing 1 array");
	this.favGames=favGames;
	for(int i=0;i<favGames.length;i++) {
		System.out.println(favGames[i]);
	}
}
public OnlineGames(String favGames[],String gamerNames[]) {
	System.out.println("Passing 2 array");
	this.favGames=favGames;
	this.gamerNames=gamerNames;
	for(int i=0;i<favGames.length;i++) {
		System.out.println(favGames[i]);
	}	
	for(int i=0;i<gamerNames.length;i++) {
		System.out.println(gamerNames[i]);
	}
}
public OnlineGames(String favGames[],String gamerNames[],int points[]) {
	System.out.println("Passing 3 array");
this.favGames=favGames;
	this.gamerNames=gamerNames;
	this.points=points;
	for(int i=0;i<favGames.length;i++) {
		System.out.println(favGames[i]);
	}
	for(int i=0;i<gamerNames.length;i++) {
		System.out.println(gamerNames[i]);
	}
	for(int i=0;i<points.length;i++) {
		System.out.println(points[i]);
	}
}
public OnlineGames(String gamesName,String typeOfGames,int points[],String favGames[],String gamerNames[],int noOfTeams) {
		 System.out.println("This is Argument consgtructor");
		 this.gamesName=gamesName;
		 this.typeOfGames=typeOfGames;
		 this.points=points;
		 this.favGames=favGames;
		 this.gamerNames=gamerNames;
		 this.noOfTeams=noOfTeams;
		 }
	 public void displayOnlineGames() {
		 System.out.println("gamesName:"+this.gamesName+"typeOfGames:"+this.typeOfGames+"points:"+this.points+"favGames:"+this.favGames+"gamerNames:"+this.gamerNames+"noOfTeams:"+this.noOfTeams);
	 }
}
