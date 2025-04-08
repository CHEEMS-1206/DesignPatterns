import com.designPattern.ConcreteElement.Circle;
import com.designPattern.ConcreteElement.Rectangle;
import com.designPattern.ConcreteVisitor.AreaCalculator;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // visitors
        AreaCalculator area = new AreaCalculator();

        circle.accept(area);
        rectangle.accept(area);
    }
}