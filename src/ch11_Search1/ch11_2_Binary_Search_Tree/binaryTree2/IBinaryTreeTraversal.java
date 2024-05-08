package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

public interface IBinaryTreeTraversal {
    void preorderTraverse(IBinaryTree2 btNode, VisitFuncPointer action);
    void inorderTraverse(IBinaryTree2 btNode, VisitFuncPointer action);
    void postorderTraverse(IBinaryTree2 btNode, VisitFuncPointer action);
}
