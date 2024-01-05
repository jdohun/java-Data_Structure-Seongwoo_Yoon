package ch02_Recursive;

public class RecursiveFactorial {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void test() {
        System.out.printf("1! = %d\n", factorial(1));
        System.out.printf("2! = %d\n", factorial(2));
        System.out.printf("3! = %d\n", factorial(3));
        System.out.printf("4! = %d\n", factorial(4));
        System.out.printf("9! = %d\n", factorial(9));
    }
}
