package com.designPatterns.adapter.adaptors;

import com.designPatterns.adapter.adaptees.CurrencyAPI1;
import com.designPatterns.adapter.target.CurrencyAPI;

// Adapter for CurrencyAPI1
public class CurrencyAdapterAPI1 implements CurrencyAPI {
    private CurrencyAPI1 api1;  // Reference to the Adaptee (CurrencyAPI1)

    // Constructor
    public CurrencyAdapterAPI1(CurrencyAPI1 api1) {
        this.api1 = api1;
    }

    // Implementation of the method from the target interface
    @Override
    public String getCurrencyData() {
        // Adapt the response from CurrencyAPI1 to the target interface's format
        return api1.fetchCurrencyDataFromAPI1();
    }
}

