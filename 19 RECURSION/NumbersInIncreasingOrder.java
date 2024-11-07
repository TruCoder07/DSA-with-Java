import java.util.*;
public class NumbersInIncreasingOrder{
    
    static void printNumbersInIncreasingOrder(int start, int n){
        
        if ( start == n ){
            System.out.print(start+" ");
            return;
        }
        System.out.print(start+" ");
        printNumbersInIncreasingOrder(start+1, n);
    }
    static void printNumbersInIncreasingOrder1(int n){
        
        if ( n == 1 ){
            System.out.print(n+" ");
            return;
        }
        printNumbersInIncreasingOrder1(n-1);
        System.out.print(n+" ");
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The program print numbers 1 to n in in creasing order");
        System.out.print("Enetr the n number = ");
        int n = sc.nextInt();
        // System.out.print("Enetr starting number = ");
        // int s = sc.nextInt();

        printNumbersInIncreasingOrder1(n);
    }
}