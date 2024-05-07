package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

public interface IBinaryTreeTraversal {
    void preorderTraverse(BinaryTree2 btNode, VisitFuncPointer action);
    void inorderTraverse(BinaryTree2 btNode, VisitFuncPointer action);
    void postorderTraverse(BinaryTree2 btNode, VisitFuncPointer action);
}
