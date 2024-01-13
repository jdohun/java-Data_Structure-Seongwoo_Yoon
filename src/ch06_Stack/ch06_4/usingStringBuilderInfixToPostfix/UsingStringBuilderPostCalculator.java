package ch06_Stack.ch06_4.usingStringBuilderInfixToPostfix;

import ch06_Stack.ch06_1.StackADT;
import ch06_Stack.ch06_4.ListBasedStack;

public class UsingStringBuilderPostCalculator {
    public static int evaluateReversePolishNotationExpression(StringBuilder expression) {
        StackADT<Integer> stack = new ListBasedStack<>();
        int expressionLen = expression.length();
        char token;
        int operation1;
        int operation2;

        for (int i = 0; i < expressionLen; i++) {
            token = expression.charAt(i);

            if (Character.isDigit(token)) { // 피연산자(숫자)이면
                stack.push(token - '0'); // 문자가 숫자와 동일한 값이 되도록 '0' 을 감소
            } else { // 연산자이면
                operation2 = stack.pop();
                operation1 = stack.pop();

                switch (token) {
                    case '+':
                        stack.push(operation1 + operation2);
                        break;
                    case '-':
                        stack.push(operation1 - operation2);
                        break;
                    case '*':
                        stack.push(operation1 * operation2);
                        break;
                    case '/':
                        stack.push(operation1 / operation2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
