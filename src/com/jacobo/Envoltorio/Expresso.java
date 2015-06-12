package com.jacobo.Envoltorio;
/**
 * esta es una clase concreta para un cafe Expresso Standard
 * @author jake
 *
 */

public class Expresso extends Beverage {

	public Expresso(){
		this.description="caffe Expresso";
	}
	
	@Override
	public double cost() {
		return 1.5;
	}

}
