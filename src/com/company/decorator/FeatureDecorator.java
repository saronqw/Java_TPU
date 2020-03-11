package com.company.decorator;

import com.company.Transport;

public abstract class FeatureDecorator extends Transport {
    protected Transport transport;

    public Transport getTransport() {
        return transport;
    }

    public abstract String showInfo();
    public abstract int getCost();
}
