package com.company.abstractFactory;

import com.company.Airplane;
import com.company.Helicopter;
import com.company.Transport;
import com.company.abstractFactory.ingredientFactory.IngredientFactory;
import com.company.abstractFactory.ingredientFactory.ManafactureOneIngredientFactory;
import com.company.abstractFactory.ingredientFactory.ManafactureTwoIngredientFactory;

public class ManafactureTwoFactory extends AbstractFactory {
    @Override
    protected Transport createTransport(String transportName) {
        Transport transport;
        IngredientFactory ingredientFactory = new ManafactureTwoIngredientFactory();
        switch (transportName){
            case "helicopter": transport = new Helicopter(ingredientFactory);
                break;
            case "airplane": transport = new Airplane(ingredientFactory);
                break;
            default: throw new IllegalArgumentException();
        }
        return transport;
    }
}
