package com.xwrokx.things;

import java.sql.Date;

public class Isro {
	public String name;
	public Date date;
	public Departments departments;
	
	public Isro() {
		System.out.println("This is Isro No Contructor");
	}
	public Isro(String name) {
		this.name=name;
		System.out.println("This is Isro No Contructor");
	}
	public Isro(Departments departments) {
		this.departments=departments;
		System.out.println("This is Isro No Contructor");
	}
}
