package app.structural.decorator;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Tiger extends AnimalDecorator {

    public Tiger(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" The Tiger is Here.");
    }
}
