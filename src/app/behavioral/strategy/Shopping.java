package app.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Shopping {

    List<Product> products;

    public Shopping() {
        this.products = new ArrayList<Product>();
    }

    public void addItem(Product product) {
        this.products.add(product);
    }

    public void removeItem(Product product) {
        this.products.remove(product);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product item : products) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
