package com.designPatterns.abstractFactory.game.factory.concreteFactories;

import com.designPatterns.abstractFactory.game.factory.abstractFactory.BaseFactory;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Artifact;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Enemy;

import com.designPatterns.abstractFactory.game.product.concreteProducts.heroes.FireBaseHero;
import com.designPatterns.abstractFactory.game.product.concreteProducts.enemies.FireBaseEnemy;
import com.designPatterns.abstractFactory.game.product.concreteProducts.artifacts.FireBaseArtifact;

public class FireBaseFactory implements BaseFactory {
    @Override
    public Hero createHero() {
        return new FireBaseHero();
    }

    @Override
    public Enemy createEnemy() {
        return new FireBaseEnemy();
    }

    @Override
    public Artifact createArtifact() {
        return new FireBaseArtifact();
    }
}
