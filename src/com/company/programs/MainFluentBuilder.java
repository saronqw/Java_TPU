package com.company.programs;

import com.company.WaterTransportFluentBuilder;

public class MainFluentBuilder {
    public static void main(String[] args) {
        WaterTransportFluentBuilder waterTransportFluentBuilder = WaterTransportFluentBuilder.createBuilder()
                .setBonus("Крылья")
                .setCountPassengers(10)
                .build();
        System.out.println(waterTransportFluentBuilder.showInfo());

        waterTransportFluentBuilder = WaterTransportFluentBuilder.createBuilder()
                .setBonus("Крылья + Парашют")
                .setCountPassengers(30)
                .build();
        System.out.println(waterTransportFluentBuilder.showInfo());
    }
}
