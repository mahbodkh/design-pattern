package app.structural.bridge;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());
        triangle.fillColor();

        Shape circle = new Circle(new Green());
        circle.fillColor();
    }

}
