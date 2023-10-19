package com.xworkz.inheritance.things;

public class Showroom {
	public static void main(String[] args) {
		/*
		 * String name = "Jeeva"; int ticket = 35; int ticket1 = 45; String name1 =
		 * "Siva";
		 * 
		 * System.out.println(name.compareTo(name1));
		 * System.out.println(name.concat(name1)); System.out.println(name.indent(5));
		 * // While giving the value that much space will be indent
		 * 
		 * System.out.println(name.endsWith(name)); //first string same as second string
		 * means its shows true or else its shows false
		 * System.out.println(name.length()); //Length of the string
		 */

		String quotes = "Hello Good Morning";
		System.out.println(quotes);
		System.out.println(quotes.length());
		char[] quotes1 = quotes.toCharArray();
		System.out.println(quotes1.length);
		for (int i = 0; i <= quotes1.length; i++) {
			System.out.print(quotes1[i] + " ");
		}

		System.out.println();
		System.out.println("Number of word:" + quotes.split(" ").length);

		String[] quotes2 = quotes.split(" ");
		for (int i = 0; i < quotes2.length; i++) {
	    System.out.print(quotes2[i] + " ");

	    System.out.println();
	    char[] reverse = quotes.toCharArray();
		for (int j = reverse.length-1; i>= 0; i--) {
		System.out.println(reverse[j] + " ");
			}

		}

	}
}
