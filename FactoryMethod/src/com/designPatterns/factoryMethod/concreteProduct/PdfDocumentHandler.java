package com.designPatterns.factoryMethod.concreteProduct;

import com.designPatterns.factoryMethod.product.DocumentHandler;

// ConcreteProduct class
public class PdfDocumentHandler implements DocumentHandler {
    @Override
    public void handleDocument() {
        System.out.println("Handling a .pdf document...");
    }
}
