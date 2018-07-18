package app.structural.decorator;

/*
 * created by Mahbod Kh with ❤️.
 */

public class AnimalDecorator implements Animal {

    protected Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        this.animal.eat();
    }
}
