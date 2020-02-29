package com.company;

public class WaterTransport extends Transport {

    public WaterTransport(String subType) {
        super("Water");
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
    public String toString() {
        return super.toString() +
                "\n\tsubType: \"" + subType + "\",";
    }
}
