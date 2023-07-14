package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Models;
import com.xworkz.Instance.things.Motors;

public class MotorsRunner {
	public static void main(String[] args) {
		Motors motors = new Motors();
		motors.display();
		Motors motors1 = new Motors("Pulsar Motor","hari");
		motors1.display();
		Motors motors2 = new Motors("Pulsar Motor","hari",20,Models.NS150);
		motors2.display();
		Motors motors3 = new Motors();
		motors3.setvalue(Models.NS200);
		motors3.display();
		
	}

}
