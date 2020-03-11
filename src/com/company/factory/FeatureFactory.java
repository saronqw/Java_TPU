package com.company.factory;


import com.company.Transport;

public abstract class FeatureFactory {

    public abstract Transport createTransport(String transportName);

    public Transport orderTransport(String transportName) {
        return createTransport(transportName);
    }
}
