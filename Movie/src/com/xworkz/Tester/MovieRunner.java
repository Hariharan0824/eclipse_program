package com.xworkz.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.Movies.HollyWood;
import com.xworkz.Movies.Movie;
import com.xworkz.config.MovieConfig;

public class MovieRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
		Movie holly = context.getBean(HollyWood.class);
		holly.Budget();
	}
}
