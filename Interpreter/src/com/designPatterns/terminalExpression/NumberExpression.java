package com.designPatterns.terminalExpression;

import com.designPatterns.abstractExpression.Expression;
import java.util.Map;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return number;
    }
}