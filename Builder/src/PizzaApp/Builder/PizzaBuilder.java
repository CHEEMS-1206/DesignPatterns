package PizzaApp.Builder;

import PizzaApp.Product.Pizza;
import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String size;
    private String crustType;
    private List<String> toppings;
    private boolean isExtraCheese;
    private boolean isExtraSauce;

    // Constructor
    public PizzaBuilder() {
        this.toppings = new ArrayList<>();
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setCrustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public PizzaBuilder addExtraCheese(boolean isExtraCheese) {
        this.isExtraCheese = isExtraCheese;
        return this;
    }

    public PizzaBuilder addExtraSauce(boolean isExtraSauce) {
        this.isExtraSauce = isExtraSauce;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, crustType, toppings, isExtraCheese, isExtraSauce);
    }
}

