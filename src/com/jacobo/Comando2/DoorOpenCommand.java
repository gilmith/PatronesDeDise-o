package com.jacobo.Comando2;

public class DoorOpenCommand implements Command {
	
	private Door door;
	
	public DoorOpenCommand(Door door){
		this.door = door;
	}

	@Override
	public void execute() {
		door.open();

	}

}
