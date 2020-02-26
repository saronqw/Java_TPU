package com.company;

public class AirTransport extends Transport {

    public AirTransport(String sideNumber) {
        super("Air");
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
    public String toString() {
        return "AirTransport{" +
                "type='" + getType() + '\'' +
                "sideNumber='" + sideNumber + '\'' +
                '}';
    }
}
