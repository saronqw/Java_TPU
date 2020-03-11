package com.company.factory;

import com.company.Airplane;
import com.company.Transport;

public class AirplaneFactory extends FeatureFactory {
    @Override
    public Transport createTransport(String transportName) {
        Transport transport;
        switch (transportName) {
            case "AirplaneH2000": transport = new Airplane("H2000", 120, "vertical");
                break;
            case "AirplaneH1000": transport = new Airplane("H1000", 120, "vertical");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + transportName);
        }
        
        return transport;
    }
}
