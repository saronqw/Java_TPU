package com.company;

public abstract class Transport {

    public Transport() {}

    private String type;
    private int cost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String showInfo(){
        return "Type: " + type;
    }

    public abstract void assembleTransport();
}
