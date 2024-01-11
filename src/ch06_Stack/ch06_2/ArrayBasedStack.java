package ch06_Stack.ch06_2;

public class ArrayBasedStack {
    private static final int STACK_LEN = 100;
    private final Integer[] stackArr = new Integer[STACK_LEN];
    private int topIndex = -1;

    boolean empty() {
        return topIndex == -1;
    }

    boolean push(Integer data) {
        if (STACK_LEN <= topIndex + 1) {
            return false;
        }
        stackArr[++topIndex] = data;
        return true;
    }

    Integer pop() {
        if (empty()) {
            return null;
        }
        final int removeIndex = topIndex;
        --topIndex;
        return stackArr[removeIndex];
    }

    Integer peek() {
        if (empty()) {
            System.out.println("Stack Memory is Empty");
            return null;
        }
        return stackArr[topIndex];
    }
}
