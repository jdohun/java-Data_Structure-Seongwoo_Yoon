package ch03_LinkedList_1.ch03_2;

public class MyArrayList {
    private static final int INITIAL_CAPACITY = 100;
    private final Integer[] array;
    private int countOfData;
    private int currentPosition;

    MyArrayList() {
        this.array = new Integer[INITIAL_CAPACITY];
        this.countOfData = 0;
        this.currentPosition = -1;
    }

    /**
     * 매개변수 data 에 전달된 값을 저장
     */
    void insert(Integer data) {
        if (countOfData > INITIAL_CAPACITY) {
            System.out.println("저장이 불가능합니다.");
            return;
        }

        array[countOfData] = data;
        ++countOfData;
    }

    /**
     * 첫번째로 저장된 데이터(0번째 인덱스의 값)를 반환한다.
     * 저장된 데이터가 존재하지 않으면 null 반환
     * 반환 시 참조 위치를 0으로 초기화한다.
     */
    Integer first() {
        if (countOfData == 0) {
            return null;
        }
        currentPosition = 0;
        return array[0];
    }

    /**
     * 가장 최근에 조회한 데이터의 다음 데이터를 반환한다.
     * 참조 중인 위치에 저장된 데이터가 존재하지 않으면 null 반환
     * 반환 시 참조 위치를 증가시킨다.
     */
    Integer next() {
        if (currentPosition >= countOfData - 1) {
            return null;
        }
        return array[++currentPosition];
    }

    /**
     * 가장 최근 조회 값 삭제
     */
    Integer remove() {
        Integer removeData = array[currentPosition];

        for (int i = currentPosition; i < countOfData - 1; i++) {
            array[i] = array[i + 1];
        }
        array[countOfData - 1] = null;

        --countOfData;
        --currentPosition;

        return removeData;
    }

    /**
     * @return 저장된 데이터의 개수
     */
    int count() {
        return countOfData;
    }
}
