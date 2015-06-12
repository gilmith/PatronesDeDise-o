package com.jacobo.PublicadorSuscriptor1.clases;

import com.jacobo.PublicadorSuscriptor1.interfaces.DisplayElement;
import com.jacobo.PublicadorSuscriptor1.interfaces.Observer;
import com.jacobo.PublicadorSuscriptor1.interfaces.Subject;

/**
 * Este seria el aparato de medida, al usar las interfaces puedo crear
 * nuevos aparatos de medida pero todos usaran la misma interfaz, reutiliza el 
 * codigo. El patron publicador-suscriptor es el patron de diseño de la 
 * cardinalidad 1 a muchos
 * @author jake
 *
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature, humidity, pressure;
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	
	/**
	 * al crear un nuevo aparato de medida, lo que hace es suscribirse al 
	 * publicador asociado, seria algo asi como asociarle un servidor
	 * @param weatherData
	 */
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("temperature = " + temperature + 
				"\nhumidity = " + humidity + 
				"\npressure = " + pressure);

	}

	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
