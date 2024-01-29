package ch09_PriorityQueue.ch09_2_PriorityQueueImplement.Q09_1_PriorityQueue;

import ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_2_UsefulArrayBasedHeap.PriorityComparator;
import ch09_PriorityQueue.ch09_2_PriorityQueueImplement.ch09_2_2_UsefulArrayBasedHeap.UsefulArrayBasedHeap;

public class PriorityQueue<E> implements PriorityQueueADT<E> {
    UsefulArrayBasedHeap<E> usefulArrayBasedHeap;

    public PriorityQueue(PriorityComparator priorityComparator) {
        usefulArrayBasedHeap = new UsefulArrayBasedHeap<>(priorityComparator);
    }

    @Override
    public boolean empty() {
        return usefulArrayBasedHeap.empty();
    }

    @Override
    public void enqueue(E data) {
        usefulArrayBasedHeap.insert(data);
    }

    @Override
    public E dequeue() {
        return usefulArrayBasedHeap.delete();
    }
}
