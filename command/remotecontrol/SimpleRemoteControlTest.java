package command.remotecontrol;

import command.remotecontrol.commands.GarageDoorUpCommand;
import command.remotecontrol.commands.LightOnCommand;
import command.remotecontrol.vendors.GarageDoor;
import command.remotecontrol.vendors.Light;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("Door");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageUp);
        remote.buttonWasPressed();
    }
}
