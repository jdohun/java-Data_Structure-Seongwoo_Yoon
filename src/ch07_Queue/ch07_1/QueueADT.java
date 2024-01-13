package ch07_Queue.ch07_1;

public interface QueueADT<E> {
    boolean empty();

    void enqueue(E data);

    E dequeue();

    E peek();
}
