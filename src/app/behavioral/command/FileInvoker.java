package app.behavioral.command;

/*
 * created by Mahbod Kh with ❤️.
 */


import app.behavioral.command.action.Command;

public class FileInvoker {

    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
