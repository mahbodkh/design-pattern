package app.structural.bridge;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Circle extends Shape {


    public Circle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.println("Circle filled the color ");
        color.fillColor();
    }
}
