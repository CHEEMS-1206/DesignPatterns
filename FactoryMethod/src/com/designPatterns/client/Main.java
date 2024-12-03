package com.designPatterns.client;

import com.designPatterns.factoryMethod.factory.DocumentFactory;
import com.designPatterns.factoryMethod.product.DocumentHandler;
import com.designPatterns.factoryMethod.concreteFactory.HandlePdfDocuments;
import com.designPatterns.factoryMethod.concreteFactory.HandleTxtDocuments;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Use factory for handling .txt documents
        DocumentFactory txtFactory = new HandleTxtDocuments();
        DocumentHandler txtHandler = txtFactory.createDocumentHandler(); // Factory method call
        txtHandler.handleDocument();  // Use the product

        // Use factory for handling .pdf documents
        DocumentFactory pdfFactory = new HandlePdfDocuments();
        DocumentHandler pdfHandler = pdfFactory.createDocumentHandler(); // Factory method call
        pdfHandler.handleDocument();  // Use the product
    }
}