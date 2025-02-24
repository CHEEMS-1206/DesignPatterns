package com.designPatterns.component;

import com.designPatterns.component.Component;

public class Coffee implements Component{
    private int coffeePrice;

    public Coffee(int price){
        coffeePrice = price;
    }

    @Override
    public int getCoffeePrice() {
        return coffeePrice;
    }
}
