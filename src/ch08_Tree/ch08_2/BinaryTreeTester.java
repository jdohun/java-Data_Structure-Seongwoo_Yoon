package ch08_Tree.ch08_2;

public class BinaryTreeTester {
    public static void test() {
        BinaryTree<Integer> bt1 = new BinaryTree<>();
        BinaryTree<Integer> bt2 = new BinaryTree<>();
        BinaryTree<Integer> bt3 = new BinaryTree<>();
        BinaryTree<Integer> bt4 = new BinaryTree<>();

        bt1.setData(1);
        bt2.setData(2);
        bt3.setData(3);
        bt4.setData(4);

        bt1.setLeftSubTree(bt2);
        bt1.setRightSubTree(bt3);
        bt2.setLeftSubTree(bt4);

        // bt1의 왼쪽 자식 노드의 데이터 출력
        System.out.printf("%d \n", bt1.getLeftSubTree().getData());

        // bt1의 왼쪽 자식 노드의 왼쪽 자식 노드의 데이터 출력
        System.out.printf("%d \n", bt1.getLeftSubTree().getLeftSubTree().getData());
    }
}
