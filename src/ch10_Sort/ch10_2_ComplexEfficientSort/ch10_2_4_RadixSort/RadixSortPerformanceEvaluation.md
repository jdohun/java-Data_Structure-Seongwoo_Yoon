# 기수 정렬: 성능평가

- 버킷으로의 데이터 삽입과 추출을 근거로 빅-오를 결정

### 삽입

``` java
    // 정렬 대상의 수만큼 반복
    int num = arr.length
    for (dataIdx = 0; dataIdx < num; dataIdx++) {
        // 버킷으로 데이터 삽입 진행
    }
```

### 추출

``` java
// N번째 자리의 숫자를 통해 정렬된 값을 인출
for (bucketIdx = 0, dataIdx = 0; bucketIdx < BUCKET_NUM; bucketIdx++) {
    // 버킷으로부터 데이터 추출 진행
}
```

- 삽입과 추출 연산을 한쌍으로 묶으면 이 한 싼의 연산 수행 횟수는 다음과 같다.
- `maxLen * num`
- 따라서 정렬 대상의 수가 *n* 이고, 모든 정렬 대상의 길이를 *l* 이라 할 때,
  시간 복잡도에 대한 기수 정렬의 빅-오는 다음과 같다.
- ## O(*ln*)