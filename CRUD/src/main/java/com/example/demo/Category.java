package com.example.demo;

public class Category {
    private String name;
    private String id;

    // Costruttore
    public Category(String name, String id) {
        this.name = name;
        this.id = id;
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
}
