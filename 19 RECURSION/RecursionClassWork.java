import java.util.*;
public class RecursionClassWork{

    // Problem 1: Print from N to 1 using Recursion
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

    // Problem Statement 3: Given a number X,  print its factorial.
    public static int printFactorial(int n){
        if (n==1) {
            return 1;
        }
        return printFactorial(n-1)*n;
    }

    // Problem statement 4: Given a number ‘N’, find out the sum of the first N natural numbers.

    public static int printSumOfFirstNnumbers(int n){
        if (n==1) {
            return 1;
        }
        // int n1 = printSumOfFirstNnumbers(n-1);
        return ( printSumOfFirstNnumbers(n-1)+n);
    }
    

    // Problem Statement 5: Given a number N,  Print the Nth Fibonacci Number.
    public static int Fibonacci(int n){
        if (n==1 || n==0) {
            return n;
        }
        int fN1= Fibonacci(n-1);
        int fN2= Fibonacci(n-2);
        return fN1+fN2;
    }
    
    // Problem Statement 6: Check if a given array is sorted or not. 
    public static boolean isArray(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        
            return (isArray(arr, i+1));
    }

    // Problem Statement 7: Write a function to find first occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        
        return firstOccurence(arr, key, i+1);
    } 
    // // Problem Statement 8: Write a function to find last occurence of an element in an array
    public static int lastOccurence(int arr[], int key, int i){
        // System.out.println(i);
        if (i == 0) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }

    // Problem Statement 8: Check if the given String is Palindrome or not
    public static boolean isPalindrome(String s, int i){
        if (i == (s.length()/2)+2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length()-1-i)) {
            return false;
        }
        return isPalindrome(s, i+1);
    }

     // Problem Statement 11: Check if the given String is Palindrome or not

     public static int tailingProblem(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        /* long way
        // kaam
        // vertical choice
        int verTiling = tailingProblem(n-1);

        // Horizontal choice
        int horTiling = tailingProblem(n-2);

        return (verTiling+horTiling); */
        // short way
        return (tailingProblem(n-1)+tailingProblem(n-2));
     }

     public static void removeDublicate (String s, int i, StringBuilder newStr, boolean map[]){
        if (i == s.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = s.charAt(i);
        if (map[currChar-'a'] == true) {
            removeDublicate(s, i+1, newStr, map);
        } else {
            map[currChar-'a']=true;
            removeDublicate(s, i+1, newStr.append(currChar), map);
        }
     }  

     public static int friendsPairing(int n){
        // base case 
        if ( n==1 || n==2){
            return n;
        }
        // choice 
        // single 
        int fn1 = friendsPairing(n-1);

        // pair 
        int fn2 = friendsPairing(n-2);
        int pairWays = fn2 * (n-1); // why multiply with (n-1)? because (n-2) = 1 pair(a, b), but a pair with any one and also b

        return (fn1 + pairWays);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int aa[] = {8,3,6,9,5,10,2,5,3};
        int n = sc.nextInt();
        String ac = "appnnacollege";
        // String a = "masateasam";
        // printNumberNto1(n);
        // printNumber1toN(n);
        // System.err.println("The factorial of "+n+" = "+printFactorial(n));
        // System.err.println("sum of the first "+n+" natural numbers = "+printSumOfFirstNnumbers(n));
        // System.out.println(Fibonacci(n));
        // System.out.println(isArray(aa, n));
        // System.out.println(isPalindrome(a, n));
        // System.out.println(lastOccurence(aa, 5, n));
        System.out.println(tailingProblem(n));
        // removeDublicate(ac, n, new StringBuilder(""), new boolean[26]);
        System.out.println(friendsPairing(n));
    }
}