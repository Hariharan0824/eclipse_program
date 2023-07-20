package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Movie;

public class MovieDirectorRunner {


public static void main(String[] args) {
	Movie movie = new Movie("RR","06-09-2023",5000000,"KKR");
	
	movie.print_info();
}
}
