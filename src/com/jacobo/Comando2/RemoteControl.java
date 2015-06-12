package com.jacobo.Comando2;

public class RemoteControl {
	
	private Command[] onCommands;
	private Command[] offCommands;
	
	public RemoteControl(){
		onCommands = new Command[2];
		offCommands = new Command[2];
		
		Command noCommand = new NoCommand();
		for(int i = 0 ; i < 2; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPressed(int slot){
		onCommands[slot].execute();
	}
	
	public void offButtonPresed(int slot){
		offCommands[slot].execute();
	}

	
	
}
