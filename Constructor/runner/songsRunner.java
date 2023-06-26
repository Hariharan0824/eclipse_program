package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.songs;

public class songsRunner {
public static void main(String args[]) {
		
	songs timePass=new songs(); 
	songs timePass1=new songs("Jio",50,5000,"Hari","Airtel");
		
		if(timePass1!=null) {
			timePass1.displaysongs();
			System.out.println("This is not equal to null");
		}
	}
}
