package ch05_LinkedList_3.Q05_2;

public class DoublyDummyLinkedListTester {
    public static void test() {
        // 양방향 연결 리스트의 생성 및 초기화  ///////
        DoublyDummyLinkedList<Integer> list = new DoublyDummyLinkedList<>();
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

        // 2의 배수 전부 삭제 ///////
        data = list.first();
        while (data != null) {
            if (data % 2 == 0) {
                list.remove();
            }
            data = list.next();
        }

        // 저장된 데이터의 재 조회 ///////
        data = list.first();
        while (data != null) {
            System.out.printf("%d ", data);
            data = list.next();
        }
    }
}
