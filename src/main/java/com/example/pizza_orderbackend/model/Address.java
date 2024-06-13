package com.example.pizza_orderbackend.model;

/**
 * Address class represents the address details of an order.
 */
public class Address {
    private String street;
    private String houseNumber;
    private String city;

    /**
     * Default constructor.
     */
    public Address() {}

    /**
     * Parameterized constructor.
     *
     * @param street the street of the address.
     * @param houseNumber the house number of the address.
     * @param city the city of the address.
     */
    public Address(String street, String houseNumber, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    // Getters and Setters

    /**
     * Gets the street.
     *
     * @return the street.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street.
     *
     * @param street the street to set.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the house number.
     *
     * @return the house number.
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the house number.
     *
     * @param houseNumber the house number to set.
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Gets the city.
     *
     * @return the city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the city to set.
     */
    public void setCity(String city) {
        this.city = city;
    }
}
