package stakeholders;

import earth.people.Human;
import elements.Product;
import elements.Receipt;

import java.util.Date;
import java.util.UUID;

public class Cashier extends Human {
    public Cashier(String name, int age) {
        super(name, age);
    }

    // to make more interesting pass in a list of products
    public void sellProduct(Product product, Customer customer, int quantity) {
        Receipt receipt = generateReceiptForProduct(product, quantity);
        customer.buyProduct(product, receipt);
    }

    private Receipt generateReceiptForProduct(Product product, int quantity) {
        return new Receipt(
                product.getName(),
                new Date(),
                UUID.randomUUID().toString(),
                product.getPrice(),
                quantity
        );
    }
}
