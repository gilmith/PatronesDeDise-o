package com.jacobo.Singleton1;

public class SimplePizzaFactory {
	
	/**
	 * en esta clase se ha delegado la responsabilidad de asignar la pizza segun el ingrediente
	 * que se le pasa como parametro
	 * @param type
	 * @return
	 */
	
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("peperoni")){
			pizza = new PeperoniPizza("pepperoni");
		} else{
			pizza = new MagaritaPizza();
		}
		return pizza;
	}

}
