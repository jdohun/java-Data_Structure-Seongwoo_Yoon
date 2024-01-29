package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.Q09_1_PriorityQueue;

public interface PriorityQueueADT<E> {
    boolean empty();

    void enqueue(E data);

    E dequeue();
}
