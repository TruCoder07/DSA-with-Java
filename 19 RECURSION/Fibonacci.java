import java.util.*;
public class Fibonacci{
    
    static void printFibonacciSeries(int a, int b , int l){
        if(l!=0){
        int sum = a+b;
        System.out.print(sum+" ");
        a=b;
        b=sum;
        l--;
        printFibonacciSeries(a, b, l);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Fibonacci Series first number = ");
        int a = sc.nextInt();
        System.out.print("Enetr Fibonacci Series second number = ");
        int b =sc.nextInt();
        System.out.print("Enetr Fibonacci Series length = ");
        int n = sc.nextInt();
        System.out.print("The fibonacci series = ");
        printFibonacciSeries(a, b, n);
    }
}