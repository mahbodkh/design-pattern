package app.structural.proxy;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {

    public static void main(String[] args) {
        CommandService service = new CommandServiceProxy("mahbod", "654321");
//        CommandService service = new CommandServiceProxy("mahbod", "123456");
        try {
            service.runCommand("ls -ltr");
            service.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
