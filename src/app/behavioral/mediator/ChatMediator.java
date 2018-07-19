package app.behavioral.mediator;

/*
 * created by Mahbod Kh with ❤️.
 */

public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
