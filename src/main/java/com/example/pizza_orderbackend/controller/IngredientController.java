package com.example.pizza_orderbackend.controller;

import com.example.pizza_orderbackend.model.Ingredient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * IngredientController class handles the HTTP requests related to ingredients.
 */
@RestController
@RequestMapping("/api")
public class IngredientController {

    /**
     * Retrieves a list of available ingredients.
     *
     * @return List of ingredients with name and image.
     */
    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients() {
        return Arrays.asList(
                new Ingredient("Sauce", "images/sauce.png"),
                new Ingredient("Cheese", "images/cheese.png"),
                new Ingredient("Corn", "images/corn.png"),
                new Ingredient("Mushrooms", "images/mushrooms.png"),
                new Ingredient("Peppers", "images/peppers.png"),
                new Ingredient("Onions", "images/onions.png")
        );
    }
}
