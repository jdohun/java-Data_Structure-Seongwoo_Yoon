package ch08_Tree.ch08_2;

/**
 * 이것 자체로 이진 트리이며
 * 이진 트리의 노드(서브 트리)
 */
public class BinaryTree<E> implements BinaryTreeNodeADT<E> {
    private E data;
    private BinaryTree<E> leftSubTree;
    private BinaryTree<E> rightSubTree;

    public BinaryTree(E data) {
        this.data = data;
        this.leftSubTree = null;
        this.rightSubTree = null;
    }

    @Override
    public E getData() {
        return data;
    }

    @Override
    public void setData(E data) {
        this.data = data;
    }

    @Override
    public BinaryTree<E> getLeftSubTree() {
        return leftSubTree;
    }

    @Override
    public void setLeftSubTree(BinaryTree<E> leftSubTree) {
        /**
         *  c 애서는 기존에 연결된 서브 트리를 순회하며 메모리를 해제하지만 자바에서는 불필요하다.
         */
        /*
        if(leftSubTree != null){
            free(leftSubTree);
        }
        */

        this.leftSubTree = leftSubTree;
    }

    @Override
    public BinaryTree<E> getRightSubTree() {
        return rightSubTree;
    }

    @Override
    public void setRightSubTree(BinaryTree<E> rightSubTree) {
        /**
         *  c 애서는 기존에 연결된 서브 트리를 순회하며 메모리를 해제하지만 자바에서는 불필요하다.
         */
        /*
        if(rightSubTree != null){
            free(rightSubTree);
        }
        */

        this.rightSubTree = rightSubTree;
    }

    /**
     * 문제 08-1 [이진 트리의 소멸]
     * 자바에서는 의미가 없음
     */
    @Override
    public void deleteTree() {
        if (this.leftSubTree != null) {
            this.leftSubTree.deleteTree();
        }
        if (this.rightSubTree != null){
            this.rightSubTree.deleteTree();
        }
        System.out.printf("delete tree data: %d\n", this.data);
        this.data = null;
    }
}
