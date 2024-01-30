package ch10_Sort.ch10_1_SimpleSort;

public class ch10_01_BubbleSort {
    static void bubbleSort(int[] arr) {
        int maxIndex = arr.length - 1;
        int temp;
        for (int i = 0; i < maxIndex; i++) {
            for (int j = 0; j < maxIndex - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void test() {
        int[] arr = {3, 2, 4, 1};

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}