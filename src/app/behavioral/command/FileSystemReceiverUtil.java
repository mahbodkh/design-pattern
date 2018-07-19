package app.behavioral.command;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if (osName.contains("MacOS")) {
            return new MacOsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }

}
