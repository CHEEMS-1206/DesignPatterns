package com.designPatterns.abstractFactory.game.product.concreteProducts.artifacts;

import com.designPatterns.abstractFactory.game.product.abstractProduct.Artifact;

public class FireBaseArtifact implements Artifact {
    @Override
    public void use() {
        System.out.println("Using Firebase Artifact!");
    }
}