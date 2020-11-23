package com.company.Menus;

import com.company.Objects.ListProducts;
import com.company.Objects.Product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminMenu {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit = false;

    public AdminMenu() {
        myAdminMenu();
        myMenuLoop();
    }

    private static void myMenuLoop() {
        do {
            userEntry();
        } while (!quit);
    }

    private static void myAdminMenu() {
        System.out.println("\n \n What do you want to do ? \n");
        System.out.println("1) List products");
        System.out.println("2) Add a product");
        System.out.println("3) Return");
    }

    private static void userEntry() {
        try {
            int userChoice = scanner.nextInt();
            // Switch case for user choice
            switch (userChoice) {
                case 1:
                    // list products
                    Product.printAllProducts();
                    System.out.println("\n Type 2 to add another product, 3 to return to the main menu");
                    break;
                case 2:
                    //add a product
                    Product.addProduct();
                    break;
                case 3:
                    //return - get back to the main menu
                    quit = true;
                    Management.myMenu();
                    break;
                default:
                    System.out.println("Invalid choice, please select one of the options above");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Your user input is not correct, please try again");
            scanner.nextLine();

        }

    }

}
