package ch06_Stack.ch06_4;

import ch06_Stack.ch06_1.StackADT;

public class InfixToPostfix {

    // Reverse Polish Notation == Postfix Notation
    public static char[] ConversionToReversePolishNotationExpression(char[] expression) {
        StackADT<Character> stack = new ListBasedStack<>();
        int expressionLen = expression.length;
        char[] conversionExpression = new char[expressionLen];

        int idx = 0; // conversionExpression 에 저장하기 위해 접근할 인덱스
        char token; // expression 배열 인덱스의 값
        char popOperator; // 스택에서 pop 된 연산자

        for (int i = 0; i < expressionLen; i++) {
            token = expression[i];

            if (Character.isDigit(token)) { // 피연산자(숫자)이면
                conversionExpression[idx++] = token;    // 변환 배열에 저장
            } else {    // 연산자이면
                switch (token) {
                    case '(':   // 여는 소괄호이면
                        stack.push(token);  // 무조건 스택에 쌓는다.
                        break;
                    case ')':   // 닫는 소괄호이면
                        while (true) {
                            popOperator = stack.pop();
                            if (popOperator == '(') break; // 여는 소괄호가 나올 때까지
                            conversionExpression[idx++] = popOperator; // 변환 배열에 저장
                        }
                        break;
                        // 사칙연산일 때
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        // 먼저 스택에 있던 연산자의 우선순위가 더 높으면(현재 토큰의 우선순위가 더 높을 때까지)
                        while (!stack.empty() && compareOperatorPrecedence(stack.peek(), token) >= 0) {
                            conversionExpression[idx++] = stack.pop(); // 변환 배열에 저장
                        }
                        stack.push(token); // 스택이 비거나 토큰의 우선순위가 더 높아지면 스택에 저장
                        break;
                }
            }
        }

        while (!stack.empty()) {
            conversionExpression[idx++] = stack.pop(); // 변환 배열에 저장
        }

        return conversionExpression;
    }

    private static int getOperatorPrecedence(char operator) {
        switch (operator) {
            case '*':
            case '/':
                return 5;
            case '+':
            case '-':
                return 3;
            case '(':
                return 1;
        }
        return -1; // 등록되지 않은 연산자
    }

    private static int compareOperatorPrecedence(char stackOperator, char incomingToken) {
        int stackOperatorPrecedence = getOperatorPrecedence(stackOperator);
        int incomingTokenPrecedence = getOperatorPrecedence(incomingToken);

        if (stackOperatorPrecedence > incomingTokenPrecedence) // 스택에는 * or / 가 있고 token 은 + or - 인 경우
            return 1;
        else if (stackOperatorPrecedence < incomingTokenPrecedence)    // 같은 수준의 연산자인 경우
            return -1;
        else // 스택에는 + or - 가 있고 token 은 * or / 인 경우
            return 0;
    }
}
