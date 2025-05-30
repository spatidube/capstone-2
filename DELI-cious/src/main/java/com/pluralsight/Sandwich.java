package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Sandwich extends Item {
    private int lengthInInches;
    private BreadType breadChoice;
    private boolean isToasted;
    private List<Topping> includedToppings = new ArrayList<>();


    public Sandwich(int lengthInInches, BreadType breadChoice, boolean isToasted) {
        this.lengthInInches = lengthInInches;
        this.breadChoice = breadChoice;
        this.isToasted = isToasted;
    }

    public void addTopping(Topping topping) {
        includedToppings.add(topping);
    }

    @Override
    public double getPrice() {
    double basePrice = switch (lengthInInches) {
        case 4 -> 5.50;
        case 8 -> 7.00;
        case 12 -> 8.50;
        default -> 0.0;

    };
            for(
    Topping topping : includedToppings)

    {
        basePrice += topping.calculateCost(lengthInInches);
    }
            return basePrice;
}

@Override
public String getName() {
    return lengthInInches + "\""  + breadChoice + (isToasted ? " (toasted)" : " ");
}
@Override
public String toString() {
    StringBuilder output = new StringBuilder();
    output.append(getName()).append("\n");
    for (Topping topping : includedToppings) {
        output.append(" - ").append(topping).append("\n");
    }
    return output.toString();

    }
}
