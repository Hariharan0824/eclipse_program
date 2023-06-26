package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.LinkedIn;

public class LinkedInRunner {
	public static void main(String args[]) {
		LinkedIn a1=new LinkedIn();
		
		LinkedIn a2=new LinkedIn();
		a2.setFounder("Reid Hoffmann");
		System.out.println("Founder of LinkedIn:"+a2.founder);
		
		LinkedIn a3=new LinkedIn();
		a3.setUser("Hariharan");
		System.out.println("LinkedIn started on:"+a3.user);
		
		LinkedIn a4=new LinkedIn();
		a4.setNoOfOffices(35);
		System.out.println("Number of offices worldwide:"+a4.noOfOffices);
		
		LinkedIn a5=new LinkedIn();
		a5.setNoOfEmployees(22500);
		System.out.println("Number of employees worldwide:"+a5.noOfEmployees);
		
		LinkedIn a6=new LinkedIn();
		a6.setOrganization("Google");
		System.out.println("Top organization followed on linkedin:"+a6.topOrganization);
		
		LinkedIn a7=new LinkedIn();
		a7.setPersonName("Bill Gates");
		System.out.println("Most followed person in linkedin:"+a7.personName);
		
		LinkedIn a8=new LinkedIn();
		a8.setFollowers("830 million");
		System.out.println("Total followers on linkedin:"+a8.followers);
		
		LinkedIn a9=new LinkedIn();
		a9.setInterviews("122 million");
		System.out.println("Number of interviews scored through linkedin:"+a9.interviews);
		
		LinkedIn a10=new LinkedIn();
		a10.setMostUsed("USA");
		System.out.println("Most used in:"+a10.mostUsed);
		
		LinkedIn a11=new LinkedIn();
		a11.setCompaniesName("58 million");
		System.out.println("Companies associated with linkedin:"+a11.companiesName);
		
		LinkedIn a12=new LinkedIn();
		a12.setArticles("1 lakh per month");
		System.out.println("Articles published:"+a12.articles);
		
		LinkedIn a13=new LinkedIn();
		a13.setSkills("50000 plus standard skills");
		System.out.println("Standard skills by linkedin:"+a13.skills);
		
		LinkedIn a14=new LinkedIn();
		a14.setIndustry("IT and Financial services");
		System.out.println("Top industries on linkedin:"+a14.topIndustry);
		
		LinkedIn a15=new LinkedIn();
		a15.setRevenue("4.45 billion USD");
		System.out.println("Revenue of Linkedin:"+a15.revenue);
		
		LinkedIn a16=new LinkedIn();
		a16.setNoOfPersonUsed(26);
		System.out.println("Number of languages linked in available:"+a16.noOfPersonUsed);
		
	}
}
