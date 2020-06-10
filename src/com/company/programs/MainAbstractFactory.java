package com.company.programs;

import com.company.Transport;
import com.company.abstractFactory.AbstractFactory;
import com.company.abstractFactory.ManafactureOneFactory;
import com.company.abstractFactory.ManafactureTwoFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ManafactureOneFactory();
        Transport transport = abstractFactory.orderTransport("airplane");
        transport = abstractFactory.orderTransport("helicopter");

        abstractFactory = new ManafactureTwoFactory();
        transport = abstractFactory.orderTransport("airplane");
        transport = abstractFactory.orderTransport("helicopter");
    }
}
