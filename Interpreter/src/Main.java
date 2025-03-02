import com.designPatterns.abstractExpression.Expression;
import com.designPatterns.nonTerminalExpression.AddExpression;
import com.designPatterns.nonTerminalExpression.SubtractExpression;
import com.designPatterns.terminalExpression.NumberExpression;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating the expression: (5 + 3 - 2)
        Expression expression = new SubtractExpression(
                new AddExpression(
                        new NumberExpression(5),
                        new NumberExpression(3)
                ),
                new NumberExpression(2)
        );

        // Interpret and evaluate the expression
        int result = expression.interpret(Map.of());
        System.out.println("Result: " + result);  // Output: 6
    }
}