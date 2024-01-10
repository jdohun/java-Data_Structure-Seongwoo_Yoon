package ch05_LinkedList_3.ch05_1;

public class CircularLinkedListTester {
    public static void test() {
        // 원형 연결 리스트의 생성 및 초기화 ///////
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        Integer data;
        int listSize;

//        int data, i, nodeNum;

        // 리스트에 5개의 데이터를 저장 ///////
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insertFront(2);
        list.insertFront(1);

        // 리스트에 저장된 데이터를 연속 3회 출력 ///////
        data = list.first();
        if (data != null) {
            System.out.printf("%d ", data);

            int threeTimes = list.size() * 3 - 1;
            for (int i = 0; i < threeTimes; i++) {
                data = list.next();
                System.out.printf("%d ", data);
            }
        }
        System.out.println(System.lineSeparator());

        // 2의 배수를 찾아서 모두 삭제 ///////
        listSize = list.size() - 1;
        if (listSize != 0) {
            data = list.first();

            if (data % 2 == 0) {
                list.remove();
            }

            for (int i = 0; i < listSize; i++) {
                data = list.next();

                if (data % 2 == 0) {
                    list.remove();
                }
            }
        }

        // 전체 데이터 1회 출력 ///////
        listSize = list.size() - 1;
        data = list.first();
        if (data != null) {
            System.out.printf("%d ", data);

            for (int i = 0; i < listSize; i++) {
                data = list.next();
                System.out.printf("%d ", data);
            }
        }
    }
}
