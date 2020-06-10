package com.company.abstractFactory;

import com.company.Transport;

public abstract class AbstractFactory {

    protected abstract Transport createTransport(String transportName);

    public Transport orderTransport(String transportName){
        Transport transport = createTransport(transportName);
        transport.assembleTransport();
        System.out.println("Выбранный транспорт: " + transport.showInfo());

        return transport;
    }
}
