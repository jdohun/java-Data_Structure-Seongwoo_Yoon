package ch10_Sort.ch10_1_SimpleSort.ch10_1_2_SelectionSort;

public class SelectionSort {
    static void SelectionSort(int[] arr) {
        int currentIndex;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            currentIndex = i;

            // 최솟값 탐색
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[currentIndex]) {
                    currentIndex = j;
                }
            }

            // 교환
            temp = arr[i];
            arr[i] = arr[currentIndex];
            arr[currentIndex] = temp;
        }
    }

    public static void test() {
        int[] arr = {3, 2, 4, 1};

        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}