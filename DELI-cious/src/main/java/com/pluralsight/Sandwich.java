package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Item {
    private int lengthInInches;
    private Enums.BreadType breadChoice;
    private boolean isToasted;
    private List<Topping> includedToppings = new ArrayList<>();

    public Sandwich(int length, Enums.BreadType bread, boolean toasted) {
        this.lengthInInches = length;
        this.breadChoice = bread;
        this.isToasted = toasted;
    }

    public void addTopping(Topping topping) {
        includedToppings.add(topping);
    }

    @Override
    public String getName() {
        return lengthInInches + " inch " + breadChoice.name().toLowerCase() + " sandwich" +
                (isToasted ? " (toasted)" : "");
    }

    @Override
    public double getPrice() {
        double basePrice;
        switch (lengthInInches) {
            case 4 -> basePrice = 4.00;
            case 8 -> basePrice = 6.50;
            case 12 -> basePrice = 8.00;
            default -> basePrice = 0.0;
        }

        for (Topping topping : includedToppings) {
            basePrice += topping.getPrice();
        }

        return basePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" - $").append(String.format("%.2f", getPrice())).append("\n");
        for (Topping topping : includedToppings) {
            sb.append("  + ").append(topping.toString()).append("\n");
        }
        return sb.toString();
    }
}
