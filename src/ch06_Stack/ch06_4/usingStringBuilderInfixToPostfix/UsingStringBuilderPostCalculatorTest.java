package ch06_Stack.ch06_4.usingStringBuilderInfixToPostfix;

public class UsingStringBuilderPostCalculatorTest {
    public static void test() {
        StringBuilder postExp1 = new StringBuilder("42*8+");
        StringBuilder postExp2 = new StringBuilder("123+*4/");

        System.out.printf("%s = %d%n", postExp1, UsingStringBuilderPostCalculator.evaluateReversePolishNotationExpression(postExp1));
        System.out.printf("%s = %d%n", postExp2, UsingStringBuilderPostCalculator.evaluateReversePolishNotationExpression(postExp2));
    }
}
