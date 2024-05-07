package ch11_Search1.ch11_2_Binary_Search_Tree;

import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2.BinaryTree2;

public class BinarySearchTree {
    private BinaryTree2 root;

    public int getNodeData(BinaryTree2 bst) {
        return bst.getData();
    }

    public void insert(int data) {
        BinaryTree2 parentNode = null;
        BinaryTree2 currentNode = root;
        BinaryTree2 insertionNode;

        // 새로운 노드가 추가될 위치를 찾는다.
        while (currentNode != null) {
            if (data == currentNode.getData())
                return;    // 키의 중복을 허용하지 않음

            parentNode = currentNode;

            if (currentNode.getData() > data)
                currentNode = currentNode.getLeftSubTree();
            else
                currentNode = currentNode.getRightSubTree();
        }

        // pNode의 서브 노드에 추가할 새 노드의 생성
        insertionNode = new BinaryTree2();    // 새 노드의 생성
        insertionNode.setData(data); // 새 노드에 데이터 저장

        // pNode의 서브 노드에 새 노드를 추가
        if (parentNode != null)    // 새 노드가 루트 노드가 아니라면,
        {
            if (data < parentNode.getData())
                parentNode.makeLeftSubTree(insertionNode);
            else
                parentNode.makeRightSubTree(insertionNode);
        } else { // 새 노드가 루트 노드라면,
            root = insertionNode;
        }
    }

    public BinaryTree2 search(int target) {
        BinaryTree2 currentNode = root;
        int currentData;

        while (currentNode != null) {
            currentData = currentNode.getData();

            if (target == currentData)
                return currentNode;
            else if (target < currentData)
                currentNode = currentNode.getLeftSubTree();
            else
                currentNode = currentNode.getRightSubTree();
        }

        return null;
    }
}
