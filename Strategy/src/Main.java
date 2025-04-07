import com.designPattern.ConcreteStrategies.*;
import com.designPattern.Context.PaymentContext;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.pay(500);

        context.setPaymentStrategy(new UPIPayment());
        context.pay(300);
    }
}
