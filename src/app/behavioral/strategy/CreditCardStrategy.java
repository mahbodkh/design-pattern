package app.behavioral.strategy;

/*
 * created by Mahbod Kh with ❤️.
 */

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv2;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv2, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv2 = cvv2;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }

}
