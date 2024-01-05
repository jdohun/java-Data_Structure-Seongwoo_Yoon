package ch02_Recursive;

public class BinarySearchRecursive {
    public static int search(final int[] arr, final int first, final int last, final int target) {
        int mid;

        if (first > last) return -1;

        mid = (first + last) / 2;
        if (target == arr[mid]) {
            return mid;
        } else {
            if (target < arr[mid]) {
                return search(arr, first, mid - 1, target);
            } else {
                return search(arr, mid + 1, last, target);
            }
        }
    }

    public static void test() {
        int[] arr = {1, 3, 5, 7, 9};
        int idx;

        idx = search(arr, 0, arr.length - 1, 7);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }

        idx = search(arr, 0, arr.length - 1, 4);
        if (-1 == idx) {
            System.out.println("탐색 실패\n");
        } else {
            System.out.printf("타겟 저장 인덱스 : %d\n", idx);
        }
    }
}
