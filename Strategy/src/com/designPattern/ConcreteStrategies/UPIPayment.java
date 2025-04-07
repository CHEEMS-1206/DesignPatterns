package com.designPattern.ConcreteStrategies;
import com.designPattern.Strategy.PaymentStrategy;

// In /strategy/UPIPayment.java
public class UPIPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
