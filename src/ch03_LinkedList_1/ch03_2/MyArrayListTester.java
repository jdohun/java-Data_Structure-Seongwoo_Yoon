package ch03_LinkedList_1.ch03_2;

public class MyArrayListTester {

    public static void test() {
        /*** `MyArrayList`의 생성 및 초기화 ***/
        MyArrayList myArrayList = new MyArrayList();
        Integer data = null;

        /*** 5개의 데이터 저장 ***/
        myArrayList.insert(11);
        myArrayList.insert(11);
        myArrayList.insert(22);
        myArrayList.insert(22);
        myArrayList.insert(33);

        /*** 저장된 데이터의 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d\n", myArrayList.count());

        // 첫 번째 데이터 조회
        data = myArrayList.first();
        while (data != null) {
            System.out.printf("%d ", data);

            // 이후의 데이터 조회
            data = myArrayList.next();
        }
        System.out.println();

        /*** 숫자 22을 탐색하여 모두 삭제 ***/
        data = myArrayList.first();
        while (data != null) {
            if (data.equals(22)) {
                myArrayList.remove();
            }
            data = myArrayList.next();
        }

        /*** 삭제 후 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d\n", myArrayList.count());

        // 첫 번째 데이터 조회
        data = myArrayList.first();
        while (data != null) {
            System.out.printf("%d ", data);

            // 이후의 데이터 조회
            data = myArrayList.next();
        }
        System.out.println();
    }
}
