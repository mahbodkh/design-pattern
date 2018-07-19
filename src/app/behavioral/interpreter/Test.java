package app.behavioral.interpreter;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public InterpreterContext ic;

    public Test(InterpreterContext i) {
        this.ic = i;
    }

    public static void main(String args[]) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Test ec = new Test(new InterpreterContext());
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));

    }

    public String interpret(String str) {
        Expression exp = null;
        //create rules for expressions
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else return str;

        return exp.interpret(ic);
    }
}
