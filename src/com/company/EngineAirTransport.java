package com.company;

public abstract class EngineAirTransport extends AirTransport {

    public EngineAirTransport() {}

    EngineAirTransport(String sideNumber, int enginePower) {
        super(sideNumber);
        this.enginePower = enginePower;
    }

    private int enginePower;

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    private String engineName;

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", enginePower = " + enginePower +
                ", engineName = " + engineName;
    }
}
