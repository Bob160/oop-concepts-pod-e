package stakeholders;

import earth.people.Human;
import elements.Product;
import elements.Receipt;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Human {

    private List<Product> productsPurchased = new ArrayList<>();

    private List<Receipt> purchaseReceipts = new ArrayList<>();

    public Customer(String name, int age) {
        super(name, age);
    }

    public void buyProduct(Product product, Receipt receipt) {
        productsPurchased.add(product);
        purchaseReceipts.add(receipt);
    }

    public List<Product> getMyPurchasedProduct() {
        return productsPurchased;
    }

    public List<Receipt> getPurchaseReceipts() {
        return purchaseReceipts;
    }
}
