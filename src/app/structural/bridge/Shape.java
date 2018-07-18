package app.structural.bridge;

/*
 * created by Mahbod Kh with ❤️.
 */

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void fillColor();

}
