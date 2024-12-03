package com.designPatterns.abstractFactory.game.factory.abstractFactory;

import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Enemy;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Artifact;

public interface BaseFactory {
    Hero createHero();
    Enemy createEnemy();
    Artifact createArtifact();
}
