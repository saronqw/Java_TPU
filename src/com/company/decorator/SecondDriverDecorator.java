package com.company.decorator;

import com.company.Transport;

public class SecondDriverDecorator extends FeatureDecorator {

    public SecondDriverDecorator(Transport transport){
        this.transport = transport;
    }

    @Override
    public String showInfo() {
        return transport.showInfo() + " SecondDriver";
    }

    @Override
    public int getCost(){
        return 80_000 + transport.getCost();
    }
}
