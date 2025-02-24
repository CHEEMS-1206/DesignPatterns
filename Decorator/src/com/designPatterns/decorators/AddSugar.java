package com.designPatterns.decorators;

import com.designPatterns.component.Coffee;
import com.designPatterns.component.Component;

public class AddSugar implements Decorator{
    private Component coffee;
    private int sugarCost;

    public AddSugar(Component coffee, int sugarCost){
        this.coffee = coffee;
        this.sugarCost = sugarCost;
    }

    @Override
    public int getCoffeePrice() {
        return coffee.getCoffeePrice() + sugarCost;
    }
}
