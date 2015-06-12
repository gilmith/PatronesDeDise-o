package com.jacobo.PublicadorSuscriptor2;

public class WeahterStation {

	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherData);
		CurrentConditionDisplay display2 = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(10, 20, 30);
		weatherData.setMeasurements(50, 60, 60);
	}
}
