package com.systechafrica.part2.interfaces;

public class MobileCharger implements ThreePinPlug{
    @Override
    public boolean plugIn() {
        System.out.println("Device is charging");
        return true;
    }

    @Override
    public boolean plugOut() {
        System.out.println("Device has been disconnected");
        return true;
    }
}
