package com.pluralsight;
import java.util.*;

//===ITEM (Abstract class) ===
public abstract class Item implements  ItemAction {
    static ArrayList<Item> cart = new ArrayList<Item>();

    public Item() {
    }

    public static double getTotal() {
        double total = 0.00;
        for (Item item : cart){
            total += item.getPrice();
        }
        return total;
    }
}
