package com.company;

public class Helicopter extends EngineAirTransport {

    public Helicopter() {}

    Helicopter(String sideNumber, int enginePower, int screwDiameter) {
        super(sideNumber, enginePower);
        this.screwDiameter = screwDiameter;
    }

    private int screwDiameter;

    public int getScrewDiameter() {
        return screwDiameter;
    }

    public void setScrewDiameter(int screwDiameter) {
        this.screwDiameter = screwDiameter;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", sideNumber = " + getSideNumber() +
                ", enginePower = " + getEnginePower() +
                ", screwDiameter = " + screwDiameter;
    }
}
