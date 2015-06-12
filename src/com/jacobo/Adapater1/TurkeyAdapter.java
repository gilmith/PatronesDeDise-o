package com.jacobo.Adapater1;

/**
 * Clase adaptador para el pavo, ahora lo que hago es disfrazar a un pavo de pato
 * @author jake
 *
 */

public class TurkeyAdapter implements Duck{
	
	private Turkey turkey;
	
	/**
	 * lo que hago es un constructor que necesite un pavo como argumento
	 * @param turkey
	 */
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	
	/**
	 * En los metodos del pato uso por dentro los del pavo
	 */

	@Override
	public void quack() {
		
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
		
	}

}
