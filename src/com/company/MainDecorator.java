package com.company;

import com.company.decorator.AutopilotDecorator;

public class MainDecorator {
    public static void main(String[] args) {
        Transport airplane = new Airplane("H2000", 120, "vertical");
        airplane.setCost(400_000);
        System.out.println(airplane.showInfo() + " " + airplane.getCost());

        airplane = new AutopilotDecorator(airplane);
        System.out.println(airplane.showInfo() + " " + airplane.getCost());
    }

}
