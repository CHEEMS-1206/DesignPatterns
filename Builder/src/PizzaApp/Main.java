package PizzaApp;

import PizzaApp.Builder.PizzaBuilder;
import PizzaApp.Builder.PizzaDirector;
import PizzaApp.Product.Pizza;

public class Main {
    public static void main(String[] args) {
        // Create a pizza builder instance
        PizzaBuilder builder = new PizzaBuilder();

        // Create director to manage pizza creation process
        PizzaDirector director = new PizzaDirector(builder);

        // Construct a Margherita pizza
        Pizza margheritaPizza = director.constructMargheritaPizza();
        System.out.println(margheritaPizza);

        // Construct a Pepperoni pizza
        Pizza pepperoniPizza = director.constructPepperoniPizza();
        System.out.println(pepperoniPizza);

        // Create a custom pizza using the builder directly
        Pizza customPizza = builder.setSize("Medium")
                .setCrustType("Stuffed")
                .addTopping("Cheese")
                .addTopping("Pepperoni")
                .addTopping("Olives")
                .addExtraCheese(true)
                .addExtraSauce(true)
                .build();
        System.out.println(customPizza);
    }
}
