package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Weather;
import com.xworkz.Instance.things.Winter;

public class WeatherRunner extends Winter{

	public static void main(String[] args) {
		
		Weather runner1=new Winter();
		runner1.display();
		Weather weather=new Winter("Rainy",30,20,"Cool");
		Winter winter = new Winter();
		WeatherRunner runner2 = new WeatherRunner();
		runner2.pressure="good";
		
		
		
	}

}
