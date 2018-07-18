package app.structural.composite;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape squareTwo = new Square();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(squareTwo);
        drawing.add(squareTwo);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(square);
        drawing.add(circle);
        drawing.draw("Green");
    }
}
