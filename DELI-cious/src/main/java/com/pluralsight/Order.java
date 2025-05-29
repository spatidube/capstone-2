// Represents an entire customer order with sandwiches, drinks, and chips

import com.pluralsight.Drink;

import java.util.ArrayList;

import java.util.List;



public class Order {


    private List<Drink> drinks = new ArrayList<>(); // list of all drinks




    // Method: add a drink to the order

    public void addDrink(Drink d) {

        drinks.add(d);

    }



    }



    // Method: calculate the total price of the entire order

    // - Adds up prices of all sandwiches, drinks, and chips

    public double getTotal() {

        double total = 0;

        for (Drink d : drinks) total += d.getPrice();

        return total;

    }



    // Method: returns a full order summary as a string

    // - Includes details of sandwiches, drinks, chips, and total price

    public String getOrderDetails() {

        StringBuilder sb = new StringBuilder();


        sb.append("DRINKS:\n");

        for (Drink d : drinks) sb.append("  - ").append(d).append("\n");


        sb.append("\nTOTAL: $").append(String.format("%.2f", getTotal()));

        return sb.toString();

    }

}

 