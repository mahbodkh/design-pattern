package app.structural.adapter;

/*
 * created by Mahbod Kh with ❤️.
 */

public class PaymentAdapterImplTwo implements PaymentAdapter {

    private Payment payment = new Payment();

    @Override
    public Bank getMellatBank() {
        Bank mellat = payment.getBank();
        return checkBanking(mellat);
    }

    @Override
    public Bank getPassargadBank() {
        return payment.getBank();
    }

    @Override
    public Bank getMelliBank() {
        Bank melli = payment.getBank();
        return checkBanking(melli);
    }

    private Bank checkBanking(Bank bank) {
        return new Bank("This is " + bank.getName());
    }
}
