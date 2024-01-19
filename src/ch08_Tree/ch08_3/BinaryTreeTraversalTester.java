package ch08_Tree.ch08_3;

import ch08_Tree.ch08_2.BinaryTree;
import ch08_Tree.ch08_2.BinaryTreeNodeADT;

public class BinaryTreeTraversalTester {
    public static void test() {
        BinaryTree<Integer> bt1 = new BinaryTree<>(1);
        BinaryTree<Integer> bt2 = new BinaryTree<>(2);
        BinaryTree<Integer> bt3 = new BinaryTree<>(3);
        BinaryTree<Integer> bt4 = new BinaryTree<>(4);
        BinaryTree<Integer> bt5 = new BinaryTree<>(5);
        BinaryTree<Integer> bt6 = new BinaryTree<>(6);

        bt1.setLeftSubTree(bt2);
        bt1.setRightSubTree(bt3);

        bt2.setLeftSubTree(bt4);
        bt2.setRightSubTree(bt5);

        bt3.setRightSubTree(bt6);

        BinaryTreeTraversal.preorderTraverse(bt1, binaryTreeNodeDataViewer);    // 1 2 4 5 3 6
        System.out.println();

        BinaryTreeTraversal.inorderTraverse(bt1, binaryTreeNodeDataViewer);     // 4 2 5 1 3 6
        System.out.println();

        BinaryTreeTraversal.postorderTraverse(bt1, binaryTreeNodeDataViewer);   // 4 5 2 6 3 1
        System.out.println();
    }

    private static BinaryTreeNodeDataHandler binaryTreeNodeDataViewer = BinaryTreeTraversalTester::showIntData;

    private static void showIntData(BinaryTreeNodeADT binaryTree) {
        System.out.printf("%d ", binaryTree.getData());
    }
}
