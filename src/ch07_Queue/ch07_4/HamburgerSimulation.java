package ch07_Queue.ch07_4;

import ch07_Queue.ch07_2.ArrayBasedCircularQueue;

import java.util.Random;

/**
 * 점심시간은 1시간이고 그 동안 고객은 15초에 1명씩 주문을 하는 것으로 간주한다.
 * 한 명의 고객은 하나의 버거만을 주문한다고 가정한다.
 * 주문하는 메뉴에는 가중치를 두지 않는다. 모든 고객은 무작위로 메뉴를 선택한다.
 * 햄버거를 만드는 사람은 1명이다. 그리고 동시에 둘 이상의 버거가 만들어지지 않는다.
 * 주문한 메뉴를 받을 다음 고객은 대기실에 나와서 대기한다.
 */

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
        for (int sec = 0; sec < 3600; ++sec) { // 1시간 동안
            if (sec % CUSTOMER_COME_TERM == 0) { // 15초 마다
                switch (random.nextInt() % 3) { // 랜덤으로 하나의 버거를 주문한다.
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
            if (makeProcess == 0 && !queue.empty()) {
                /**
                 * 대기실에서 나와서 대기한다.
                 * 햄버거를 제조한다.
                 */
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
