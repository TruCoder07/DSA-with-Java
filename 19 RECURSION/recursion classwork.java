import java.util.*;
public class BasicRecursion{

    // Problem 1: Print your Name N times using recursion
    public static void printNameNtimes(String s, int n){
        if (n==1) {
            System.out.println(s);
            return;
        }
        System.out.println(s);
        printNameNtimes(s, n-1);
    }

    // Problem 2: Print from N to 1 using Recursion
    static void printNumberNto1(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNumberNto1(n-1);
    }

    // Problem 2: Print from 1 to N using Recursion
    public static void printNumber1toN(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        printNumber1toN(n-1);
        System.out.print(n+" ");
    }
    // Problem statement 4: Given a number ‘N’, find out the sum of the first N natural numbers.

    public static int printSumOfFirstNnumbers(int n){
        if (n==1) {
            return 1;
        }
        // int n1 = printSumOfFirstNnumbers(n-1);
        return ( printSumOfFirstNnumbers(n-1)+n);
    }
    // Problem Statement 5: Given a number X,  print its factorial.
    public static int printFactorial(int n){
        if (n==1) {
            return 1;
        }
        return printFactorial(n-1)*n;
    }

    // Problem Statement 6: Given a number N,  Print the Fibonacci series up to the Nth term.
    // public static int Fibonacci(int n){
    //     if (n<1) {
    //         return 0;
    //     }
    //     if (n <= 1) {
    //         return n;
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2);
    // }
    
    // Problem Statement 7: You are given an array. The task is to reverse the array and print it. 
    public static void reverseArray(int arr[], int n, int i){
        if((n-1)== i){
            return;
        }
        if (arr[i]<arr[i+1]) {
            
        }

    }

    // Problem Statement 8: Check if the given String is Palindrome or not
    public static boolean isPalindrome(String s, int i){
        System.out.println(i);
        if (i == (s.length()/2)+2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length()-1-i)) {
            return false;
        }
        isPalindrome(s, i+1);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();
        String a = "Taj";
        // printNameNtimes(a, n);
        // printNumberNto1(n);
        // printNumber1toN(n);
        // System.err.println("The factorial of "+n+" = "+printFactorial(n));
        // System.err.println("sum of the first "+n+" natural numbers = "+printSumOfFirstNnumbers(n));
        // primeFibonacci(n);
        System.out.println(isPalindrome("masrtsam", n));
    }
}