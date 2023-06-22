package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.CallCenter;

public class CallCenterRunner {
	
	public static void main(String args[]) {
		
		CallCenter work=new CallCenter();
		CallCenter work1=new CallCenter("Hari",20,450,"Mico","BPO");
		
		work1.displayCallCenter();
		if(work1 != null) {
			
			System.out.println("This is not equal to null");
		}
	}

}
