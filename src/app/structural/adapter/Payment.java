package app.structural.adapter;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Payment {

    private static final String PASSARGAD = "passargad";
    private static final String MELLAT = "mellat";

    public Bank getBank() {
        return new Bank(PASSARGAD);
    }
}
