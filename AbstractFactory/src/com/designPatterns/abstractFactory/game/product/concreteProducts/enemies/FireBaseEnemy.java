package com.designPatterns.abstractFactory.game.product.concreteProducts.enemies;

import com.designPatterns.abstractFactory.game.product.abstractProduct.Enemy;

public class FireBaseEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Firebase Enemy Attacks!");
    }
}
