package com.pluralsight;
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
    public double getPrice() (
            double basePrice = switch (lengthInInches) {
                case 4 -> 5.50;
                case 8 -> 7.00;
                case 12 -> 0.0;
            };
            for (Topping topping : includedToppings)

    {
        basePrice += topping.calculateCost(lengthInInches);
    }

    }
}
