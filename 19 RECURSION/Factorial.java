import java.util.*;
public class Factorial{
    
    static int printFactorial(int n){
        
        if ( n == 0 ){
            return 1;
        }
        
        return n*printFactorial(n-1);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The program print Factorial :");
        System.out.print("Enetr the n number = ");
        int n = sc.nextInt();
        // System.out.print("Enetr starting number = ");
        // int s = sc.nextInt();

        System.out.println("The Factorial of "+n+" = "+printFactorial(n));

        
    }
}