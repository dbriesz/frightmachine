package com.example.motion;


public abstract class MotionDetector {
    public abstract void onMotionDetected();

    public void simulateMotion() {
        onMotionDetected();
    }
}
