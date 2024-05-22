package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_2_UsefulArrayBasedHeap;

public class UsefulArrayBasedHeapTester {
    private static final PriorityComparator<Character> priorityComparator = UsefulArrayBasedHeapTester::comparePriorities;

    public static void test() {
        UsefulArrayBasedHeap<Character> usefulArrayBasedHeap = new UsefulArrayBasedHeap(priorityComparator);

        usefulArrayBasedHeap.insert('A');
        usefulArrayBasedHeap.insert('B');
        usefulArrayBasedHeap.insert('C');
        System.out.println(usefulArrayBasedHeap.delete());    // A

        usefulArrayBasedHeap.insert('A');
        usefulArrayBasedHeap.insert('B');
        usefulArrayBasedHeap.insert('C');
        System.out.println(usefulArrayBasedHeap.delete());    // A

        while (!usefulArrayBasedHeap.empty()) {
            // B
            // B
            // C
            // C
            System.out.println(usefulArrayBasedHeap.delete());
        }
    }

    private static int comparePriorities(Character leftData, Character rightData) {
        // 아스키 코드 값이 작은 문자의 우선 순위가 더 높다.
        // 양수 반환
        return rightData.charValue() - leftData.charValue();
    }
}
