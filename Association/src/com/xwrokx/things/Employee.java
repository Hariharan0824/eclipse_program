package com.xwrokx.things;

import java.sql.Date;

public class Employee {
	public String name;
	public Date data;
	public Investor investor;
	
	public Employee() {
		System.out.println("This is Employee Constructor");
	}
	public Employee(String name) {
		this.name=name;
		System.out.println("This is Employee Constructor");
	}
	public Employee(Investor investor) {
		this.investor=investor;
		System.out.println("This is Employee Constructor");
	}

	

}
