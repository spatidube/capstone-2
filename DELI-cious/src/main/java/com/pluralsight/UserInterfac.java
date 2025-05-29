package com.pluralsight;
import java.util.Scanner;

//text based simulation of order being placed
public class UserInterfac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new order();

        //sample drinks
        order.addItem(new Drink (DrinkSize.SMALL, "Coke Zero"));
        order.addItem(new Drink(DrinkSize.Medium, "Coke"));
        order.addItem(new Drink (DrinkSize.LARGE, "Sprite") );

    }
}
