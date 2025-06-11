package com.pluralsight;

public class MainScreen {

    public static void displayWelcome() {
        System.out.println("\n=== WELCOME TO DELI-cious! ===\n");
        System.out.println("1. Start a new order");
        System.out.println("2. Exit\n");
    }

    public static void displayMenu(Menu menu) {
        System.out.println("\n--- MENU ---");
        System.out.println(menu); // Assuming Menu has a toString()
    }

    public static void displayOrderScreen() {
        System.out.println("\n--- ORDER SCREEN ---");
        System.out.println("1. Add Sandwich");
        System.out.println("2. Add Drink");
        System.out.println("3. Add Chips");
        System.out.println("4. Remove Last Item");
        System.out.println("5. Checkout");
        System.out.println("0. Cancel Order\n");
    }
}
