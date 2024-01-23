package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_1_SimpleHeap;

public class ArrayBasedHeapTester {
    public static void test() {
        ArrayBasedHeap<Character> arrayBasedHeap = new ArrayBasedHeap();

        arrayBasedHeap.insert('A', 1);
        arrayBasedHeap.insert('B', 2);
        arrayBasedHeap.insert('C', 3);
        System.out.println(arrayBasedHeap.delete());    // A

        arrayBasedHeap.insert('A', 1);
        arrayBasedHeap.insert('B', 2);
        arrayBasedHeap.insert('C', 3);
        System.out.println(arrayBasedHeap.delete());    // A

        while (!arrayBasedHeap.empty()) {
            // B
            // B
            // C
            // C
            System.out.println(arrayBasedHeap.delete());
        }
    }
}
