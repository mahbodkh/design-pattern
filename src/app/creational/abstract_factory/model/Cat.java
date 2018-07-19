package app.creational.abstract_factory.model;

/*
 * created by Mahbod Kh with ❤️.
 */

import app.creational.factory.model.Animal;

public class Cat extends Animal {

    private String color;
    private String feed;
    private String name;

    public Cat(String color, String feed, String name) {
        this.color = color;
        this.feed = feed;
        this.name = name;
    }

    @Override
    public String getFeed() {
        return this.feed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", feed='" + feed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
