package com.pluralsight;
import java.util.*;
import java.io.*;
@SuppressWarnings("all")
public class YourClassName
{
    public static void displayWelcome() {
        System.out.println("Welcome to DELI-cious!\n------------------------");
    }

    public static void displayMenu(Menu menu) {
        System.out.println("Main Menu:");
        int count = 1;
        for (String option : menu.getOptions()) {
            System.out.println(count++ + ". " + option);
        }
    }

    public static void displayOrderScreen() {
        System.out.println("\nOrder Menu:");
        System.out.println("1. Add Sandwich");
        System.out.println("2. Add Drink");
        System.out.println("3. Add Chips");
        System.out.println("4. Remove Last Item");
        System.out.println("5. Checkout");
        System.out.println("0. Cancel Order");
    }
}
