package ch08_Tree.ch08_2;

public interface BinaryTreeNodeADT<E> {

    E getData();

    void setData(E data);

    BinaryTree<E> getLeftSubTree();

    void setLeftSubTree(BinaryTree<E> subTree);

    BinaryTree<E> getRightSubTree();

    void setRightSubTree(BinaryTree<E> subTree);
}

