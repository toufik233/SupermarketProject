package com.company.Objects;

public class Product {

    private String name;
    private float price;
    private int quantity;

    public Product(String myName, float myPrice, int myQuantity) {
        this.name = myName;
        this.price = myPrice;
        this.quantity = myQuantity;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
