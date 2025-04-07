package com.designPattern.ConcreteStrategies;

import com.designPattern.Strategy.PaymentStrategy;

// In /strategy/CreditCardPayment.java
public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}