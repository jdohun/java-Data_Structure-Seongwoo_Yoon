package ch07_Queue.ch07_2;

import ch07_Queue.ch07_1.QueueADT;

public class ArrayBasedCircularQueue<E> implements QueueADT<E> {
    private final int QUEUE_LEN; // = 100;
    int front = 0;
    int rear = 0;
    E[] queueArr; // E 타입의 배열로 변경

    public ArrayBasedCircularQueue(final int QUEUE_LEN) {
        this.QUEUE_LEN = QUEUE_LEN;
        this.queueArr = (E[]) new Object[QUEUE_LEN];
    }

    @Override
    public boolean empty() {
        if (front == rear)
            return true;
        else
            return false;
    }

    @Override
    public void enqueue(E data) {
        final int next = nextPositionIndex(rear);
        if (next == front) {
            System.out.println("Queue is Full");
            System.exit(-1);
        }
        rear = next;
        queueArr[rear] = data;
    }

    @Override
    public E dequeue() {
        if (empty()) {
            System.out.println("Queue is Empty");
            System.exit(-1);
        }
        front = nextPositionIndex(front);

        // 굳이 삭제(초기화)를 하지 않아도 삭제로 간주한다.
        return queueArr[front];
    }

    @Override
    public E peek() {
        if (empty()) {
            System.out.println("Queue is Empty");
            System.exit(-1);
        }
        return queueArr[nextPositionIndex(front)];
    }

    private int nextPositionIndex(int position) {
        if (position == QUEUE_LEN - 1)
            return 0;
        else
            return position + 1;
    }
}
