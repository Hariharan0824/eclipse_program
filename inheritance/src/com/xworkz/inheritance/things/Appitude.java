package com.xworkz.inheritance.things;

public class Appitude {
	public static void main(String[] args) {
		
		//Reverse the string
		
		
		String Appiti="Good";
		char[] Appiti1=Appiti.toCharArray();
		System.out.println(Appiti1.length);
		for(int i=Appiti1.length-1;i>=0;i--) {
			System.out.println(Appiti1[i]+" ");
		}
		
		//Particular sentence in particular word
		
		/*String[] Appiti2=Appiti.split(" ");
		for(int j=0;j<=Appiti2.length;j++) {
			System.out.println(Appiti2[j]+"Moring");
		}*/
		
		if(Appiti.equals(Appiti1)) {
			System.out.println("this is palindrom");
		}
			else{
				System.out.println("this is not a palindrom");
			}
			
		}
	
	}