package ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_1_HeapSort;

import ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_2_UsefulArrayBasedHeap.PriorityComparator;
import ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_2_UsefulArrayBasedHeap.UsefulArrayBasedHeap;

/**
 * Ch09_2_2_UsefulArrayBasedHeap 참고
 * 힙의 특성을 활용하여, 힙에 정렬할 대상을 모두 넣었다가 다시 꺼내어 정렬을 진행한다.
 */
public class HeapSort {
    private static final PriorityComparator<Integer> priorityComparator = HeapSort::comparePriorities;

    static void HeapSort(int[] arr, final PriorityComparator priorityComparator) {
        UsefulArrayBasedHeap<Integer> usefulArrayBasedHeap = new UsefulArrayBasedHeap<>(priorityComparator);

        // 정렬 대상을 힙에 삽입하며 자동 정렬이 진행된다.
        for (int i = 0; i < arr.length; i++) {
            usefulArrayBasedHeap.insert(arr[i]);
        }

        // 정렬이 완료된 데이터를 순차적으로 힙에서 꺼내어 다시 저장한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = usefulArrayBasedHeap.delete();
        }
    }

    public static void test() {
        int[] arr = {3, 4, 2, 1};

        HeapSort(arr, priorityComparator);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    private static int comparePriorities(Integer leftData, Integer rightData) {
        // 작은 값이 우선 순위가 더 높다.
        // 양수 반환
        return rightData - leftData; // 오름차순 정렬
        // return leftData - rightData; // 내림차순 정렬
    }
}
