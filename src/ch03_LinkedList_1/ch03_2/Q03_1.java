package ch03_LinkedList_1.ch03_2;

public class Q03_1 {
    public static void q03() {
        int sum = 0;
        Integer data;

        // 1. 리스트를 생성 및 초기화 한 다음, 정수 1부터 9까지 리스트에 저장한다.
        MyArrayList myArrayList = new MyArrayList();

        for (int i = 1; i < 10; i++) {
            myArrayList.insert(i);
        }

        // 2. 리스트에 저장된 값을 순차적으로 참조하여 그 합을 계산하여 출력한다.
        data = myArrayList.first();

        while (data != null) {
            sum += data;
            data = myArrayList.next();
        }

        System.out.println("SUM = " + sum);

        // 3. 리스트에 저장된 값을 중 2의 배수와 3의 배수에 해당하는 값을 모두 삭제한다.
        data = myArrayList.first();

        while (data != null) {
            if (data % 2 == 0 || data % 3 == 0) {
                myArrayList.remove();
            }
            data = myArrayList.next();
        }

        // 4. 마지막으로 리스트에 저장된 데이터를 순서대로 출력한다.
        data = myArrayList.first();

        while (data != null) {
            System.out.printf("%d ", data);
            data = myArrayList.next();
        }
    }
}
