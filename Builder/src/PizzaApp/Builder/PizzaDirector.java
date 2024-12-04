package PizzaApp.Builder;

import PizzaApp.Product.Pizza;

public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }
    // A method to create a specific pizza
    public Pizza constructMargheritaPizza() {
        return builder.setSize("Medium")
                .setCrustType("Thin")
                .addTopping("Cheese")
                .addTopping("Tomato")
                .addExtraCheese(true)
                .addExtraSauce(false)
                .build();
    }
    public Pizza constructPepperoniPizza() {
        return builder.setSize("Large")
                .setCrustType("Thick")
                .addTopping("Pepperoni")
                .addTopping("Cheese")
                .addExtraCheese(false)
                .addExtraSauce(true)
                .build();
    }
}
