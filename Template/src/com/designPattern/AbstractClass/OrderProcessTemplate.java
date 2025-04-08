package com.designPattern.AbstractClass;

// In /template/OrderProcessTemplate.java
public abstract class OrderProcessTemplate {

    // Template method
    public final void processOrder() {
        selectItems();
        makePayment();
        deliver();
    }

    protected void selectItems() {
        System.out.println("Items selected.");
    }

    protected abstract void makePayment();  // to be implemented by subclass
    protected abstract void deliver();      // to be implemented by subclass
}
