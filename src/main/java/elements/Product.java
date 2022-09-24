package elements;

public class Product {
    private String name;
    private double price;
    private int stock;
    private double weight;

    public Product(String name, double price, int stock, double weight) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public double getWeight() {
        return weight;
    }
}
