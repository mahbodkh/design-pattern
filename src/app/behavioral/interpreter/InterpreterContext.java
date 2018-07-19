package app.behavioral.interpreter;

/*
 * created by Mahbod Kh with ❤️.
 */


public class InterpreterContext {

    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}