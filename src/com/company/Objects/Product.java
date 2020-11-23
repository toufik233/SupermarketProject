package com.company.Objects;

import java.util.Scanner;
import java.util.SortedMap;

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

    /*public static void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name");
        String nameProductInput = scanner.next();
        System.out.println("Enter product price");
        float priceProductInput = scanner.nextFloat();
        System.out.println("Enter product quantity");
        int quantityProductInput = scanner.nextInt();
        System.out.println("Product added");
        Product myProduct = new Product(nameProductInput, priceProductInput, quantityProductInput);
    }*/

}
