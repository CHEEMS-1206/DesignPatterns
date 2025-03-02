package com.designPatterns.abstractExpression;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> context);
}