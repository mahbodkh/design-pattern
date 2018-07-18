package app.structural.adapter;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) {
        testPaymentAdapterOne();
        testPaymentAdapterTwo();
    }


    private static void testPaymentAdapterOne() {
        PaymentAdapter payment = new PaymentAdapterImplOne();
        Bank mellat = getBank(payment, 1);
        Bank passargad = getBank(payment, 2);
        Bank melli = getBank(payment, 3);

        System.out.println("mellat bank using One Adapter=" + mellat.getName());
        System.out.println("passargad bank using One Adapter=" + passargad.getName());
        System.out.println("melli bank using One Adapter=" + melli.getName());
    }


    private static void testPaymentAdapterTwo() {
        PaymentAdapter payment = new PaymentAdapterImplTwo();
        Bank mellat = getBank(payment, 1);
        Bank passargad = getBank(payment, 2);
        Bank melli = getBank(payment, 3);

        System.out.println("mellat bank using Two Adapter=" + mellat.getName());
        System.out.println("passargad bank using Two Adapter=" + passargad.getName());
        System.out.println("melli bank using Two Adapter=" + melli.getName());
    }


    private static Bank getBank(PaymentAdapter adapter, int i) {
        switch (i) {
            case 1:
                return adapter.getMellatBank();
            case 2:
                return adapter.getPassargadBank();
            case 3:
                return adapter.getMelliBank();
            default:
                return adapter.getMelliBank();
        }


    }
}
