package app.behavioral.stage;

/*
 * created by Mahbod Kh with ❤️.
 */


public class TVContext implements State {

    private State tvState;

    public State getState() {
        return this.tvState;
    }

    public void setState(State state) {
        this.tvState = state;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

}