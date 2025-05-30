package com.pluralsight;
@SuppressWarnings("all")
public class Topping
{
class Topping extends Item {
    private String label;
    private Enums.ToppingCategory kind;
    private boolean extraPortion;

    public Topping(String label, Enums.ToppingCategory kind, boolean extraPortion) {
        this.label = label;
        this.kind = kind;
        this.extraPortion = extraPortion;
    }