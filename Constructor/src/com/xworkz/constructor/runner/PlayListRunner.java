package com.xworkz.constructor.runner;

import com.xworkz.constructor.runner.things.PlayList;

public class PlayListRunner {
	public static void main(String args[]) {
		
		PlayList song=new PlayList(); 
		PlayList songs=new PlayList("Jio",50,5000,"Hari","Airtel");
		
		if(songs!=null) {
			songs.displayPlayList();
			System.out.println("This is not equal to null");
		}
	}

}
