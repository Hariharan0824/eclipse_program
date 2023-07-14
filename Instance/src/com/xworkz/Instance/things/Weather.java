package com.xworkz.Instance.things;

public class Weather {
	protected double temperature;
	protected double humidity;
	protected String windspeed;
	protected int precipitation;
	protected String pressure;
	protected String visibility;
	protected String sunriseTime;
	protected String sunsetTime;
	protected String weatherDescriptioin;
	protected String weatherCode;
	protected String windDirection;
	protected String uvIndex;
	protected String airQualityIndex;
	protected double dewpoint;
	protected boolean cloudCover;
	protected boolean weatherIcon;
	protected String FeelSlikeTemp;
	protected String precipitationProbability;
	protected String thunderStrom;
	protected int pollenCount;
	
	public Weather() {
		super();
		System.out.println("This is No Argument Constructor");
		}

	public Weather(double temperature, double humidity, String windspeed, int precipitation, String pressure,
			String visibility, String sunriseTime, String sunsetTime, String weatherDescriptioin, String weatherCode,
			String windDirection, String uvIndex, String airQualityIndex, double dewpoint, boolean cloudCover,
			boolean weatherIcon, String feelSlikeTemp, String precipitationProbability, String thunderStrom,
			int pollenCount) {
//		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.windspeed = windspeed;
		this.precipitation = precipitation;
		this.pressure = pressure;
		this.visibility = visibility;
		this.sunriseTime = sunriseTime;
		this.sunsetTime = sunsetTime;
		this.weatherDescriptioin = weatherDescriptioin;
		this.weatherCode = weatherCode;
		this.windDirection = windDirection;
		this.uvIndex = uvIndex;
		this.airQualityIndex = airQualityIndex;
		this.dewpoint = dewpoint;
		this.cloudCover = cloudCover;
		this.weatherIcon = weatherIcon;
		this.FeelSlikeTemp = feelSlikeTemp;
		this.precipitationProbability = precipitationProbability;
		this.thunderStrom = thunderStrom;
		this.pollenCount = pollenCount;
		
		System.out.println("temperature:"+this.temperature);
		System.out.println("humidity:"+this.humidity);
		System.out.println("windspeed:"+this.windspeed);
		System.out.println("precipitation:"+this.precipitation);
		System.out.println("pressure:"+this.pressure);
		System.out.println("visibility:"+this.visibility);
		System.out.println("sunriseTime:"+this.sunriseTime);
		System.out.println("weatherDescriptioin:"+this.weatherDescriptioin);
		System.out.println("weatherCode:"+this.weatherCode);
		System.out.println("uvIndex:"+this.uvIndex);
		System.out.println("airQualityIndex:"+this.airQualityIndex);
		System.out.println("dewpoint:"+this.dewpoint);
		System.out.println("cloudCover:"+this.cloudCover);
		System.out.println("weatherIcon:"+this.weatherIcon);
		System.out.println("FeelSlikeTemp:"+this.FeelSlikeTemp);
		System.out.println("precipitationProbability:"+this.precipitationProbability);
		System.out.println("thunderStrom:"+this.thunderStrom);
		System.out.println("pollenCount:"+this.pollenCount);
		System.out.println("sunsetTime:"+this.sunsetTime);
		System.out.println("windDirection:"+this.windDirection);
		
		
	}
	
	public void display() {
		System.out.println("This is Waeather method");
	}
	

}
