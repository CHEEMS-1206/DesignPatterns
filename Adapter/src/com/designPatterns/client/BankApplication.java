package com.designPatterns.client;

import com.designPatterns.adapter.target.CurrencyAPI;
import com.designPatterns.adapter.adaptees.CurrencyAPI1;
import com.designPatterns.adapter.adaptees.CurrencyAPI2;
import com.designPatterns.adapter.adaptors.CurrencyAdapterAPI1;
import com.designPatterns.adapter.adaptors.CurrencyAdapterAPI2;

// Client Code: This is the UI or the main application code
public class BankApplication {
    public static void main(String[] args) {
        // Create instances of the Adaptees (API1 and API2)
        CurrencyAPI1 api1 = new CurrencyAPI1();
        CurrencyAPI2 api2 = new CurrencyAPI2();

        // Create adapters for both APIs
        CurrencyAPI apiAdapter1 = new CurrencyAdapterAPI1(api1);
        CurrencyAPI apiAdapter2 = new CurrencyAdapterAPI2(api2);

        // The client interacts with the common interface (CurrencyAPI)
        System.out.println("Fetching currency data from API1: " + apiAdapter1.getCurrencyData());
        System.out.println("Fetching currency data from API2: " + apiAdapter2.getCurrencyData());
    }
}
