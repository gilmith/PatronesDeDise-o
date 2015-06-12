package com.jacobo.Singleton2;

import com.jacobo.Singleton2.Pizza;

public class NyStylePizza extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("peperoni")){
			 pizza = new NyPeperoniPizza();
		} else {
			System.out.println("no hay");
		}
		return pizza;
	}

}
