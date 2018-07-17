package app.creational.factory;

import app.creational.factory.model.Animal;
import app.creational.factory.model.Cat;
import app.creational.factory.model.Dog;

/*
 * created by Mahbod Kh with ❤️.
 */

public class AnimalFactory {
    public static Animal getAnimal(String type, String color, String feed, String name) {
        if ("DOG".equalsIgnoreCase(type)) return new Dog(color, feed, name);
        else if ("CAT".equalsIgnoreCase(type)) return new Cat(color, feed, name);
        return null;
    }
}


