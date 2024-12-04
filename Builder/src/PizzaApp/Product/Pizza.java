package PizzaApp.Product;

import PizzaApp.Toppings.Cheese;
import PizzaApp.Toppings.Pepperoni;
import PizzaApp.Toppings.Veggies;

import java.util.List;

public class Pizza {
    private String size;
    private String crustType;
    private List<String> toppings;
    private boolean isExtraCheese;
    private boolean isExtraSauce;

    // Constructor (can be private or package-private to enforce builder usage)
    public Pizza(String size, String crustType, List<String> toppings, boolean isExtraCheese, boolean isExtraSauce) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
        this.isExtraCheese = isExtraCheese;
        this.isExtraSauce = isExtraSauce;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "Size='" + size + '\'' +
                ", Crust='" + crustType + '\'' +
                ", Toppings=" + toppings +
                ", Extra Cheese=" + isExtraCheese +
                ", Extra Sauce=" + isExtraSauce +
                '}';
    }

    // Getters for Pizza properties
    public String getSize() { return size; }
    public String getCrustType() { return crustType; }
    public List<String> getToppings() { return toppings; }
    public boolean isExtraCheese() { return isExtraCheese; }
    public boolean isExtraSauce() { return isExtraSauce; }
}
