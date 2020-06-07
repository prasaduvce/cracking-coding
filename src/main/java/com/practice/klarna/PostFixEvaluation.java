package com.practice.klarna;

import java.util.Stack;

public class PostFixEvaluation {

    public static void main(String[] args) {
        PostFixEvaluation postFixEvaluation = new PostFixEvaluation();
        String expr = "5 1 2 + 4 * + 3 -";

        System.out.println("Result ==> "+postFixEvaluation.evaluate(expr));
    }

    public double evaluate(String expr) {
        if (expr.isEmpty()) {
            return 0;
        }
        String[] stringSplits = expr.split(" ");
        Stack<Double> numStack = new Stack<>();
        for (String subString: stringSplits) {
            try {
                double item = Double.parseDouble(subString);
                numStack.push(item);
            } catch (Exception e) {
                Double operand2 = numStack.pop();
                Double operand1 = numStack.pop();
                Double result = performCalculation(operand1, operand2, subString);
                numStack.push(result);
            }
        }
        return numStack.pop();
    }

    private static double performCalculation(Double num1, Double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
            default: throw new IllegalArgumentException("Unexpected operation, operator "+operator+" is invalid");
        }
    }
}
