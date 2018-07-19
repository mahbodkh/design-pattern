package app.behavioral.command.action;

/*
 * created by Mahbod Kh with ❤️.
 */


import app.behavioral.command.Command;
import app.behavioral.command.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}