package app.behavioral.strategy;

/*
 * created by Mahbod Kh with ❤️.
 */

public class MellatStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public MellatStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Mellat Bank.");
    }

}

