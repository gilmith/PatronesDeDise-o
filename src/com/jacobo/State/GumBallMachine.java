package com.jacobo.State;

public class GumBallMachine {
	
	private final static int SOLD_OUT = 0;
	private final static int NO_QUARTER = 1;
	private final static int HAS_QUARTER = 2;
	private final static int SOLD = 3;
	
	private int state = SOLD_OUT;
	private int count;
	
	public GumBallMachine(int count){
		
		this.count = count;
		
	}
	/**
	 * La version mas cutre del patron State lo que hace es recorrer con metodos con muchos if
	 * para realizar el recorrido de una matriz de transicion de estados
	 */
	
	
	public void insertQuarter(){
		
		if( state == HAS_QUARTER){
			System.out.println("You can't insert another quarter");
		} else if ( state == SOLD_OUT ){
			System.out.println("You acn´t insert a quarter, the machine is sold out");
		} else if ( state == SOLD ){
			System.out.println("Please wait, we're already giving you a gumball");
		} else if ( state == NO_QUARTER ){
			state = HAS_QUARTER;
			System.out.println("You inserterd a quarter");
		}
		
	}
	
	public void ejectQuarter(){
		if ( state == HAS_QUARTER ){
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if ( state == NO_QUARTER ){	
			System.out.println("You haven´t inserted a quarter");
		} else if ( state == SOLD ){
			System.out.println("sorry you already turned the crank");
		} else if ( state == SOLD_OUT ){
			System.out.println("You can´t eject, you haven´t inserted a quarter");
		}
	}
	
	public void turnCrank(){
		if ( state ==  SOLD ){
			System.out.println("Turning twice doesn´t get you another gumball");
		} else if ( state == NO_QUARTER ){
			System.out.println("You turned but thre´s no quarter");
		} else if ( state == SOLD_OUT ){
			System.out.println("You turned but thre´s no GUMBALL");
		} else if ( state == HAS_QUARTER ){ 
			System.out.println("You turned...");
			state = SOLD;
			dispense();
		}
	}
	public void dispense() {
		
		if( state == SOLD ){
			System.out.println("A gumball comes rolling out the solt");
			count--;
			if ( count == 0 ){
				System.out.println("out of gumball");
				state = SOLD_OUT;
			} else { 
				state = NO_QUARTER;
			}
		} else if ( state == NO_QUARTER ){
			System.out.println("you need to pay first");
		} else if ( state == SOLD_OUT ) {
			System.out.println("No gumball dispensed");
		}
		
	}

}
