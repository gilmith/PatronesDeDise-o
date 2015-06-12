package com.jacobo.Comando2;

import java.util.Scanner;

public class Remote {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		LightOnCommand lightOn = new LightOnCommand(new Light());
		LightOffCommand lightOffCommand = new LightOffCommand(new Light());
		DoorOpenCommand doorOpen = new DoorOpenCommand(new Door());
		DoorCloseCommand doorClose = new DoorCloseCommand(new Door());
		
		
			
		remoteControl.setCommand(0, lightOn, lightOffCommand);
		remoteControl.setCommand(1, doorOpen, doorClose);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("pulsa el boton");
		remoteControl.onButtonPressed(Integer.valueOf(sc.next()));
	
		
		
	}

}
