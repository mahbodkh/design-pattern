package app.structural.proxy;

/*
 * created by Mahbod Kh with ❤️.
 */

public class CommandServiceImpl implements CommandService {

    @Override
    public void runCommand(String command) throws Exception {
        Runtime.getRuntime().exec(command);
        System.out.println(" : " + command + ": command executed.");
    }
}
