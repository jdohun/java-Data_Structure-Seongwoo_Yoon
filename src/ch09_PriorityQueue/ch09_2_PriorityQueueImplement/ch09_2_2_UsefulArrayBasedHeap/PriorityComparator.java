package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_2_UsefulArrayBasedHeap;

@FunctionalInterface
public interface PriorityComparator<E> {
    /**
     * 첫 번째 인자의 우선순위가 높다면 양수(0보다 큰 값을) 반환
     * 두 번째 인자의 우선순위가 높다면 음수(0보다 작은 값)을 반환
     * 첫 번째, 두 번째 인자의 우선순위가 동일하면 0 반환
     */
    int comparePriorities(E leftData, E rightData);
}
