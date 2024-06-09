package com.example.pizza_orderbackend.model;

import java.util.List;

public class Pizza {
    private List<String> ingredients;

    // Constructors
    public Pizza() {}

    public Pizza(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    // Getters and Setters
    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
