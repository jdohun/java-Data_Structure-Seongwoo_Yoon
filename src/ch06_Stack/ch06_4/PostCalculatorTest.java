package ch06_Stack.ch06_4;

public class PostCalculatorTest {
    public static void test() {
        char[] postExp1 = "42*8+".toCharArray();
        char[] postExp2 = "123+*4/".toCharArray();

        System.out.printf("%s = %d%n", new String(postExp1), PostCalculator.evaluateReversePolishNotationExpression(postExp1));
        System.out.printf("%s = %d%n", new String(postExp2), PostCalculator.evaluateReversePolishNotationExpression(postExp2));
    }
}
