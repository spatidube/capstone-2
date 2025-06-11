package com.pluralsight;// Represents an entire customer order with sandwiches, drinks, and chips

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Item> getItems() {
        return items;
    }

    private List<Item> items = new ArrayList<>(); // list of all orderable items

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        String receipt = "Order Summary: \n";

        for (Item item : items) {
            receipt += item.toString() + "\n";
        }
        receipt += "Total: $" + String.format("%.2f", getTotalPrice());
        return receipt;

    }
}


