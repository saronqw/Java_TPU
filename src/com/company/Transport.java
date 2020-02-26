package com.company;

public class Transport {

    public Transport(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                '}';
    }
}
