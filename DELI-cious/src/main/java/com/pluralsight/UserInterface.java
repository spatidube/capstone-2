package com.pluralsight;
import java.util.*;
import java.io.*;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private List<Item> currentOrder = new ArrayList<>();

    public void run() {
        boolean running = true;
        while (running) {
            MainScreen.displayWelcome();
            Menu menu = new Menu();
            MenuReading.loadMenu(menu);
            MainScreen.displayMenu(menu);

            System.out.print("Choose an option: ");
            int homeChoice = scanner.nextInt();
            scanner.nextLine();

            switch (homeChoice) {
                case 1 -> handleNewOrder();
                case 2 -> {
                    System.out.println("Exiting application. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void handleNewOrder() {
        currentOrder.clear();
        boolean ordering = true;

        while (ordering) {
            MainScreen.displayOrderScreen();
            System.out.print("Select option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> currentOrder.add(buildSandwich());
                case 2 -> currentOrder.add(buildDrink());
                case 3 -> currentOrder.add(buildChips());
                case 4 -> removeLastItem();
                case 5 -> checkout();
                case 0 -> {
                    System.out.println("Order cancelled.");
                    ordering = false;
                }
                default -> System.out.println("Invalid selection.");
            }
        }
    }



//understand
    private Sandwich buildSandwich() {
        System.out.print("Enter sandwich size (4, 8, 12): ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter bread type (WHITE, WHEAT, RYE): ");
        Enums.BreadType bread = Enums.BreadType.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Toasted? (true/false): ");
        boolean toasted = scanner.nextBoolean();
        scanner.nextLine();

        Sandwich sandwich = new Sandwich(size, bread, toasted);

        System.out.println("Add toppings. Enter 'done' when finished:");
        while (true) {
            System.out.print("Enter topping name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Enter category (MEAT, CHEESE, CRUNCHY): ");
            Enums.ToppingCategory cat = Enums.ToppingCategory.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Extra portion? (true/false): ");
            boolean extra = scanner.nextBoolean();
            scanner.nextLine();

            sandwich.addTopping(new Topping(name, cat, extra));
        }

        return sandwich;
    }
//customer customizing their drink
    private Drink buildDrink() {
        System.out.print("Enter drink size (SMALL, MEDIUM, LARGE): ");
        Enums.DrinkSize size = Enums.DrinkSize.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter drink flavor: ");
        String flavor = scanner.nextLine();

        return new Drink(size, flavor);
    }
//customer ordering their drink
    private Chips buildChips() {
        System.out.print("Enter chip flavor: ");
        return new Chips(scanner.nextLine());
    }


    }
}