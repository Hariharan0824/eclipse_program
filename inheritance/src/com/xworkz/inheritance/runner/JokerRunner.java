package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Joker;

class JokerRunner {
	public static void main(String[] args) {
		Joker jok = new Joker();
		String res = jok.toString();
		System.out.println(res);

		Joker jok1 = new Joker("Hari", 12, "Good", 12345678, 12345, 1234, "Mico", 1234);
		String res1 = jok1.toString();
		System.out.println(res1);

		Joker jok2 = new Joker("Hari", 12, "Good", 12345678, 12345, 1234, "Mico", 1234);
		boolean res2 = jok1.equals(jok2);
		System.out.println(res2);

		Joker jok3 = new Joker("Hari", 12, "Good", 12345678, 12345, 1234, "Mico", 1234);
		boolean res3 = jok2.equals(jok2);
		System.out.println(res3);
		
		Joker jok4 = new Joker("Hari", 12, "Good", 12345678, 12345, 1234, "Mico", 1234);
		boolean res4 = jok3.equals(jok4);
		System.out.println(res4);

	}

}
