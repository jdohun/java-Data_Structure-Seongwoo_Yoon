package ch11_Search1.ch11_1_Interpolation_Search;

public class InterpolationSearch {
    static int search(int[] arr, int first, int last, int target) {
        // 탐색 대상이 존재하지 않는 경우 에러 발생
        // if (first > last)
        if (arr[first] > target || arr[last] < target)
            return -1;

        int mid = (int) (((double) (target - arr[first]) / (arr[last] - arr[first]) * (last - first)) + first);

        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return search(arr, first, mid - 1, target);
        else
            return search(arr, mid + 1, last, target);
    }

    public static void test() {
        int[] arr = {1, 3, 5, 7, 9};
        int idx;

        idx = search(arr, 0, arr.length - 1, 7);
        if (idx == -1)
            System.out.println("탐색 실패");
        else
            System.out.printf("타겟 저장 인덱스: %d\n", idx);

        idx = search(arr, 0, arr.length - 1, 2);
        if (idx == -1)
            System.out.println("탐색 실패");
        else
            System.out.printf("타겟 저장 인덱스: %d\n", idx);
    }
}
