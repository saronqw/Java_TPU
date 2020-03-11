package com.company.decorator;

import com.company.Transport;

public class AutopilotDecorator extends FeatureDecorator {

    public AutopilotDecorator(Transport transport){
        this.transport = transport;
    }

    @Override
    public String showInfo() {
        return transport.showInfo() + " Autopilot";
    }

    @Override
    public int getCost(){
        return 65_000 + transport.getCost();
    }
}
