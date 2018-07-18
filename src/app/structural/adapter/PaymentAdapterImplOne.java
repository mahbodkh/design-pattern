package app.structural.adapter;

/*
 * created by Mahbod Kh with ❤️.
 */

public class PaymentAdapterImplOne extends Payment implements PaymentAdapter {

    @Override
    public Bank getMellatBank() {
        Bank mellat = getBank();
        return mellat;
    }

    @Override
    public Bank getPassargadBank() {
        Bank passargad = getBank();
        return passargad;
    }

    @Override
    public Bank getMelliBank() {
        Bank melli = getBank();
        return melli;
    }


}

