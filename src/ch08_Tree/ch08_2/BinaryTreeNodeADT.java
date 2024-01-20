package ch08_Tree.ch08_2;

public interface BinaryTreeNodeADT<E> {

    E getData();

    void setData(E data);

    BinaryTree<E> getLeftSubTree();

    void setLeftSubTree(BinaryTree<E> subTree);

    BinaryTree<E> getRightSubTree();

    void setRightSubTree(BinaryTree<E> subTree);

    /**
     * 문제 08-1 [이진 트리의 소멸]
     */
    void deleteTree();
}

