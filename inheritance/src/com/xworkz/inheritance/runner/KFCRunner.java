package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.KFC;
import com.xworkz.inheritance.things.KFC1;

public class KFCRunner extends KFC1 {
	public static void main(String[] args) {
		KFC kfc = new KFCRunner();
		kfc.barrowing();
	}

}

