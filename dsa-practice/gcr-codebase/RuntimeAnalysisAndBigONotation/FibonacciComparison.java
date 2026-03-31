package BridgeLabz_Day28_RuntimeBigONotation;

public class FibonacciComparison {
    public static void main(String[] args) {
        int n = 40;
        long start = System.nanoTime();
        System.out.println("Recursive Result : " + fibRecursive(n));
        long end = System.nanoTime();
        System.out.println("Recursive Time : " + (end-start)/1e6 + " ms");
        start = System.nanoTime();
        System.out.println("Iterative Result : " + fibIterative(n));
        end = System.nanoTime();
        System.out.println("Iterative Time : " + (end-start)/1e6 + " ms");
    }
    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n-1) + fibRecursive(n-2);
    }
    public static int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}