package com.designPattern.ConcreteClasses;


import com.designPattern.AbstractClass.OrderProcessTemplate;

// In /template/StorePickupOrder.java
public class StorePickUpOrder extends OrderProcessTemplate {
    protected void makePayment() {
        System.out.println("Paid at the store.");
    }

    protected void deliver() {
        System.out.println("Picked up in-store. No delivery needed.");
    }
}