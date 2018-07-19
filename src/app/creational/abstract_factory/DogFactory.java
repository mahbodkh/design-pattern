package app.creational.abstract_factory;

import app.creational.abstract_factory.model.Animal;
import app.creational.abstract_factory.model.Dog;

public class DogFactory implements AnimalAbstractFactory {

    private String color;
    private String feed;
    private String name;

    public DogFactory(String color, String feed, String name) {
        this.color = color;
        this.feed = feed;
        this.name = name;
    }

    @Override
    public Animal createAnimal() {
//        return new Dog(color, feed, name);
        return null;
    }

}
