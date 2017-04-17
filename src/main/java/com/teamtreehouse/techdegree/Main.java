package com.teamtreehouse.techdegree;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

public class Main {

    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();

        Horn horn = new Horn();
        Strobe strobe = new Strobe();
        Camera camera = new Camera(5);

        machine.addAccessory(horn);
        machine.addAccessory(strobe);
        machine.addAccessory(camera);
        machine.simulateMotion();
    }
}
