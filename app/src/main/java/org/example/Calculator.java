package org.example;

public class Calculator {

    InfixToPostfix infixToPostfix = new InfixToPostfix();


    private InfixToPostfix conv;
    private PostfixEvaluator eval;

    public double evaluate(String expression) {
        String post = conv.convert(expression);

        return eval.eval(post);
    }
}