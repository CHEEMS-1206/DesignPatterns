import com.designPatterns.component.Coffee;
import com.designPatterns.component.Component;
import com.designPatterns.decorators.AddSugar;

public class Main {
    public static void main(String[] args) {
        Component milkCoffee = new Coffee(10);
        System.out.println(milkCoffee.getCoffeePrice());

        Component coffeeWithSugar = new AddSugar(milkCoffee,2);
        System.out.println(coffeeWithSugar.getCoffeePrice());
    }
}