package com.pluralsight;

import java.util.ArrayList;


class Sandwich extends Item {
    private int lengthInInches;
    private Enum.Breadtype breadChoice;
    private boolean isToasted;
    private List<Topping> includedToppings = new ArrayList<>();

    public Sandwich( int lengthInInches,Enum.Breadtype breadChoice,boolean isToasted) {

        this.lengthInInches = length;
        this.breadChoice = bread;
        this.isToasted = toased;

    }
    publid double getPrice() {
        double basePrice = switch(lengthInInches) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0.0;
        };
        for (Topping topping : includedToppings) {
            basePrice += topping.calculateCost(lengthInInches);
        }
        return basePrice;
    }
    public string getName() {
        return lengthInInches + "\" " + breadChoice + (isToasted ? " (toasted)" : "");
    }
//}//@Override
//public double getPrice() {
//    double sandwichPrice = 0;
//
//    switch (sandwichSize) {
//        case "4":
//            sandwichPrice = 5.50;
//            for (Topping topping : sandwichTopping) {
//                if (topping.isMeat && !topping.isExtraMeat)
//                    sandwichPrice += 1.00;
//                else if (topping.isExtraMeat)
//                    sandwichPrice += 0.50;
//                else if (topping.isCheese && !topping.isExtraCheese)
//                    sandwichPrice += 0.75;
//                else if (topping.isExtraCheese)
//                    sandwichPrice += 0.30;
//                else if (topping.isMunchy && !topping.isExtraMunchy)
//                    sandwichPrice += 1.25;
//                else if (topping.isExtraMunchy)
//                    sandwichPrice += 0.60;
//            }
//            break;
//
//        case "8":
//            sandwichPrice = 7.00;
//            for (Topping topping : sandwichTopping) {
//                if (topping.isMeat && !topping.isExtraMeat)
//                    sandwichPrice += 2.00;
//                else if (topping.isExtraMeat)
//                    sandwichPrice += 1.00;
//                else if (topping.isCheese && !topping.isExtraCheese)
//                    sandwichPrice += 1.50;
//                else if (topping.isExtraCheese)
//                    sandwichPrice += 0.60;
//                else if (topping.isCrunchy && !topping.isExtraCrunchy)
//                    sandwichPrice += 2.50;
//                else if (topping.isExtraCrunchy)
//                    sandwichPrice += 1.20;
//            }
//            break;
//
//        case "12":
//            sandwichPrice = 8.50;
//            for (Topping topping : sandwichToppings) {
//                if (topping.isMeat && !topping.isExtraMeat)
//                    sandwichPrice += 3.00;
//                else if (topping.isExtraMeat)
//                    sandwichPrice += 1.50;
//                else if (topping.isCheese && !topping.isExtraCheese)
//                    sandwichPrice += 2.25;
//                else if (topping.isExtraCheese)
//                    sandwichPrice += 0.90;
//                else if (topping.isMunchy && !topping.isExtraMunchy)
//                    sandwichPrice += 3.75;
//                else if (topping.isExtraMunchy)
//                    sandwichPrice += 1.80;
//            }
//            break;
//
//        case "EXTRA LARGE":
//            sandwichPrice = 45.00;
//            break;
//    }
//
//    return sandwichPrice;
//}
