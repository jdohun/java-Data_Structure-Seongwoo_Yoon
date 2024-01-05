package ch02_Recursive;

public class Fibonacci {
    public static int fibonacci(int n) {
        System.out.printf("func call param %d\n", n);

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void test() {
        for (int i = 1; i < 15; i++) {
            System.out.printf("%d ", fibonacci(i));
        }
    }

    public static void testCall() {
        fibonacci(7);
    }
}
