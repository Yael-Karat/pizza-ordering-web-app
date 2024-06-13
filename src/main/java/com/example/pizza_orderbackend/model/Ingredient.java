package com.example.pizza_orderbackend.model;

/**
 * Ingredient class represents an ingredient with a name and an image.
 */
public class Ingredient {
    private String name;
    private String image;

    /**
     * Default constructor.
     */
    public Ingredient() {}

    /**
     * Parameterized constructor.
     *
     * @param name the name of the ingredient.
     * @param image the image of the ingredient.
     */
    public Ingredient(String name, String image) {
        this.name = name;
        this.image = image;
    }

    // Getters and Setters

    /**
     * Gets the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the image.
     *
     * @return the image.
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the image.
     *
     * @param image the image to set.
     */
    public void setImage(String image) {
        this.image = image;
    }
}
