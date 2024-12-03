package com.designPatterns.abstractFactory.game.product.concreteProducts.heroes;

import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;

public class FireBaseHero implements Hero {
    @Override
    public void battleCry() {
        System.out.println("Firebase Hero Battle Cry!");
    }
}
