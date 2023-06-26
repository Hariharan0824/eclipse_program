package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Pogo;

public class PogoRunner {
public static void main(String args[]) {
	
	Pogo carrton=new Pogo();
	carrton.setName("Hari");
	carrton.setNumberOfPersons(100);
	carrton.setMode("Offline");
	carrton.setOffers(9.8f);
	carrton.setNumberOfVewing(100);
	carrton.setMode1(false);
	carrton.setNumberOfrevewing1(500);
	carrton.setChannelNames("Hari");
	carrton.setAnimationName("ZYZ");
	carrton.setDubbingvoiceName("Hari");
	System.out.println(carrton.getName());
	System.out.println(carrton.getNumberOfPersons());
	System.out.println(carrton.getMode());
	System.out.println(carrton.getOffers());
	System.out.println(carrton.getNumberOfVewing());
	System.out.println(carrton.getMode1());
	System.out.println(carrton.getNumberOfrevewing1());
	System.out.println(carrton.getChannelNames());
	System.out.println(carrton.getAnimationName());
	System.out.println(carrton.getDubbingvoiceName());
}
}
