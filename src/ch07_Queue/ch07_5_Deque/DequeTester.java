package ch07_Queue.ch07_5_Deque;

public class DequeTester {
    public static void test() {
        // Deque의 생성 및 초기화 ///////
        DequeADT<Integer> deq = new Deque<>();

        // 데이터 넣기 1차 ///////
        deq.addFirst(3);
        deq.addFirst(2);
        deq.addFirst(1);

        deq.addLast(4);
        deq.addLast(5);
        deq.addLast(6);

        // 데이터 꺼내기 1차 ///////
        while(!deq.empty()){
            System.out.printf("%d ", deq.removeFirst());
        }
        System.out.println();

        // 데이터 넣기 2차 ///////
        deq.addFirst(3);
        deq.addFirst(2);
        deq.addFirst(1);

        deq.addLast(4);
        deq.addLast(5);
        deq.addLast(6);

        // 데이터 꺼내기 2차 ///////
        while(!deq.empty()){
            System.out.printf("%d ", deq.removeLast());
        }
    }
}
