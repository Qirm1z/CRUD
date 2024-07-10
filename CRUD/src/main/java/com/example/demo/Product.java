package com.example.demo;

public class Product {
    private String name;
    private String id;
    private double price;

    // Costruttore
    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
