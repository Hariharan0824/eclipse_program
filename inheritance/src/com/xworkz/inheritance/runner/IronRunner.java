package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Iron;

public class IronRunner {
public static void main(String[] args) {
	Iron irn = new Iron();
	String res=irn.toString();
	System.out.println(res);
	
	Iron irn1 = new Iron(34,23,"Hari",2,12,45);
	String res1=irn1.toString();
	System.out.println(res1);
	
	Iron irn2 = new Iron(34,23,"Hari",2,12,45);
	boolean res2=res1.equals(irn2);
	System.out.println(res2);
	
	Iron irn3 = new Iron(34,23,"Hari",2,12,45);
	boolean res3=irn2.equals(irn3);
	System.out.println(res3);
	
	Iron irn4 = new Iron(34,23,"Hari",2,12,45);
	boolean res4=irn4.equals(irn4);
	System.out.println(res4);
	
	Iron irn5 = new Iron(34,23,"Hari",2,12,45);
	boolean res5=irn4.equals(irn5);
	System.out.println(res4);
	
}
}
