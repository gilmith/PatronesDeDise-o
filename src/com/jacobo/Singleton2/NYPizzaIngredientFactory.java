package com.jacobo.Singleton2;

/**
 * este es el factory que creara cada uno de los ingredientes que tiene en la interfaz
 * @author jake
 *
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	/**
	 * cada uno de los metodos del factory devuelve un objeto concreto para el 
	 * estilo de NY
	 */
	
	@Override
	public Dough createDought() {
		return new ThinCrustDought();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

/*	public Veggie[] createVeggie() {
		Veggie veggie[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggie;
	}*/

	@Override
	public Peperoni createPeperoni() {
		return new SlicedPeperoni();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

}
