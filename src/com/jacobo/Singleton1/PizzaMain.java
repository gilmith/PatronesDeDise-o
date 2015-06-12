package com.jacobo.Singleton1;

public class PizzaMain {
	
	public static void main(String[] args){
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		pizzaStore.orderPizza("peperoni");
	}

}
