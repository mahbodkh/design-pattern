package app.creational.builder;

/*
 * created by Mahbod Kh with ❤️.
 */


public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal.AnimalBuilder("lion", 12).setColor("yellow").build();
        System.out.println(animal);
    }
}
