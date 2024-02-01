package ch10_Sort.ch10_1_SimpleSort.ch10_1_3_InsertionSort;

public class InsertionSort {
    // 오름차순 정렬
    static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int sortingTarget = arr[i];
            int previousIndex = i - 1;

            // 인덱스가 끝날때까지 나보다 작은 값이 없으면
            while (previousIndex >= 0 && arr[previousIndex] > sortingTarget){
                // 이전 값을 뒤로 밀어낸다,
                arr[previousIndex + 1] = arr[previousIndex];
                --previousIndex;
            }

            // 이전 값이 나보다 작거나 내가 제일 작은 값이면 삽입한다.
            arr[previousIndex + 1] = sortingTarget;
        }
    }

    public static void test() {
        int[] arr = {5, 3, 2, 4, 1};

        InsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
