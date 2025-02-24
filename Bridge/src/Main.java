import com.designPatterns.Implementation.Color;
import com.designPatterns.ConcreteImplementation.BlueColor;
import com.designPatterns.ConcreteImplementation.RedColor;

import com.designPatterns.RefinedAbstraction.CircleShape;
import com.designPatterns.RefinedAbstraction.SquareShape;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();

        SquareShape sqRed = new SquareShape(red);
        SquareShape sqBlue = new SquareShape(blue);

        CircleShape crRed = new CircleShape(red);
        CircleShape crBlue = new CircleShape(blue);

        sqRed.draw();
        sqBlue.draw();
        crRed.draw();
        crBlue.draw();
    }
}