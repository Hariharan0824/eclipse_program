package com.xworkz.mock;

public class Stringss {

	public static void main(String[] args) {
		
		 String name = "XwoRkZ";
		 char[] name1 = name.toCharArray();
		 for (char c : name1) {
			 if(c=='X' | c=='R' |c=='Z') {
				 c+=32;
			 }
			 else {
				 c-=32;
			 }
			 System.out.println(c);
		}
	}

}
