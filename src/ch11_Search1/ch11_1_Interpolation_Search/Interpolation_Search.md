# 탐색의 이해와 보간 탐색

- 효율적인 탐색을 위해서는 `어떻게 찾을까`만을 고민해서는 안 된다.
- 그보다 효율적인 탐색을 위한 `저장 방법`을 우선 고민해야한다.
- ### *효율적인 탐색이 가능한 대표적인 자료구조는 트리(이진트리)이다.*

## 보간 탐색

- 이진 탐색과 보간 탐색 모두 정렬이 완료된 데이터를 대상으로 탐색을 진행하는 알고리즘이다.

> - 이진 탐색: 무조건 중간에 위치한 데이터를 탐색의 위치로 결정
> - 보간 탐색: 대상에 비례하여 탐색의 위치를 결정

### 보간탐색: 비례식 구성

- low, high: 시작과 끝의 인덱스

> - A = arr[high] - arr[low]
>- Q = arr[s] - arr[low]

- `*s: 찾고자 하는 값의 인덱스`

#### 비례식 구성:

> - **A : Q = (high-low) : (s:low)**
    <br>-> **s = Q/A * (high-low) + low**
    <br>-> **s = (x - arr[low ]) / (arr[high] - arr[low]) * (high - low) + low**

- `*x = arr[s]`

```java
class Recursive {
    public static int searchRecursive(final int[] arr, final int first, final int last, final int target) {
        int mid;

        if (first > last) return -1;

        mid = (first + last) / 2;
        if (target == arr[mid]) {
            return mid;
        } else {
            if (target < arr[mid]) {
                return searchRecursive(arr, first, mid - 1, target);
            } else {
                return searchRecursive(arr, mid + 1, last, target);
            }
        }
    }
}
```

위 코드의 mid 를
교체하면 보간 탐색이 된다.

```java
class Recursive {
    public static int searchRecursive(/* 기존 매개변수 */) {
        // ...기존 내용
        
        mid = ((double) (target - arr[first]) / (arr[last] - arr[first]) * (last - first)) + first;
        
        // ...기존 내용
    }
}
```

## 탐색 키와 탐색 데이터

> 실제 프로그램 개발에 있어서 탐색의 대상은 ***데이터***가 아닌 ***키(key)*** 이다.
> <br> 다만 학습의 편의를 위해서, 우리는 데이터를 찾는 형태로 간단히 예제를 작성하고 있을 뿐이다.
