import java.util.Scanner;
/*  Q2.Print star pattern.
    ****
    ***
    **
    *
    1. Lines = 4
    OuterLoop - 4
    2. Number of times  (i)
    inner Loop (n-1+line)

*/


public class PQ2{
    public static void main(String[] args) {
        int n = 4;

        for(int line = 1; line <= 4; line++){
            for (int star = 1; star <=n-line+1; star++) {
            System.out.print("*");
            }
            System.out.println();
            }
    }
}