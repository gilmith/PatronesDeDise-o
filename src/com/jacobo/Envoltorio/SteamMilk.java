package com.jacobo.Envoltorio;

/**
 * ahora estos son los condimientos de la clase para darle en tiempo de ejecucion mas 
 * propiedades. Para que funcione bien tengo que añadirle en su interior la clase base
 * @author jake
 *
 */

public class SteamMilk extends CondimientDecorator {

	private Beverage beverage;
	
	public SteamMilk(Beverage beverage){
		this.beverage = beverage;
	}
	
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " with SteamMilk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.2;
	}

}
