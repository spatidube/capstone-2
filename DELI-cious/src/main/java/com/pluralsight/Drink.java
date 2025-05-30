package com.pluralsight;

import java.util.ArrayList;

public class Drink extends Item {
    private DrinkSize size;
    private String drinkFlavor;
    private boolean hasIce;

    // Static list of available drink flavors (Strings instead of Drink objects)
    private static ArrayList<String> availableFlavors = new ArrayList<>();

    public Drink(DrinkSize size, String drinkFlavor, boolean hasIce) {
        this.size = size;
        this.drinkFlavor = drinkFlavor;
        this.hasIce = hasIce;
    }

    public String getDrinkFlavor() {
        return drinkFlavor;
    }

    public static void addAvailableFlavor(String flavor) {
        availableFlavors.add(flavor);
    }

    public static void printAvailableFlavors() {
        System.out.println("\nList of Drink Flavors:");
        int index = 1;
        for (String flavor : availableFlavors) {
            System.out.println(index + ".) " + flavor);
            index++;
        }
    }

    @Override
    public double getPrice() {
        return switch (size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
        };
    }

    @Override
    public String getName() {
        return size + " " + drinkFlavor;
    }

    @Override
    public String toString() {
        String iceInfo = hasIce ? "on the rocks (ice)" : "No Ice";
        return getName() + " - " + iceInfo + " - $" + getPrice();
    }
}
