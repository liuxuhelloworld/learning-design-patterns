package command.remotecontrol.commands;

import command.remotecontrol.Command;
import command.remotecontrol.vendors.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setCd();
    }
}
