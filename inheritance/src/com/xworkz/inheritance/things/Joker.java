package com.xworkz.inheritance.things;

public class Joker {
	
	public String name;
	public int age;
	public String movieRating;
	public int collections;
	public int views;
	public int noOFJokers;
	public String address;
	public int noOfpeole;
	
	public Joker() {
System.out.println("This is Joker Constructor");
	}

	public Joker(String name, int age, String movieRating, int collections, int views, int noOFJokers, String address,
			int noOfpeole) {
		super();
		this.name = name;
		this.age = age;
		this.movieRating = movieRating;
		this.collections = collections;
		this.views = views;
		this.noOFJokers = noOFJokers;
		this.address = address;
		this.noOfpeole = noOfpeole;
	}
	public String toString() {
		return "Joker[name='"+name+"',"+"age='"+age+"',\"+\"movieRating='\"+movieRating+\"',\"+\"collections='\"+collections+\"',\"+\"views='\"+views+\"',\"+\"noOFJokers='\"+noOFJokers+\"',\"+\"address='\"+address+\"',\"+\"noOfpeole='\"+noOfpeole+\"']";
	}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
	
		if(getClass()!=obj.getClass())
			 return false;
		
		Joker jok= (Joker)obj;
		 if(this.name==jok.name && this.age==jok.age && this.movieRating==jok.movieRating && this.collections==jok.collections && this.views==jok.views && this.noOFJokers==jok.noOFJokers && this.address==jok.address && this.noOfpeole==jok.noOfpeole)
		 return true;
		 return false;
		
	}

}
