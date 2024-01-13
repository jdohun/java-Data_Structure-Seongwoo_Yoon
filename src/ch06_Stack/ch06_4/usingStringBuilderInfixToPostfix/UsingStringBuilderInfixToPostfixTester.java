package ch06_Stack.ch06_4.usingStringBuilderInfixToPostfix;

public class UsingStringBuilderInfixToPostfixTester {
    public static void test() {
        StringBuilder expression1 = new StringBuilder("1+2*3");
        StringBuilder expression2 = new StringBuilder("(1+2)*3");
        StringBuilder expression3 = new StringBuilder("((1-2)+3)*(5-2)");

        final StringBuilder conversion1 = UsingStringBuilderInfixToPostfix.ConversionToReversePolishNotationExpression(expression1);
        final StringBuilder conversion2 = UsingStringBuilderInfixToPostfix.ConversionToReversePolishNotationExpression(expression2);
        final StringBuilder conversion3 = UsingStringBuilderInfixToPostfix.ConversionToReversePolishNotationExpression(expression3);

        System.out.println(conversion1); // 123*+
        System.out.println(conversion2); // 12+3*
        System.out.println(conversion3); // 12-3+52-*
    }
}
