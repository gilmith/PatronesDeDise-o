package com.jacobo.Adapater1;

/**
 * subclase pato, es un tipo de pato en concreto
 * @author jake
 *
 */

public class MallordDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("quack");

	}

	@Override
	public void fly() {
		System.out.println("flies long distance");

	}

}
