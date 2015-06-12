package com.jacobo.Singleton2;

public class PizzaMain {

	public static void main(String[] args) {

		PizzaStore pizzaStore2 = new NyStylePizza();
		Pizza pizza = pizzaStore2.createPizza("peperoni");
		pizza.prepare();
		NyPizzaStore ny = new NyPizzaStore();
		Pizza pizza2 = ny.createPizza("cheese");
		pizza2.prepare();
		
		
	}

}
