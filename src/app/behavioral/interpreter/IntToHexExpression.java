package app.behavioral.interpreter;

/*
 * created by Mahbod Kh with ❤️.
 */


public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(i);
    }

}