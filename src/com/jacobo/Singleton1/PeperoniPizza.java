package com.jacobo.Singleton1;

public class PeperoniPizza extends Pizza {
	
	private String ingrediente, description;
	
	public PeperoniPizza(String ingrediente){
		this.ingrediente = ingrediente;
		description = "el peperoni no es salchichon";
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	public void getDescription(){
		System.out.println(description);
	}

}
