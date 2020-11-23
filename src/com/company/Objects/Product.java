package com.company.Objects;

import com.company.Menus.AdminMenu;

import java.util.Scanner;

public class Product {


    private static ListProducts myProductList = new ListProducts();
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


    public static ListProducts addProduct() {

        boolean isInProgress = true;

        Product myProduct;

        while (isInProgress) {

            System.out.println("-------- NEW PRODUCT --------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product name");
            String nameProductInput = scanner.next();
            System.out.println("Enter product price");
            float priceProductInput = scanner.nextFloat();
            System.out.println("Enter product quantity");
            int quantityProductInput = scanner.nextInt();
            System.out.println("Product added");


            String[] productTab = {nameProductInput, String.valueOf(priceProductInput), String.valueOf(quantityProductInput)};
            System.out.println("Enter the word quit to get back at the menu, else type continue to add a new product");
            String resultInput = scanner.next();

            if (resultInput.equalsIgnoreCase("quit")) {
                isInProgress = false;
                myProduct = new Product(productTab[0], Float.parseFloat(productTab[1]), Integer.parseInt(productTab[2]));
                myProductList.getListOfProducts().add(myProduct);
                new AdminMenu();
            } else if (resultInput.equalsIgnoreCase("continue")) {
                myProduct = new Product(productTab[0], Float.parseFloat(productTab[1]), Integer.parseInt(productTab[2]));
                myProductList.getListOfProducts().add(myProduct);
            } else {
                System.out.println("Your user input is not correct, please try again");
                isInProgress = false;
                new AdminMenu();
            }


        }
        return myProductList;

    }

    public static void printAllProducts() {
        if (myProductList.getListOfProducts().size() == 0) {
            System.out.println("There's no product stored in the supermarket");
        } else {
            System.out.println("-------- PRODUCT LIST --------");
            for (int i = 0; i < myProductList.getListOfProducts().size(); i++) {
                System.out.println((i+1)+") NAME : " + myProductList.getListOfProducts().get(i).getName() + ", PRICE : " + myProductList.getListOfProducts().get(i).getPrice()
                        + "€, QUANTITY : " + myProductList.getListOfProducts().get(i).getQuantity());
            }
        }
    }

}
