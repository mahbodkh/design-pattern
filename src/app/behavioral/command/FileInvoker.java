package app.behavioral.command;

/*
 * created by Mahbod Kh with ❤️.
 */


public class FileInvoker {

    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
