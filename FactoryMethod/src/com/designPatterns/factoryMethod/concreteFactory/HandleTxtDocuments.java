package com.designPatterns.factoryMethod.concreteFactory;

import com.designPatterns.factoryMethod.product.DocumentHandler;
import com.designPatterns.factoryMethod.factory.DocumentFactory;
import com.designPatterns.factoryMethod.concreteProduct.TxtDocumentHandler;

// ConcreteFactory class

public class HandleTxtDocuments implements DocumentFactory {
    @Override
    public DocumentHandler createDocumentHandler() {
        return new TxtDocumentHandler(); // Return concrete product
    }
}
