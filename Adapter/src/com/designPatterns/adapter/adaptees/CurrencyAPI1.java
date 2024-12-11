package com.designPatterns.adapter.adaptees;

// Adaptee 1: Represents an external currency API with a different interface
public class CurrencyAPI1 {
    // This method returns currency data in a different format
    public String fetchCurrencyDataFromAPI1() {
        return "Currency Data from API1: USD, EUR, GBP, JPY";
    }
}

