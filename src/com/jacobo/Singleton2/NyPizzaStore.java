package com.jacobo.Singleton2;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientes = new NYPizzaIngredientFactory();
		if(type.equals("cheese")){
			pizza = new CheesePizza((NYPizzaIngredientFactory) ingredientes);
		}
		return pizza;
	}

}
