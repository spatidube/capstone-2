package com.pluralsight;
import java.util.Scanner;

//text based simulation of order being placed
public class UserInterfac {
    //scanner fo reading user input
        private static final Scanner scanner = new Scanner(System.in);
        //this order object stores items the user adds
        private static final Order order = new Order();

        // entering app ui
        public static void startApp() {
            while (true) {
                System.out.println("\nWelcome to DELI-cious!");
                System.out.println("[1] Start Order");
                System.out.println("[2] Exit");
                System.out.println("Enter what you'd like: ");

                switch (scanner.nextLine().trim()) {
                    case "1":
                        showOrderMenu(); // go to ordering menu
                        break;
                    case "2":
                        System.out.println("Thanks for stopping by!");
                        break;
                    default:
                        System.out.println("invalid input, try again");
                        break;
                }
            }

            //display main menu and handles user choidces

            private static void showOrderMenu() {
                boolean ordering = true;

                while (ordering) {
                    System.out.println("\nOrder Menu:");
                    System.out.println("[1] Add Sandwich");
                    System.out.println("[2] Add Drink");
                    System.out.println("[3] Add Chips");
                    System.out.println("[4]  View and Checkout");
                    System.out.println(" [0} Cancel Order");
                    System.out.println("Selct an option: ");

                    switch (scanner.nextLine().trim) {

                    }
                    //manage user input- adding sandwich, drink, chips, or generally showing final order or cancelling
                    switch (input) {
                        case "1":
                            addSandwich();
                            break;
                        case "2":
                            addDrink();
                            break;
                        case "3":
                            addChips();
                            break;
                        case "4":
                            checkout();
                            ordering = false;
                            break;
                        case "0":
                            System.out.println("Cancelled order");
                            break;
                    }
                }
            }



            //gatehr input to create custom sandwich

        public static void addSandwich() {
                System.out.println("\nEnter Sandwich Length (4,8, 12: ");
                int length = Integer.parseInt(scanner.nextLine());

                System.out.println("Choose bread type (WHITE, WHEAT, CIABATTA): ");
                BreadType bread = BreadType.valueOf(scanner.nextLine.toUpperCase());

                System.out.println("Add Toppings: (yes/no)");
                boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

                Sandwich sandwich = new Sandwich(length,bread, toasted);

                System.out.println("add toppings (yes/no) ");
                if (scanner.nextLine().equalsIgnoreCase("yes")) {
                    ToppingsUI.addToppingsToSandwich(sandwich); //add toppings through separate ui classes

                    order.addItem(sandwich); //adding sandwich to order
                    System.out.println("sandwich added to order");
                }
                    //gathering user input to create drink
        private static void addDrink() {

                    System.out.println("\n Enter drink size (SMALL, MEDIUM, LARGE): ");
                    DrinkSize size = DrinkSize.valueOf(scanner.nextLine().toUpperCase());

                    System.out.println("Enter Drink Flavor:");
                    String flavor = scanner.nextLine();

                    Drink drink = new Drink (size, flavor);
                    order.addItem(drink); //add drink to order
                    System.out.println("Drink added to order");


                    //now we add chips

        private static void addChips() {
                        System.out.println("\nEnter Chip flavor: ");
                        String chipFlavor = scanner.nextLine();

                        Chips chips = new Chips(flavor);
                        order.addItem(chips); // add chips to order
                        System.out.println("Chips added to order.");

                        //display FINAL order summary and write it to a file

        private static void checkout() {
                            System.out.println("\nFinal order");
                            System.out.println(order); //display all items in order
                            ReceiptWriter.saveReceipt(order, "receipt.txt"); // save to file
                            System.out.println("Reciept saved as receipt.txt");
                        }
                    }
                }
            }

