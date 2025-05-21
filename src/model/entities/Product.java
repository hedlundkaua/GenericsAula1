package model.entities;

public class Product implements Comparable<Product> {
    private String name;
    //USAR SÓ METODO COM LETRA MAIUSCULA
    private Double price;

    public Product() {
    }

    public Product(String name, Double amount) {
        this.name = name;
        this.price = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
