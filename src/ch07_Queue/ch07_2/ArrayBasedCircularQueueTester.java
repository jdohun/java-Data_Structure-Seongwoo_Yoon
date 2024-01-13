package ch07_Queue.ch07_2;

public class ArrayBasedCircularQueueTester {
    public static void test() {
        // Queue의 생성 및 초기화 ///////
        ArrayBasedCircularQueue<Integer> queue = new ArrayBasedCircularQueue<>(100);

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
