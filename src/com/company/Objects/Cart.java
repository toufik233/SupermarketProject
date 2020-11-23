package com.company.Objects;

import com.company.Menus.Management;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cart {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit = false;

    public Cart() {
        System.out.println("0 to return");
        Product.printAllProducts();
        myMenuLoop();
    }

    private static void myMenuLoop() {
        do {
            userEntry();
        } while (!quit);
    }


    private static void userEntry() {
        try {
            int userChoice = scanner.nextInt();
            // Swich case for user choice
            switch (userChoice) {
                case 0:
                    quit = true;
                default:
                    //

                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Your user input is not correct, please try again");
            scanner.nextLine();

        }

    }

}
