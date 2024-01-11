package ch06_Stack.ch06_2;

public class ArrayBasedStackTester {
    public static void test() {
        ArrayBasedStack arrayBasedStack = new ArrayBasedStack();

        arrayBasedStack.push(1);
        arrayBasedStack.push(2);
        arrayBasedStack.push(3);
        arrayBasedStack.push(4);
        arrayBasedStack.push(5);


        while (!arrayBasedStack.empty()) {
            System.out.printf("%d ", arrayBasedStack.pop());
        }
        System.out.println();
    }
}
