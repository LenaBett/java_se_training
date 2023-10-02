package com.systechafrica.part2.interfaces;

public class CookerPlug implements ThreePinPlug{

    @Override
    public boolean plugIn() {
        return false;
    }

    @Override
    public boolean plugOut() {
        return false;
    }
}
