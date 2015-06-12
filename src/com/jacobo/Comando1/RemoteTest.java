package com.jacobo.Comando1;

public class RemoteTest {

	public static void main(String[] args) {
		LightsOnCommand lightCommand = new LightsOnCommand(new Lights());
		lightCommand.execute();
	}

}
