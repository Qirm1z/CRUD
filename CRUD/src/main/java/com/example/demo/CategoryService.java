package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private List<Category> list;

    // Costruttore che inizializza alcune categorie di esempio
    public CategoryService() {
        this.list = new ArrayList<>();
        list.add(new Category("Alimentari", "1"));
        list.add(new Category("Bevande", "2"));
        list.add(new Category("Surgelati", "3"));
        list.add(new Category("Igiene", "4"));
    }

    // Visualizzare lista categorie
    public List<Category> getList() {
        return list;
    }

    // Aggiungere categoria
    public void addCategory(Category category) {
        list.add(category);
    }

    // Metodo per aggiornare una categoria
    public boolean updateCategory(String id, Category updatedCategory) {
        Optional<Category> existingCategory = list.stream().filter(d -> d.getID().equalsIgnoreCase(id)).findFirst();
        if (existingCategory.isPresent()) {
            Category category = existingCategory.get();
            category.setName(updatedCategory.getName());
            category.setID(updatedCategory.getID());
            return true;
        }
        return false;
    }

    // Metodo per rimuovere una categoria
    public boolean removeCategory(String id) {
        return list.removeIf(d -> d.getID().equalsIgnoreCase(id));
    }
}
