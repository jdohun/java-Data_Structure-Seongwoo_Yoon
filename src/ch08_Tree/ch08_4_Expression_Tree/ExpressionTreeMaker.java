package ch08_Tree.ch08_4_Expression_Tree;

import ch06_Stack.ch06_4.ListBasedStack;
import ch08_Tree.ch08_2.BinaryTree;
import ch08_Tree.ch08_2.BinaryTreeNodeADT;
import ch08_Tree.ch08_3.BinaryTreeTraversal;

public class ExpressionTreeMaker {

    public static BinaryTree makeExpressionTree(char[] expression) {
        ListBasedStack<BinaryTree> listBasedStack = new ListBasedStack<>();
        int expressionLen = expression.length;

        for (int i = 0; i < expressionLen; i++) {
            BinaryTree binaryTree;
            if (Character.isDigit(expression[i])) {
                binaryTree = new BinaryTree<Integer>(expression[i] - '0');
            } else {    // 연산자이면
                binaryTree = new BinaryTree<Character>(expression[i]);
                binaryTree.setRightSubTree(listBasedStack.pop());
                binaryTree.setLeftSubTree(listBasedStack.pop());
            }
            listBasedStack.push(binaryTree);
        }
        return listBasedStack.pop();
    }

    public static int evaluateExpressionTree(BinaryTree binaryTree) {
        if (binaryTree.getLeftSubTree() == null &&
                binaryTree.getRightSubTree() == null) { // 단말 노드라면
            return (int) binaryTree.getData();
        }

        int operand1 = evaluateExpressionTree(binaryTree.getLeftSubTree());
        int operand2 = evaluateExpressionTree(binaryTree.getRightSubTree());

        switch ((char) binaryTree.getData()) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
        }
        return 0;
    }

    public static void showPrefixTypeExpression(BinaryTree<Character> binaryTree) {
        BinaryTreeTraversal.preorderTraverse(binaryTree, ExpressionTreeMaker::ShowNodeData);
    }

    public static void showInfixTypeExpression(BinaryTree<Character> binaryTree) {
        BinaryTreeTraversal.inorderTraverse(binaryTree, ExpressionTreeMaker::ShowNodeData);
    }

    public static void showPostfixTypeExpression(BinaryTree<Character> binaryTree) {
        BinaryTreeTraversal.postorderTraverse(binaryTree, ExpressionTreeMaker::ShowNodeData);
    }

    private static void ShowNodeData(BinaryTreeNodeADT binaryTree) {
        final Object data = binaryTree.getData();

        if (data instanceof Number) {
            if (0 <= (int) data && (int) data <= 9) {
                System.out.printf("%d ", data);
            }
        }
        if (data instanceof Character) {
            System.out.printf("%c ", data);
        }
    }

    private static void showIntData(BinaryTreeNodeADT binaryTree) {
        System.out.printf("%d ", binaryTree.getData());
    }
}
