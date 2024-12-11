package com.designPatterns.adapter.adaptors;

import com.designPatterns.adapter.adaptees.CurrencyAPI2;
import com.designPatterns.adapter.target.CurrencyAPI;

// Adapter for CurrencyAPI2
public class CurrencyAdapterAPI2 implements CurrencyAPI {
    private CurrencyAPI2 api2;  // Reference to the Adaptee (CurrencyAPI2)

    // Constructor
    public CurrencyAdapterAPI2(CurrencyAPI2 api2) {
        this.api2 = api2;
    }

    // Implementation of the method from the target interface
    @Override
    public String getCurrencyData() {
        // Adapt the response from CurrencyAPI2 to the target interface's format
        return api2.retrieveCurrencyInfo();
    }
}
