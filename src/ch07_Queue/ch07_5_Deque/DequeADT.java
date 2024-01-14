package ch07_Queue.ch07_5_Deque;

public interface DequeADT<E> {
    boolean empty();

    void addFirst(E data);

    void addLast(E data);

    E removeFirst();

    E removeLast();

    E getFirst();

    E getLast();
}
