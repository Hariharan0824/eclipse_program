package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Movies.Bollywood;
import com.xworkz.Movies.HollyWood;

@Configuration
//@Configuration("com.xworkz.Movies")
@ComponentScan("com.xworkz")
public class MovieConfig {

	/*
	 * @Bean public HollyWood getHollyWood() { return new HollyWood(); }
	 */
}
