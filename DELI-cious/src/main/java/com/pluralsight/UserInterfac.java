package com.pluralsight;
import java.util.Scanner;

//text based simulation of order being placed
public class UserInterfac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        //sample drinks
        order.addItem(new Drink (DrinkSize.SMALL, "Coke Zero"));
        order.addItem(new Drink(DrinkSize.MEDIUM, "Coke"));
        order.addItem(new Drink (DrinkSize.LARGE, "Sprite") );

        //sample Sandwich
        Sandwich sandwich = new Sandwich(8, BreadType.WHEAT, true);
        sandwich.addTopping(new Topping("Turkey", ToppingCategory.MEAT, false));
        sandwich.addTopping(new Topping("Chedda", ToppingCategory.CHEESE, false));
        sandwich.addTopping(new Topping("Lettuce", ToppingCategory.STANDARD, false));
        sandwich.addTopping(new Topping("House Sauce", ToppingCategory.SAUCE, false));
        order.addItem((sandwich));

        //add chips
        order.addItem(new Chips("BBQ"));

        //LET'S PRINT RECEIPT
        System.out.println("\n ====RECIEPT ====");
        System.out.println(order.generateOrderSummary());
        System.out.println("==================================");
        System.out.println("goodbye, have a great one");

        scanner.close();

    }
}
