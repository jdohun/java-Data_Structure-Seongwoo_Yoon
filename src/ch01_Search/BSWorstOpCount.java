package ch01_Search;

public class BSWorstOpCount {
    public static int binarySearch(final int[] arr, final int target) {
        int first = 0;
        int last = arr.length -1;
        int mid;
        int opCount = 0; // 비교 연산의 횟수를 기록

        while (first <= last) {
            mid = (first + last) / 2;

            if (target == arr[mid]) {
                return mid;
            } else {
                if (target < arr[mid]) {
                    last = mid - 1; // -1 하는 이유 : 이미 비교한 mid 인덱스를 다시 비교하지 않기 위해
                } else {
                    first = mid + 1; // +1 하는 이유 : 또한 mid 인덱스의 값이 target 이라면 무한 루프가 형성되기 때문에
                }
            }
            ++opCount;
        }

        System.out.printf("비교 연산 횟수: %d\n", opCount);
        return -1;
    }

    public static void test() {
        int[] arr1 = new int[500];
        int[] arr2 = new int[5000];
        int[] arr3 = new int[50000];
        int idx;

        // 배열 arr1을 대상으로, 지정되지 않은 정수 1을 찾으라고 명령
        idx = binarySearch(arr1, 1);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }

        // 배열 arr2을 대상으로, 지정되지 않은 정수 1을 찾으라고 명령
        idx = binarySearch(arr2, 1);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }

        // 배열 arr3을 대상으로, 지정되지 않은 정수 1을 찾으라고 명령
        idx = binarySearch(arr3, 1);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }
    }
}
