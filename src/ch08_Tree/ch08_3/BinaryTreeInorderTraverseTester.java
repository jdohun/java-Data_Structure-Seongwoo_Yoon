package ch08_Tree.ch08_3;

import ch08_Tree.ch08_2.BinaryTree;

public class BinaryTreeInorderTraverseTester {
    public static void test() {
        BinaryTree<Integer> bt1 = new BinaryTree<>(1);
        BinaryTree<Integer> bt2 = new BinaryTree<>(2);
        BinaryTree<Integer> bt3 = new BinaryTree<>(3);
        BinaryTree<Integer> bt4 = new BinaryTree<>(4);

        bt1.setLeftSubTree(bt2);
        bt1.setRightSubTree(bt3);

        bt2.setLeftSubTree(bt4);

        inorderTraverse(bt1); // 4 2 1 3
    }

    // 중위 순회
    public static void inorderTraverse(BinaryTree binaryTree) {
        if (binaryTree == null)    // bt가 null 이면 재귀 탈출!
            return;

        inorderTraverse(binaryTree.getLeftSubTree());
        System.out.printf("%d ", binaryTree.getData());
        inorderTraverse(binaryTree.getRightSubTree());
    }
}
