import com.designPattern.AbstractClass.OrderProcessTemplate;
import com.designPattern.ConcreteClasses.OnlineOrder;
import com.designPattern.ConcreteClasses.StorePickUpOrder;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate order1 = new OnlineOrder();
        order1.processOrder();

        System.out.println("------");

        OrderProcessTemplate order2 = new StorePickUpOrder();
        order2.processOrder();
    }
}
