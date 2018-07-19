package app.behavioral.command.action;

/*
 * created by Mahbod Kh with ❤️.
 */


import app.behavioral.command.FileSystemReceiver;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.openFile();
    }

}