package com.company.Menus;

import com.company.Menus.AdminMenu;
import com.company.Menus.ClientMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Management {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit = false;

    public Management() {
        myMenu();
        myMenuLoop();
    }

    private static void myMenuLoop(){
        do {
            userEntry();
        } while (!quit);
    }


    // Printing the options on the menu
    public static void myMenu() {
        System.out.println("\n \n What do you want to do ? \n");
        System.out.println("1) Log in as a client");
        System.out.println("2) Log in as an administrator");
        System.out.println("3) Exit");
    }

    private static void userEntry() {
        try {
            int userChoice = scanner.nextInt();
            // Swich case for user choice
            switch (userChoice) {
                case 1:
                    // client menu
                    new ClientMenu();
                    break;
                case 2:
                    // admin menu
                    new AdminMenu();
                    break;
                case 3:
                    quit = true;
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
