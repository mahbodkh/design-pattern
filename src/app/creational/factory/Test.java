package app.creational.factory;

import app.creational.factory.model.Animal;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog", "brown", "bone", "foggy");
        Animal cat = AnimalFactory.getAnimal("cat", "black", "meat", "persian");
        System.out.println("Factory Cat is :: " + cat);
        System.out.println("Factory Dog is :: " + dog);
    }
}
