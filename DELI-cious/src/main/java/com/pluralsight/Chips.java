package com.pluralsight;

import java.util.*;
import java.io.*;


class Chips extends Item {
    private String flavor;

    public Chips(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return 1.50;
    }

    public String getName() {
        return flavor + " Chips";
    }
}
