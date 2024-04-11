package ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_4_RadixSort;

public interface Queue<T> {
    boolean isEmpty();

    void enqueue(T data);

    T dequeue();

    T peak();
}
