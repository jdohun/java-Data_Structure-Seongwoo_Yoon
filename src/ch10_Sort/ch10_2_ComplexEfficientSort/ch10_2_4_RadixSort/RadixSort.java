package ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_4_RadixSort;

import utils.Utils;

public class RadixSort {
    private static final int BUCKET_NUM = 10; // 0 ~ 9의 개수

    private static void radixSort(int[] arr, int maxLen) {
        Queue<Integer>[] buckets = new Queue[BUCKET_NUM];

        int bucketIdx;
        int position;
        int dataIdx;
        int divisor = 1;
        int radix;


        for (bucketIdx = 0; bucketIdx < BUCKET_NUM; bucketIdx++) {
            buckets[bucketIdx] = new ListBasedQueue<>();
        }

        // 가장 긴 데이터의 길이만큼 반복
        for (position = 0; position < maxLen; position++) {
            // 정렬 대상의 수만큼 반복
            for (dataIdx = 0; dataIdx < arr.length; dataIdx++) {
                // N번째 자리의 숫자 추출
                radix = (arr[dataIdx] / divisor) % 10;

                // 추출한 숫자를 근거로 데이터 버킷에 저장
                buckets[radix].enqueue(arr[dataIdx]);
            }

            // N번째 자리의 숫자를 통해 정렬된 값을 인출
            for (bucketIdx = 0, dataIdx = 0; bucketIdx < BUCKET_NUM; bucketIdx++) {
                // 버킷에 저장된 것 순서대로 다 꺼내서 다시 arr에 저장
                while (!buckets[bucketIdx].isEmpty())
                    arr[dataIdx++] = buckets[bucketIdx].dequeue();
            }

            // N번째 자리의 숫자 추출을 위한 피제수의 증가
            divisor *= 10;
        }
    }

    public static void test() {
        int[] arr = {13, 212, 14, 7141, 10987, 6, 15};

        radixSort(arr, 5);

        Utils.print(arr);
    }
}
