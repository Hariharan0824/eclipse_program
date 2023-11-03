package com.xworkz.Appti.program;

public class Frequency {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,3,2,1,1,1,1};
		int x=1;
		int count=0;
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				count ++;
				
				
			}
		}
		System.out.println(count);
	}
}
