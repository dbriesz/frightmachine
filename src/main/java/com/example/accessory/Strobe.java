package com.example.accessory;

public class Strobe implements Accessory {
    @Override
    public void activate() {
        System.out.println("Flashing lights!!!  Flash, flash, flash");
    }
}
