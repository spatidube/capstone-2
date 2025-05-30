package com.pluralsight;
import java.util.*;
import java.io.*;



//===ITEM (Abstract class) ===
abstract class Item implements ItemAction {
    public String toString() {
        return getName() + " - $" + String.format("%.2f", getPrice());
    }
}