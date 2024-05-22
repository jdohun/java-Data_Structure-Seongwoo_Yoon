package ch11_Search1.ch11_2_Binary_Search_Tree;

import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3.IBinaryTree3;

public class BinarySearchTreeTester {
    public static void test() {
        BinarySearchTree bstRoot = new BinarySearchTree();
        IBinaryTree3 searchNode;

        // bstRoot 가 가리키는 이진트리에 데이터를 저장한다.
        bstRoot.insert(9);
        bstRoot.insert(1);
        bstRoot.insert(6);
        bstRoot.insert(2);
        bstRoot.insert(8);
        // bstRoot.insert(4);
        bstRoot.insert(3);
        bstRoot.insert(5);
        // bstRoot.insert(7);

        searchNode = bstRoot.search(1);
        if (searchNode == null)
            System.out.println("탐색 실패");
        else
            System.out.printf("탐색에 성공한 키의 값: %d \n", bstRoot.getNodeData(searchNode));

        searchNode = bstRoot.search(4);
        if (searchNode == null)
            System.out.println("탐색 실패");
        else
            System.out.printf("탐색에 성공한 키의 값: %d \n", bstRoot.getNodeData(searchNode));

        searchNode = bstRoot.search(6);
        if (searchNode == null)
            System.out.println("탐색 실패");
        else
            System.out.printf("탐색에 성공한 키의 값: %d \n", bstRoot.getNodeData(searchNode));

        searchNode = bstRoot.search(7);
        if (searchNode == null)
            System.out.println("탐색 실패");
        else
            System.out.printf("탐색에 성공한 키의 값: %d \n", bstRoot.getNodeData(searchNode));
    }

    public static void deleteTest() {
        BinarySearchTree bstRoot = new BinarySearchTree();
        IBinaryTree3 searchNode;

        bstRoot.insert(5);
        bstRoot.insert(8);
        bstRoot.insert(1);
        bstRoot.insert(6);
        bstRoot.insert(4);
        bstRoot.insert(9);
        bstRoot.insert(3);
        bstRoot.insert(2);
        bstRoot.insert(7);

        bstRoot.showAll();
        System.out.println();

        searchNode = bstRoot.remove(3);
        System.out.println("Removed Target: " + searchNode.getData());
        // free(sNode);
        bstRoot.showAll();
        System.out.println();

        // TODO 8 제거할 때 이상함, 그림그려가면서 insert 부터 remove 까지 해보면서 디버깅할 것
        searchNode = bstRoot.remove(8);
        System.out.println("Removed Target: " + searchNode.getData());
        // free(sNode);
        bstRoot.showAll();
        System.out.println();

        searchNode = bstRoot.remove(1);
        System.out.println("Removed Target: " + searchNode.getData());
        // free(sNode);
        bstRoot.showAll();
        System.out.println();

        searchNode = bstRoot.remove(6);
        System.out.println("Removed Target: " + searchNode.getData());
        // free(sNode);
        bstRoot.showAll();
        System.out.println();
    }
}
