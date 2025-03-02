package com.designPatterns.nonTerminalExpression;

import com.designPatterns.abstractExpression.Expression;
import java.util.Map;

public class AddExpression implements Expression {
    private Expression left, right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
