package ch02_Recursive;

public class RecursiveFunc {
    public static void recursive(int num) {
        if (num <= 0) {
            return;
        }
        System.out.printf("Recursive call!! %d\n", num);
        recursive(num - 1);
    }

    public static void test() {
        recursive(3);
    }
}
