package com.company.abstractFactory.ingredientFactory;

public class ManafactureOneIngredientFactory extends IngredientFactory {
    @Override
    public String assembleEngine() {
        return "ManafactureOne engine";
    }

    @Override
    public int assembleEnginePower() {
        return 1000;
    }
}
