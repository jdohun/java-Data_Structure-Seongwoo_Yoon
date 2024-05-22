package ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_2_DivideAndConquer;

public class MergeSort {
    void MergeSort(int[] arr, int left, int right) {
        int mid;

        if (left < right) { // left 가 더 작다는 것 == 더 나눌 수 있다.
            mid = (left + right) / 2;

            MergeSort(arr, left, mid);  // left ~ mid 에 위치한 데이터를 정렬
            MergeSort(arr, mid, right); // mid ~ right 에 위치한 데이터를 정렬

            MergeTwoArea(arr, left, mid, right);
        }
    }

    private void MergeTwoArea(int[] arr, int left, int mid, int right) {
        int firstIdx = left; // 왼쪽 분할 배열의 시작
        int rightIdx = mid + 1; // 오른쪽 분할 배열의 시작
        int[] sortedArr = new int[right + 1]; // 정렬된 값을 새로 저장할 임시 배열
        int sortedIdx = left;   // 정렬된 값이 저장될 배열의 인덱스

        /**
         * 병합할 두 영역의 데이터를 비교하여 sortedArr 에 담는다.
         */
        while (firstIdx <= mid && rightIdx <= right) {
            if (arr[firstIdx] <= arr[rightIdx]) {
                sortedArr[sortedIdx] = arr[firstIdx++];
            } else {
                sortedArr[sortedIdx] = arr[rightIdx++];
            }
            ++sortedIdx;
        }

        // 왼쪽 배열이 모두 소모되었다.
        if (firstIdx > mid) {
            // 오른쪽 배열의 남은 값을 순서대로 저장한다.
            for (int i = rightIdx; i <= right; ++i, ++sortedIdx) {
                sortedArr[sortedIdx] = arr[i];
            }
        } else { // 오른쪽 배열이 모두 소모되었다.
            // 왼쪽 배열의 남은 값을 순서대로 저장한다.
            for (int i = left; i <= mid; ++i, ++sortedIdx) {
                sortedArr[sortedIdx] = arr[i];
            }
        }

        // 병합 결과를 원본 배열에 저장한다.
        if (right + 1 - left >= 0) {
            System.arraycopy(sortedArr, left, arr, left, right + 1 - left);
        }

        // 병합 결과를 원본 배열에 저장한다.
        // for (int i = left; i <= right; ++i) {
        //     arr[i] = sortedArr[i];
        // }
    }
}
