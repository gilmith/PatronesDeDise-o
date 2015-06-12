package com.jacobo.Singleton1;

public class MagaritaPizza extends Pizza {

	private String ingrediente;
	
	public MagaritaPizza(){
		this.ingrediente = "tomate";
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	
}
