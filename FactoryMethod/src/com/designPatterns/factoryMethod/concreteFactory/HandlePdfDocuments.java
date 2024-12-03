package com.designPatterns.factoryMethod.concreteFactory;

import com.designPatterns.factoryMethod.product.DocumentHandler;
import com.designPatterns.factoryMethod.factory.DocumentFactory;
import com.designPatterns.factoryMethod.concreteProduct.PdfDocumentHandler;

// ConcreteFactory class

public class HandlePdfDocuments implements DocumentFactory {
    @Override
    public DocumentHandler createDocumentHandler() {
        return new PdfDocumentHandler(); // Return concrete product
    }
}
