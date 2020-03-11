package com.company;

public class WaterTransport extends Transport {

    public WaterTransport() {}

    public WaterTransport(String subType) {
        setType("Water");
        this.subType = subType;
    }

    private String subType;

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", subType = " + subType;
    }
}
