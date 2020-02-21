package command.remotecontrol.commands;

import command.remotecontrol.Command;
import command.remotecontrol.vendors.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
