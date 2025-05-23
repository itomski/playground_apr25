package de.lubowiecki.patterns.factorymethod.beispiel1;

public class Brott implements Product {

    private String description;

    private double price;

    public Brott(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void use() {
        System.out.println("Wird geschnitten und belegt");
    }
}
