package ch07_Queue.ch07_3;

public class LinkedListBasedQueueTester {
    public static void test() {
        // Queue의 생성 및 초기화 ///////
        LinkedListBasedQueue<Integer> queue = new LinkedListBasedQueue<>();

        // 데이터 넣기 ///////
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // 데이터 꺼내기 ///////
        while (!queue.empty())
            System.out.printf("%d ", queue.dequeue());
    }
}
