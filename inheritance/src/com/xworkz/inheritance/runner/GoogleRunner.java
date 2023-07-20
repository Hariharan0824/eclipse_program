package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Google;
import com.xworkz.inheritance.things.Meeting;
import com.xworkz.inheritance.things.Quora;
import com.xworkz.inheritance.things.Youtub;

public class GoogleRunner extends Meeting{
	public static void main(String[] args) {
		GoogleRunner google = new GoogleRunner();
		//google.googleChrome();
		google.meet();
	}

}