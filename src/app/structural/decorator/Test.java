package app.structural.decorator;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) {
        Animal wild = new Lion(new Cat());
        wild.eat();
        System.out.println("\n*****");

        Animal pet = new Lion(new Tiger(new Cat()));
        pet.eat();
    }
}
