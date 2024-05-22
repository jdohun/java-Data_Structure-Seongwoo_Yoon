package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3.IBinaryTree3;

public interface IBinaryTreeTraversal {
    void preorderTraverse(IBinaryTree3 btNode, VisitFuncPointer action);

    void inorderTraverse(IBinaryTree3 btNode, VisitFuncPointer action);

    void postorderTraverse(IBinaryTree3 btNode, VisitFuncPointer action);
}
