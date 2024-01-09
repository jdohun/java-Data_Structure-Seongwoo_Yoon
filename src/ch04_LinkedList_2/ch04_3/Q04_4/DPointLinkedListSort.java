package ch04_LinkedList_2.ch04_3.Q04_4;

class DPointLinkedListSort<E> {
    MyNode<E> head;
    MyNode<E> current;
    MyNode<E> preNode;

    // 정렬 기준
    SortInsert sortInsert;

    int size;

    DPointLinkedListSort() {
        this.head = new MyNode<>(); // 더미 노드를 항상 헤드에 위치시킴
        this.current = head;
        this.preNode = null;
        this.sortInsert = null;
        this.size = 0;
    }

    // 헤드(더미 노드)에 연결
    void insertNode(E data) {
        MyNode<E> insertionNode = new MyNode<>(data); // 새로운 노드 생성

        insertionNode.link = head.link; // 새로운 노드를 헤드(더미 노드)와 연결되었던 노드와 연결
        head.link = insertionNode; // 헤드(더미 노드)에 새로운 노드를 연결
        ++size; // 사이즈 증가
    }

    void sortInsert(E data) {
        MyNode<E> insertionNode = new MyNode<>(data);
        MyNode<E> predecessor = head;

        while (predecessor.link != null &&
                sortInsert.compare((Point) data, (Point) predecessor.link.data) != 0) {
            predecessor = predecessor.link;
        }

        insertionNode.link = predecessor.link;
        predecessor.link = insertionNode;

        ++size;
    }

    void setSort(SortInsert sortInsert) {
        this.sortInsert = sortInsert;
    }

    E first() {
        if (head.link == null) { // 반환할 데이터가 없음
            return null;
        }

        preNode = head;
        current = head.link;    // 첫번째 노드(더미 노드의 링크)를 저장

        return current.data;
    }

    E next() {
        if (current.link == null) {
            return null;
        }

        preNode = current;
        current = current.link;

        return current.data;
    }

    /**
     * 가장 최근 조회 값 삭제
     */
    E remove() {
        // C 에서는 메모리 해제를 위해서 임시로 주소를 저장해야함
        // final MyNode<E> removeNode = current;

        final E removeData = current.data;

        preNode.link = current.link;

        // remove 이후 next 를 해서 삭제한 노드 이후의 값을 보려면 이렇게 해야함
        // 근데 이렇게 하면 연속 remove 는 불가능함
        current = preNode;

        // 아래처럼 하면 연속된 remove 는 가능하나 next 에 문제가 생김
        // current = current.link;

        // C는 여기서 current 의 메모리 해제가 필요함

        --size;
        return removeData;
    }

    /**
     * @return 저장된 데이터의 개수
     */
    int size() {
        return size;
    }
}
