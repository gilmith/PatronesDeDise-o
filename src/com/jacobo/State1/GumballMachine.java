package com.jacobo.State1;

public class GumballMachine {
	
	private SoldState soldState;
	private HasQuarterState hasQuarterState;
	private SoldOutState soldOutState;
	private NoQuarterState noQuarterState;
	private State state;
	private int count;
	
	public GumballMachine(int count){
		this.count = count;
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		if( count > 0 ){
			state = noQuarterState;
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	

}
