package ch11_Search1.ch11_2_Binary_Search_Tree;

import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3.IBinaryTree3;

public interface IBinarySearchTree {

    // BST를 대상으로 데이터 저장(노드의 생성과정 포함)

    // BST를 대상으로 데이터 탐색

    // 노드에 저장된 데이터 반환
    Integer getNodeData(IBinaryTree3 bst);

    // 이진 탐색 트리를 대상으로 데이터 저장(노드의 생성과정 포함)
    void insert(Integer data);

    // 이진 탐색 트리를 대상으로 데이터 탐색
    IBinaryTree3 search(Integer target);

    // 트리에서 노드를 제거하고 제거된 노드의 주소 값을 반환한다.
    IBinaryTree3 remove(Integer target);

    // 이진 탐색 트리에 저장된 모든 노드의 데이터를 출력한다.
    void showAll();
}
