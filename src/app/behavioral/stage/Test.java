package app.behavioral.stage;

/*
 * created by Mahbod Kh with ❤️.
 */


public class Test {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();

    }
}
