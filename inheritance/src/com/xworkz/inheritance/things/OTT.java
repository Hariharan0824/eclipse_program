package com.xworkz.inheritance.things;

public class OTT {
 public int id;
 public String name;
 
 public OTT() {
	System.out.println("This is OTT Constructor");
}

public OTT(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
 public String toString() {
	 return "OTT[id='"+id+"',"+"name='"+name+"']";
 }
 public boolean equals(Object obj) {
	 if(obj==null)
		 return false;

 if(getClass()!=obj.getClass())
	 return false;
 
 OTT ott= (OTT)obj;
 if(this.id==ott.id && this.name==ott.name)
 return true;
 return false;
 
}

}