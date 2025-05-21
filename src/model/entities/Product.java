package model.entities;

public class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double amount) {
        this.name = name;
        this.price = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
