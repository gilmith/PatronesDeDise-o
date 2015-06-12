package com.jacobo.PublicadorSuscriptor1.interfaces;

/**
 * esta es la interfaz comun que usaran todos los publicadores para enviar 
 * los mensajes a los suscritores. Como es una interfaz no especifica los 
 * metodos solo es la implementacion de la misma.
 * 
 *  El usar una inteerfaz es para compartir codigo sin tener que
 *  definirlo por completo
 * @author jake
 *
 */

public interface Subject {
	
	/**
	 * Registra un suscriptor dentro del publicador
	 * @param o
	 */
	public void registerObserver(Observer o);
	
	/**
	 * borra un suscriptr dentro del publicador
	 * @param o
	 */
	
	public void removeObserver(Observer o);
	
	/**
	 * Notifica, que no actualiza a los suscriptores que tienen nuevos datos disponibles
	 */
	public void notifyObservers();
}
