package ch06_Stack.ch06_4;

import ch06_Stack.ch06_1.StackADT;

public class ListBasedStack<E> implements StackADT<E> {
    MyNode<E> head;
    int size = 0;

    @Override
    public boolean empty() {
        return head == null;
    }

    @Override
    public void push(E data) {
        MyNode<E> insertionNode = new MyNode<>(data);

        insertionNode.next = head;
        head = insertionNode;
        ++size;
    }

    @Override
    public E pop() {
        if (head == null) {
            System.out.println("Stack Memory is Empty");
            return null;
        }

        final E removeData = head.data;
        head = head.next;
        --size;
        return removeData;
    }

    @Override
    public E peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }
}
