package app.creational.factory.model;

/*
 * created by Mahbod Kh with ❤️.
 */


public class Dog extends Animal {


    private String color;
    private String food;
    private String name;

    public Dog(String color, String food, String name) {
        this.color = color;
        this.food = food;
        this.name = name;
    }

    @Override
    public String getFeed() {
        return "Hap-Hap";
    }

    @Override
    public String getName() {
        return "I'm Dog";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", food='" + food + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
