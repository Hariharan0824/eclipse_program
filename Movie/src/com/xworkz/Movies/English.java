package com.xworkz.Movies;

import org.springframework.stereotype.Component;

@Component("English")
public class English implements Languages {

	@Override
	public void sound() {
		System.out.println("Languages in English");
		
	}

	@Override
	public void Views() {
		System.out.println("Languages in English");
		
	}

}
