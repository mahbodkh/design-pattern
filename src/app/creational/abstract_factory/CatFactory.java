package app.creational.abstract_factory;

/*
 * created by Mahbod Kh with ❤️.
 */


import app.creational.abstract_factory.model.Animal;
import app.creational.abstract_factory.model.Cat;

public class CatFactory implements AnimalAbstractFactory {

    private String color;
    private String feed;
    private String name;

    public CatFactory(String color, String feed, String name) {
        this.color = color;
        this.feed = feed;
        this.name = name;
    }


    @Override
    public Animal createAnimal() {
//        return new Cat(color, feed, name);
        return null;
    }

}
