package com.jacobo.Envoltorio;

public class Cafeteria {

	public static void main(String[] args) {
		
		Beverage cafe1 = new Expresso();
		System.out.println(cafe1.getDescription() + " " + cafe1.cost());
		//ahora le pongo mocha, pero usando un cosa nueva
		cafe1 = new Mocha(cafe1);
		System.out.println(cafe1.getDescription() + " " + cafe1.cost());
		
		
	}

}
