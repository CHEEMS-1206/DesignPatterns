package com.designPatterns.abstractFactory.game.factory.concreteFactories;

import com.designPatterns.abstractFactory.game.factory.abstractFactory.BaseFactory;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Artifact;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Enemy;

import com.designPatterns.abstractFactory.game.product.concreteProducts.heroes.IceBaseHero;
import com.designPatterns.abstractFactory.game.product.concreteProducts.enemies.IceBaseEnemy;
import com.designPatterns.abstractFactory.game.product.concreteProducts.artifacts.IceBaseArtifact;

public class IceBaseFactory implements BaseFactory {
    @Override
    public Hero createHero() {
        return new IceBaseHero();
    }

    @Override
    public Enemy createEnemy() {
        return new IceBaseEnemy();
    }

    @Override
    public Artifact createArtifact() {
        return new IceBaseArtifact();
    }
}
