package com.jacobo.Template1;

/**
 * una forma de usar el Template Method es con la interfaz comparable con ella lo que hago es 
 * override el metodo compareTo para que los objetos puedan ser ordenados en el Collections.sort
 * o en el Arrays.sort. 
 * 
 * El algorithmo esta en el collection, pero lo que hago con el Template es sobreescribir uno de 
 * los metodos de los que consta, el Comparable.
 * @author jake
 *
 */

public class Duck implements Comparable<Duck> {
	
	private int weight;
	@SuppressWarnings("unused")
	private String name;
	
	public Duck(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	

	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	@Override
	public int compareTo(Duck o) {
		if(this.weight < o.getWeight()){
			return -1;
		} else if(this.weight == o.getWeight()){
			return 0;
		} else {
			return 1;
		}
	}

}
