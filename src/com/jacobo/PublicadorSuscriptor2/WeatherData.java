package com.jacobo.PublicadorSuscriptor2;

import java.util.Observable;
/**
 * El api de java tiene una clase para crear publicadores locales, es la clase
 * observable, es decir que si es una clase, tengo que hacer subclase de la misma
 * para heredar los metodos para que sea observable, ahorra codigo pero 
 * no es demasiado elegante.
 * 
 * PAra que los suscriptores lo vean tienen que ser Observer
 * @author jake
 *
 */

public class WeatherData extends Observable {

	private float temperature, humidity, pressure;
	
	public WeatherData(){
		
	}
	
	public void measurementChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
