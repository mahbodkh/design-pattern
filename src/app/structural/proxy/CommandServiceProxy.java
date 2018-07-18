package app.structural.proxy;

/*
 * created by Mahbod Kh with ❤️.
 */

public class CommandServiceProxy implements CommandService {

    private boolean isAdmin;
    private CommandService service;

    public CommandServiceProxy(String user, String pwd) {
        if ("mahbod".equals(user) && "123456".equals(pwd)) isAdmin = true;
        service = new CommandServiceImpl();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (isAdmin) {
            service.runCommand(command);
        } else {
            if (command.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                service.runCommand(command);
            }
        }
    }
}
