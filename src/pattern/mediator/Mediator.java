package pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public void relay(Product product, String s) {
        for (Product sub : products) {
            if (!sub.equals(product)) {
                product.receive(s);
            }
        }
    }
}
