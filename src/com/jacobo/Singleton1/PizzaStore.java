package com.jacobo.Singleton1;

public class PizzaStore {
	
	private SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(SimplePizzaFactory simplePizzaFactory){
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public void orderPizza(String type){
		Pizza pizza = simplePizzaFactory.createPizza(type);
		pizza.prepare();
	}

}
