package com.company;

import com.company.abstractFactory.ingredientFactory.IngredientFactory;

public class Helicopter extends EngineAirTransport {

    public Helicopter() {}

    public IngredientFactory ingredientFactory;

    public Helicopter(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    Helicopter(String sideNumber, int enginePower, int screwDiameter) {
        super(sideNumber, enginePower);
        this.screwDiameter = screwDiameter;
    }

    @Override
    public void assembleTransport() {
        this.setEngineName(ingredientFactory.assembleEngine());
        this.setEnginePower(ingredientFactory.assembleEnginePower());
        this.setType("Air");
    }

    private int screwDiameter;

    public int getScrewDiameter() {
        return screwDiameter;
    }

    public void setScrewDiameter(int screwDiameter) {
        this.screwDiameter = screwDiameter;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", screwDiameter = " + screwDiameter;
    }
}
