package com.jacobo.PublicadorSuscriptor2;

import java.util.Observable;
import java.util.Observer;

import com.jacobo.PublicadorSuscriptor1.interfaces.DisplayElement;

public class CurrentConditionDisplay implements DisplayElement, Observer {

	
	@SuppressWarnings("unused")
	private Observable observable;
	private float temperature, humidity, pressure;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.pressure = weatherData.getPressure();
			this.humidity = weatherData.getHumidity();
			display();
		}

	}

	@Override
	public void display() {
		System.out.println("temperature = " + temperature + 
				"\nhumidity = " + humidity + 
				"\npressure = " + pressure);
	}

}
