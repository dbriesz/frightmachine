package com.teamtreehouse.techdegree;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.Device;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

public class Main {

    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();

        Horn horn = new Horn();
        Strobe strobe = new Strobe();
        Device device = new Device();
        Camera camera = new Camera();

        machine.addAccessory(horn);
        machine.addAccessory(strobe);
        device.addDevice(camera);
        machine.simulateMotion();
        device.activate();
        camera.snapPhotos(5);

    }
}
