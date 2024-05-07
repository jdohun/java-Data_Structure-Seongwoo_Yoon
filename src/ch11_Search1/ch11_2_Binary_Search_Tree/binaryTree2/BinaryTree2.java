package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

public class BinaryTree2 implements IBinaryTree2 {
    private int data;
    private BinaryTree2 left;
    private BinaryTree2 right;

    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void setData(int data) {
        this.data = data;
    }

    @Override
    public BinaryTree2 getLeftSubTree() {
        return left;
    }

    @Override
    public BinaryTree2 getRightSubTree() {
        return right;
    }

    @Override
    public void makeLeftSubTree(BinaryTree2 sub) {
        this.left = sub;
    }

    @Override
    public void makeRightSubTree(BinaryTree2 sub) {
        this.right = sub;
    }
}
