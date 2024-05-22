package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

public class BinaryTree2 implements IBinaryTree2 {
    private Integer data;
    private IBinaryTree2 left;
    private IBinaryTree2 right;

    @Override
    public Integer getData() {
        return this.data;
    }

    @Override
    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public IBinaryTree2 getLeftSubTree() {
        return left;
    }

    @Override
    public IBinaryTree2 getRightSubTree() {
        return right;
    }

    @Override
    public void makeLeftSubTree(IBinaryTree2 sub) {
        this.left = sub;
    }

    @Override
    public void makeRightSubTree(IBinaryTree2 sub) {
        this.right = sub;
    }
}
