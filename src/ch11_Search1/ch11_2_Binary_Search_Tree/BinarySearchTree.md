# 이진 탐색 트리의 이해

> **이진 탐색 트리 = 이진 트리 + 데이터의 저장 규칙**

- 저장 규칙을 근거로 탐색 규칙이 결정된다.
-

| 자료구조 | 위치 정보 | 데이터의 수 | 거치는 노드의 수 |
|----------|:---------|:--------|:-------------|
| 연결리스트    | 있다! | 10억 개 | 최악의 경우 10억 개 |
| 이진 탐색 트리 | 있다! | 10억 개 | 평균 30개 미만 |

- 이진 탐색 트리의 노드에 저장된 키(key)는 유일!
- 루트 노드의 키 > 왼쪽 서브 트리를 구성하는 키
- 루트 노드의 키 < 오른쪽 서브 트리를 구성하는 키
- 왼쪽과 오른쪽 서브 트리도 이진 탐색 트리!

# 이진 탐색 트리의 구현 방안

---

- ### 구현 방법 1

이전에 구현한 이진 트리를 참조하여 처음부터 완전히 다시 구현한다.

- ### 구현 방법 2

이진 탐색 트리도 이진 트리인, 이전에 구현한 이진 트리를 활용하여 구현한다.<br>
BinaryTree2 를 활용하여 구현한다.
---

# 이진 탐색 트리 삭제 구현: 상황 별 삭제

> **상황1.** 삭제한 노드가 단말 노드인 경우<br>
> **상황2.** 삭제한 노드가 하나의 자식 노드를(하나의 서브 트리를) 갖는 경우<br>
> **상황3.** 삭제한 노드가 두 개의 자식 노드를(두 개의 서브 트리를) 갖는 경우<br>

<div style="color: orangered;">
각 상황 별로 추가로 삭제할 노드가 루트 노드인 경우를 구분해야 하지만
이를 피해가는 형태로 코드를 구성하기로 한다!
</div>

- 상황별 코드를 각각 작성한다.
- 작성한 코드를 합친다.
- 루트 노드가 루트 노드가 아니게 만든다.

## 상황1

- 삭제할 노드가 단말 노드인 경우!
- 가장 쉽게 삭제가 가능한 상황이다.

```java
class BinarySearchTree {
    IBinaryTree3 remove(Integer target) {
        // deleteNode와 parentNode는 각각 삭제할 노드와 이의 부모 노드를 가리키는 포인터 변수
        if (/** 삭제할 노드가 단말노드이다! */) {
            if (parentNode.getLeftSubTree() == deleteNode)
                parentNode.removeLeftSubTree();
            else
                parentNode.removeRightSubTree();
        }
    }
}
```

removeLeftSubTree, removeRightSubTree 는 IBinaryTree2, BinaryTree2에 추가할 함수이다.

## 상황2

- 삭제할 노드가 하나의 자식 노드를 갖는 경우

```java
class BinarySearchTree {
    IBinaryTree3 remove(Integer target) {
        // deleteNode와 parentNode는 각각 삭제할 노드와 이의 부모 노드를 가리키는 포인터 변수
        if (/** 삭제할 노드가 하나의 자식 노드를 지닌다! */) {
            IBinaryTree3 deleteChildNode; // 삭제 대상의 자식 노드

            // 삭제 대상의 자식 노드를 찾는다.
            if (deleteNode.getLeftSubTree() != null)
                deleteChildNode = deleteNode.getLeftSubTree();
            else
                deleteChildNode = deleteNode.getRightSubTree();

            // 삭제 대상의 부모 노드와 자식 노드를 연결한다.
            if (parentNode.getLeftSubTree() == deleteNode)
                parentNode.changeLeftSubTree(deleteChildNode);
            else
                parentNode.changeRightSubTree(deleteChildNode);
        }
    }
}
```

changeLeftSubTree, changeRightSubTree 는 IBinaryTree2, BinaryTree2에 추가할 함수이다.

## 상황3

- 삭제할 노드가 두 개의 자식 노드를 갖는 경우
    - 왼쪽 서브 트리에서 가장 큰 값,
      또는 오른쪽 서브 트리에서 가장 작은 값으로 대체

- 단계1. 삭제한 노드를 대체할 노드를 찾는다.
- 단계2. 대체할 노드에 저장된 값을 삭제할 노드에 대입한다.
- 단계3. 대체할 노드의 부모 노드와 자식 노드를 연결한다.

```java
class BinarySearchTree {
    IBinaryTree3 remove(Integer target) {
        // deleteNode와 parentNode는 각각 삭제할 노드와 이의 부모 노드를 가리키는 포인터 변수
        if(true /** 삭제할 노드가 두 개의 자식 노드를 지닌다! */) {
            IBinaryTree3 mNode = deleteNode.getRightSubTree(); // mNode는 대체 노드
            IBinaryTree3 mParentNode = deleteNode; // mParentNode는 대체 노드의 부모 노드
    
        ...

            // 단계 1. 삭제한 노드를 대체할 노드를 찾는다.
            while (mNode.getLeftSubTree() != null) {
                mParentNmNode = mNode;
                mNode = mNode.getLeftSubTree();
            }

            // 단계 2. 대체할 노드에 저장된 값을 삭제할 노드에 대입한다.
            deleteNode.setData(mNode.getData());

            // 단계 3. 대체할 노드의 부모 노드와 자식 노드를 연결한다.
            if (mParentNode.getLeftSubTree() == mNode) {
                // 대체할 노드의 자식 노드를 부모 노드의 왼쪽에 연결
                // 자식 노드가 있따면 오른쪽 자식 노드이다.
                mParentNode.changeLeftSubTree(mNode.getRightSubTree());
            } else {
                // 대체할 노드가 오른쪽 자식의 노드라면
                // 대체할 노드의 자식 노드를 부모 노드의 오른쪽에 연결
                mParentNode.changeRightSubTree(mNode.getRightSubTree());
            }
        }
    }
}
```

