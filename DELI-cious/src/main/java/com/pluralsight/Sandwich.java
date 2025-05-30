package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
public class Item {
    // class code here
}

class Sandwich extends Item {
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

    public double getPrice() {
        double basePrice = switch (lengthInInches) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0.0;
        };
    }
}