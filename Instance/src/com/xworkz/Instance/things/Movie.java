package com.xworkz.Instance.things;

public class Movie {
	String name;
	String releaseDate="20-10-2023";
	int budget;
	String directorName;
	
	Director director=new Director("Rocky", "Mohan", 5000000, "Raja SS moli");

	public Movie(String name,String releaseDate,int budget,String directorName) {
		System.out.println("Constructor of movie class");
		this.name=name;
		this.releaseDate=releaseDate;
		this.budget=budget;
		this.directorName=directorName;
	}
	void setBudget(int budget) {
		this.budget=budget;

	}
	public void print_info() {
		System.out.println("Name:" +this.name);
		System.out.println("Release Date:" +this.releaseDate);
		System.out.println("Budget:" +this.budget);
		System.out.println("Director Name:" +this.directorName);
		director.print_InfoDirector();

	}

}
