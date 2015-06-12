package com.jacobo.Comando1;

public class LightsOnCommand implements Command {
	
	private Lights light;
	
	public LightsOnCommand(Lights light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();

	}

}
