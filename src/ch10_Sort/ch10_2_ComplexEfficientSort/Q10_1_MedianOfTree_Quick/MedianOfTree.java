package ch10_Sort.ch10_2_ComplexEfficientSort.Q10_1_MedianOfTree_Quick;

import static ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_3_QuickSort.QuickSort.quickSort;
import static utils.Utils.print;
import static utils.Utils.swap;

public class MedianOfTree {
    /**
     * 문제 10-1 [median of tree]
     */
    public static void question1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        print(arr);

        quickSort(arr, 0, arr.length - 1, true);
        print(arr);
    }

    public static int medianOfTree(int[] arr, int left, int right) {
        int[] compareIndex = {left, (left + right) / 2, right};
        System.out.printf("%d %d %d\n", arr[compareIndex[0]], arr[compareIndex[1]], arr[compareIndex[2]]);

        // 가장 큰 값을 오른쪽 끝으로
        if (arr[compareIndex[0]] > arr[compareIndex[1]]) {
            swap(compareIndex, 0, 1);
        }

        if (arr[compareIndex[1]] > arr[compareIndex[2]]) {
            swap(compareIndex, 1, 2);
        }

        // 중간 값을 중간으로
        if (arr[compareIndex[0]] > arr[compareIndex[1]]) {
            swap(compareIndex, 0, 1);
        }

        System.out.printf("%d %d %d\n", arr[compareIndex[0]], arr[compareIndex[1]], arr[compareIndex[2]]);

        // 중간 값이 있는 인덱스 반환
        return compareIndex[1];
    }
}