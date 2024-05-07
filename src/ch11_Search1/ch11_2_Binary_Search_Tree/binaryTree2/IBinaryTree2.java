package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

public interface IBinaryTree2 {
    int getData();

    void setData(int data);

    BinaryTree2 getLeftSubTree();

    BinaryTree2 getRightSubTree();

    void makeLeftSubTree(BinaryTree2 sub);

    void makeRightSubTree(BinaryTree2 sub);
}
