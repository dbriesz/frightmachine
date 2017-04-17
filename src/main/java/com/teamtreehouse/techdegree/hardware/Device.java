package com.teamtreehouse.techdegree.hardware;


import com.example.accessory.Accessory;

import java.util.ArrayList;
import java.util.List;

public class Device implements Accessory {
    private List<Device> devices = new ArrayList();

    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void activate() {
        for (Device device : devices) {
            device.activate();
        }
    }
}
