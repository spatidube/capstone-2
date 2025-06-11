package com.pluralsight;
import java.util.*;
import java.io.*;

@SuppressWarnings("all")

class Menu {

    private List<String> options = new ArrayList<>();

    public void addOption(String option) {
        options.add(option);
    }

    public List<String> getOptions() {
        return options;

    }
}
