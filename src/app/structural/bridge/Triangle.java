package app.structural.bridge;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Triangle extends Shape {


    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.println("Triangle filled with color ");
        color.fillColor();
    }
}
