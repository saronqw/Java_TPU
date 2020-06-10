package com.company.abstractFactory;

import com.company.Airplane;
import com.company.Helicopter;
import com.company.Transport;
import com.company.abstractFactory.ingredientFactory.IngredientFactory;
import com.company.abstractFactory.ingredientFactory.ManafactureOneIngredientFactory;

public class ManafactureOneFactory extends AbstractFactory {
    @Override
    protected Transport createTransport(String transportName) {
        Transport transport;
        IngredientFactory ingredientFactory = new ManafactureOneIngredientFactory();
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
