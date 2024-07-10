package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> list;

    // Costruttore che inizializza alcuni prodotti di esempio
    public ProductService() {
        this.list = new ArrayList<>();
        list.add(new Product("Pasta", "1", 2.50));
        list.add(new Product("Farina", "2", 2.00));
        list.add(new Product("Uova", "3", 6.00));
        list.add(new Product("Sale", "4", 4.00));
        list.add(new Product("Fanta", "5", 4.00));
    }

    // Visualizzare lista prodotti
    public List<Product> getList() {
        return list;
    }

    // Aggiungere prodotto
    public void addProduct(Product product) {
        list.add(product);
    }

    // Metodo per aggiornare un prodotto
    public boolean updateProduct(String id, Product updatedProduct) {
        Optional<Product> existingProduct = list.stream().filter(d -> d.getID().equalsIgnoreCase(id)).findFirst();
        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setID(updatedProduct.getID());
            product.setPrice(updatedProduct.getPrice());
            return true;
        }
        return false;
    }

    // Metodo per rimuovere un prodotto
    public boolean removeProduct(String id) {
        return list.removeIf(d -> d.getID().equalsIgnoreCase(id));
    }
}
