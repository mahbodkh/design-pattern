package app.behavioral.command;

/*
 * created by Mahbod Kh with ❤️.
 */


public class MacOsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Macintosh OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Macintosh OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Macintosh OS");
    }

}
