package com.pluralsight;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class ReceiptWriter {
    public static void writeReceipt(List<Item> items, double total) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("receipt.txt", true))) {
            writer.println("=== Receipt ===");
            for (Item item : items) {
                writer.println(item);
            }
            writer.printf("Total: $%.2f%n", total);
            writer.println("==============\n");
        } catch (IOException e) {
            System.out.println("Failed to write receipt: " + e.getMessage());
        }
    }
}
