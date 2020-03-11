package com.company;

public abstract class AirTransport extends Transport {

    public AirTransport() {}

    public AirTransport(String sideNumber) {
        setType("Air");
        this.sideNumber = sideNumber;
    }

    private String sideNumber;

    public String getSideNumber() {
        return sideNumber;
    }

    public void setSideNumber(String sideNumber) {
        this.sideNumber = sideNumber;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", sideNumber = " + sideNumber;
    }
}
