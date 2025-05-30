package com.pluralsight;

public class Drink extends Item {
    private DrinkSize size;
    private String drinkFlavor;

    public Drink(DrinkSize size, String drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
        this.size = size;
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
        return getName() + " - $" + getPrice();
    }
}