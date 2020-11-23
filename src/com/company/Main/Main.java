package com.company.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit = false;

    public static void main(String[] args) {

        menu();
        do {
            userEntry();
        } while (!quit);


    }


    // Printing the options on the menu
    private static void menu() {
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
                    // object client
                    break;
                case 2:
                    //object admin
                    break;
                case 3:
                    quit = true;
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Your user input is not correct, please try again");
            menu();

        }
    }
}