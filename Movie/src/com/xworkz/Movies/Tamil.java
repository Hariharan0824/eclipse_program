package com.xworkz.Movies;

import org.springframework.stereotype.Component;

@Component("tamil")
public class Tamil implements Languages {

	@Override
	public void sound() {
		System.out.println("Languages in Tamil");
		
	}

	@Override
	public void Views() {
		System.out.println("Languages in Tamil");
		
	}

}
