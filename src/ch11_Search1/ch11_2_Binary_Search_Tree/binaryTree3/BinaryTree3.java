package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3;

public class BinaryTree3 implements IBinaryTree3 {
    private Integer data;
    private IBinaryTree3 left;
    private IBinaryTree3 right;

    @Override
    public Integer getData() {
        return this.data;
    }

    @Override
    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public IBinaryTree3 getLeftSubTree() {
        return left;
    }

    @Override
    public IBinaryTree3 getRightSubTree() {
        return right;
    }

    @Override
    public void makeLeftSubTree(IBinaryTree3 sub) {
        this.left = sub;
    }

    @Override
    public void makeRightSubTree(IBinaryTree3 sub) {
        this.right = sub;
    }

    @Override
    public IBinaryTree3 removeLeftSubTree() {
        IBinaryTree3 delNode = null;

        if (data != null) {
            delNode = left;
            // left = null;
        }
        return delNode;
    }

    @Override
    public IBinaryTree3 removeRightSubTree() {
        IBinaryTree3 delNode = null;

        if (data != null) {
            delNode = right;
            // right = null;
        }
        return delNode;
    }

    @Override
    public void changeLeftSubTree(IBinaryTree3 sub) {
        left = sub;
    }

    @Override
    public void changeRightSubTree(IBinaryTree3 sub) {
        right = sub;
    }
}
