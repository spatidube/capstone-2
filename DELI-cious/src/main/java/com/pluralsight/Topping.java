package com.pluralsight;

public class Topping {
    private String label;
    private ToppingCategory kind;
    private boolean extraPortion;

    public Topping(String label, ToppingCategory kind, boolean extraPortion){

        this.label = label;
        this.kind = kind;
        this.extraPortion = extraPortion;
    }
    public double calculateCost (int sandwichLength) {
        return switch (kind) {
            case MEAT -> extraPortion ? 1.0 * sandwichLength / 4.0 : 2.0 *  sandwichLength / 8.0;
            case CHEESE -> extraPortion ? 0.6 * sandwichLength / 8.0 : 1.5 * sandwichLength /8.0;
            default -> 0.0;
        };
    }
    @Override
    public String toString() {
        return label + (extraPortion ? " (extra)" : "");
    }
}
