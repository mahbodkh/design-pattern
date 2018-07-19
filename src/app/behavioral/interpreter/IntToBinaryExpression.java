package app.behavioral.interpreter;

/*
 * created by Mahbod Kh with ❤️.
 */


public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(this.i);
    }

}