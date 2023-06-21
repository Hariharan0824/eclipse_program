package com.xworkz.constructor.runner;

import com.xworkz.constructor.runner.things.Learning;

public class LearningRunner {

	public static void main(String args[]) {
		
		Learning friends=new Learning();
		Learning friends1=new Learning("Xworkz","hari","ravi",4,46,"java",15000,false,50,"good");
		friends1.displayLearning();
		if(friends1!=null) {
			
			System.out.println("This is not equal to null");
			friends1.displayLearning();
	}
	}
	}
