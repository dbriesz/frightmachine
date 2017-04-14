package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

public class FrightMachine extends MotionDetector {

    private final Horn horn;
    private final Strobe strobe;
    private final Camera camera;

    public FrightMachine() {
        horn = new Horn();
        strobe = new Strobe();
        camera = new Camera();
    }
    
    @Override
    public void onMotionDetected() {
        // TODO: This is hardcoded, we should make it more extensible!  :(
        horn.activate();
        strobe.activate();
        camera.snapPhotos(5);
    }
}
