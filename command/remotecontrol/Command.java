package command.remotecontrol;

public interface Command {
    void execute();
    void undo();
}
