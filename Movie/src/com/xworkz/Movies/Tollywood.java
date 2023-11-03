package com.xworkz.Movies;

import org.springframework.stereotype.Component;

@Component
public class Tollywood implements Movie{

	@Override
	public void Budget() {
		System.out.println("Movie Budget in Tollywood");
		
	}

	@Override
	public void Views() {
		System.out.println("Movie Budget in Tollywood");
		
	}

}
