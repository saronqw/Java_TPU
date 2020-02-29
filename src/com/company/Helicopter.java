package com.company;

public class Helicopter extends EngineAirTransport {

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
    public String toString() {
        return super.toString() +
                "\n\tscrewDiameter: " + screwDiameter +
                "\n}";
    }
}
