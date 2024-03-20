package utils;

public class Utils {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
