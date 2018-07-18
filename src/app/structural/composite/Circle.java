package app.structural.composite;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Circle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Drawing Circle with color " + color);
    }
}
