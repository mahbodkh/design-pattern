package app.behavioral.command.action;

/*
 * created by Mahbod Kh with ❤️.
 */


import app.behavioral.command.FileSystemReceiver;

public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}
