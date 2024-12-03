package com.designPatterns.abstractFactory.game.client;

import com.designPatterns.abstractFactory.game.factory.abstractFactory.BaseFactory;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Hero;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Enemy;
import com.designPatterns.abstractFactory.game.product.abstractProduct.Artifact;
import com.designPatterns.abstractFactory.game.factory.concreteFactories.FireBaseFactory;
import com.designPatterns.abstractFactory.game.factory.concreteFactories.IceBaseFactory;
import com.designPatterns.abstractFactory.game.factory.concreteFactories.WaterBaseFactory;

public class GameApplication {
    private final Hero hero;
    private final Enemy enemy;
    private final Artifact artifact;

    public GameApplication(BaseFactory factory) {
        hero = factory.createHero();
        enemy = factory.createEnemy();
        artifact = factory.createArtifact();
    }

    public void startGame() {
        System.out.println("Game Starting...\n");
        hero.battleCry();
        enemy.attack();
        artifact.use();
    }

    public static void main(String[] args) {
        BaseFactory firebaseFactory = new FireBaseFactory();
        GameApplication firebaseGame = new GameApplication(firebaseFactory);
        firebaseGame.startGame();  // Outputs Firebase specific actions

        System.out.println("\n-----");

        BaseFactory iceBaseFactory = new IceBaseFactory();
        GameApplication iceBaseGame = new GameApplication(iceBaseFactory);
        iceBaseGame.startGame();  // Outputs IceBase specific actions

        System.out.println("\n-----");

        BaseFactory waterBaseFactory = new WaterBaseFactory();
        GameApplication waterBaseGame = new GameApplication(waterBaseFactory);
        waterBaseGame.startGame();  // Outputs WaterBase specific actions
    }
}