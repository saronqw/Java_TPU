package com.company;

public class EngineAirTransport extends AirTransport {

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
    public String toString() {
        return super.toString() +
                "\n\tenginePower: " + enginePower + ",";
    }
}
