package app.behavioral.mediator;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Mahbod");
        User user2 = new UserImpl(mediator, "Kevin");
        User user3 = new UserImpl(mediator, "Lisa");
        User user4 = new UserImpl(mediator, "Rose");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send(" Hi All");

    }
}
