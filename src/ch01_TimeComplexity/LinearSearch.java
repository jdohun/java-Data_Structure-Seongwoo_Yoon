package ch01_TimeComplexity;

public class LinearSearch {
    public static int search(final int[] arr, final int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void test() {
        int[] arr = {3, 5, 2, 4, 9};

        int idx = search(arr, 4);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }

        idx = search(arr, 7);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }
    }
}