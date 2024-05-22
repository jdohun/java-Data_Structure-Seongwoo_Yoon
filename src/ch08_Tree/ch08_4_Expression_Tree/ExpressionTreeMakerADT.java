package ch08_Tree.ch08_4_Expression_Tree;

import ch08_Tree.ch08_2.BinaryTree;

public interface ExpressionTreeMakerADT<E> {

    BinaryTree<E> makeExpressionTree(char[] expression);

    int EvaluateExpressionTree(BinaryTree<E> binaryTree);


    void showPrefixTypeExpression(BinaryTree<E> binaryTree);

    void showInfixTypeExpression(BinaryTree<E> binaryTree);

    void showPostfixTypeExpression(BinaryTree<E> binaryTree);
}
