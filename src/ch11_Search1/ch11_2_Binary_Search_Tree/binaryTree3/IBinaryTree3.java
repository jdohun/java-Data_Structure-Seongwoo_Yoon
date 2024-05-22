package ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3;

public interface IBinaryTree3 {
    Integer getData();

    void setData(Integer data);

    IBinaryTree3 getLeftSubTree();

    IBinaryTree3 getRightSubTree();

    void makeLeftSubTree(IBinaryTree3 sub);

    void makeRightSubTree(IBinaryTree3 sub);

    // 왼쪽 자식 노드를 트리에서 제거, 제거된 노드(의 주소 값)을 반환
    IBinaryTree3 removeLeftSubTree();

    // 오른쪽 자식 노드를 트리에서 제거, 제거된 노드(의 주소 값)을 반환
    IBinaryTree3 removeRightSubTree();

    // (메소리 소멸을 수반하지 않고) 왼쪽 자식 노드를 변경
    void changeLeftSubTree(IBinaryTree3 sub);

    // (메소리 소멸을 수반하지 않고) 오른쪽 자식 노드를 변경
    void changeRightSubTree(IBinaryTree3 sub);
}
