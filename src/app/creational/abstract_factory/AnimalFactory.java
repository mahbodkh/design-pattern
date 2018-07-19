package app.creational.abstract_factory;

import app.creational.abstract_factory.model.Animal;

public class AnimalFactory {
    public static Animal getAnimal(AnimalAbstractFactory factory) {
        return factory.createAnimal();
    }
}
