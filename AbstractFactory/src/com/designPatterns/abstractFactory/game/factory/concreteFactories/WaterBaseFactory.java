package com.designPatterns.abstractFactory.game.factory.concreteFactories;

import com.designPatterns.abstractFactory.game.factory.abstractFactory.BaseFactory;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Artifact;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Enemy;

import com.designPatterns.abstractFactory.game.product.concreteProducts.heroes.WaterBaseHero;
import com.designPatterns.abstractFactory.game.product.concreteProducts.enemies.WaterBaseEnemy;
import com.designPatterns.abstractFactory.game.product.concreteProducts.artifacts.WaterBaseArtifact;

public class WaterBaseFactory implements BaseFactory {
    @Override
    public Hero createHero() {
        return new WaterBaseHero();
    }

    @Override
    public Enemy createEnemy() {
        return new WaterBaseEnemy();
    }

    @Override
    public Artifact createArtifact() {
        return new WaterBaseArtifact();
    }
}
