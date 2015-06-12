package com.jacobo.PublicadorSuscriptor1.clases;

public class WeatherStation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherData);
		CurrentConditionDisplay display2 = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(10, 10, 10);
		weatherData.setMeasurements(20, 20, 20);
		
		
	}

}
