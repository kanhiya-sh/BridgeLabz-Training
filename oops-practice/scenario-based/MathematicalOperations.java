package Capgemini_Day16_ScenarioBased;

class MathsUtilityOperations {
//    factorial of a number
    static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
//    checking prime number
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
//    finding gcd of two numbers
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
//    finding fibonacci of a number
    static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        int a = 0, b = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
public class MathematicalOperations {
    public static void main(String[] args) {
        System.out.println("Factorial(5): " + MathsUtilityOperations.factorial(5));
        System.out.println("Prime(7): " + MathsUtilityOperations.isPrime(7));
        System.out.println("GCD(20, 8): " + MathsUtilityOperations.gcd(20, 8));
        System.out.println("Fibonacci(6): " + MathsUtilityOperations.fibonacci(6));
    }
}
