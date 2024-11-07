import java.util.*;
public class SumofNumber{
    
    static int printSumofNumber(int n){
        
        if ( n == 1 ){
            return 1;
        }
        // int sNM1 = printSumofNumber(n-1);
        // int sN =  n + sNM1;
        // return sN;
        return  printSumofNumber(n-1)+n;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The program print Sum of Number :");
        System.out.print("Enetr the n number = ");
        int n = sc.nextInt();
        // System.out.print("Enetr starting number = ");
        // int s = sc.nextInt();

        System.out.println("The sum of first "+n+" number = "+printSumofNumber(n));

        
    }
}