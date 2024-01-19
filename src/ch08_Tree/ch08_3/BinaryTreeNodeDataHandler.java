package ch08_Tree.ch08_3;

import ch08_Tree.ch08_2.BinaryTreeNodeADT;

public interface BinaryTreeNodeDataHandler<E> {
    void handle(BinaryTreeNodeADT<E> binaryTree);
}
