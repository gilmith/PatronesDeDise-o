package com.jacobo.Envoltorio;

public class Mocha extends CondimientDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + " with mocha ";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}

}
