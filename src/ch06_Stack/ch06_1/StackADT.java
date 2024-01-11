package ch06_Stack.ch06_1;

public interface StackADT<E> {
    boolean empty();

    void push(E data);

    E pop();

    E peek();

    int size();
}
