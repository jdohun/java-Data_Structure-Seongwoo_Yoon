package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_1_SimpleHeap;

public class HeapElement<E> {
    int priority;   // 값이 작을수록 높은 순위
    E data;

    public HeapElement(int priority, E data) {
        this.priority = priority;
        this.data = data;
    }
}
