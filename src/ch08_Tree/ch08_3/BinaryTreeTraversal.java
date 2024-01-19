package ch08_Tree.ch08_3;

import ch08_Tree.ch08_2.BinaryTree;

public class BinaryTreeTraversal {

    // 전위 순회
    public static void preorderTraverse(BinaryTree binaryTree, BinaryTreeNodeDataHandler binaryTreeNodeDataHandler) {
        if (binaryTree == null)    // bt가 null 이면 재귀 탈출!
            return;

        binaryTreeNodeDataHandler.handle(binaryTree);
        preorderTraverse(binaryTree.getLeftSubTree(), binaryTreeNodeDataHandler);
        preorderTraverse(binaryTree.getRightSubTree(), binaryTreeNodeDataHandler);
    }

    // 중위 순회
    public static void inorderTraverse(BinaryTree binaryTree, BinaryTreeNodeDataHandler binaryTreeNodeDataHandler) {
        if (binaryTree == null)    // bt가 null 이면 재귀 탈출!
            return;

        inorderTraverse(binaryTree.getLeftSubTree(), binaryTreeNodeDataHandler);
        binaryTreeNodeDataHandler.handle(binaryTree);
        inorderTraverse(binaryTree.getRightSubTree(), binaryTreeNodeDataHandler);
    }

    // 후위 순회
    public static void postorderTraverse(BinaryTree binaryTree, BinaryTreeNodeDataHandler binaryTreeNodeDataHandler) {
        if (binaryTree == null)    // bt가 null 이면 재귀 탈출!
            return;

        postorderTraverse(binaryTree.getLeftSubTree(), binaryTreeNodeDataHandler);
        postorderTraverse(binaryTree.getRightSubTree(), binaryTreeNodeDataHandler);
        binaryTreeNodeDataHandler.handle(binaryTree);
    }
}
