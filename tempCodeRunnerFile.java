import java.util.Scanner;

public class Fibonacci {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to find the nth Fibonacci number
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0;
        int fib2 = 1;
        int fibN = 1;
        for (int i = 2; i <= n; i++) {
            fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }
        return fibN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculating Fibonacci using recursive method
        int fibRecursive = fibonacciRecursive(n);
        System.out.println("Fibonacci number (Recursive) at position " + n + " is: " + fibRecursive);

        // Calculating Fibonacci using iterative method
        int fibIterative = fibonacciIterative(n);
        System.out.println("Fibonacci number (Iterative) at position " + n + " is: " + fibIterative);

        scanner.close();
    }
}
