package app.behavioral.chain_of_responsibility;

/*
 * created by Mahbod Kh with ❤️.
 */

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
