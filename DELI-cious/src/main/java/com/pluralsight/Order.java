package com.pluralsight;// Represents an entire customer order with sandwiches, drinks, and chips

import com.pluralsight.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> items = new ArrayList<>(); // list of all drinks

    // Method: add a drink to the order

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String generateOrderSummary() {
        StringBuilder summary = new StringBuilder();
        for (Item item : items) {
            summary.append("  -").append(item).append("\n");
        }
        summary.append("\nTOTAL: $").append(String.format("%.2f", calculateOrderTotal()));
        return summary.toString();

    }}


