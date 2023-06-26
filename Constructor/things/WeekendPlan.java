package com.xworkz.constructor.things;

public class WeekendPlan {
	public String sundaySpecial;
	 public String tripPlace;
	 public int budjet[];
	 public String names[];
	 public String lunchType[];
	 public int noOfFreidns;
	 
	 public WeekendPlan() {
		 System.out.println("This is No-Argument Constructor");
	}
	 public WeekendPlan(String sundaySpecial) {
		 System.out.println("This is 1 Argument Passing");
		 this.sundaySpecial=sundaySpecial;
		 }
public WeekendPlan(String sundaySpecial,String names[]) {
		 System.out.println("This is 1 Argument Passing & 1 Array");
		 this.sundaySpecial=sundaySpecial;
		 this.names=names;
			for(int i=0;i<names.length;i++) {
				System.out.println(names);
			}
	 }
	 public WeekendPlan(String sundaySpecial,String tripPlace) {
		 System.out.println("This is  2 Argument Passing");
		 this.sundaySpecial=sundaySpecial;
		 this.tripPlace=tripPlace;
		}
public WeekendPlan(String sundaySpecial,String tripPlace,int noOfFreidns) {
	 System.out.println("This is  3 Argument Passing");
	 this.sundaySpecial=sundaySpecial;
	 this.tripPlace=tripPlace;
	 this.noOfFreidns=noOfFreidns;
	}
public WeekendPlan(String sundaySpecial,String tripPlace,int noOfFreidns,String names[]) {
	 System.out.println("This is  3 Argument Passing & 1 Array");
	 this.sundaySpecial=sundaySpecial;
	 this.tripPlace=tripPlace;
	 this.noOfFreidns=noOfFreidns;
	 this.names=names;
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
	}
}
public WeekendPlan(String names[]) {
	System.out.println("Passing 1 array");
	this.names=names;
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
}
public WeekendPlan(String names[],String lunchType[]) {
	System.out.println("Passing 2 array");
	this.names=names;
	this.lunchType=lunchType;
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}	
	for(int i=0;i<lunchType.length;i++) {
		System.out.println(lunchType[i]);
	}
}
public WeekendPlan(String names[],String lunchType[],int budjet[]) {
	System.out.println("Passing 3 array");
this.names=names;
	this.lunchType=lunchType;
	this.budjet=budjet;
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
	for(int i=0;i<lunchType.length;i++) {
		System.out.println(lunchType[i]);
	}
	for(int i=0;i<budjet.length;i++) {
		System.out.println(budjet[i]);
	}
}
public WeekendPlan(String sundaySpecial,String tripPlace,int budjet[],String names[],String lunchType[],int noOfFreidns) {
		 System.out.println("This is Argument consgtructor");
		 this.sundaySpecial=sundaySpecial;
		 this.tripPlace=tripPlace;
		 this.budjet=budjet;
		 this.names=names;
		 this.lunchType=lunchType;
		 this.noOfFreidns=noOfFreidns;
		 }
	 public void displayWeekendPlan() {
		 System.out.println("sundaySpecial:"+this.sundaySpecial+"tripPlace:"+this.tripPlace+"budjet:"+this.budjet+"lunchType:"+this.lunchType+"names:"+this.names+"noOfFreidns:"+this.noOfFreidns);
	 }

}
