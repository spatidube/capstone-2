package com.pluralsight;

public class Chips extends Item {
    private String chipFlavor;

    public Chips(String chipFlavor) {
        this.chipFlavor = chipFlavor;
    }
    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public  String getName() {
        return chipFlavor + "chips";
    }

    @Override
    public String toString() {
        return getName() + " - $" + getPrice();
    }
}
