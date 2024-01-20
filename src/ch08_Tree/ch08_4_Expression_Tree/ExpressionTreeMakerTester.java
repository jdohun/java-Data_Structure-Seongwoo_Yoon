package ch08_Tree.ch08_4_Expression_Tree;

import ch08_Tree.ch08_2.BinaryTree;

public class ExpressionTreeMakerTester {
    public static void test() {
        char expression[] = "12+7*".toCharArray();
        final BinaryTree expressionBinaryTree = ExpressionTreeMaker.makeExpressionTree(expression);

        System.out.print("전위 표기법의 수식: ");
        ExpressionTreeMaker.showPrefixTypeExpression(expressionBinaryTree); // * + 1 2 7
        System.out.println();

        System.out.print("중위 표기법의 수식: ");
        ExpressionTreeMaker.showInfixTypeExpression(expressionBinaryTree); // 1 + 2 * 7
        System.out.println();

        System.out.print("후위 표기법의 수식: ");
        ExpressionTreeMaker.showPostfixTypeExpression(expressionBinaryTree); // 1 2 + 7 *
        System.out.println();

        System.out.printf("연산의 결과: %d \n", ExpressionTreeMaker.evaluateExpressionTree(expressionBinaryTree));
    }
}
