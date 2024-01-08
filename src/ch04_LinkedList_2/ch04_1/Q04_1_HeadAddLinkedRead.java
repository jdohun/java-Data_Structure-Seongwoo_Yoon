package ch04_LinkedList_2.ch04_1;

import java.util.Scanner;

public class Q04_1_HeadAddLinkedRead {
    public static void read() {
        Scanner sc = new Scanner(System.in);

        MyNode<Integer> head = null;
        MyNode<Integer> tail = null;
        MyNode<Integer> current = null;

        MyNode<Integer> insertionNode = null;
        Integer readData;

        /**** 데이터를 입력 받는 과정 ****/
        while (true) {
            System.out.printf("자연수 입력: ");
            readData = sc.nextInt();

            if (readData < 1) {
                break;
            }

            /*** 노드의 추가과정 ***/
            insertionNode = new MyNode<>(readData);

            if (tail == null) {
                tail = insertionNode;
            } else {
                // 새로운 노드에 head 를 연결하고
                insertionNode.link = head;
            }

            // head 를 최신화
            head = insertionNode;
        }
        System.out.println();

        /**** 입력 받은 데이터의 출력과정 ****/
        System.out.println("입력 받은 데이터의 전체출력!");
        if (head == null) {
            System.out.print("저장된 자연수가 존재하지 않습니다.");
        } else {
            current = head;
            System.out.printf("%d ", current.data); // 첫 번째 데이터 출력

            while (current.link != null) { // 두 번째 이후의 데이터 출력
                current = current.link;
                System.out.printf("%d ", current.data);
            }
        }
        System.out.println();
    }
}
