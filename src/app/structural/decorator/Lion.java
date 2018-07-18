package app.structural.decorator;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Lion extends AnimalDecorator {

    public Lion(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" The Lion is here.");
    }
}
