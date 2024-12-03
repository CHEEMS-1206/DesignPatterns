package com.designPatterns.abstractFactory.game.product.concreteProducts.heroes;

import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;

public class WaterBaseHero implements Hero {
    @Override
    public void battleCry() {
        System.out.println("Water Base Hero Battle Cry!");
    }
}
