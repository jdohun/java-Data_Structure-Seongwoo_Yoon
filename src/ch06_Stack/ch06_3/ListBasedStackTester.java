package ch06_Stack.ch06_3;

public class ListBasedStackTester {
    public static void test() {
        // Stack의 생성 및 초기화 ///////
        ListBasedStack stack = new ListBasedStack();

        // 데이터 넣기 ///////
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // 데이터 꺼내기 ///////
        while (!stack.empty()) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.println();
    }
}
