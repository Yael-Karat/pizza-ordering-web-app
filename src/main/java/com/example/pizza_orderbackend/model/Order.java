package com.example.pizza_orderbackend.model;

import java.util.List;

/**
 * Order class represents an order with a code, customer details, address, phone number, and a list of pizzas.
 */
public class Order {
    private String code;
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private List<Pizza> pizzas;

    /**
     * Default constructor.
     */
    public Order() {}

    /**
     * Parameterized constructor.
     *
     * @param code the order code.
     * @param firstName the first name of the customer.
     * @param lastName the last name of the customer.
     * @param address the address of the customer.
     * @param phoneNumber the phone number of the customer.
     * @param pizzas the list of pizzas in the order.
     */
    public Order(String code, String firstName, String lastName, Address address, String phoneNumber, List<Pizza> pizzas) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.pizzas = pizzas;
    }

    // Getters and Setters

    /**
     * Gets the code.
     *
     * @return the code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code the code to set.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the first name.
     *
     * @return the first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the address.
     *
     * @return the address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the address to set.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Gets the phone number.
     *
     * @return the phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     *
     * @param phoneNumber the phone number to set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the list of pizzas.
     *
     * @return the list of pizzas.
     */
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    /**
     * Sets the list of pizzas.
     *
     * @param pizzas the list of pizzas to set.
     */
    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
