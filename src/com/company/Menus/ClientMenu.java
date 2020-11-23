package com.company.Menus;

import com.company.Main.Main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ClientMenu {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit = false;

    public ClientMenu() {
        myClientMenu();
        myMenuLoop();
    }

    private static void myMenuLoop(){
        do {
            userEntry();
        } while (!quit);
    }

    private static void myClientMenu() {
        System.out.println("\n \n What do you want to do ? \n");
        System.out.println("1) List products");
        System.out.println("2) My cart");
        System.out.println("3) Logout");
    }
    private static void userEntry() {
        try {
            int userChoice = scanner.nextInt();
            // Swich case for user choice
            switch (userChoice) {
                case 1:
                    // list products
                    break;
                case 2:
                    //my cart
                    break;
                case 3:
                    //logout - get back to the main menu
                    quit = true;
                    Main.menu();
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
