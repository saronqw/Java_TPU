package com.company;

import com.company.abstractFactory.ingredientFactory.IngredientFactory;

public class Airplane extends EngineAirTransport {

    private IngredientFactory ingredientFactory;

    public Airplane() { }

    public Airplane(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public Airplane(String sideNumber, int enginePower, String takeOffMode) {
        super(sideNumber, enginePower);
        this.takeOffMode = takeOffMode;
    }

    @Override
    public void assembleTransport() {
        this.setEngineName(ingredientFactory.assembleEngine());
        this.setEnginePower(ingredientFactory.assembleEnginePower());
        this.setType("Air");
    }

    private String takeOffMode;

    public String getTakeOffMode() {
        return takeOffMode;
    }

    public void setTakeOffMode(String takeOffMode) {
        this.takeOffMode = takeOffMode;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", takeOffMode = " + takeOffMode;
    }
}
