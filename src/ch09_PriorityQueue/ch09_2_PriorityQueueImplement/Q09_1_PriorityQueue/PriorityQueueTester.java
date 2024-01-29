package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.Q09_1_PriorityQueue;

import ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_2_UsefulArrayBasedHeap.PriorityComparator;

public class PriorityQueueTester {
    private static PriorityComparator<Character> priorityComparator = PriorityQueueTester::comparePriorities;

    public static void test() {
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>(priorityComparator);

        priorityQueue.enqueue('A');
        priorityQueue.enqueue('B');
        priorityQueue.enqueue('C');
        System.out.printf("%c\n", priorityQueue.dequeue());

        priorityQueue.enqueue('A');
        priorityQueue.enqueue('B');
        priorityQueue.enqueue('C');
        System.out.printf("%c\n", priorityQueue.dequeue());


        while (!priorityQueue.empty()) {
            System.out.printf("%c\n", priorityQueue.dequeue());
        }
    }

    private static int comparePriorities(Character leftData, Character rightData) {
        // 아스키 코드 값이 작은 문자의 우선 순위가 더 높다.
        // 양수 반환
        return rightData.charValue() - leftData.charValue();
    }
}
