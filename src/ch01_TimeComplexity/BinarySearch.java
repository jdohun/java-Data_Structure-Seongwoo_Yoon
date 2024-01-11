package ch01_TimeComplexity;

public class BinarySearch {
    public static int search(final int[] arr, final int target) {
        int first = 0;
        int last = arr.length -1;
        int mid;

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
        }

        return -1;
    }

    public static void test() {
        int[] arr = {1, 3, 5, 7, 9};
        int idx;

        idx = search(arr, 7);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }

        idx = search(arr, 4);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }
    }
}