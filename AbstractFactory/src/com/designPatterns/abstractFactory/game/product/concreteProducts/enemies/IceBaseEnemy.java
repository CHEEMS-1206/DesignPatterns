package com.designPatterns.abstractFactory.game.product.concreteProducts.enemies;

import com.designPatterns.abstractFactory.game.product.abstractProduct.Enemy;

public class IceBaseEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Ice Base Enemy Attacks!");
    }
}