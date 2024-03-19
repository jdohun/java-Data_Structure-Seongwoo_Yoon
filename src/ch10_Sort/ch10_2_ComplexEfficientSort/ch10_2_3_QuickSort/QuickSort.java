package ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_3_QuickSort;

public class QuickSort {

    public static void test() {
        int[] arr1 = {3, 2, 4, 1, 7, 6, 5};
        int[] arr2 = {3, 3, 3};
        testArr(arr1);
        testArr(arr2);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left <= right) {
            int sortPivotIndex = partition(arr, left, right);
            // 5. 정렬된 pivot 을 기준으로 나뉘어진 두 그룹에 대하여 재귀적 반복
            quickSort(arr, left, sortPivotIndex - 1);
            quickSort(arr, sortPivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        // 1. pivot 설정
        int pivot = arr[left];
        int low = left + 1;
        int high = right;

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

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void testArr(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
