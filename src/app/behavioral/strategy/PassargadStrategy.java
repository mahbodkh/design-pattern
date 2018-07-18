package app.behavioral.strategy;

/*
 * created by Mahbod Kh with ❤️.
 */

public class PassargadStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PassargadStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Passargad Bank.");
    }
}
