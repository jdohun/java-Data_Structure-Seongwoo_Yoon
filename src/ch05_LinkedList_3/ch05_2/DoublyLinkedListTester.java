package ch05_LinkedList_3.ch05_2;

public class DoublyLinkedListTester {
    public static void test() {
        // 양방향 연결 리스트의 생성 및 초기화  ///////
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        Integer data;

        // 8개의 데이터 저장  ///////
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        // 저장된 데이터의 조회  ///////
        data = list.first();
        while (data != null) {
            System.out.printf("%d ", data);
            data = list.next();
        }

        data = list.previous();
        while (data != null) {
            System.out.printf("%d ", data);
            data = list.previous();
        }
        System.out.println(System.lineSeparator());
    }
}
