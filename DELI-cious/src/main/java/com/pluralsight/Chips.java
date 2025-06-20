package com.pluralsight;

import java.util.ArrayList;

//Clancy
//Steven added toStrings
public class Chips extends Item {
    protected String chipType;
    static ArrayList<Chips> chipFlavors = new ArrayList<>();

    public Chips(String chipType) {
        this.chipType = chipType;
    }

    public String getChipType() {
        return chipType;
    }

    public static void toStringChipFlavors() {
        int temp = 1;
        System.out.println("\nList of Chip Flavors: ");
        for (Chips flavors : chipFlavors) {
            System.out.println(temp + ".) " + flavors.getChipType() + " ($1.50)");
            temp++;
        }
    }

    @Override
    public double getPrice() {
        if (chipType != null && !chipType.isEmpty()) {
            return 1.50;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return chipType;
    }

}
