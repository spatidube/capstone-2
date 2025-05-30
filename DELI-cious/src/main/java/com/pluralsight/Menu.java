package com.pluralsight;

import java.util.ArrayList;

public class Menu {

    private List<String> optioins = new ArrayList<>();

    public void addOption(String option){
        options.add(option);
    }

    public List<String> getOptions() {
        return optioins;
    }
}
