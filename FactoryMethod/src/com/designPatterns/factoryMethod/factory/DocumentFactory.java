package com.designPatterns.factoryMethod.factory;

// Factory Interface

import com.designPatterns.factoryMethod.product.DocumentHandler;

public abstract interface DocumentFactory {
    public abstract DocumentHandler createDocumentHandler();
}
