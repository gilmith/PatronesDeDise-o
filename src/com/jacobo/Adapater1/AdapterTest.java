package com.jacobo.Adapater1;

public class AdapterTest {

	public static void main(String[] args) {
		System.out.println("el pavo va a llamar a los metodos del pato");
		
		TurkeyAdapter pavo = new TurkeyAdapter(new WildTurkey());
		pavo.quack();

	}

}
