package com.jacobo.Envoltorio;

public abstract class Beverage {
	
	protected String description="Unknown";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();

}
