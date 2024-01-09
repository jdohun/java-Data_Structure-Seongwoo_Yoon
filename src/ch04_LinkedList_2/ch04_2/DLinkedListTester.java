package ch04_LinkedList_2.ch04_2;

public class DLinkedListTester {
    public static void test() {
        /*** ArrayList의 생성 및 초기화 ***/
        DLinkedList<Integer> dLinkedList = new DLinkedList<>();
        Integer data = null;
        dLinkedList.insertNode(11);

        /*** 5개의 데이터 저장 ***/
        dLinkedList.insertNode(11);
        dLinkedList.insertNode(22);
        dLinkedList.insertNode(22);
        dLinkedList.insertNode(33);

        /*** 저장된 데이터의 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", dLinkedList.size());

        data = dLinkedList.first();
        while (data != null){
            System.out.println(data);
            data = dLinkedList.next();
        }
        System.out.println();

        /*** 숫자 22을 탐색하여 모두 삭제 ***/
        data = dLinkedList.first();
        while (data != null) {
            if (data.equals(22)) {
                dLinkedList.remove();
            }
            data = dLinkedList.next();
        }

        /*** 삭제 후 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", dLinkedList.size());

        data = dLinkedList.first();
        while (data != null){
            System.out.println(data);
            data = dLinkedList.next();
        }
        System.out.println();
    }
}
