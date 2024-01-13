package ch07_Queue.ch07_4;

import ch07_Queue.ch07_2.ArrayBasedCircularQueue;

import java.util.Random;

public class HamburgerSimulation {
    private static final int CUSTOMER_COME_TERM = 15; // 고객의 주문 간격 : 초 단위

    private static final int CHEESE_BURGER = 0; // 치즈버거 상수
    private static final int BULGOGI_BURGER = 1; // 불고기버거 상수
    private static final int DOUBLE_BURGER = 2; // 더블버거 상수

    private static final int CHEESE_BURGER_TERM = 12; // 치즈버거 제작 시간 : 초 단위
    private static final int BULGOGI_BURGER_TERM = 15; // 불고기버거 제작 시간 : 초 단위
    private static final int DOUBLE_BURGER_TERM = 25; // 더블버거 제작 시간 : 초 단위

    public static void test() {
        int makeProcess = 0; // 현재 제조 중인 햄버거의 남은 완료 시간
        int cheeseOrder = 0;
        int bulgogiOrder = 0;
        int doubleOrder = 0;

        final int QUEUE_LEN = 170;

        ArrayBasedCircularQueue<Integer> queue = new ArrayBasedCircularQueue<>(QUEUE_LEN);

        Random random = new Random(System.currentTimeMillis());

        // 아래 for 문의 1회 회전은 1초의 시간 흐름을 의미함
        for (int sec = 0; sec < 3600; ++sec) {
            if (sec % CUSTOMER_COME_TERM == 0) {
                switch (random.nextInt() % 3) {
                    case CHEESE_BURGER:
                        queue.enqueue(CHEESE_BURGER_TERM);
                        ++cheeseOrder;
                        break;
                    case BULGOGI_BURGER:
                        queue.enqueue(BULGOGI_BURGER_TERM);
                        ++bulgogiOrder;
                        break;
                    case DOUBLE_BURGER:
                        queue.enqueue(DOUBLE_BURGER_TERM);
                        ++doubleOrder;
                        break;
                }
            }

            // 제조 중인 버거가 없고 대기중인 주문이 있다면
            if (makeProcess == 0 && !queue.empty()){
                makeProcess = queue.dequeue();
            }

            --makeProcess; // for 문 1회당 1초 감소
        }

        System.out.println("Simulation Report!");
        System.out.printf(" - Cheese burger: %d \n", cheeseOrder);
        System.out.printf(" - Bulgogi burger: %d \n", bulgogiOrder);
        System.out.printf(" - Double burger: %d \n", doubleOrder);
        System.out.printf(" - Waiting room size: %d \n", QUEUE_LEN);
    }
}
