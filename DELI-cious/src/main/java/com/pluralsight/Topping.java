package com.pluralsight;

public class Topping extends Item {
    private String label;
    private Enums.ToppingCategory kind;
    private boolean extraPortion;

    public Topping(String label, Enums.ToppingCategory kind, boolean extraPortion) {
        this.label = label;
        this.kind = kind;
        this.extraPortion = extraPortion;
    }

    @Override
    public String getName() {
        return label + (extraPortion ? " (Extra)" : "");
    }

    @Override
    public double getPrice() {
        return extraPortion ? 0.50 : 0.25; // example prices
    }

    public Enums.ToppingCategory getKind() {
        return kind;
    }

    public boolean hasExtraPortion() {
        return extraPortion;
    }

    @Override
    public String toString() {
        return getName() + " - $" + String.format("%.2f", getPrice());
    }
}
