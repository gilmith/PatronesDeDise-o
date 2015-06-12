package com.jacobo.State;

public class GumballMachineTestDrive {
	
	public static void main(String[] args){
		GumBallMachine machine = new GumBallMachine(3);
		
		System.out.println("maquina de chicles");
		
		machine.insertQuarter();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.ejectQuarter();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.turnCrank();
	}

}
