import java.util.*;
public class NumbersInDecreasingOrder{
    
    static void printNumbersInDecreasingOrder(int n){
        if ( n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printNumbersInDecreasingOrder(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The program print numbers n to 1 in decreasing order");
        System.out.print("Enetr n number = ");
        int n = sc.nextInt();

        printNumbersInDecreasingOrder(n);
    }
}