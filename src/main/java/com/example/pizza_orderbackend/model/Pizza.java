package com.example.pizza_orderbackend.model;

import java.util.List;

/**
 * Pizza class represents a pizza with a list of ingredients and a price.
 */
public class Pizza {
    private List<String> ingredients;
    private double price;

    /**
     * Default constructor.
     */
    public Pizza() {}

    /**
     * Parameterized constructor.
     *
     * @param ingredients the list of ingredients.
     * @param price the price of the pizza.
     */
    public Pizza(List<String> ingredients, double price) {
        this.ingredients = ingredients;
        this.price = price;
    }

    // Getters and Setters

    /**
     * Gets the list of ingredients.
     *
     * @return the list of ingredients.
     */
    public List<String> getIngredients() {
        return ingredients;
    }

    /**
     * Sets the list of ingredients.
     *
     * @param ingredients the list of ingredients to set.
     */
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Gets the price.
     *
     * @return the price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @param price the price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
