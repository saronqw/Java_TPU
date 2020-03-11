package com.company.programs;

import com.company.Transport;
import com.company.factory.AirplaneFactory;
import com.company.factory.FeatureFactory;

public class MainFactoryPattern {
    public static void main(String[] args) {
        FeatureFactory airplaneFactory = new AirplaneFactory();
        Transport airplane = airplaneFactory.createTransport("AirplaneH2000");
        System.out.println(airplane.showInfo());

        airplane = airplaneFactory.createTransport("AirplaneH1000");
        System.out.println(airplane.showInfo());

    }
}
