package com.jacobo.Singleton2;

/**
 * puedo usr un factory no solo con clases abstractas tambien lo puedo hacer 
 * con interfaces que sirvan para crear objetos.
 * 
 * Habra una clase por cada ingrediente que vaya a añadir, por tanto esta interfaz es 
 * extensible. Ahora el factory tendra que implementar esta interfaz
 * @author jake
 *
 */

public interface PizzaIngredientFactory {
	
	/**
	 * metodo para crear la masa
	 * @return
	 */
	public Dough createDought();
	
	/**
	 * metodo para crear la salsa
	 * @return
	 */
	
	public Sauce createSauce();
	
	/**
	 * metodo para crear el queso
	 * @return
	 */
	
	public Cheese createCheese();
	
	/**
	 * metodo para añadir la verdura
	 * @return
	 */
	
//	public Veggie[] createVeggie();
	
	/**
	 * metodo para añadir los peperoni
	 * @return
	 */
	
	public Peperoni createPeperoni();
	
	/**
	 * esto no me cuadra
	 * @return
	 */
	
	public Clams createClams();

}
