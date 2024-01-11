package ch03_LinkedList_1.ch03_3;

public class PointArrayListTester {

    public static void test() {
        /*** `MyArrayList`의 생성 및 초기화 ***/
        PointArrayList pointArrayList = new PointArrayList();
        Point point;
        Point comparisonPosition;

        /*** 4개의 데이터 저장 ***/
        pointArrayList.insert(new Point(2, 1));
        pointArrayList.insert(new Point(2, 2));
        pointArrayList.insert(new Point(3, 1));
        pointArrayList.insert(new Point(3, 1));

        /*** 저장된 데이터의 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d\n", pointArrayList.count());

        // 첫 번째 데이터 조회
        point = pointArrayList.first();
        while (point != null) {
            point.showPointPosition();

            // 이후의 데이터 조회
            point = pointArrayList.next();
        }
        System.out.println();

        /*** xPosition 이 2인 데이터를 탐색하여 모두 삭제 ***/
        comparisonPosition = new Point(2, 0);

        point = pointArrayList.first();
        while (point != null) {
            if (comparisonPosition.compare(point) == 1) {
                pointArrayList.remove();
                // 여기서 C 언어는 제거 후 메모리 해제함
            }
            point = pointArrayList.next();
        }

        /*** 삭제 후 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d\n", pointArrayList.count());

        // 첫 번째 데이터 조회
        point = pointArrayList.first();
        while (point != null) {
            point.showPointPosition();

            // 이후의 데이터 조회
            point = pointArrayList.next();
        }
        System.out.println();
    }
}
