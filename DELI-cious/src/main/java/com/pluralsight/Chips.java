package com.pluralsight;
import java.util.ArrayList;


public class Chips extends Item {
    private String flavor;

    public Chips (String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return 1.50;

    }

    public String getName() {
        return flavor + "Chips";
    }

    //
//
//    static ArrayList<Chips> chipType = new ArrayList<>();
//
//    public Chips( String chipType) {
//        this.chipType = chipType;
//
//    }
//
//    public static void toStringChipFlavors() {
//        int temp = 1;
//        System.out.println("\nList of Chip Type: ");
//        for (Chips flavors : chipType) {
//            System.out.println(temp + ".) " + flavors.getChipType() + " (1.50)");
//            temp++;
//        }
//
//    }  @Override
//    public double getPrice() {
//        return 1.50;
//    }
//
//    @Override
//    public String toString() {
//        return chipType + " - $1.50";
//    }
//}
//
//    }
//
//    @Override
//    public String toString() {
//        return chipType;
//    }
//}
