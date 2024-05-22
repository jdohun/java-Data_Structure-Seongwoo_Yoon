package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2;

import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3.IBinaryTree3;

public class BinaryTreeTraversal implements IBinaryTreeTraversal {

    @Override
    public void preorderTraverse(IBinaryTree3 btNode, VisitFuncPointer action) {
        if (btNode == null)
            return;

        action.visit(btNode.getData());
        preorderTraverse(btNode.getLeftSubTree(), action);
        preorderTraverse(btNode.getRightSubTree(), action);
    }

    @Override
    public void inorderTraverse(IBinaryTree3 btNode, VisitFuncPointer action) {
        if (btNode == null)
            return;

        inorderTraverse(btNode.getLeftSubTree(), action);
        action.visit(btNode.getData());
        inorderTraverse(btNode.getRightSubTree(), action);
    }

    @Override
    public void postorderTraverse(IBinaryTree3 btNode, VisitFuncPointer action) {
        if (btNode == null)
            return;

        postorderTraverse(btNode.getLeftSubTree(), action);
        postorderTraverse(btNode.getRightSubTree(), action);
        action.visit(btNode.getData());
    }
}
