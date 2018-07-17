package app.creational.factory.model;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Cat extends Animal {

    private String color;
    private String food;
    private String name;

    public Cat(String color, String food, String name) {
        this.color = color;
        this.food = food;
        this.name = name;
    }

    @Override
    public String getFeed() {
        return "Mio-Mio";
    }

    @Override
    public String getName() {
        return "I'm Cat";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", food='" + food + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
