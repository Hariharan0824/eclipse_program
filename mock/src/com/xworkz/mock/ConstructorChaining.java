package com.xworkz.mock;

public class ConstructorChaining {
	
	String name;
	int age;
	String college;
	String place;
	
	public ConstructorChaining(String name,int age,String college) {
		this.name= name;
		this.age=age;
		this.college=college;
	}
	
	public ConstructorChaining(String name,int age,String college,String place) {
		this(name,age,college);
		this.place = place;
	}


}

