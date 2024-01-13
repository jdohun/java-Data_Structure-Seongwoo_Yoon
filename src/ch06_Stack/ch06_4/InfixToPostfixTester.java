package ch06_Stack.ch06_4;

public class InfixToPostfixTester {
    public static void test() {
        char[] expression1 = "1+2*3".toCharArray();
        char[] expression2 = "(1+2)*3".toCharArray();
        char[] expression3 = "((1-2)+3)*(5-2)".toCharArray();

        final char[] conversion1 = InfixToPostfix.ConversionToReversePolishNotationExpression(expression1);
        final char[] conversion2 = InfixToPostfix.ConversionToReversePolishNotationExpression(expression2);
        final char[] conversion3 = InfixToPostfix.ConversionToReversePolishNotationExpression(expression3);

        System.out.println(conversion1); // 123*+
        System.out.println(conversion2); // 12+3*
        System.out.println(conversion3); // 12-3+52-*
    }
}
