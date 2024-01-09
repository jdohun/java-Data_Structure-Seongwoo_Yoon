package ch04_LinkedList_2.ch04_3.Q04_4;

public class DPointLinkedListSortTester {
    public static void test() {
        Point comparisonPosition;

        /*** ArrayList의 생성 및 초기화 ***/
        DPointLinkedListSort<Point> dPointLinkedListSort = new DPointLinkedListSort<>();
        Point data;

        dPointLinkedListSort.setSort(DPointLinkedListSortTester::whoIsPrecede);

        /*** 4개의 데이터 저장 ***/
        dPointLinkedListSort.sortInsert(new Point(2, 1));
        dPointLinkedListSort.sortInsert(new Point(2, 2));
        dPointLinkedListSort.sortInsert(new Point(3, 1));
        dPointLinkedListSort.sortInsert(new Point(3, 2));

        /*** 저장된 데이터의 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", dPointLinkedListSort.size());

        data = dPointLinkedListSort.first();
        while (data != null) {
            data.showPointPosition();
            data = dPointLinkedListSort.next();
        }
        System.out.println();

        /*** xPosition 이 2인 데이터를 탐색하여 모두 삭제 ***/
        comparisonPosition = new Point(2, 0);

        data = dPointLinkedListSort.first();
        while (data != null) {
            if (comparisonPosition.compare(data) == 1) {
                dPointLinkedListSort.remove();
                // 여기서 C 언어는 제거 후 메모리 해제함
            }
            data = dPointLinkedListSort.next();
        }

        /*** 삭제 후 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d \n", dPointLinkedListSort.size());

        data = dPointLinkedListSort.first();
        while (data != null) {
            data.showPointPosition();
            data = dPointLinkedListSort.next();
        }
        System.out.println();
    }

    static int whoIsPrecede(Point d1, Point d2) {
        if (d1.xPosition < d2.xPosition) return 0;
        if (d1.xPosition == d2.xPosition && d1.yPosition < d2.yPosition) {
            return 0;
        }
        return 1;
    }
}
