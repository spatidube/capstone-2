package com.pluralsight;

import static com.pluralsight.Menu.*;

public class Topping extends Item {

    private String label;
    private Enums.ToppingCategory kind;
    private boolean extraPortion;


    public Topping(String label, Enums.ToppingCategory kind, boolean extraPortion) {
        this.label = label;
        this.kind = kind;
        this.extraPortion = extraPortion;


    }

    public double calculateCost(int sandwichLength) {
        return switch (kind) {
            case MEAT -> extraPortion ? 1.0 * sandwichLength / 4.0 : 2.0 * sandwichLength / 8.0;
            case CHEESE -> extraPortion ? 0.6 * sandwichLength / 8.0 : 1.5 * sandwichLength / 8.0;
            case CRUNCHY -> 0.0;
        };
    }

    public double getPrice() {
        return 0.0;
    }
    public String getName() {
        return label + (extraPortion ? "(extra)" : "");
    }
}

