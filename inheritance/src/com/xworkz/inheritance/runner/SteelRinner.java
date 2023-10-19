package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Steel;

public class SteelRinner {
	public static void main(String[] args) {
		Steel stl = new Steel();
		String ref1 = stl.toString();
		System.out.println(ref1);

		Steel st2 = new Steel("Hari", 45, 654, "Siva");
		String ref2 = st2.toString();
		System.out.println(ref2);

		Steel st3 = new Steel("Hari", 45, 654, "Siva");
		boolean result = st2.equals(st3);
		System.out.println(result);

		Steel st4 = new Steel("Hari", 45, 654, "Siva");
		boolean result1 = st3.equals(st4);
		System.out.println(result1);

		Steel st5 = new Steel("Hari", 45, 654, "Siva");
		boolean result2 = st5.equals(st4);
		System.out.println(result2);

	}
}
