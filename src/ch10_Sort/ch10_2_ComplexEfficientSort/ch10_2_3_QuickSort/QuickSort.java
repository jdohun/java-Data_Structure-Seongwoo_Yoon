package ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_3_QuickSort;

import static ch10_Sort.ch10_2_ComplexEfficientSort.Q10_1_MedianOfTree_Quick.MedianOfTree.medianOfTree;
import static utils.Utils.print;
import static utils.Utils.swap;

public class QuickSort {
    public static void test() {
        int[] arr1 = {3, 2, 4, 1, 7, 6, 5};
        int[] arr2 = {3, 3, 3};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        testArr(arr1, false);
        testArr(arr2, false);
        testArr(arr3, false);
    }

    public static void quickSort(int[] arr, int left, int right, boolean chooseMedian) {
        if (left <= right) {
            int sortPivotIndex = partition(arr, left, right, chooseMedian);
            // 5. 정렬된 pivot 을 기준으로 나뉘어진 두 그룹에 대하여 재귀적 반복
            quickSort(arr, left, sortPivotIndex - 1, chooseMedian);
            quickSort(arr, sortPivotIndex + 1, right, chooseMedian);
        }
    }

    private static int partition(int[] arr, int left, int right, boolean chooseMedian) {
        // 1. pivot 설정
        int pivot = arr[left];
        int low = left + 1;
        int high = right;

        if (chooseMedian) {
            int mid = medianOfTree(arr, left, right);
            pivot = arr[mid];
            swap(arr, left, mid); // 피벗을 가장 왼쪽으로 이동, low 와 high 의 교차 이후 다시 제자리로 돌아오게 된다.
            System.out.println(pivot);
        }

        // 2. pivot 의 위치 찾기
        // 3. pivot 보다 큰 그룹과 작은 그룹으로 나누기
        while (low <= high) { // 교차되지 않을 때까지 반복
            while (low <= right && pivot >= arr[low]) { // 3.1 피벗보다 큰 값을 찾기
                // 조건문의 순서가 Index Out of Bounds 에 영향을 줌
                // 정렬 범위 검사 후 안전한 경우 값을 비교하는 순서를 지켜야함
                // while (pivot > arr[low] && low <= right) {
                ++low;
            }

            while (high >= (left + 1) && pivot <= arr[high]) { // 3.2 피벗보다 작은 값을 찾기
                // while (pivot < arr[high] && high >= (left + 1)) {
                --high;
            }

            if (low <= high) {  // 3.3 교차되지 않은 상태라면 swap
                swap(arr, low, high);
            }
        }
        // 교차 이후
        swap(arr, left, high);   // 4. 피벗과 high 의 값 교환
        return high;    // 옮겨진 피벗의 위치 정보 반환
    }

    private static void testArr(int[] arr, boolean chooseMedian) {
        quickSort(arr, 0, arr.length - 1, chooseMedian);
        print(arr);
    }
}
