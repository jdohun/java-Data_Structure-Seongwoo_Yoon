package ch05_LinkedList_3.ch05_1;

class CircularLinkedList<E> {
    private MyNode<E> tail;
    private MyNode<E> current;
    private MyNode<E> pre;

    private int size;

    CircularLinkedList() {
        tail = null;
        current = null;
        pre = null;
        size = 0;
    }

    /**
     * 꼬리에 추가
     */
    void insert(E data) {
        MyNode<E> insertionNode = new MyNode<>(data);

        if (tail == null) {
            // 새로운 노드를 자기 자신과 연결하고
            insertionNode.link = insertionNode;
        } else {
            insertionNode.link = tail.link; // 머리(꼬리의 다음)를 새로운 노드에 연결한다.
            tail.link = insertionNode; // 기존 꼬리에 새로운 노드를 연결하고
        }
        // 새로운 노드가 꼬리이다.
        tail = insertionNode;

        ++size;
    }

    /**
     * 머리에 추가
     */
    void insertFront(E data) {
        MyNode<E> insertionNode = new MyNode<>(data);

        if (tail == null) {
            insertionNode.link = insertionNode;
            tail = insertionNode;
        } else {
            insertionNode.link = tail.link; // 머리(꼬리의 다음)를 새로운 노드와 연결하고
            tail.link = insertionNode; // 머리(꼬리의 다음)이 새로운 노드이다.
        }

        ++size;
    }

    E first() {
        if (tail == null) {
            return null;
        }

        pre = tail;
        current = tail.link;
        return current.data;
    }

    E next() {
        if (tail == null) {
            return null;
        }

        pre = current;
        current = current.link;
        return current.data;
    }

    E remove() {
        if (tail == null) {
            return null;
        }

        final E removeData = current.data;

        if (current == tail) { // 참조하는 주소를 비교하기 때문에 동일성 비교 시행
            if (tail == tail.link) { // tail 만 존재한다면
                tail = null;
            } else {
                tail = pre;
            }
        }

        pre.link = current.link;
        current = pre; // 연속된 remove 사용시 문제 발생, next 가 정상적으로 작동되기 위함

        --size;

        return removeData;
    }

    int size() {
        return size;
    }

    void sortInsert() {

    }
}
