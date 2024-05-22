package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

public interface IBinaryTree2 {
    Integer getData();

    void setData(Integer data);

    IBinaryTree2 getLeftSubTree();

    IBinaryTree2 getRightSubTree();

    void makeLeftSubTree(IBinaryTree2 sub);

    void makeRightSubTree(IBinaryTree2 sub);
}
