package com.company.abstractFactory.ingredientFactory;

public class ManafactureTwoIngredientFactory extends IngredientFactory {
    @Override
    public String assembleEngine() {
        return "ManafactureTwo engine";
    }

    @Override
    public int assembleEnginePower() {
        return 2000;
    }
}
