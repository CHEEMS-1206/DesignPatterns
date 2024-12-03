package com.designPatterns.abstractFactory.game.product.concreteProducts.heroes;

import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;

public class IceBaseHero implements Hero {
    @Override
    public void battleCry() {
        System.out.println("Ice Base Hero Battle Cry!");
    }
}
