package ch04_LinkedList_2.myLinkedList;

public class MyLinkedList<E> {
    private MyNode<E> head; // head 노드
    private int size = 0;

    public MyLinkedList() {
        head = null;
    }

    // 중간에 삽입
    public void insertNode(MyNode<E> preNode, E data) {
        MyNode<E> insertionNode = new MyNode<>(data); // 새로운 노드 생성

        /**
         * `preNode.link`는 `preNode`의 다음 노드이므로,
         * `newNode.link = preNode.link`는 새로운 노드의 `link`가 `preNode`의 다음 노드를 참조하도록 함.
         */
        // 니가 보던거 내가 볼게
        insertionNode.link = preNode.link;

        /**
         * preNode의 link 가 새로운노드를 참조하도록 함.
         * 최종적으로 `preNode -> newNode -> 기존 preNode 의 다음 노드` 이렇게 구성됨
         */
        // 너는 나 봐
        preNode.link = insertionNode;
        ++size;
    }

    // 마지막에 삽입
    public void insertNode(E data) {
        MyNode<E> insertionNode = new MyNode<>(data); // 새로운 노드 생성
        if (head == null) {
            // 최초 노드 삽입 시 `head`로 설정함
            this.head = insertionNode;
        } else {
            // `head`부터 시작해서
            MyNode<E> tempNode = head;

            // 마지막 node 까지 찾아감
            while (tempNode.link != null) {
                tempNode = tempNode.link;
            }

            // 마지막 node 에 새로운 node 연결
            tempNode.link = insertionNode;
        }
        ++size;
    }

    // 탐색하여 삭제
    public void deleteNode(E data) {
        MyNode<E> preNode = head;
        MyNode<E> currentNode = head.link;

        // 첫번째 노드의 데이터와 일치하는 경우
        if (data.equals(head.getData())) {
            head = head.link;
        } else {
            while (currentNode != null) {
                // 데이터와 일치하면서
                if (data.equals(currentNode.getData())) {
                    // currentNode 가 마지막 노드인 경우
                    if (currentNode.link == null) {
                        preNode.link = null;
                    } else {
                        preNode.link = currentNode.link;
                        currentNode = currentNode.link;
                    }
                    --size;
                } else {
                    preNode = currentNode;
                    currentNode = currentNode.link;
                }
            }
        }
    }

    // 마지막 노드 삭제
    public void deleteNode() {
        // 존재하는 노드가 없는 경우
        if (head == null) {
            return;
        }

        // head 만 존재하는(존재하는 노드가 1개인) 경우
        if (head.link == null) {
            head = null;
        } else {
            MyNode<E> preNode = head;
            MyNode<E> currentNode = head.link;

            while (currentNode.link != null) {
                preNode = currentNode;
                currentNode = currentNode.link;
            }
            preNode.link = null;
        }
        --size;
    }

    // Node 탐색
    public MyNode<E> searchNode(E data) {
        MyNode<E> currentNode = head;

        // 노드가 존재하면
        while (currentNode != null) {
            if (data.equals(currentNode.getData())) {
                return currentNode;
            } else {
                currentNode = currentNode.link;
            }
        }

        // 노드가 존재하지 않으면
        return null;
    }

    // Node 탐색
    public boolean contain(E data) {
        MyNode<E> currentNode = head;

        // 노드가 존재하면
        while (currentNode != null) {
            if (data.equals(currentNode.getData())) {
                return true;
            } else {
                currentNode = currentNode.link;
            }
        }

        // 노드가 존재하지 않으면
        return false;
    }

    /**
     * head:n1<br>
     * link:n1 -> n2 -> n3 -> n4 -> n5 -> null<br>
     * pre:null <- current:n1  link:n2 -> n3 -> n4 -> n5 -> null<br>
     * null <- pre:n1 <- current:n2  link:n3 -> n4 -> n5 -> null<br>
     * null <- n1 <- pre:n2 <- current:n3  link:n4 -> n5 -> null<br>
     * null <- n1 <- n2 <- pre:n3 <- current:n4  link:n5 -> null<br>
     * null <- n1 <- n2 <- n3 <- pre:n4 <- current:n5  link:null<br>
     * head : current : n5<br>
     * n5 -> n4 > n3 -> n2 -> n1 -> null<br>
     */
    // 리스트의 순서를 역순으로 전환
    public void reverseList() {
        MyNode<E> nextNode = head;
        MyNode<E> currentNode = null;
        MyNode<E> preNode = null;

        while (nextNode != null) {
            preNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.link;
            currentNode.link = preNode;
        }

        head = currentNode;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public MyNode<E> head() {
        return head;
    }
}


// 참고 : https://freestrokes.tistory.com/84