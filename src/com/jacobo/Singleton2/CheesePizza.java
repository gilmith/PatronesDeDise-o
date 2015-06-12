package com.jacobo.Singleton2;

public class CheesePizza extends Pizza {

	private NYPizzaIngredientFactory nyPizzaIngredientFactory;
	
	public CheesePizza(NYPizzaIngredientFactory nyPizzaIngredientFactory){
		this.nyPizzaIngredientFactory = nyPizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("preparando la pizza de queso");
		dough = nyPizzaIngredientFactory.createDought();
		sauce = nyPizzaIngredientFactory.createSauce();
		cheese = nyPizzaIngredientFactory.createCheese();
		
		
	}

}
