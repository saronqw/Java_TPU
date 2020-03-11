package com.company.decorator;

import com.company.Transport;

public class AutopilotDecorator extends FeatureDecorator {
    Transport transport;

    public AutopilotDecorator(Transport transport){
        this.transport = transport;
    }

    @Override
    public String showInfo() {
        return transport.showInfo() + " Autopilot";
    }

    public int getCost(){
        return 65_000 + transport.getCost();
    }
}
