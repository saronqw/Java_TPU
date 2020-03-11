package com.company;

public class Airplane extends EngineAirTransport {

    public Airplane() { }

    public Airplane(String sideNumber, int enginePower, String takeOffMode) {
        super(sideNumber, enginePower);
        this.takeOffMode = takeOffMode;
    }

    private String takeOffMode;

    public String getTakeOffMode() {
        return takeOffMode;
    }

    public void setTakeOffMode(String takeOffMode) {
        this.takeOffMode = takeOffMode;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", sideNumber = " + getSideNumber() +
                ", enginePower = " + getEnginePower() +
                ", takeOffMode = " + takeOffMode;
    }
}
