package com.designPattern.ConcreteClasses;

import com.designPattern.AbstractClass.OrderProcessTemplate;

// In /template/OnlineOrder.java
public class OnlineOrder extends OrderProcessTemplate {
    protected void makePayment() {
        System.out.println("Paid online through net banking.");
    }

    protected void deliver() {
        System.out.println("Delivered via courier.");
    }
}
