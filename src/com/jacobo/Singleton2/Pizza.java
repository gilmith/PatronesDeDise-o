package com.jacobo.Singleton2;

public abstract class Pizza {
	
	private String ingrediente, name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggie veggie[];
	protected Cheese cheese;
	protected Peperoni peperoni;
	protected Clams clams;
	
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("hornear");
	}
	
	public void cut(){
		System.out.println("cortar la pizza");
	}
	
	public void box(){
		System.out.println("lo mete en la caja");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

}
