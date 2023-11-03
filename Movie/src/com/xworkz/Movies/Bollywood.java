package com.xworkz.Movies;

import org.springframework.stereotype.Component;

@Component("bolly")
public class Bollywood implements Movie{

	@Override
	public void Budget() {
		System.out.println("Movie Budget in Bollywood");
		
	}

	@Override
	public void Views() {
		System.out.println("Movie Budget in Bollywood");
		
	}

}
