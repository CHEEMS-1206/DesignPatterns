package com.designPattern.Context;
import com.designPattern.Strategy.PaymentStrategy;


// In /context/PaymentContext.java
public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        if (strategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        strategy.pay(amount);
    }
}
