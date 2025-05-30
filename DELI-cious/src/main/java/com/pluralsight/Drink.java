package com.pluralsight;

import java.util.*;
import java.io.*;


class Drink extends Item {
    private Enums.DrinkSize size;
    private String flavor;

    public Drink(Enums.DrinkSize size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice() {
        return switch (size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
        };
    }

    public String getName() {
        return size + " " + flavor;
    }
}