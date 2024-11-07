import java.util.Scanner;
/*  Q1.Print star pattern.
    ******
    *    *
    *    *
    ******
    Sol;
    1. Lines = 4
    OuterLoop - 4
    2. Number of times  (i)
    inner Loop-i times
*/

public class PQ5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number of Lines = ");
        int m = 4; //outer loop (Number Of lines)  
        int n = 5; //inner loop (Number Of Star)   
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == m || j == 1 || j == n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }            
        System.out.println();
        }
        
    }
}