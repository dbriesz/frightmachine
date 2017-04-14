package com.example.accessory;

public class Horn implements Accessory {
    @Override
    public void activate() {
        System.out.println("BEEEEEEEP!");
    }
}
