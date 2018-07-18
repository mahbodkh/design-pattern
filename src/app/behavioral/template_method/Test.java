package app.behavioral.template_method;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
