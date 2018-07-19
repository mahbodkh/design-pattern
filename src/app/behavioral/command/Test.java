package app.behavioral.command;

/*
 * created by Mahbod Kh with ❤️.
 */


import app.behavioral.command.action.CloseFileCommand;
import app.behavioral.command.action.OpenFileCommand;
import app.behavioral.command.action.WriteFileCommand;

public class Test {
    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
