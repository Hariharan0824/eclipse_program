package com.xwrokx.things;

import java.sql.Date;

public class Investor {
	public String name;
	public Date data;
	public Lab lab;
	
	public Investor() {
		System.out.println("This is Investor No Arguments Constructor");
	}
	public Investor(String name) {
		this.name=name;
		System.out.println("This is Investor No Arguments Constructor");
	}
	public Investor(Lab lab) {
		this.lab=lab;
		System.out.println("This is Investor No Arguments Constructor");
	}

}
