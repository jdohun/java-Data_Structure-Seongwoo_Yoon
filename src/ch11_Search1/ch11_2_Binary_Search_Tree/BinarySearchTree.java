package ch11_Search1.ch11_2_Binary_Search_Tree;

import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2.BinaryTreeTraversal;
import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree2.VisitFuncPointer;
import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3.BinaryTree3;
import ch11_Search1.ch11_2_Binary_Search_Tree.binaryTree3.IBinaryTree3;

public class BinarySearchTree implements IBinarySearchTree {
    private IBinaryTree3 root;

    @Override
    public Integer getNodeData(IBinaryTree3 bst) {
        return bst.getData();
    }

    @Override
    public void insert(Integer data) {
        IBinaryTree3 parentNode = null;
        IBinaryTree3 currentNode = root;
        IBinaryTree3 insertionNode;

        // 새로운 노드가 추가될 위치를 찾는다.
        while (currentNode != null) {
            if (data.equals(currentNode.getData()))
                return;    // 키의 중복을 허용하지 않음

            parentNode = currentNode;

            if (currentNode.getData() > data)
                currentNode = currentNode.getLeftSubTree();
            else
                currentNode = currentNode.getRightSubTree();
        }

        // pNode의 서브 노드에 추가할 새 노드의 생성
        insertionNode = new BinaryTree3();    // 새 노드의 생성
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

    @Override
    public IBinaryTree3 search(Integer target) {
        IBinaryTree3 currentNode = root;
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

    @Override
    public IBinaryTree3 remove(Integer target) {
        // 삭제 대상이 루트 노드인 경우를 별도로 고려해야 한다.
        IBinaryTree3 pVRoot = new BinaryTree3();    // 가상 루트 노드;

        IBinaryTree3 pNode = pVRoot;    // parent node
        IBinaryTree3 cNode = root;  // current node
        IBinaryTree3 dNode; // delete node

        // 루트 노드를 pVRoot가 가리키는 노드의 오른쪽 서브 노드가 되게 한다.
        pVRoot.makeRightSubTree(root);

        // 삭제 대상을 저장한 노드 탐색
        while (cNode != null && !cNode.getData().equals(target)) {
            pNode = cNode;

            if (target < cNode.getData())
                cNode = cNode.getLeftSubTree();
            else
                cNode = cNode.getRightSubTree();
        }

        if (cNode == null)  // 삭제 대상이 존재하지 않는다면,
            return null;

        dNode = cNode;  // 삭제 대상을 dNode가 가리키게 한다.

        // 첫 번째 경우: 삭제할 노드가 단말 노드인 경우
        if (dNode.getLeftSubTree() == null && dNode.getRightSubTree() == null) {
            if (pNode.getLeftSubTree() == dNode)
                pNode.removeLeftSubTree();
            else
                pNode.removeRightSubTree();
        }

        // TODO == || == 일때가 오히려 올바른데, != || != 이 아닌 이유를 디버깅하며 알아낼 것
        // 두 번째 경우: 하나의 자식 노드를 갖는 경우
        // else if (GetLeftSubTree(dNode) == NULL || GetRightSubTree(dNode) == NULL) {
        else if (dNode.getLeftSubTree() == null || dNode.getRightSubTree() == null) {
            IBinaryTree3 dcNode;    // delete node의 자식 노드

            if (dNode.getLeftSubTree() != null)
                dcNode = dNode.getLeftSubTree();
            else
                dcNode = dNode.getRightSubTree();

            if (pNode.getLeftSubTree() == dNode)
                pNode.changeLeftSubTree(dcNode);
            else
                pNode.changeRightSubTree(dcNode);
        }

        // 세 번째 경우: 두 개의 자식 노드를 모두 갖는 경우
        else {
            IBinaryTree3 mNode  = dNode.getRightSubTree();  // mininum node
            IBinaryTree3 mpNode  = dNode; // mininum node의 부모 노드
            Integer delData;

            // 삭제할 노드를 대체할 노드를 찾는다.
            while (mNode.getLeftSubTree() != null) {
                mpNode = mNode;
                mNode = mNode.getLeftSubTree();
            }

            // 대체할 노드에 저장된 값을 삭제할 노드에 대입한다.
            delData = dNode.getData();  // 대입 전 데이터 백업
            dNode.setData(mNode.getData());

            // 대체할 노드의 부모 노드와 자식 노드를 연결한다.
            if (mpNode.getLeftSubTree() == mNode)
                mpNode.changeLeftSubTree(mNode);
            else
                mpNode.changeRightSubTree(mNode);

            dNode = mNode;
            dNode.setData(delData); // 백업 데이터 복원
        }

        // 삭제된 노드가 루트 노드인 경우에 대한 처리
        if (pVRoot.getRightSubTree() != root)
		    root = pVRoot.getRightSubTree();

        // free(pVRoot);
        return dNode;
    }

    @Override
    public void showAll() {
        final BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        VisitFuncPointer visitFuncPointer = this::showIntData;
        binaryTreeTraversal.inorderTraverse(root, visitFuncPointer);
    }

    void showIntData(Integer data) {
        System.out.println(data);
    }
}
