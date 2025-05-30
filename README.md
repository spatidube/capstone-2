# DELI-cious Ordering System
!![img_9.png](../../../../../target/img_9.png)
Welcome to the **DELI-cious Ordering System**, an interactive platform designed to bring the essense of Eating Good.nc into a world of sandiwch creativity. 
This application allows users to customize their experience with
---

## 📌 Project Features

* 🍞 **Sandwich Builder**: Choose bread type, size, toasting, and multiple toppings with optional extras.
* 🥤 **Drink Selector**: Pick size and input a custom flavor.
* 🍟 **Chip Picker**: Type in your preferred chip flavor.
* 💵 **Auto-Pricing Engine**: Dynamic pricing based on size and extras.
* 📄 **Receipt Generation**: Saves detailed receipts to a file with itemized summary.
* 🧾 **Order Management**: Add, remove, cancel, or confirm orders.

---

## 🧱 Class Architecture

[Class Diagram](src/main/resources/Receipts/Capstone%202%20-%20DELI-cious.png)
![img_2.png](../../../../../target/img_2.png)
---

## 🖥️ Application Screens

### 🏠 Home Screen

```
Welcome to DELI-cious!
------------------------
Main Menu:
1. New Order
2. Exit
```

### 📦 Order Menu

```
1. Add Sandwich
2. Add Drink
3. Add Chips
4. Remove Last Item
5. Checkout
0. Cancel Order
```

### 🧾 Order Summary

```
Order Summary:
- 8" WHEAT (toasted) - $8.75
- MEDIUM Grape - $2.50
- BBQ Chips - $1.50
Total: $12.75
```

---

## 💡 Interesting Code Snippet

```java
public double calculateCost(int sandwichLength) {
    return switch (kind) {
        case MEAT -> extraPortion ? 1.0 * sandwichLength / 4.0 : 2.0 * sandwichLength / 8.0;
        case CHEESE -> extraPortion ? 0.6 * sandwichLength / 8.0 : 1.5 * sandwichLength / 8.0;
        case CRUNCHY -> 0.0;
    };
}
```

This logic calculates the topping cost dynamically based on topping type, sandwich size, and whether it's an extra portion. It's a great example of combining enums with modern Java `switch` expressions for clean and readable logic.

---

## 📁 Folders & Files

* `/src/com/pluralsight/` — All Java classes
* `/src/main/resources/Receipts/` — Receipt output and diagram
* `README.md` — Project summary and usage guide

---

## ✅ How to Run

```bash
javac MainApp.java
java com.pluralsight.MainApp
```

---

## 🙌 Credits

Developed by Spati D. as part of a Capstone Java project.

For feedback or contributions, feel free to reach out!
