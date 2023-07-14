package com.xworkz.Instance.things;

public class Aircooler {
private String mechine;
private int cost;
private String bestBrand;
private String worestBrand;
private int numberOfMechine;
private int condition;

public Aircooler() {
	System.out.println("No Argumnet Constructor");
}
public Aircooler(String mechine,int cost,String bestBrand,String worestBrand,int numberOfMechine,int condition) {
System.out.println("This is All Argument Constructor");
this.mechine=mechine;
this.cost=cost;
this.bestBrand=bestBrand;
this.worestBrand=worestBrand;
this.numberOfMechine=numberOfMechine;
this.condition=condition;
}
public void setMechine(String mechine) {
	this.mechine=mechine;
}
public String getMechine() {
	return mechine;
}
public void setCost(int cost) {
	this.cost=cost;
}
public int getCost() {
	return cost;
}
public void setBestBrand(String bestBrand) {
	this.bestBrand=bestBrand;
}
public String getBestBrand() {
	return bestBrand;
}
public void setWorestBrand(String worestBrand) {
	this.worestBrand=worestBrand;
}
public String getWorestBrand() {
	return worestBrand;
}
public void setNumberOfMechine(int numberOfMechine) {
	this.numberOfMechine=numberOfMechine;
}
public int getNumberOfMechine() {
	return numberOfMechine;
}
public void setCondition(int condition) {
	this.condition=condition;
}
public int getCondition() {
	return condition;
}
public String getcondition(int condition) {
	if(condition<10) {
		return "Too cool";
	}else if(condition>40) {
	return "Too Hot";
	}else {
		return "Normal";
	}
		}
public void wheatherCondition() {
System.out.println("WheatherConditions in Room");
	
}
public String getCondition(String condition) {
	if(condition=="Too cool") {
		return "Turn off the AirCooler";	
	}else {
		return "Invalid";
	}
	
}

}
