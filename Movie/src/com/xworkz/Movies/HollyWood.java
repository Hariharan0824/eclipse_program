package com.xworkz.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class HollyWood implements Movie {

	@Autowired
	@Qualifier("tamil")
	private Tamil t;

	@Override
	public void Budget() {
		System.out.println("Movie Budget in HollyWood");
		t.sound();

	}

	@Override
	public void Views() {
		System.out.println("Movie Budget in HollyWood");

	}

}
