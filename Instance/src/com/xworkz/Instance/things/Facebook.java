package com.xworkz.Instance.things;

public class Facebook {
 public String firstName;
 public String lastName;
 public String gender;
 public int dateOfBirth;
 public long phoneNumber;
 public String emailId;
 public String password;
 public Facebook (){
	 
	 System.out.println("This is Default Constructor");
 }
 public Facebook (String firstName,String lastName,String gender,int dateOfBirth,long phoneNumber,String emailId,String password) {
	 System.out.println("This is All Argument Constructor");
 }
 public void register(String firstName) {
	 this.firstName=firstName;
	 System.out.println("This is 1 Argument");
 }
 public void register(String firstName,String lastName) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 System.out.println("This is 2 Argument");
 }
 public void register(String firstName,String lastName,String gender) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.gender=gender;
	 System.out.println("This is 3 Argument");
 }
 public void register(String firstName,String lastName,String gender,int dateOfBirth) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.gender=gender;
	 this.dateOfBirth=dateOfBirth;
	 System.out.println("This is 4 Argument");
 }
 public void register(String firstName,String lastName,String gender,int dateOfBirth,long phoneNumber) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.gender=gender;
	 this.dateOfBirth=dateOfBirth;
	 this.phoneNumber=phoneNumber;
	 System.out.println("This is 5 Argument");
 }
 public void register(String firstName,String lastName,String gender,int dateOfBirth,long phoneNumber,String emailId) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.gender=gender;
	 this.dateOfBirth=dateOfBirth;
	 this.phoneNumber=phoneNumber;
	 this.emailId=emailId;
	 System.out.println("This is 6 Argument");
 }
 public void register(String firstName,String lastName,String gender,int dateOfBirth,long phoneNumber,String emailId,String password) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.gender=gender;
	 this.dateOfBirth=dateOfBirth;
	 this.phoneNumber=phoneNumber;
	 this.emailId=emailId;
	 this.password=password;
	 System.out.println("This is 7 Argument");
 }
 
 public void dispalyRegister() {
	 
	 System.out.println("This is display method");
	 System.out.println("firstName:"+this.firstName+" "+"lastName:"+this.lastName+" "+"gender:"+this.gender+" "+"dateOfBirth:"+this.dateOfBirth+" "+"phoneNumber:"+this.phoneNumber+" "+ "emailId:"+this.emailId+" "+ "password:"+this.password);
 }
 public String login(String firstName,String password) {
	 if(firstName==null){
	 System.out.println("This is if condition");
	 return null;
	 }
	 else if (password==null){
	 System.out.println("This is else condition");
	 return null;
	 }else {
		 return firstName;
	 }
 
	 
}

}
