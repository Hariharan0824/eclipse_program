package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Dharisanam;
import com.xworkz.Instance.things.Temple;

public class TempleRunner {
	public static void main(String[] args) {
		Temple temple1 = new Temple();
		temple1.display();
		Temple temple2 = new Temple("Sivan","BTM");
		temple2.display();
		Temple temple3 = new Temple("Sivan","BTM",8,Dharisanam.FirstClass);
		temple3.display();
		Temple temple4 = new Temple();
		temple4.setvalue(Dharisanam.SecondClass);
		temple4.display();
	}

}
