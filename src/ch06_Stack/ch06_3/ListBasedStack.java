package ch06_Stack.ch06_3;

import ch06_Stack.ch06_1.StackADT;

public class ListBasedStack implements StackADT<Integer> {
    MyNode<Integer> head;
    int size = 0;

    @Override
    public boolean empty() {
        return head == null;
    }

    @Override
    public void push(Integer data) {
        MyNode<Integer> insertionNode = new MyNode<>(data);

        insertionNode.next = head;
        head = insertionNode;
        ++size;
    }

    @Override
    public Integer pop() {
        if (head == null){
            System.out.println("Stack Memory is Empty");
            return null;
        }

        final Integer removeData = head.data;
        head = head.next;
        --size;
        return removeData;
    }

    @Override
    public Integer peek() {
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
