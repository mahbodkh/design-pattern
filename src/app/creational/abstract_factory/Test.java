package app.creational.abstract_factory;


/*
 * created by Mahbod Kh with ❤️.
 */

import app.creational.abstract_factory.model.Animal;

public class Test {


    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Animal cat = AnimalFactory.getAnimal(new CatFactory("BLACK", "MILK", "Pou"));
        Animal dog = AnimalFactory.getAnimal(new DogFactory("BLACK-WHITE", "MILK", "Doggy"));
        System.out.println("AbstractFactory CAT is ::" + cat);
        System.out.println("AbstractFactory DOG is ::" + dog);
    }

}
