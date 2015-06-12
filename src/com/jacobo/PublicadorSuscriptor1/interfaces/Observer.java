package com.jacobo.PublicadorSuscriptor1.interfaces;

/**
 * Esta es la interfaz comun a todos los suscriptores, de esta manera puedo 
 * definir suscriptores mas o menos sofisticados pero todos usaran la misma
 * interfaz para actualizar los datos.
 * 
 * @author jake
 *
 */

public interface Observer {
	
	/**
	 * Actuliza los datos disponibles una vez que se le ha notificado que tiene actuliazaciones
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void update(float temperature, float pressure, float humidity);

}
