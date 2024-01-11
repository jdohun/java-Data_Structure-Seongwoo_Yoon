package ch06_Stack.ch06_3.Q06_1;

class CircularLinkedListBasedStack<E> {

    private CircularLinkedList<E> circularLinkedList = new CircularLinkedList<>();

    public boolean empty() {
        return circularLinkedList.size() == 0;
    }

    public void push(E data) {
        circularLinkedList.insertFront(data);
    }

    public E pop() {
        circularLinkedList.first();
        return circularLinkedList.remove();
    }

    public E peek() {
        return circularLinkedList.first();
    }

    public int size() {
        return circularLinkedList.size();
    }
}
