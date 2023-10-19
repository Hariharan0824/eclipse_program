package com.xworkz.inheritance.things;

public class Iron {
	
	public int meltingPoint;
	public int shops;
	public String name;
	public int id;
	public int weight;
	public int count;
	
	public Iron() {
		System.out.println("This is Iron Constructor");
	}

	public Iron(int meltingPoint, int shops, String name, int id, int weight, int count) {
		super();
		this.meltingPoint = meltingPoint;
		this.shops = shops;
		this.name = name;
		this.id = id;
		this.weight = weight;
		this.count = count;
	}public boolean equals(Object obj) {
		if(obj==null)
			return false;
	
		if(getClass()!=obj.getClass())
			 return false;
		
		Iron irl= (Iron)obj;
		 if(this.meltingPoint==irl.meltingPoint && this.shops==irl.shops && this.name==irl.name && this.id==irl.id && this.weight==irl.weight && this.count==irl.count)
		 return true;
		 return false;
	
	}

}
