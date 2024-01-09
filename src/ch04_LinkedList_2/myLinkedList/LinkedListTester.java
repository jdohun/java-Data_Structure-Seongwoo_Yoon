package ch04_LinkedList_2.myLinkedList;

public class LinkedListTester {

    public static void test() {
        /*** `ArrayList`의 생성 및 초기화 ***/
        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyNode<Integer> data = null;
        list.insertNode(11);

        /*** 5개의 데이터 저장 ***/
        list.insertNode(11);
        list.insertNode(22);
        list.insertNode(22);
        list.insertNode(33);

        /*** 저장된 데이터의 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", list.size());


        System.out.println();

        /*** 숫자 22을 탐색하여 모두 삭제 ***/
        if (!list.isEmpty()) {
            while (list.contain(22)) {
                list.deleteNode(22);
            }
        }

        /*** 삭제 후 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", list.size());


        System.out.println();
    }
}
