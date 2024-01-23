package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_1_SimpleHeap;

public class ArrayBasedHeap<E> {
    private static final int HEAP_LEN = 100;
    int size = 0;
    HeapElement<E>[] heapElements = new HeapElement[HEAP_LEN];

    boolean empty() {
        return size == 0;
    }

    int getParentIndex(int idx) {
        return idx / 2;
    }

    int getLeftChildIndex(int idx) {
        return idx * 2;
    }

    int getRightChildIndex(int idx) {
        return getLeftChildIndex(idx) + 1;
    }

    /**
     * 부모 노드의 인덱스를 기준으로 자식 노드들의 우선순위를 비교한다.
     *
     * @return 더 높은 우선순위를 가진 자식 노드의 인덱스
     */
    int getHighPriorityChildIndex(int idx) {
        final int leftChildIndex = getLeftChildIndex(idx);
        final int rightChildIndex;

        /* size 는 마지막 노드의 인덱스
         * 마지막 노드의 인덱스보다 큰 인덱스의 노드는 존재하지 않는다.
         *  */
        if (leftChildIndex > size) { // 자식 노드가 없다면
            return 0;
        } else if (leftChildIndex == size) { // 왼쪽 자식 노드가 마지막 노드라면 == 왼쪽 자식 노드만 있다. : 완전 이진 트리의 특성
            return leftChildIndex;
        } else { // 왼쪽 자식 노드와 오른쪽 자식 노드의 우선순위를 비교
            rightChildIndex = getRightChildIndex(idx);

            // 우선순위는 값이 작을 수록 높은 것으로 설정했다.(프로그래머가 기준을 설정)
            if (heapElements[leftChildIndex].priority > heapElements[rightChildIndex].priority) {
                return rightChildIndex;
            } else {
                return leftChildIndex;
            }
        }
    }

    /**
     * 가장 마지막 노드를 루트 Index 부터 시작해서
     * 자식 노드와 우선순위를 비교하여
     * 올바른 순서로 재위치한다.
     *
     * @return 루트 노드의 Data
     */
    E delete() {
        E deleteData = heapElements[1].data;    // 반환을 위해 삭제할 데이터 저장
        HeapElement<E> lastElement = heapElements[size]; // 마지막 노드 저장

        int parentIdx = 1;    // 루트 노드의 Index, 최종적으로 마지막 노드가 저장될 Index 가 된다.
        int childIdx = getHighPriorityChildIndex(parentIdx);   // 우선 순위가 더 높은 자식 노드의 Index

        while (childIdx != 0) { // 자식 노드가 없을 때까지
            // 우선순위는 값이 작을 수록 높은 것으로 설정했다.(프로그래머가 기준을 설정)
            if (lastElement.priority <= heapElements[childIdx].priority) {
                break;  // 마지막 노드의 우선순위가 높아지면 탈출
            }

            heapElements[parentIdx] = heapElements[childIdx]; // 비어있는 자리에 높은 우선순위 노드를 재위치
            parentIdx = childIdx;   // 빈 자리의 Index 설정
            childIdx = getHighPriorityChildIndex(parentIdx);
        }

        heapElements[parentIdx] = lastElement;  // 최종 위치에 마지막 노드를 재위치
        --size; // Array 기준이기 때문에 size(index) 를 이용하여 노드 제거 처리
        return deleteData;
    }

    void insert(E data, int priority) {
        int idx = size + 1;
        HeapElement<E> insertion = new HeapElement<>(priority, data);

        // 새 노드가 저장될 위치가 루트 노드의 위치가 아니라면 while 문 반복
        while (idx != 1) {
            // 새 노드와 부모 노드의 우선순위 비교
            if (priority < (heapElements[getParentIndex(idx)].priority)) {
                // 부모 노드를 한 레벨 내림, 실제로 내림
                heapElements[idx] = heapElements[getParentIndex(idx)];
                // 새 노드를 한 레벨 올림, 실제로는 올리지 않고 인덱스 값만 갱신
                idx = getParentIndex(idx);
            } else  // 새 노드의 우선순위가 높지 않으면
                break;
        }

        heapElements[idx] = insertion; // 최종 위치에 새 노드를 저장
        ++size;
    }
}
