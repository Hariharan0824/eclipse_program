package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.MovieMaker;

public class MovieMakerRunner {
	
	public static void main(String[] args) {
		MovieMaker movie = new MovieMaker();
		String res=movie.toString();
		System.out.println(res);
		
		MovieMaker movie1 = new MovieMaker("Hari","Siva","Jeeva","Krishna","Hariharan","Sarvesh","Sagar","Ravi","Arun","arunkumar");
		String res1=movie.toString();
		System.out.println(res1);
		
		MovieMaker movie2 = new MovieMaker("Hari","Siva","Jeeva","Krishna","Hariharan","Sarvesh","Sagar","Ravi","Arun","arunkumar");
		boolean res2=movie1.equals(movie2);
		System.out.println(res2);
		
		MovieMaker movie3 = new MovieMaker("Hari","Siva","Jeeva","Krishna","Hariharan","Sarvesh","Sagar","Ravi","Arun","arunkumar");
		boolean res3=movie2.equals(movie3);
		System.out.println(res3);
		
		MovieMaker movie4 = new MovieMaker("Hari","Siva","Jeeva","Krishna","Hariharan","Sarvesh","Sagar","Ravi","Arun","arunkumar");
		boolean res4=movie3.equals(movie4);
		System.out.println(res4);
	}

}
