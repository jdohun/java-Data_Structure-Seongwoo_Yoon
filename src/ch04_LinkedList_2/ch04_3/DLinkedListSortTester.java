package ch04_LinkedList_2.ch04_3;

public class DLinkedListSortTester {
    public static void test() {
        /*** ArrayList의 생성 및 초기화 ***/
        DLinkedListSort<Integer> dLinkedListSort = new DLinkedListSort<>();
        Integer data;

        dLinkedListSort.setSort(DLinkedListSortTester::whoIsPrecede);

        /*** 5개의 데이터 저장 ***/
        dLinkedListSort.sortInsert(11);
        dLinkedListSort.sortInsert(11);
        dLinkedListSort.sortInsert(22);
        dLinkedListSort.sortInsert(22);
        dLinkedListSort.sortInsert(33);

        /*** 저장된 데이터의 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", dLinkedListSort.size());

        data = dLinkedListSort.first();
        while (data != null) {
            System.out.println(data);
            data = dLinkedListSort.next();
        }
        System.out.println();

        /*** 숫자 22을 탐색하여 모두 삭제 ***/
        data = dLinkedListSort.first();
        while (data != null) {
            if (data.equals(22)) {
                dLinkedListSort.remove();
            }
            data = dLinkedListSort.next();
        }

        /*** 삭제 후 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", dLinkedListSort.size());

        data = dLinkedListSort.first();
        while (data != null) {
            System.out.println(data);
            data = dLinkedListSort.next();
        }
        System.out.println();
    }

    static int whoIsPrecede(Integer d1, Integer d2) {
        if (d1 < d2) return 0;
        else return 1;
    }
}
