package com.jacobo.PublicadorSuscriptor1.clases;

/**
 * Esta es la clase que realmente va a funcionar por eso lo que hace es 
 * implementar los metodos para añadir nuevos suscriptores y para notificar que tienen 
 * actulizaciones pendientes
 */

import java.util.ArrayList;

import com.jacobo.PublicadorSuscriptor1.interfaces.Observer;
import com.jacobo.PublicadorSuscriptor1.interfaces.Subject;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observes;
	private float temperature, humidity, pressure;
	
	/**
	 * El constructor de la clase lo que hace es crear un array los suscriptores
	 */
	
	public WeatherData(){
		observes = new ArrayList<Observer>();
		
	}
	
	/**
	 * Añade un elemento al array
	 * @param Observer o
	 */

	@Override
	public void registerObserver(Observer o) {
		observes.add(o);

	}
	
	/**
	 * Elimina un elemento del array, pero teniendo cuidado si esta vacio 
	 * el array
	 * @param Observer o 
	 */

	@Override
	public void removeObserver(Observer o) {
		int i = observes.indexOf(o);
		if(i >= 0){
			observes.remove(i);
		}
	}

	/**
	 * recorre el array llamando al metodo de actualizacion de los 
	 * suscriptores
	 */
	@Override
	public void notifyObservers() {
		for(int i = 0; i < observes.size(); i++){
			Observer suscriptor = observes.get(i);
			suscriptor.update(temperature, pressure, humidity);
		}

	}
	
	/**
	 * Metodo concreto para actualizar las observaciones de la 
	 * estacion meteorologica
	 */
	public void measurementChanged(){
		notifyObservers();
	}
	
	/**
	 * seteo de las variables atmosfericas
	 */
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

}
