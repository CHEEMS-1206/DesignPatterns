package com.designPatterns.adapter.adaptees;

// Adaptee 2: Another external API with a different method
public class CurrencyAPI2 {
    // This method returns currency data in a different format
    public String retrieveCurrencyInfo() {
        return "Currency Data from API2: USD, CAD, AUD, INR";
    }
}


