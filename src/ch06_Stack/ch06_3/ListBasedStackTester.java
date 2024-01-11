package ch06_Stack.ch06_3;

public class ListBasedStackTester {
    public static void test() {
        ListBasedStack stack = new ListBasedStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        while (!stack.empty()) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.println();
    }
}
