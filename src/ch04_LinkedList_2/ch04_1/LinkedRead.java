package ch04_LinkedList_2.ch04_1;

import java.util.Scanner;

public class LinkedRead {
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

            if (head == null) {
                head = insertionNode;
            } else {
                // 기존 tail 에 다음 노드를 연결하고
                tail.link = insertionNode;
            }

            // tail 을 최신화
            tail = insertionNode;
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

        /**** 메모리의 해제과정 : java 에서는 가비지 컬렉터가 알아서 해줌 ****/
        /*
        if (head == null) {
            return;    // 해제할 노드가 존재하지 않는다.
        } else {
            MyNode<Integer> delNode = head;
            MyNode<Integer> delNextNode = head.link;

            System.out.printf("%d을(를) 삭제합니다.\n", head.data);
            head = null;    // 첫 번째 노드의 삭제

            while (delNextNode != null) {     // 두 번째 이후의 노드 삭제 위한 반복문
                delNode = delNextNode;
                delNextNode = delNextNode.link;

                System.out.printf("%d을(를) 삭제합니다.\n", delNode.data);
                delNode = null;    // 두 번째 이후의 노드 삭제
            }
        }
         */
    }
}
