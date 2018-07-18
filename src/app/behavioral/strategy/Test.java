package app.behavioral.strategy;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {

    public static void main(String[] args) {
        Shopping cart = new Shopping();

        Product iPhone = new Product(1000, "iphone");
        Product camera = new Product(2000, "camera");

        cart.addItem(iPhone);
        cart.addItem(camera);


        cart.pay(new MellatStrategy("mahbod@gmail.com", "123456"));
        cart.pay(new PassargadStrategy("mahbod@gmail.com", "123456"));

        cart.pay(new CreditCardStrategy("Mahbod", "1234567890123456", "786", "09/99"));
    }


}
