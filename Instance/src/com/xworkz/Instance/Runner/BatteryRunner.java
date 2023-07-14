package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Battery;
import com.xworkz.Instance.things.ModelsType;

public class BatteryRunner {
public static void main(String[] args) {
	Battery battery1 = new Battery();
	battery1.display();
	Battery battery2 = new Battery("PulsarBattery","Hari");
	battery2.display();
	Battery battery3 = new Battery("PulsarBattery","Hari",50,ModelsType.GD);
	battery3.display();
	Battery battery4 = new Battery();
	battery4.setValues(ModelsType.LD);
	battery4.display();
}
}
