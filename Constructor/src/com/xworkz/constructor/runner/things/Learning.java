package com.xworkz.constructor.runner.things;

public class Learning {

	public String name;
	public String traniers;
	public String traninees;
	public int rooms;
	public int chairs;
	public String courses;
	public int fees;
	public boolean breaks;
	public int laptops;
	public String services;
	
	public Learning() {
		
		System.out.println("This is default comstructor");
	}
	
	public Learning(String name,String traniers,String traninees,int rooms,int chairs,String courses,int fees,boolean breaks,int laptops,String services) {
		System.out.println("Arguments constructors");
		
		this.name=name;
		this.traniers=traniers;
		this.traninees=traninees;
		this.rooms=rooms;
		this.chairs=chairs;
		this.courses=courses;
		this.fees=fees;
		this.breaks=breaks;
		this.laptops=laptops;
		this.services=services;
		
		
	}
	public void displayLearning() {
		
		
		System.out.println("name:"+this.name+"traniers:"+this.traniers+"this:"+this.traniers+"this:"+this.traninees+"this:"+this.rooms+"this:"+this.chairs+"this:"+this.courses+"this:"+this.fees+"this:"+this.breaks+"this:"+this.laptops+"this:"+this.services);
	}
}
