package com.xworkz.Appti.program;

public class FrequencyTest {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5,5,5,5};
		int X=5;
		int count=0;
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			if(a[i]==X) {
				count++;
				
			}
		}
System.out.println("The Output is:"+count);
	}

}
