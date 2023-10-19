package com.xworkz.inheritance.things;

public class Steel {

	public String name;
	public int noOFCount;
	public int weight;
	public String brandName;
	
	public Steel() {
		System.out.println("This is Steel Constructor");
	}

	public Steel(String name, int noOFCount, int weight, String brandName) {
		super();
		this.name = name;
		this.noOFCount = noOFCount;
		this.weight = weight;
		this.brandName = brandName;
	}
	public String toString() {
		return "Steel[name='"+name+"',"+"noOFCount='"+noOFCount+"',"+"weight='"+weight+"',"+"brandName='"+brandName+"']";
		}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
	
		if(getClass()!=obj.getClass())
			 return false;
		
		Steel stl= (Steel)obj;
		 if(this.name==stl.name && this.noOFCount==stl.noOFCount && this.weight==stl.weight && this.brandName==stl.brandName)
		 return true;
		 return false;
		
	}
	
}
