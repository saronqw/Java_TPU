package com.company;

public abstract class EngineAirTransport extends AirTransport {

    EngineAirTransport(String sideNumber, int enginePower) {
        super(sideNumber);
        this.enginePower = enginePower;
    }

    private int enginePower;

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", sideNumber = " + getSideNumber() +
                ", enginePower = " + enginePower;
    }
}
